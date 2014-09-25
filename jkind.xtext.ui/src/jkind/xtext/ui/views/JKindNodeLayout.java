package jkind.xtext.ui.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jkind.results.layout.Layout;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.Variable;
import jkind.xtext.util.Util;

public class JKindNodeLayout implements Layout {
	private final List<String> nodeInputs;
	private final List<String> nodeOutputs;
	private final List<String> nodeLocals;
	
	private static final String INPUTS = "Inputs";
	private static final String OUTPUTS = "Outputs";
	private static final String LOCALS = "Locals";
	private static final String INLINED = "Inlined";
	private static final String[] CATEGORIES = { INPUTS, OUTPUTS, LOCALS, INLINED };

	public JKindNodeLayout(Node node) {
		if (node == null) {
			throw new IllegalArgumentException("Unable to create layout for null node");
		}
		
		this.nodeInputs = getNames(Util.getVariables(node.getInputs()));
		this.nodeOutputs = getNames(Util.getVariables(node.getOutputs()));
		this.nodeLocals = getNames(Util.getVariables(node.getLocals()));
	}
	
	public JKindNodeLayout(File file) {
		this(Util.getMainNode(file));
	}
	
	private List<String> getNames(List<Variable> variables) {
		List<String> names = new ArrayList<>();
		for (Variable v : variables) {
			names.add(v.getName());
		}
		return names;
	}

	@Override
	public List<String> getCategories() {
		return Arrays.asList(CATEGORIES);
	}

	@Override
	public String getCategory(String signal) {
		String prefix = signal.split("\\.|\\[")[0];
		if (nodeInputs.contains(prefix)) {
			return INPUTS;
		} else if (nodeOutputs.contains(prefix)) {
			return OUTPUTS;
		} else if (nodeLocals.contains(prefix)) {
			return LOCALS;
		} else {
			return INLINED;
		}
	}

}