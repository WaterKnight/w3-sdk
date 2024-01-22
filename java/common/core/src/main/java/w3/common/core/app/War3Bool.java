package w3.common.core.app;

import w3.common.core.DataType;

import javax.annotation.Nonnull;

public class War3Bool extends DataType {
	public static String name() {
		return "War3Bool";
	}

	@Nonnull
	public static War3Bool getDefVal() {
		return new War3Bool(false);
	}
	
	private boolean value;

	public boolean getValue() {
		return value;
	}

	@Override
	public String toString() {
		return Boolean.valueOf(getValue()).toString();
	}
	
	private War3Bool(boolean val) {
		value = val;
	}
	
	public static War3Bool valueOf(boolean val) {
		return new War3Bool(val);
	}

	public static War3Bool valueOf(Object val) {
		if (val != null) {
			String s = val.toString();

			switch (s) {
				case "0":
				case "false":
					return valueOf(false);
				case "1":
				case "true":
					return valueOf(true);
			}
		}
		
		return null;
	}
	
	@Override
	public War3Bool decode(Object val) {
		return valueOf(val);
	}
	
	public static War3Bool decodeStatic(Object val) {
		return valueOf(val);
	}
}
