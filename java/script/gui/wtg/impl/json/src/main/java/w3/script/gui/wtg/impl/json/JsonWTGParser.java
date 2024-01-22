package w3.script.gui.wtg.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import w3.script.gui.wtg.api.WTGParser;
import w3.script.gui.wtg.model.WTG;

import java.io.IOException;
import java.io.InputStream;

public class JsonWTGParser implements WTGParser {
    private final InputStream inputStream;

    public JsonWTGParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public WTG parse() {
        try {
            return new ObjectMapper().readValue(inputStream, WTG.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
