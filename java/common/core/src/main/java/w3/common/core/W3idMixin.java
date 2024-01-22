package w3.common.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class W3idMixin {
    @JsonCreator
    public W3idMixin(@JsonProperty("value") String value) {

    }
}
