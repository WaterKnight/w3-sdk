package w3.object.destructable.mod.w3b.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.object.destructable.mod.w3b.api.W3BSerializer;
import w3.object.destructable.mod.w3b.model.W3B;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3BSerializer implements W3BSerializer {
    final OutputStream outputStream;

    public JsonW3BSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3B w3b) {
        try {
            final String outString = KaitaiSerializer.serialize(w3b);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
