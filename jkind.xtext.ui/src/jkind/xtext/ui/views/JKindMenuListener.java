package jkind.xtext.ui.views;

import java.io.File;
import java.io.IOException;

import jkind.api.results.PropertyResult;
import jkind.api.ui.AnalysisResultTable;
import jkind.results.Counterexample;
import jkind.results.InvalidProperty;
import jkind.results.Property;
import jkind.results.UnknownProperty;
import jkind.results.layout.Layout;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.program.Program;

public class JKindMenuListener implements IMenuListener {
	private final AnalysisResultTable table;
	private Layout layout;

	public JKindMenuListener(AnalysisResultTable table) {
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
	}

	private void addViewCounterexampleMenu(IMenuManager manager, PropertyResult result) {
		final Counterexample cex = getCounterexample(result);
		if (cex == null) {
			return;
		}

		boolean inductive = result.getProperty() instanceof UnknownProperty;
		String text = "View " + (inductive ? "Inductive " : "") + "Counterexample in Spreadsheet";
		manager.add(new Action(text) {
			@Override
			public void run() {
				viewCexSpreadsheet(cex, layout);
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
}
