package wc3.script.gui.wct.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import w3.script.gui.wct.api.WCTParser;
import wc3.script.gui.wct.model.WCT;

import java.io.IOException;
import java.io.InputStream;

public class JsonWCTParser implements WCTParser {
    private final InputStream inputStream;

    public JsonWCTParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public WCT parse() {
        try {
            return new ObjectMapper().readValue(inputStream, WCT.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
