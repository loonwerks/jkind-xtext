package jkind.xtext.scoping;

import jkind.xtext.jkind.AbbreviationType;
import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.NodeCallExpr;
import jkind.xtext.jkind.RecordAccessExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.UserType;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.VariableGroup;
import jkind.xtext.jkind.util.JkindSwitch;
import jkind.xtext.util.Util;

public class RecordTypeLookup extends JkindSwitch<RecordType> {
	@Override
	public RecordType caseConstant(Constant e) {
		if (e.getType() != null) {
			return doSwitch(e.getType());
		} else {
			return doSwitch(e.getExpr());
		}
	}

	@Override
	public RecordType caseVariable(Variable e) {
		return doSwitch(Util.getType(e));
	}

	@Override
	public RecordType caseAbbreviationType(AbbreviationType e) {
		return doSwitch(e.getType());
	}

	@Override
	public RecordType caseRecordType(RecordType e) {
		return e;
	}

	@Override
	public RecordType caseUserType(UserType e) {
		return doSwitch(e.getDef());
	}

	@Override
	public RecordType caseBinaryExpr(BinaryExpr e) {
		if (e.getOp().equals("->")) {
			return doSwitch(e.getLeft());
		} else {
			return null;
		}
	}

	@Override
	public RecordType caseUnaryExpr(UnaryExpr e) {
		if (e.getOp().equals("pre")) {
			return doSwitch(e.getExpr());
		} else {
			return null;
		}
	}

	@Override
	public RecordType caseRecordAccessExpr(RecordAccessExpr e) {
		return doSwitch(Util.getType(e.getField()));
	}

	@Override
	public RecordType caseIdExpr(IdExpr e) {
		return doSwitch(e.getId());
	}

	@Override
	public RecordType caseIfThenElseExpr(IfThenElseExpr e) {
		return doSwitch(e.getThen());
	}

	@Override
	public RecordType caseNodeCallExpr(NodeCallExpr e) {
		VariableGroup group = e.getNode().getOutputs().get(0);
		return doSwitch(group.getType());
	}

	@Override
	public RecordType caseRecordExpr(RecordExpr e) {
		return e.getType();
	}
}
