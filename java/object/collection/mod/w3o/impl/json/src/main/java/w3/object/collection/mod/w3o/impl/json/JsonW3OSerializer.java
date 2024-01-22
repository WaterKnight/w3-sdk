package w3.object.collection.mod.w3o.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.object.collection.mod.w3o.api.W3OSerializer;
import w3.object.collection.mod.w3o.model.W3O;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3OSerializer implements W3OSerializer {
    final OutputStream outputStream;

    public JsonW3OSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3O w3o) {
        try {
            final String outString = KaitaiSerializer.serialize(w3o);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
