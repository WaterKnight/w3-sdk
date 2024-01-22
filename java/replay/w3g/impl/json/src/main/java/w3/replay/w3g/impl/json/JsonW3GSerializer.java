package w3.replay.w3g.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.replay.w3g.api.W3GSerializer;
import w3.replay.w3g.model.W3G;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3GSerializer implements W3GSerializer {
    final OutputStream outputStream;

    public JsonW3GSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3G w3g) {
        try {
            final String outString = KaitaiSerializer.serialize(w3g);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
