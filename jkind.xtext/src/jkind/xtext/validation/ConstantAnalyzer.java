package jkind.xtext.validation;

import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.BoolExpr;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.IntExpr;
import jkind.xtext.jkind.NodeCallExpr;
import jkind.xtext.jkind.ProjectionExpr;
import jkind.xtext.jkind.RealExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.util.JkindSwitch;

public class ConstantAnalyzer extends JkindSwitch<Boolean> {
	@Override
	public Boolean caseConstant(Constant e) {
		return true;
	}

	@Override
	public Boolean caseVariable(Variable e) {
		return false;
	}
	
	@Override
	public Boolean caseBinaryExpr(BinaryExpr e) {
		if (e.getOp().equals("->")) {
			return false;
		} else {
			return doSwitch(e.getLeft()) && doSwitch(e.getRight());
		}
	}

	@Override
	public Boolean caseUnaryExpr(UnaryExpr e) {
		if (e.getOp().equals("pre")) {
			return false;
		} else {
			return doSwitch(e.getExpr());
		}
	}

	@Override
	public Boolean caseProjectionExpr(ProjectionExpr e) {
		return doSwitch(e.getExpr());
	}

	@Override
	public Boolean caseIdExpr(IdExpr e) {
		return doSwitch(e.getId());
	}

	@Override
	public Boolean caseIntExpr(IntExpr e) {
		return true;
	}

	@Override
	public Boolean caseRealExpr(RealExpr e) {
		return true;
	}
	
	@Override
	public Boolean caseBoolExpr(BoolExpr e) {
		return true;
	}

	@Override
	public Boolean caseIfThenElseExpr(IfThenElseExpr e) {
		return doSwitch(e.getCond()) && doSwitch(e.getThen()) && doSwitch(e.getElse());
	}

	@Override
	public Boolean caseNodeCallExpr(NodeCallExpr e) {
		return false;
	}

	@Override
	public Boolean caseRecordExpr(RecordExpr e) {
		for (Expr expr : e.getExprs()) {
			if (!doSwitch(expr)) {
				return false;
			}
		}
		return true;
	}
}
