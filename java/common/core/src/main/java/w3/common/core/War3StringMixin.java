package w3.common.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class War3StringMixin {
    @JsonIgnore
    public String getValue() {
        throw new RuntimeException();
    }
}
