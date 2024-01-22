package w3.common.core.app;


import w3.common.core.DataType;
import w3.common.core.DataTypeInfo;
import w3.common.core.War3Num;

import javax.annotation.Nonnull;

public class War3Int extends DataType implements War3Num {
	public static String name() {
		return "War3Int";
	}
	
	public static War3Int getDefVal() {
		return new War3Int(0);
	}
	
	private int value;
	
	public Integer getValue() {
		return value;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof War3Int)
			return equals((War3Int) other);
		
		return super.equals(other);
	}
	
	public boolean equals(War3Int other) {
		return getValue().equals(other.getValue());
	}
	
	@Override
	public String toString() {
		return getValue().toString();
	}
	
	public int toInt() {
		return getValue();
	}
	
	@Override
	public float toFloat() {
		return getValue();
	}
	
	protected War3Int(int value) {
		super();
		
		this.value = value;
	}
	
	public War3Int() {
		
	}

	@Nonnull
	public static War3Int valueOf(int value) {
		return new War3Int(value);
	}

	public static War3Int valueOf(Integer value) {
		if (value == null) {
			return null;
		}

		return valueOf(value.intValue());
	}

	public static War3Int valueOf(Object value) throws DataTypeInfo.CastException {
		try {
			if (value instanceof Long) {
				return valueOf(((Long) value).intValue());
			}
			return valueOf(Integer.parseInt(value.toString()));
		} catch (NumberFormatException e) {
			throw new DataTypeInfo.CastException(e);
		}
	}
	
	@Override
	public War3Int decode(Object value) throws DataTypeInfo.CastException {
		return valueOf(value);
	}
	
	public static War3Int decodeStatic(Object value) throws DataTypeInfo.CastException {
		return valueOf(value);
	}
}