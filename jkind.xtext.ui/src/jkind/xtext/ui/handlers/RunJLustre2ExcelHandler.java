package jkind.xtext.ui.handlers;

import java.io.File;

import jkind.api.JLustre2ExcelApi;
import jkind.xtext.util.Util;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.program.Program;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class RunJLustre2ExcelHandler extends AbstractRunHandler {
	@Override
	protected Object executeOnEditor(ExecutionEvent event) {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
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
					.openConfirm(window.getShell(), "Save and Run JLustre2Excel", "The file "
							+ input.getName() + " has unsaved changes. Save file and continue?")) {
				xtextEditor.doSave(null);
			} else {
				return null;
			}
		}

		WorkspaceJob job = new WorkspaceJob("JLustre2Excel") {
			@Override
			public IStatus runInWorkspace(final IProgressMonitor monitor) {
				if (hasErrors(xtextEditor)) {
					return errorStatus("Lustre file contains errors");
				}
				return runJob(fileOnDisk);
			}
		};

		job.schedule();
		return null;
	}

	private boolean hasErrors(XtextEditor xtextEditor) {
		return xtextEditor.getDocument().readOnly(new IUnitOfWork<Boolean, XtextResource>() {
			@Override
			public Boolean exec(XtextResource resource) throws Exception {
				return hasErrors(resource);
			}
		});
	}

	private IStatus runJob(File lustreFile) {
		JLustre2ExcelApi api = new JLustre2ExcelApi();
		api.setJKindJar(Util.getJKindJar());
		File xlsFile = api.execute(lustreFile);

		if (xlsFile.exists()) {
			Program.launch(xlsFile.toString());
			return Status.OK_STATUS;
		} else {
			return errorStatus("JLustre2Excel failed to create xls file");
		}
	}
}
