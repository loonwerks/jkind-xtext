package jkind.xtext.ui;

import jkind.xtext.jkind.AbbreviationType;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Field;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.Type;
import jkind.xtext.jkind.Variable;
import jkind.xtext.util.Util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import com.google.inject.Inject;

public class JKindEObjectHoverProvider extends DefaultEObjectHoverProvider {
	@Inject
	ISerializer serializer;

	@Override
	protected String getFirstLine(EObject e) {
		if (e instanceof RecordType) {
			return serializer.serialize(e);
		}
		
		String result = super.getFirstLine(e);
		Type type = getType(e);
		if (type != null) {
			return result + " : " + serializer.serialize(type);
		} else {
			return result;
		}
	}

	private Type getType(EObject e) {
		if (e instanceof Variable) {
			return Util.getType((Variable) e);
		} else if (e instanceof Constant) {
			return ((Constant) e).getType();
		} else if (e instanceof Field) {
			return Util.getType((Field) e);
		} else if (e instanceof AbbreviationType) {
			return ((AbbreviationType) e).getType();
		}

		return null;
	}
}
