package jkind.xtext.converter;

import java.math.BigInteger;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class JKindValueConverter extends AbstractDeclarativeValueConverterService {
	@Inject
	private JKindINTValueConverter bigIntegerValueConverter;
	
	@ValueConverter(rule = "INT")
	public IValueConverter<BigInteger> INT() {
		return bigIntegerValueConverter;
	}
	
	@Inject
	private JKindIDValueConverter idValueConverter;

	@ValueConverter(rule = "ID")
	public IValueConverter<String> ID() {
		return idValueConverter;
	}
}