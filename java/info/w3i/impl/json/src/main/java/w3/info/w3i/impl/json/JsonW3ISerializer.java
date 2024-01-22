package w3.info.w3i.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.info.w3i.api.W3ISerializer;
import w3.info.w3i.model.W3I;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3ISerializer implements W3ISerializer {
    final OutputStream outputStream;

    public JsonW3ISerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3I w3i) {
        try {
            final String outString = KaitaiSerializer.serialize(w3i);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
