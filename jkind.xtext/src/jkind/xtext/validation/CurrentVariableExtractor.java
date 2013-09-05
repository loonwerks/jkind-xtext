package jkind.xtext.validation;

import java.util.HashSet;
import java.util.Set;

import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.Variable;
import jkind.xtext.util.JKindIterator;

public class CurrentVariableExtractor extends JKindIterator {
	public static Set<Variable> get(Expr expr) {
		CurrentVariableExtractor extractor = new CurrentVariableExtractor();
		extractor.doSwitch(expr);
		return extractor.set;
	}
	
	private Set<Variable> set = new HashSet<>();
	
	@Override
	public Object caseUnaryExpr(UnaryExpr e) {
		if (e.getOp().equals("pre")) {
			return DONE;
		} else {
			return super.caseUnaryExpr(e);
		}
	}
	
	@Override
	public Object caseIdExpr(IdExpr e) {
		if (e.getId() instanceof Variable) {
			set.add((Variable) e.getId());
		}
		return DONE;
	}
}
