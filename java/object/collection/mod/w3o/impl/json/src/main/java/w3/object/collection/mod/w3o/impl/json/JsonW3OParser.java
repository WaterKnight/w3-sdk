package w3.object.collection.mod.w3o.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import w3.object.collection.mod.w3o.api.W3OParser;
import w3.object.collection.mod.w3o.model.W3O;
import w3.object.collection.mod.w3o.model.W3id;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3OParser implements W3OParser {
    private final InputStream inputStream;

    public JsonW3OParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3O parse() {
        try {
            return new ObjectMapper().addMixIn(W3id.class, W3idMixin.class).readValue(inputStream, W3O.class);
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
