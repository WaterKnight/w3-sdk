package w3.object.unit.mod.w3u.impl.json;

import w3.common.json.W3ObjectMapper;
import w3.common.core.W3idMixin;
import w3.object.unit.mod.w3u.api.W3UParser;
import w3.object.unit.mod.w3u.impl.kaitai.W3id;
import w3.object.unit.mod.w3u.model.W3U;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3UParser implements W3UParser {
    private final InputStream inputStream;

    public JsonW3UParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3U parse() {
        try {
            return new W3ObjectMapper()
                    .addMixIn(W3id.class, W3idMixin.class)
                    .readValue(inputStream, W3U.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
