package jkind.xtext.typing;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JTupleType extends JType {
	public final List<JType> types;
	
	public JTupleType(List<JType> types) {
		this.types = Collections.unmodifiableList(types);
	}
	
	public int size() {
		return types.size();
	}
	
	@Override
	public String toString() {
		if (types.isEmpty()) {
			return "()";
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		Iterator<JType> iterator = types.iterator();
		sb.append(iterator.next());
		while (iterator.hasNext()) {
			sb.append(", ");
			sb.append(iterator.next());
		}
		sb.append(")");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		return types.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JTupleType) {
			JTupleType other = (JTupleType) obj;
			return types.equals(other.types);
		}
		return false;
	}
}
