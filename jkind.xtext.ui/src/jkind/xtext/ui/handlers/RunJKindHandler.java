package jkind.xtext.ui.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import jkind.JKindException;
import jkind.api.JKindApi;
import jkind.api.results.JKindResult;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.Property;
import jkind.xtext.ui.internal.JKindActivator;
import jkind.xtext.ui.views.JKindResultsView;
import jkind.xtext.util.Util;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class RunJKindHandler extends AbstractHandler {
	private IWorkbenchWindow window;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor == null) {
			return null;
		}

		window = HandlerUtil.getActiveWorkbenchWindow(event);
		if (window == null) {
			return null;
		}

		final String program = getEditorInput(event);

		WorkspaceJob job = new WorkspaceJob("JKind Analysis") {
			@Override
			public IStatus runInWorkspace(final IProgressMonitor monitor) {
				return xtextEditor.getDocument().readOnly(
						new IUnitOfWork<IStatus, XtextResource>() {
							@Override
							public IStatus exec(XtextResource resource) throws Exception {
								return runJob((File) resource.getContents().get(0), program,
										monitor);
							}
						});
			}
		};

		job.schedule();
		return null;
	}

	private String getEditorInput(ExecutionEvent event) {
		try {
			IEditorPart editor = HandlerUtil.getActiveEditor(event);
			FileEditorInput input = (FileEditorInput) editor.getEditorInput();
			return inputStreamToString(input.getFile().getContents());
		} catch (Throwable t) {
			t.printStackTrace();
			return null;
		}
	}

	private String inputStreamToString(InputStream stream) throws IOException {
		StringWriter sw = new StringWriter();
		BufferedReader buffered = new BufferedReader(new InputStreamReader(stream));
		try (PrintWriter pw = new PrintWriter(sw)) {
			String line;
			while ((line = buffered.readLine()) != null) {
				pw.println(line);
			}
		}
		return sw.toString();
	}

	private IStatus runJob(File file, String program, IProgressMonitor monitor) {
		JKindApi api = new JKindApi();
		JKindResult result = new JKindResult("", getProperties(file));
		showView(result);

		try {
			api.execute(program, result, monitor);
			return Status.OK_STATUS;
		} catch (JKindException e) {
			return new Status(IStatus.ERROR, JKindActivator.JKIND_XTEXT_JKIND, getNestedMessages(e));
		}
	}

	private void showView(final JKindResult result) {
		window.getShell().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					JKindResultsView page = (JKindResultsView) window.getActivePage().showView(
							JKindResultsView.ID);
					page.setInput(result);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}

	private List<String> getProperties(File file) {
		List<String> properties = new ArrayList<>();
		for (Property property : Util.getMainNode(file).getProperties()) {
			properties.add(property.getRef().getName());
		}
		return properties;
	}

	private String getNestedMessages(Throwable e) {
		StringWriter sw = new StringWriter();
		try (PrintWriter pw = new PrintWriter(sw)) {
			while (e != null) {
				if (!e.getMessage().isEmpty()) {
					pw.println(e.getMessage());
				}
				e = e.getCause();
			}
		}
		return sw.toString();
	}
}
