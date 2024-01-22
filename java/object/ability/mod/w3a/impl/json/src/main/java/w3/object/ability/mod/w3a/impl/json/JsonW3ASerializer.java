package w3.object.ability.mod.w3a.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import w3.common.core.KaitaiSerializer;
import w3.object.ability.mod.w3a.api.W3ASerializer;
import w3.object.ability.mod.w3a.model.W3A;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3ASerializer implements W3ASerializer {
    private final OutputStream outputStream;

    public JsonW3ASerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3A w3a) {
        try {
            final ObjectMapper objectMapper = new W3AObjectMapper();
            final String outString = KaitaiSerializer.serialize(w3a, objectMapper);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
