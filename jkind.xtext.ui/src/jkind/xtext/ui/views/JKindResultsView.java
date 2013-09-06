package jkind.xtext.ui.views;

import jkind.api.results.JKindResult;
import jkind.api.ui.AnalysisResultTable;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class JKindResultsView extends ViewPart {
    public static final String ID = "jkind.xtext.ui.views.jKindResultsView";

    private AnalysisResultTable table;

    @Override
    public void createPartControl(Composite parent) {
        table = new AnalysisResultTable(parent);
    }

    @Override
    public void setFocus() {
        table.getControl().setFocus();
    }

    public void setInput(JKindResult result) {
    	table.setInput(result);
    }
}
