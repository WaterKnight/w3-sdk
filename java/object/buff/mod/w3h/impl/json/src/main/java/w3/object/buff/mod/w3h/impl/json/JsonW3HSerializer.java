package w3.object.buff.mod.w3h.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.object.buff.mod.w3h.api.W3HSerializer;
import w3.object.buff.mod.w3h.model.W3H;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3HSerializer implements W3HSerializer {
    final OutputStream outputStream;

    public JsonW3HSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3H w3h) {
        try {
            final String outString = KaitaiSerializer.serialize(w3h);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
