package jkind.xtext.ui.handlers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import jkind.JKindException;
import jkind.api.JKindApi;
import jkind.api.results.JKindResult;
import jkind.excel.Layout;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.Property;
import jkind.xtext.ui.internal.JKindActivator;
import jkind.xtext.ui.preferences.PreferenceConstants;
import jkind.xtext.ui.views.JKindNodeLayout;
import jkind.xtext.ui.views.JKindResultsView;
import jkind.xtext.util.Util;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;

public class RunJKindHandler extends AbstractHandler {
	private static final String TERMINATE_ID = "jkind.xtext.ui.commands.terminateJKind";

	private IWorkbenchWindow window;

	@Inject
	protected IResourceValidator resourceValidator;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchPart part = HandlerUtil.getActivePart(event);
		if (!(part instanceof XtextEditor)) {
			try {
				openXtextEditor(event);
			} catch (PartInitException e) {
				MessageDialog.openError(part.getSite().getShell(), "Error opening editor",
						e.getMessage());
				e.printStackTrace();
			}
		}
		return executeOnEditor(event);
	}

	private void openXtextEditor(ExecutionEvent event) throws PartInitException {
		IWorkbenchPartSite site = HandlerUtil.getActivePart(event).getSite();
		IStructuredSelection selection = (IStructuredSelection) site.getSelectionProvider()
				.getSelection();
		IFile file = (IFile) selection.getFirstElement();
		IWorkbenchPage page = site.getWorkbenchWindow().getActivePage();
		page.openEditor(new FileEditorInput(file), JKindActivator.JKIND_XTEXT_JKIND);
	}

	public Object executeOnEditor(ExecutionEvent event) {
		window = HandlerUtil.getActiveWorkbenchWindow(event);
		if (window == null) {
			return null;
		}

		final XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor == null) {
			return null;
		}

		FileEditorInput input = (FileEditorInput) xtextEditor.getEditorInput();
		final java.io.File fileOnDisk = input.getFile().getLocation().toFile();

		if (xtextEditor.isDirty()) {
			if (MessageDialog.openConfirm(window.getShell(), "Save and Run JKind", "The file "
					+ input.getName() + " has unsaved changes. Save file and continue?")) {
				xtextEditor.doSave(null);
			} else {
				return null;
			}
		}

		WorkspaceJob job = new WorkspaceJob("JKind Analysis") {
			@Override
			public IStatus runInWorkspace(final IProgressMonitor monitor) {
				final IHandlerService handlerService = (IHandlerService) window
						.getService(IHandlerService.class);
				final IHandlerActivation activation = handlerService.activateHandler(TERMINATE_ID,
						new TerminateHandler(monitor));
				addJobChangeListener(new JobChangeAdapter() {
					@Override
					public void done(IJobChangeEvent event) {
						handlerService.deactivateHandler(activation);
					}
				});

				return xtextEditor.getDocument().readOnly(
						new IUnitOfWork<IStatus, XtextResource>() {
							@Override
							public IStatus exec(XtextResource resource) throws Exception {
								File file = (File) resource.getContents().get(0);
								return runJob(file, fileOnDisk, monitor);
							}
						});
			}
		};

		job.schedule();
		return null;
	}

	private IStatus runJob(File file, java.io.File raw, IProgressMonitor monitor) {
		if (hasErrors(file.eResource())) {
			return errorStatus("Lustre file contains errors");
		}

		JKindApi api = getJKindApi();
		JKindResult result = new JKindResult("", getProperties(file));
		showView(result, new JKindNodeLayout(file));

		try {
			api.execute(raw, result, monitor);
			return Status.OK_STATUS;
		} catch (JKindException e) {
			return errorStatus(getErrorMessage(e, result.getText()));
		}
	}

	private boolean hasErrors(Resource res) {
		for (Issue issue : resourceValidator.validate(res, CheckMode.ALL, CancelIndicator.NullImpl)) {
			if (issue.getSeverity() == Severity.ERROR) {
				return true;
			}
		}
		return false;
	}

	private JKindApi getJKindApi() {
		JKindApi api = new JKindApi();
		IPreferenceStore prefs = JKindActivator.getInstance().getPreferenceStore();
		if (prefs.getBoolean(PreferenceConstants.PREF_INDUCT_CEX)) {
			api.setInductiveCounterexamples();
		}
		if (prefs.getBoolean(PreferenceConstants.PREF_SMOOTH_CEX)) {
			api.setSmoothCounterexamples();
		}
		api.setN(prefs.getInt(PreferenceConstants.PREF_DEPTH));
		api.setTimeout(prefs.getInt(PreferenceConstants.PREF_TIMEOUT));
		return api;
	}

	private void showView(final JKindResult result, final Layout layout) {
		window.getShell().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					JKindResultsView page = (JKindResultsView) window.getActivePage().showView(
							JKindResultsView.ID);
					page.setInput(result, layout);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}

	private List<String> getProperties(File file) {
		List<String> properties = new ArrayList<>();
		Node main = Util.getMainNode(file);
		if (main != null) {
			for (Property property : main.getProperties()) {
				properties.add(property.getRef().getName());
			}
		}
		return properties;
	}

	private String getErrorMessage(Throwable e, String details) {
		StringWriter sw = new StringWriter();
		try (PrintWriter pw = new PrintWriter(sw)) {
			while (e != null) {
				if (!e.getMessage().isEmpty()) {
					pw.println(e.getMessage());
				}
				e = e.getCause();
			}
			pw.println(details);
		}
		return sw.toString();
	}

	private IStatus errorStatus(String message) {
		return new Status(IStatus.ERROR, JKindActivator.JKIND_XTEXT_JKIND, message);
	}
}
