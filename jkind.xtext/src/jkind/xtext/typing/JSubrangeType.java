package jkind.xtext.typing;

import java.math.BigInteger;

public class JSubrangeType extends JType {
	public final BigInteger low;
	public final BigInteger high;
	
	public JSubrangeType(BigInteger low, BigInteger high) {
		this.low = low;
		this.high = high;
	}
	
	@Override
	public String toString() {
		return "int";
	}

	public String toSubrangeString() {
		return "subrange [" + low + ", " + high + "] of int";
	}

	@Override
	public int hashCode() {
		return low.hashCode() + high.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JSubrangeType) {
			JSubrangeType other = (JSubrangeType) obj;
			return low.equals(other.low) && high.equals(other.high);
		}
		return false;
	}
}
