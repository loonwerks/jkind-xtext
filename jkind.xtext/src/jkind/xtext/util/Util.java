package jkind.xtext.util;

import jkind.xtext.jkind.Field;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.Type;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.VariableGroup;

public class Util {
	public static Node getMainNode(File file) {
		Node main = null;
		for (Node node : file.getNodes()) {
			if (!node.getMain().isEmpty()) {
				main = node;
			}
		}
		if (main == null && !file.getNodes().isEmpty()) {
			main = file.getNodes().get(file.getNodes().size() - 1);
		}
		return main;
	}
	
	public static Type getType(Variable v) {
		return ((VariableGroup) v.eContainer()).getType();
	}

	public static Type getType(Field e) {
		RecordType record = (RecordType) e.eContainer();
		return record.getTypes().get(record.getFields().indexOf(e));
	}
}
