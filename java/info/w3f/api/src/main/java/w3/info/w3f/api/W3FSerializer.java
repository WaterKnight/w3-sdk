package w3.info.w3f.api;

import w3.common.api.Serializer;
import w3.info.w3f.model.W3F;
import w3.info.w3f.model.W3W3f;

public interface W3FSerializer extends Serializer<W3F> {
    void serialize(W3F data);
}
