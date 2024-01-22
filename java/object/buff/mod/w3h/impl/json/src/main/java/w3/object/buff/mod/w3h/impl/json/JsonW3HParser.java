package w3.object.buff.mod.w3h.impl.json;

import w3.common.json.W3ObjectMapper;
import w3.common.core.W3idMixin;
import w3.object.buff.mod.w3h.api.W3HParser;
import w3.object.buff.mod.w3h.impl.kaitai.W3id;
import w3.object.buff.mod.w3h.model.W3H;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3HParser implements W3HParser {
    private final InputStream inputStream;

    public JsonW3HParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3H parse() {
        try {
            return new W3ObjectMapper()
                    .addMixIn(W3id.class, W3idMixin.class)
                    .readValue(inputStream, W3H.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
