package jkind.xtext.validation;

import java.util.List;

import jkind.xtext.jkind.ArrayAccessExpr;
import jkind.xtext.jkind.ArrayExpr;
import jkind.xtext.jkind.ArrayUpdateExpr;
import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.BoolExpr;
import jkind.xtext.jkind.CallExpr;
import jkind.xtext.jkind.CastExpr;
import jkind.xtext.jkind.CondactExpr;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.IntExpr;
import jkind.xtext.jkind.RealExpr;
import jkind.xtext.jkind.RecordAccessExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordUpdateExpr;
import jkind.xtext.jkind.TupleExpr;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.util.JkindSwitch;

public class ConstantAnalyzer extends JkindSwitch<Boolean> {
	@Override
	public Boolean caseArrayAccessExpr(ArrayAccessExpr e) {
		return doSwitch(e.getArray()) && doSwitch(e.getIndex());
	}

	@Override
	public Boolean caseArrayExpr(ArrayExpr e) {
		return doSwitchList(e.getExprs());
	}

	@Override
	public Boolean caseArrayUpdateExpr(ArrayUpdateExpr e) {
		return doSwitch(e.getAccess()) && doSwitch(e.getValue());
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
	public Boolean caseBoolExpr(BoolExpr e) {
		return true;
	}

	@Override
	public Boolean caseCastExpr(CastExpr e) {
		return doSwitch(e.getExpr());
	}

	@Override
	public Boolean caseCondactExpr(CondactExpr e) {
		return false;
	}

	@Override
	public Boolean caseIdExpr(IdExpr e) {
		return doSwitch(e.getId());
	}

	@Override
	public Boolean caseIfThenElseExpr(IfThenElseExpr e) {
		return doSwitch(e.getCond()) && doSwitch(e.getThen()) && doSwitch(e.getElse());
	}

	@Override
	public Boolean caseIntExpr(IntExpr e) {
		return true;
	}

	@Override
	public Boolean caseCallExpr(CallExpr e) {
		return false;
	}

	@Override
	public Boolean caseRealExpr(RealExpr e) {
		return true;
	}

	@Override
	public Boolean caseRecordAccessExpr(RecordAccessExpr e) {
		return doSwitch(e.getRecord());
	}

	@Override
	public Boolean caseRecordExpr(RecordExpr e) {
		return doSwitchList(e.getExprs());
	}
	
	@Override
	public Boolean caseRecordUpdateExpr(RecordUpdateExpr e) {
		return doSwitch(e.getRecord()) && doSwitch(e.getValue());
	}

	@Override
	public Boolean caseTupleExpr(TupleExpr e) {
		return doSwitchList(e.getExprs());
	}

	@Override
	public Boolean caseUnaryExpr(UnaryExpr e) {
		return doSwitch(e.getExpr());
	}

	@Override
	public Boolean caseConstant(Constant e) {
		return true;
	}

	@Override
	public Boolean caseVariable(Variable e) {
		return false;
	}

	private Boolean doSwitchList(List<Expr> es) {
		for (Expr e : es) {
			if (!doSwitch(e)) {
				return false;
			}
		}
		return true;
	}
}
