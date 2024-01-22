package w3.save.w3v.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.save.w3v.api.W3VSerializer;
import w3.save.w3v.model.W3V;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3VSerializer implements W3VSerializer {
    final OutputStream outputStream;

    public JsonW3VSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3V w3v) {
        try {
            final String outString = KaitaiSerializer.serialize(w3v);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
