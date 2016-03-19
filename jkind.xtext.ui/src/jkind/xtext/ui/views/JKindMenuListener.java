package jkind.xtext.ui.views;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import jkind.api.results.PropertyResult;
import jkind.api.ui.results.AnalysisResultTable;
import jkind.results.Counterexample;
import jkind.results.InvalidProperty;
import jkind.results.Property;
import jkind.results.UnknownProperty;
import jkind.results.ValidProperty;
import jkind.results.layout.Layout;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.program.Program;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class JKindMenuListener implements IMenuListener {
	private final IWorkbenchWindow window;
	private final AnalysisResultTable table;
	private Layout layout;

	public JKindMenuListener(IWorkbenchWindow window, AnalysisResultTable table) {
		this.window = window;
		this.table = table;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		IStructuredSelection selection = (IStructuredSelection) table.getViewer().getSelection();
		if (!selection.isEmpty()) {
			PropertyResult result = (PropertyResult) selection.getFirstElement();
			addLinkedMenus(manager, result);
		}
	}

	private void addLinkedMenus(IMenuManager manager, PropertyResult result) {
		addViewCounterexampleMenu(manager, result);
		addViewInvariantsMenu(manager, result);
	}

	private void addViewCounterexampleMenu(IMenuManager manager, PropertyResult result) {
		final Counterexample cex = getCounterexample(result);
		if (cex == null) {
			return;
		}

		boolean inductive = result.getProperty() instanceof UnknownProperty;
		String text = "View " + (inductive ? "Inductive " : "") + "Counterexample in ";
		manager.add(new Action(text + "Spreadsheet") {
			@Override
			public void run() {
				viewCexSpreadsheet(cex, layout);
			}
		});
		manager.add(new Action(text + "Eclipse") {
			@Override
			public void run() {
				viewCexEclipse(cex, layout);
			}
		});
	}

	private void viewCexSpreadsheet(Counterexample cex, Layout layout) {
		try {
			File file = File.createTempFile("cex", ".xls");
			cex.toExcel(file, layout);
			Program.launch(file.toString());
		} catch (IOException e) {
			MessageDialog.openError(table.getControl().getShell(), "Error opening spreadsheet",
					e.getMessage());
			e.printStackTrace();
		}
	}

	private void viewCexEclipse(Counterexample cex, Layout layout) {
		try {
			JKindCounterexampleView cexView = (JKindCounterexampleView) window.getActivePage()
					.showView(JKindCounterexampleView.ID);
			cexView.setInput(cex, layout);
			cexView.setFocus();
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	private static Counterexample getCounterexample(PropertyResult result) {
		Property prop = result.getProperty();
		if (prop instanceof InvalidProperty) {
			return ((InvalidProperty) prop).getCounterexample();
		} else if (prop instanceof UnknownProperty) {
			return ((UnknownProperty) prop).getInductiveCounterexample();
		} else {
			return null;
		}
	}

	private void addViewInvariantsMenu(IMenuManager manager, PropertyResult result) {
		if (!(result.getProperty() instanceof ValidProperty)) {
			return;
		}
		ValidProperty vp = (ValidProperty) result.getProperty();

		if (vp.getInvariants().isEmpty()) {
			return;
		}

		manager.add(new Action("View inductive validity core in console") {
			@Override
			public void run() {
				viewIvcInConsole(vp.getName(), vp.getInvariants(), vp.getIvc());
			}
		});
	}

	private void viewIvcInConsole(String property, List<String> invariants, Set<String> ivc) {
		MessageConsole console = findConsole("JKind Inductive Validity Core");
		showConsole(console);
		console.clearConsole();

		try (MessageConsoleStream stream = console.newMessageStream()) {
			stream.println("Invariants for " + property + ": ");
			for (String invariant : invariants) {
				stream.println("  " + invariant);
			}

			stream.println();
			stream.println("Inductive validity core for " + property + ": ");
			for (String e : ivc) {
				stream.println("  " + e);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	private void showConsole(IConsole console) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IConsoleView view = (IConsoleView) page.showView(IConsoleConstants.ID_CONSOLE_VIEW);
			view.display(console);
			view.setScrollLock(true);
		} catch (PartInitException e) {
		}
	}
}
