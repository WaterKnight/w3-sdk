package w3.common.core;

import w3.common.core.Id;

public class FieldState<T extends DataType> {
    private final Id id;
    private final DataTypeInfo type;
    private final T defaultValue;

    public FieldState(Id id, Class<T> type, T defaultValue) {
        this.id = id;
        this.type = new DataTypeInfo(type);
        this.defaultValue = defaultValue;
    }

    public FieldState(Id id, DataTypeInfo type, T defaultValue) {
        this.id = id;
        this.type = type;
        this.defaultValue = defaultValue;
    }
}
