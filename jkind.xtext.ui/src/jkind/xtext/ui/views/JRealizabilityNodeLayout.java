package jkind.xtext.ui.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jkind.results.layout.Layout;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.Variable;
import jkind.xtext.util.Util;

public class JRealizabilityNodeLayout implements Layout {
	private final List<String> realizabilityInputs;
	private final List<String> realizabilityOutputs;
	private final List<String> nodeOutputs;
	private final List<String> nodeLocals;

	private static final String REALIZABILITY_INPUTS = "Realizability Inputs";
	private static final String REALIZABILITY_OUTPUTS = "Realizability Outputs";
	private static final String NODE_OUTPUTS = "Node Outputs";
	private static final String NODE_LOCALS = "Node Locals";
	private static final String NODE_INLINED = "Node Inlined";
	private static final String[] CATEGORIES = { REALIZABILITY_INPUTS, REALIZABILITY_OUTPUTS,
			NODE_OUTPUTS, NODE_LOCALS, NODE_INLINED };

	public JRealizabilityNodeLayout(Node node) {
		if (node == null) {
			throw new IllegalArgumentException("Unable to create layout for null node");
		}

		this.realizabilityInputs = getNames(node.getRealizabilityInputs().get(0).getIds());
		this.realizabilityOutputs = getNames(Util.getVariables(node.getInputs()));
		this.realizabilityOutputs.removeAll(this.realizabilityInputs);
		
		this.nodeOutputs = getNames(Util.getVariables(node.getOutputs()));
		this.nodeLocals = getNames(Util.getVariables(node.getLocals()));
	}

	public JRealizabilityNodeLayout(File file) {
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
		if (realizabilityInputs.contains(prefix)) {
			return REALIZABILITY_INPUTS;
		} else if (realizabilityOutputs.contains(prefix)) {
			return REALIZABILITY_OUTPUTS;
		} else if (nodeOutputs.contains(prefix)) {
			return NODE_OUTPUTS;
		} else if (nodeLocals.contains(prefix)) {
			return NODE_LOCALS;
		} else {
			return NODE_INLINED;
		}
	}
}