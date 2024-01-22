package w3.object.item.mod.w3t.impl.json;

import w3.common.json.W3ObjectMapper;
import w3.common.core.W3idMixin;
import w3.object.item.mod.w3t.api.W3TParser;
import w3.object.item.mod.w3t.impl.kaitai.W3id;
import w3.object.item.mod.w3t.model.W3T;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3TParser implements W3TParser {
    private final InputStream inputStream;

    public JsonW3TParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3T parse() {
        try {
            return new W3ObjectMapper()
                    .addMixIn(W3id.class, W3idMixin.class)
                    .readValue(inputStream, W3T.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
