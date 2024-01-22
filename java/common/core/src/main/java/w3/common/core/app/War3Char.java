package w3.common.core.app;

import w3.common.core.DataType;

import javax.annotation.Nonnull;

public class War3Char extends DataType {
	private final char value;

	@Nonnull
	public Character getValue() {
		return value;
	}

	private War3Char(char val) {
		value = val;
	}

	@Nonnull
	public static War3Char valueOf(char val) {
		return new War3Char(val);
	}

	@Override
	public DataType decode(Object val) {
		return new War3Char(val.toString().charAt(0));
	}
}