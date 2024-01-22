package w3.object.upgrade.mod.w3q.impl.json;

import w3.common.json.W3ObjectMapper;
import w3.common.core.W3idMixin;
import w3.object.upgrade.mod.w3q.api.W3QParser;
import w3.object.upgrade.mod.w3q.impl.kaitai.W3id;
import w3.object.upgrade.mod.w3q.model.W3Q;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3QParser implements W3QParser {
    private final InputStream inputStream;

    public JsonW3QParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3Q parse() {
        try {
            return new W3ObjectMapper()
                    .addMixIn(W3id.class, W3idMixin.class)
                    .readValue(inputStream, W3Q.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
