package w3.info.mmp.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import w3.info.mmp.api.MMPParser;
import w3.info.mmp.model.MMP;

import java.io.IOException;
import java.io.InputStream;

public class JsonMMPParser implements MMPParser {
    private final InputStream inputStream;


    public JsonMMPParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public MMP parse() {
        try {
            return new ObjectMapper().readValue(inputStream, MMP.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
