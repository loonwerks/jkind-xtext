/*
 * generated by Xtext
 */
package jkind.xtext;

import jkind.xtext.converter.JKindValueConverter;
import jkind.xtext.scoping.JKindImportedNamespaceAwareLocalScopeProvider;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class JKindRuntimeModule extends AbstractJKindRuntimeModule {
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return JKindValueConverter.class;
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return IGenerator.NullGenerator.class;
	}

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class)
				.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
				.to(JKindImportedNamespaceAwareLocalScopeProvider.class);
	}
}
