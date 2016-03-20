package jkind.xtext.util;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import jkind.JKindException;
import jkind.xtext.jkind.Field;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.Type;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.VariableGroup;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class Util {
	public static Node getMainNode(jkind.xtext.jkind.File file) {
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

	public static String getCycleErrorMessage(List<String> cycle) {
		StringBuilder text = new StringBuilder();
		boolean first = true;
		for (String node : cycle) {
			if (first) {
				first = false;
			} else {
				text.append(" -> ");
			}
			text.append(node);
		}
		return text.toString();
	}

	public static String getJKindJar() {
		Bundle bundle = Platform.getBundle("jkind.xtext");
		URL url = bundle.getEntry("dependencies/jkind.jar");
		try {
			URL fileUrl = FileLocator.toFileURL(url);
			return new File(fileUrl.getPath()).toString();
		} catch (Exception e) {
			throw new JKindException("Unable to extract jkind.jar from plug-in", e);
		}
	}
}
