package w3.ai.wai.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import w3.script.ai.wai.api.WAIParser;
import w3.ai.wai.model.W3id;
import w3.script.ai.wai.model.WAI;

import java.io.IOException;
import java.io.InputStream;

public class JsonWAIParser implements WAIParser {
    private final InputStream inputStream;

    public JsonWAIParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public WAI parse() {
        try {
            return new ObjectMapper().addMixIn(W3id.class, W3idMixin.class).readValue(inputStream, WAI.class);
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
