package jkind.xtext.ui.views;

import jkind.api.results.JKindResult;
import jkind.api.ui.AnalysisResultTable;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class JKindResultsView extends ViewPart {
    public static final String ID = "jkind.xtext.ui.views.jKindResultsView";

    private AnalysisResultTable table;
    private JKindMenuListener menuListener;

    @Override
    public void createPartControl(Composite parent) {
        table = new AnalysisResultTable(parent);
        
        menuListener = new JKindMenuListener(table);
        MenuManager manager = new MenuManager();
        manager.setRemoveAllWhenShown(true);
        manager.addMenuListener(menuListener);
        table.getControl().setMenu(manager.createContextMenu(table.getViewer().getTable()));
    }

    @Override
    public void setFocus() {
        table.getControl().setFocus();
    }

    public void setInput(JKindResult result) {
    	table.setInput(result);
    }
}
