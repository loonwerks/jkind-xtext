package jkind.xtext.ui.handlers;

import java.io.PrintWriter;
import java.io.StringWriter;

import jkind.xtext.ui.internal.JKindActivator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;

public abstract class AbstractRunHandler extends AbstractHandler {
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
				return null;
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

	protected abstract Object executeOnEditor(ExecutionEvent event);

	protected boolean hasErrors(Resource res) {
		for (Issue issue : resourceValidator.validate(res, CheckMode.ALL, CancelIndicator.NullImpl)) {
			if (issue.getSeverity() == Severity.ERROR) {
				return true;
			}
		}
		return false;
	}

	protected static String getErrorMessage(Throwable e, String details) {
		StringWriter sw = new StringWriter();
		try (PrintWriter pw = new PrintWriter(sw)) {
			while (e != null) {
				if (e.getMessage() != null && !e.getMessage().isEmpty()) {
					pw.println(e.getMessage());
				}
				e = e.getCause();
			}
			pw.println(details);
		}
		return sw.toString();
	}

	protected static IStatus errorStatus(String message) {
		return new Status(IStatus.ERROR, JKindActivator.JKIND_XTEXT_JKIND, message);
	}
}
