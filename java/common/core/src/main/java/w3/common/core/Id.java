package w3.common.core;

public class Id extends DataType {
    private final String value;

    protected Id() {
        this.value = null;
    }

    protected Id(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        if (getValue().length() != 4) {
            return getValue().hashCode();
        }

        return Math.decode(getValue(), Math.CODE_ASCII);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Id) {
            return equals((Id) other);
        }

        return super.equals(other);
    }

    public boolean equals(Id other) {
        return hashCode() == other.hashCode();
    }

    public static Id valueOf(String idString) {
        return new Id(idString);
    }

    public Id lower() {
        return Id.valueOf(getValue().toLowerCase());
    }

    @Override
    public DataType decode(Object val) throws DataTypeInfo.CastException {
        return null;
    }
}