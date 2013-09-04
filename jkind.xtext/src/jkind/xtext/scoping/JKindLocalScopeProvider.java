package jkind.xtext.scoping;


import java.util.List;

import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.RecordExpr;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

public class JKindLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	@Override
	protected String getImportedNamespace(EObject object) {
		if (object instanceof RecordExpr) {
			RecordExpr expr = (RecordExpr) object;
			List<INode> node = NodeModelUtils.findNodesForFeature(expr,
					JkindPackage.Literals.RECORD_EXPR__DEF);
			String name = node.get(0).getText();
			return name + ".*";
		}
		return super.getImportedNamespace(object);
	}
}
