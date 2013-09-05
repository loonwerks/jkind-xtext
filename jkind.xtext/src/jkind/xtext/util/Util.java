package jkind.xtext.util;

import jkind.xtext.jkind.File;
import jkind.xtext.jkind.Node;

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
}
