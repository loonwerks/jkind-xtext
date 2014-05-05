package jkind.xtext.util;

import java.util.ArrayList;
import java.util.List;

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
	
	public static List<Variable> getVariables(List<VariableGroup> groups) {
		List<Variable> result = new ArrayList<>();
		for (VariableGroup group : groups) {
			result.addAll(group.getVariables());
		}
		return result;
	}
	
	public static List<Variable> getNodeVariables(Node node) {
		List<VariableGroup> groups = new ArrayList<>();
		groups.addAll(node.getInputs());
		groups.addAll(node.getOutputs());
		groups.addAll(node.getLocals());
		return getVariables(groups);
	}
}
