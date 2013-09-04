package jkind.xtext.validation;

public class JBuiltinType extends JType {
	public static final JBuiltinType BOOL = new JBuiltinType("bool");
	public static final JBuiltinType INT = new JBuiltinType("int");
	public static final JBuiltinType REAL = new JBuiltinType("real");
	public static final JBuiltinType ERROR = new JBuiltinType("<error>");
	
	private final String name;
	
	private JBuiltinType(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
