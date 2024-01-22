package w3.info.w3i.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import w3.info.w3i.api.W3IParser;
import w3.info.w3i.model.W3I;
import w3.info.w3i.model.W3id;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3IParser implements W3IParser {
    private final InputStream inputStream;

    public JsonW3IParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3I parse() {
        try {
            return new ObjectMapper().addMixIn(W3id.class, W3idMixin.class).readValue(inputStream, W3I.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class W3idMixin {
        @JsonCreator
        public W3idMixin(@JsonProperty("value") String val) {

        }
    }
}
