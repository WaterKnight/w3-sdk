package w3.info.w3i.api;

import w3.common.api.Serializer;
import w3.info.w3i.model.W3I;

public interface W3ISerializer extends Serializer<W3I> {
    void serialize(W3I w3i);
}
