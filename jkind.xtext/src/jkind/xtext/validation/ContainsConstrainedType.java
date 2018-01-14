package jkind.xtext.validation;

import jkind.xtext.jkind.AbbreviationType;
import jkind.xtext.jkind.ArrayType;
import jkind.xtext.jkind.BoolType;
import jkind.xtext.jkind.EnumType;
import jkind.xtext.jkind.IntType;
import jkind.xtext.jkind.RealType;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.SubrangeType;
import jkind.xtext.jkind.Type;
import jkind.xtext.jkind.UserType;
import jkind.xtext.jkind.util.JkindSwitch;

public class ContainsConstrainedType extends JkindSwitch<Boolean> {
	public static boolean check(Type type) {
		return new ContainsConstrainedType().doSwitch(type);
	}

	@Override
	public Boolean caseAbbreviationType(AbbreviationType e) {
		return doSwitch(e.getType());
	}

	@Override
	public Boolean caseRecordType(RecordType e) {
		for (Type type : e.getTypes()) {
			if (doSwitch(type)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean caseEnumType(EnumType e) {
		return true;
	}

	@Override
	public Boolean caseArrayType(ArrayType e) {
		return doSwitch(e.getBase());
	}

	@Override
	public Boolean caseIntType(IntType e) {
		return false;
	}

	@Override
	public Boolean caseBoolType(BoolType e) {
		return false;
	}

	@Override
	public Boolean caseRealType(RealType e) {
		return false;
	}

	@Override
	public Boolean caseSubrangeType(SubrangeType e) {
		return true;
	}

	@Override
	public Boolean caseUserType(UserType e) {
		return doSwitch(e.getDef());
	}
}
