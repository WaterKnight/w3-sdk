package w3.save.w3v.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import w3.save.w3v.api.W3VParser;
import w3.save.w3v.model.W3V;
import w3.save.w3v.model.W3id;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3VParser implements W3VParser {
    private final InputStream inputStream;

    public JsonW3VParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3V parse() {
        try {
            return new ObjectMapper().addMixIn(W3id.class, W3idMixin.class).readValue(inputStream, W3V.class);
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
