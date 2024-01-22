package w3.object.ability.mod.w3a.impl.json;

import w3.common.json.W3ObjectMapper;
import w3.common.core.W3idMixin;
import w3.object.ability.mod.w3a.api.W3AParser;
import w3.object.ability.mod.w3a.impl.kaitai.W3id;
import w3.object.ability.mod.w3a.model.W3A;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3AParser implements W3AParser {
    private final InputStream inputStream;

    public JsonW3AParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3A parse() {
        try {
            return new W3ObjectMapper()
                    .addMixIn(W3id.class, W3idMixin.class)
                    .readValue(inputStream, W3A.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
