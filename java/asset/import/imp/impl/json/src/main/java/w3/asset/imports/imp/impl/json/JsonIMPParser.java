package w3.asset.imports.imp.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import w3.asset.imports.imp.api.IMPParser;
import w3.asset.imports.imp.model.IMP;

import java.io.IOException;
import java.io.InputStream;

public class JsonIMPParser implements IMPParser {
    private final InputStream inputStream;


    public JsonIMPParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public IMP parse() {
        try {
            return new ObjectMapper().readValue(inputStream, IMP.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
