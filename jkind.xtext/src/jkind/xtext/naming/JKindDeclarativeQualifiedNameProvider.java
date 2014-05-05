package jkind.xtext.naming;

import jkind.xtext.jkind.EnumValue;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class JKindDeclarativeQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	protected QualifiedName qualifiedName(EnumValue e){
		return QualifiedName.create(e.getName());
	}
}
