package jkind.xtext.validation;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class JRecordType extends JType {
	public final String id;
	public final Map<String, JType> fields;
	
	public JRecordType(String id, Map<String, JType> fields) {
		this.id = id;
		this.fields = Collections.unmodifiableSortedMap(new TreeMap<>(fields));
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
		if (obj instanceof JRecordType) {
			JRecordType other = (JRecordType) obj;
			return id.equals(other.id);
		}
		return false;
	}
}
