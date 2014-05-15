package jkind.xtext.validation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jkind.lustre.BinaryOp;
import jkind.lustre.UnaryOp;
import jkind.lustre.values.ArrayValue;
import jkind.lustre.values.BooleanValue;
import jkind.lustre.values.IntegerValue;
import jkind.lustre.values.RealValue;
import jkind.lustre.values.RecordValue;
import jkind.lustre.values.TupleValue;
import jkind.lustre.values.Value;
import jkind.util.BigFraction;
import jkind.xtext.jkind.ArrayAccessExpr;
import jkind.xtext.jkind.ArrayExpr;
import jkind.xtext.jkind.ArrayUpdateExpr;
import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.BoolExpr;
import jkind.xtext.jkind.CastExpr;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.Field;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.IntExpr;
import jkind.xtext.jkind.RealExpr;
import jkind.xtext.jkind.RecordAccessExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordUpdateExpr;
import jkind.xtext.jkind.TupleExpr;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.util.JkindSwitch;

public class ConstantEvaluator extends JkindSwitch<Value> {
	@Override
	public Value caseArrayAccessExpr(ArrayAccessExpr e) {
		ArrayValue array = (ArrayValue) doSwitch(e.getArray());
		IntegerValue index = (IntegerValue) doSwitch(e.getIndex());
		if (array == null || index == null) {
			return null;
		}
		return array.elements.get(index.value.intValue());
	}

	@Override
	public Value caseArrayExpr(ArrayExpr e) {
		List<Value> elements = doSwitchList(e.getExprs());
		if (elements == null) {
			return null;
		}
		return new ArrayValue(elements);
	}

	@Override
	public Value caseArrayUpdateExpr(ArrayUpdateExpr e) {
		ArrayValue array = (ArrayValue) doSwitch(e.getAccess().getArray());
		IntegerValue index = (IntegerValue) doSwitch(e.getAccess().getIndex());
		Value value = doSwitch(e.getValue());
		if (array == null || index == null || value == null) {
			return null;
		}
		return array.update(index.value.intValue(), value);
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
	public Value caseBoolExpr(BoolExpr e) {
		return BooleanValue.fromBoolean(e.getVal().equals("true"));
	}

	@Override
	public Value caseCastExpr(CastExpr e) {
		Value value = doSwitch(e.getExpr());
		if (value == null) {
			return null;
		}
	
		if (e.getOp().equals("real") && value instanceof IntegerValue) {
			IntegerValue iv = (IntegerValue) value;
			return new RealValue(new BigFraction(iv.value));
		} else if (e.getOp().equals("floor") && value instanceof RealValue) {
			RealValue rv = (RealValue) value;
			return new IntegerValue(rv.value.floor());
		} else {
			// Treat this like a type error
			throw new ClassCastException();
		}
	}

	@Override
	public Value caseIdExpr(IdExpr e) {
		return doSwitch(e.getId());
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
	public Value caseIntExpr(IntExpr e) {
		return new IntegerValue(e.getVal());
	}

	@Override
	public Value caseRealExpr(RealExpr e) {
		return new RealValue(new BigFraction(new BigDecimal(e.getVal())));
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
	public Value caseRecordExpr(RecordExpr e) {
		Map<String, Value> fields = new HashMap<>();
		for (int i = 0; i < e.getFields().size(); i++) {
			Field field = e.getFields().get(i);
			Expr expr = e.getExprs().get(i);
			fields.put(field.getName(), doSwitch(expr));
		}
		return new RecordValue(fields);
	}

	@Override
	public Value caseRecordUpdateExpr(RecordUpdateExpr e) {
		RecordValue record = (RecordValue) doSwitch(e.getRecord());
		Value value = doSwitch(e.getValue());
		if (record == null || value == null) {
			return null;
		}
		return record.update(e.getField().getName(), value);
	}
	
	@Override
	public Value caseTupleExpr(TupleExpr e) {
		return new TupleValue(doSwitchList(e.getExprs()));
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
	public Value caseConstant(Constant e) {
		return doSwitch(e.getExpr());
	}

	private List<Value> doSwitchList(List<Expr> es) {
		List<Value> result = new ArrayList<>();
		for (Expr e : es) {
			Value v = doSwitch(e);
			if (v == null) {
				return null;
			}
			result.add(v);
		}
		return result;
	}
}
