package jkind.xtext.typing;

import java.util.Collections;
import java.util.List;

public class JEnumType extends JType {
	public final String id;
	public final List<String> values;
	
	public JEnumType(String id, List<String> values) {
		this.id = id;
		this.values = Collections.unmodifiableList(values);
	}
	
	@Override
	public String toString() {
		return id;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JEnumType) {
			JEnumType other = (JEnumType) obj;
			return id.equals(other.id);
		}
		return false;
	}
}
