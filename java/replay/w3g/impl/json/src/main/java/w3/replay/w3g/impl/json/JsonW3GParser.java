package w3.replay.w3g.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import w3.replay.w3g.api.W3GParser;
import w3.replay.w3g.model.W3G;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3GParser implements W3GParser {
    private final InputStream inputStream;

    public JsonW3GParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3G parse() {
        try {
            return new ObjectMapper().readValue(inputStream, W3G.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
