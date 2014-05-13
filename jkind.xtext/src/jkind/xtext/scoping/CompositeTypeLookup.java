package jkind.xtext.scoping;

import jkind.xtext.jkind.AbbreviationType;
import jkind.xtext.jkind.ArrayAccessExpr;
import jkind.xtext.jkind.ArrayType;
import jkind.xtext.jkind.ArrayUpdateExpr;
import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.JkindFactory;
import jkind.xtext.jkind.NodeCallExpr;
import jkind.xtext.jkind.RecordAccessExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.RecordUpdateExpr;
import jkind.xtext.jkind.Type;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.UserType;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.VariableGroup;
import jkind.xtext.jkind.util.JkindSwitch;
import jkind.xtext.util.Util;

public class CompositeTypeLookup extends JkindSwitch<Type> {
	public static RecordType getRecordType(Expr e) {
		UserType ut = (UserType) new CompositeTypeLookup().doSwitch(e);
		return (RecordType) ut.getDef();
	}
	
	@Override
	public Type caseConstant(Constant e) {
		if (e.getType() != null) {
			return doSwitch(e.getType());
		} else {
			return doSwitch(e.getExpr());
		}
	}

	@Override
	public Type caseVariable(Variable e) {
		return doSwitch(Util.getType(e));
	}

	@Override
	public Type caseAbbreviationType(AbbreviationType e) {
		return doSwitch(e.getType());
	}

	@Override
	public Type caseRecordType(RecordType e) {
		return wrapRecordType(e);
	}
	
	@Override
	public Type caseArrayType(ArrayType e) {
		return e;
	}

	@Override
	public Type caseUserType(UserType e) {
		return doSwitch(e.getDef());
	}

	@Override
	public Type caseBinaryExpr(BinaryExpr e) {
		if (e.getOp().equals("->")) {
			return doSwitch(e.getLeft());
		} else {
			return null;
		}
	}

	@Override
	public Type caseUnaryExpr(UnaryExpr e) {
		if (e.getOp().equals("pre")) {
			return doSwitch(e.getExpr());
		} else {
			return null;
		}
	}

	@Override
	public Type caseRecordAccessExpr(RecordAccessExpr e) {
		return doSwitch(Util.getType(e.getField()));
	}

	@Override
	public Type caseRecordUpdateExpr(RecordUpdateExpr e) {
		return doSwitch(e.getRecord());
	}

	@Override
	public Type caseArrayAccessExpr(ArrayAccessExpr e) {
		ArrayType at = (ArrayType) doSwitch(e.getArray());
		return at.getBase();
	}

	@Override
	public Type caseArrayUpdateExpr(ArrayUpdateExpr e) {
		return doSwitch(e.getAccess().getArray());
	}

	@Override
	public Type caseIdExpr(IdExpr e) {
		return doSwitch(e.getId());
	}

	@Override
	public Type caseIfThenElseExpr(IfThenElseExpr e) {
		return doSwitch(e.getThen());
	}

	@Override
	public Type caseNodeCallExpr(NodeCallExpr e) {
		VariableGroup group = e.getNode().getOutputs().get(0);
		return doSwitch(group.getType());
	}

	@Override
	public Type caseRecordExpr(RecordExpr e) {
		return wrapRecordType(e.getType());
	}
	
	private Type wrapRecordType(RecordType e) {
		UserType ut = JkindFactory.eINSTANCE.createUserType();
		ut.setDef(e);
		return ut;
	}
}
