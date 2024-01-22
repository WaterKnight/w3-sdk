package w3.strings.wts.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import w3.strings.wts.api.WTSParser;
import w3.strings.wts.model.WTS;

import java.io.IOException;
import java.io.InputStream;

public class JsonWTSParser implements WTSParser {
    private final InputStream inputStream;

    public JsonWTSParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public WTS parse() {
        try {
            return new ObjectMapper().readValue(inputStream, WTS.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
