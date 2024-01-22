package w3.common.core.app;

import w3.common.core.DataType;

import java.util.Optional;

public class War3String extends DataType {
	private static final War3String EMPTY_STRING = new War3String("");

	public static String name() {
		return "String";
	}

	public static War3String getDefaultValue() {
		return EMPTY_STRING;
	}

    private String value;

    public void setValue(String value) {
    this.value = value;
  }

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getValue();
	}

	@Override
	public int hashCode() {
		return Optional.ofNullable(toString()).map(String::hashCode).orElse(0);
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof War3String)
			return equals((War3String) other);
		if (other instanceof String)
			return equals(War3String.valueOf(other));

		return super.equals(other);
	}

	public boolean equals(War3String other) {
		return (hashCode() == other.hashCode());
	}

	public War3String() {

	}

	public War3String(String value, String... aliases) {
		this.value = value;
	}

	public static War3String valueOf(Object value) {
		if (value == null) return null;

		return new War3String(value.toString());
	}

	@Override
	public War3String decode(Object value) {
		return valueOf(value);
	}

	public static War3String decodeStatic(Object value) {
		return valueOf(value);
	}
}
