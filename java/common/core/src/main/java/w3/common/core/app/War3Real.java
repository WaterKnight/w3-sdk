package w3.common.core.app;


import w3.common.core.DataType;
import w3.common.core.DataTypeInfo;
import w3.common.core.War3Num;

public class War3Real extends DataType implements War3Num {
	public static String name() {
		return "War3Real";
	}

	public final static War3Real getDefVal() {
		return new War3Real(0F);
	}
	
	private float value;
	
	public Float getValue() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof War3Real)
			return equals((War3Real) other);

		return super.equals(other);
	}

	public boolean equals(War3Real other) {
		return getValue().equals(other.getValue());
	}

	@Override
	public String toString() {
		return getValue().toString();
	}
	
	@Override
	public float toFloat() {
		return value;
	}
	
	public double toDouble() {
		return getValue();
	}

	public int intValue() {
		return getValue().intValue();
	}
	
	public War3Real(float val) {
		super();
		
		value = val;
	}
	
	public static War3Real valueOf(float val) {
		return new War3Real(val);
	}

	public static War3Real valueOf(Object val) throws DataTypeInfo.CastException {
		try {
			War3Real ret = valueOf(Float.parseFloat(val.toString()));
			
			return ret;
		} catch (NumberFormatException e) {
		}
		
		return null;
	}
	
	public War3Real() {
		
	}
	
	@Override
	public War3Real decode(Object val) throws DataTypeInfo.CastException {
		return valueOf(val);
	}
	
	public static War3Real decodeStatic(Object val) throws DataTypeInfo.CastException {
		return valueOf(val);
	}
}