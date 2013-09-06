package jkind.xtext.ui.handlers;

import jkind.xtext.jkind.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.spi.Element;

public class RunJKindHandler extends AbstractHandler {
	@Inject
	ISerializer serializer;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// System.out.println(HandlerUtil.getActiveEditor(event));
		final XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor == null) {
			return null;
		}

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		if (window == null) {
			return null;
		}

		WorkspaceJob job = new WorkspaceJob("JKind Analysis") {
			@Override
			public IStatus runInWorkspace(final IProgressMonitor monitor) {
				return xtextEditor.getDocument().readOnly(
						new IUnitOfWork<IStatus, XtextResource>() {
							@Override
							public IStatus exec(XtextResource resource) throws Exception {
								return runJob((File) resource.getContents().get(0), monitor);
							}
						});
			}
		};

		job.schedule();
		return null;
	}

	private IStatus runJob(File file, IProgressMonitor monitor) {
		System.out.println(serializer.serialize(file));
		return Status.OK_STATUS;
	}
}
