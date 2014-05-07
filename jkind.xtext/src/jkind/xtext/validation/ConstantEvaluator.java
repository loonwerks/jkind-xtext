package jkind.xtext.validation;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import jkind.lustre.BinaryOp;
import jkind.lustre.UnaryOp;
import jkind.lustre.values.BooleanValue;
import jkind.lustre.values.IntegerValue;
import jkind.lustre.values.RealValue;
import jkind.lustre.values.RecordValue;
import jkind.lustre.values.Value;
import jkind.util.BigFraction;
import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.BoolExpr;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.Field;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.IntExpr;
import jkind.xtext.jkind.RealExpr;
import jkind.xtext.jkind.RecordAccessExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.util.JkindSwitch;

public class ConstantEvaluator extends JkindSwitch<Value> {
	@Override
	public Value caseConstant(Constant e) {
		return doSwitch(e.getExpr());
	}

	@Override
	public Value caseBinaryExpr(BinaryExpr e) {
		Value left = doSwitch(e.getLeft());
		Value right = doSwitch(e.getRight());
		if (left == null) {
			return null;
		} else {
			return left.applyBinaryOp(BinaryOp.fromString(e.getOp()), right);
		}
	}

	@Override
	public Value caseUnaryExpr(UnaryExpr e) {
		Value v = doSwitch(e.getExpr());
		UnaryOp op = UnaryOp.fromString(e.getOp());
		if (v == null) {
			return null;
		} else if (op == UnaryOp.PRE) {
			return v;
		} else {
			return v.applyUnaryOp(op);
		}
	}

	@Override
	public Value caseRecordAccessExpr(RecordAccessExpr e) {
		Value v = doSwitch(e.getRecord());
		if (v instanceof RecordValue) {
			RecordValue record = (RecordValue) v;
			return record.fields.get(e.getField().getName());
		} else {
			return null;
		}
	}

	@Override
	public Value caseIdExpr(IdExpr e) {
		return doSwitch(e.getId());
	}

	@Override
	public Value caseIntExpr(IntExpr e) {
		return new IntegerValue(e.getVal());
	}

	@Override
	public Value caseRealExpr(RealExpr e) {
		return new RealValue(new BigFraction(new BigDecimal(e.getVal())));
	}

	@Override
	public Value caseBoolExpr(BoolExpr e) {
		return BooleanValue.fromBoolean(e.getVal().equals("true"));
	}

	@Override
	public Value caseIfThenElseExpr(IfThenElseExpr e) {
		Value cond = doSwitch(e);
		if (cond instanceof BooleanValue) {
			boolean condValue = ((BooleanValue) cond).value;
			return doSwitch(condValue ? e.getThen() : e.getElse());
		} else {
			return null;
		}
	}

	@Override
	public Value caseRecordExpr(RecordExpr e) {
		Map<String, Value> fields = new HashMap<>();
		for (int i = 0; i < e.getFields().size(); i++) {
			Field field = e.getFields().get(i);
			Expr expr = e.getExprs().get(i);
			fields.put(field.getName(), doSwitch(expr));
		}
		return new RecordValue(fields);
	}
}
