package w3.object.upgrade.mod.w3q.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.object.unit.mod.w3u.api.W3USerializer;
import w3.object.unit.mod.w3u.model.W3U;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3QSerializer implements W3USerializer {
    final OutputStream outputStream;

    public JsonW3QSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3U w3u) {
        try {
            final String outString = KaitaiSerializer.serialize(w3u);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
