package jkind.xtext.ui.handlers;

import jkind.JKindException;
import jkind.api.JRealizabilityApi;
import jkind.api.results.JKindResult;
import jkind.api.results.JRealizabilityResult;
import jkind.results.layout.Layout;
import jkind.xtext.jkind.File;
import jkind.xtext.ui.views.JKindResultsView;
import jkind.xtext.ui.views.JRealizabilityNodeLayout;
import jkind.xtext.util.Util;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class RunJRealizabilityHandler extends AbstractRunHandler {
	private static final String TERMINATE_ID = "jkind.xtext.ui.commands.terminateJKind";

	private IWorkbenchWindow window;

	@Override
	protected Object executeOnEditor(ExecutionEvent event) {
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
			if (MessageDialog
					.openConfirm(window.getShell(), "Save and Run JRealizability", "The file "
							+ input.getName() + " has unsaved changes. Save file and continue?")) {
				xtextEditor.doSave(null);
			} else {
				return null;
			}
		}

		WorkspaceJob job = new WorkspaceJob("JKind Analysis") {
			@Override
			public IStatus runInWorkspace(final IProgressMonitor monitor) {
				activateTerminateHandler(monitor, this);
				if (!hasQuery(xtextEditor)) {
					return errorStatus("Main node does not contain realizability query");
				}
				JRealizabilityResult result = initializeJRealizabilityResult(xtextEditor);
				if (result == null) {
					return errorStatus("Lustre file contains errors");
				}
				return runJob(fileOnDisk, result, monitor);
			}
		};

		job.schedule();
		return null;
	}

	private void activateTerminateHandler(final IProgressMonitor monitor, final WorkspaceJob job) {
		final IHandlerService handlerService = (IHandlerService) window
				.getService(IHandlerService.class);
		window.getShell().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				final IHandlerActivation activation = handlerService.activateHandler(TERMINATE_ID,
						new TerminateHandler(monitor));
				job.addJobChangeListener(new JobChangeAdapter() {
					@Override
					public void done(IJobChangeEvent event) {
						window.getShell().getDisplay().syncExec(new Runnable() {
							@Override
							public void run() {
								handlerService.deactivateHandler(activation);
							}
						});
					}
				});
			}
		});
	}

	private boolean hasQuery(XtextEditor xtextEditor) {
		return xtextEditor.getDocument().readOnly(new IUnitOfWork<Boolean, XtextResource>() {
			@Override
			public Boolean exec(XtextResource resource) throws Exception {
				File file = (File) resource.getContents().get(0);
				return !Util.getMainNode(file).getRealizabilityInputs().isEmpty();
			}
		});
	}

	private JRealizabilityResult initializeJRealizabilityResult(XtextEditor xtextEditor) {
		return xtextEditor.getDocument().readOnly(
				new IUnitOfWork<JRealizabilityResult, XtextResource>() {
					@Override
					public JRealizabilityResult exec(XtextResource resource) throws Exception {
						File file = (File) resource.getContents().get(0);
						return initializeJRealizabilityResult(file);
					}
				});
	}

	private JRealizabilityResult initializeJRealizabilityResult(File file) {
		if (hasErrors(file.eResource())) {
			return null;
		}

		JRealizabilityResult result = new JRealizabilityResult(Util.getMainNode(file).getName()
				+ " realizable");
		showView(result, new JRealizabilityNodeLayout(file));
		return result;
	}

	private IStatus runJob(java.io.File file, JRealizabilityResult result, IProgressMonitor monitor) {
		try {
			JRealizabilityApi api = new JRealizabilityApi();
			api.setJKindJar(Util.getJKindJar());
			try {
				api.execute(file, result, monitor);
			} catch (JKindException e) {
				e.printStackTrace();
			}
			writeConsoleOutput(result.getText());
			return Status.OK_STATUS;
		} catch (JKindException e) {
			return errorStatus(getErrorMessage(e, result.getText()));
		}
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

	private void writeConsoleOutput(final String text) {
		window.getShell().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageConsole console = findConsole("JKind");
				console.clearConsole();
				console.newMessageStream().print(text);
			}
		});
	}

	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				return (MessageConsole) existing[i];
			}
		}
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}
}
