package w3.common.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DataTypeMixin {
    @JsonIgnore
    public DataTypeInfo getTypeInfo() {
        throw new RuntimeException();
    }
}
