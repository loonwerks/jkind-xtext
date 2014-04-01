package jkind.xtext.typing;


public class JArrayType extends JType {
	public final JType base;
	public final int size;
	
	public JArrayType(JType base, int size) {
		this.base = base;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return base + "[" + size + "]";
	}

	@Override
	public int hashCode() {
		return base.hashCode() + size;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JArrayType) {
			JArrayType other = (JArrayType) obj;
			return size == other.size && base.equals(other.base);
		}
		return false;
	}
}
