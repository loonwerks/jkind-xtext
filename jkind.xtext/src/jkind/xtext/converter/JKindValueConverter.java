package jkind.xtext.converter;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class JKindValueConverter extends AbstractDeclarativeValueConverterService {
	@Inject
	private JKindIDValueConverter idValueConverter;

	@ValueConverter(rule = "ID")
	public IValueConverter<String> ID() {
		return idValueConverter;
	}
}