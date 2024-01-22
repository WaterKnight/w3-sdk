package w3.object.item.mod.w3t.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.object.item.mod.w3t.api.W3TSerializer;
import w3.object.item.mod.w3t.model.W3T;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3TSerializer implements W3TSerializer {
    final OutputStream outputStream;

    public JsonW3TSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3T w3t) {
        try {
            final String outString = KaitaiSerializer.serialize(w3t);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
