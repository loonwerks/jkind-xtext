package jkind.xtext.converter;

import org.eclipse.xtext.conversion.impl.IDValueConverter;

/**
 * We do not allow fully qualified variable names in our grammar, so we must
 * modify the IDValueConverter in order to enable refactoring without warnings
 */
public class JKindIDValueConverter extends IDValueConverter {
	@Override
	public String toString(String value) {
		return super.toString(getLastSegment(value));
	}

	private String getLastSegment(String qualifiedName) {
		int index = qualifiedName.lastIndexOf('.');
		if (index != -1) {
			return qualifiedName.substring(index + 1);
		} else {
			return qualifiedName;
		}
	}
}