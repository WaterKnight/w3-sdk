package w3.object.destructable.mod.w3b.impl.json;

import w3.common.json.W3ObjectMapper;
import w3.common.core.W3idMixin;
import w3.object.destructable.mod.w3b.api.W3BParser;
import w3.object.destructable.mod.w3b.impl.kaitai.W3id;
import w3.object.destructable.mod.w3b.model.W3B;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3BParser implements W3BParser {
    private final InputStream inputStream;

    public JsonW3BParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3B parse() {
        try {
            return new W3ObjectMapper()
                    .addMixIn(W3id.class, W3idMixin.class)
                    .readValue(inputStream, W3B.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
