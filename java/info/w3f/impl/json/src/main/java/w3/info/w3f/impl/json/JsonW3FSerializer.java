package w3.info.w3f.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.info.w3f.api.W3FSerializer;
import w3.info.w3f.model.W3F;
import w3.info.w3f.model.W3W3f;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3FSerializer implements W3FSerializer {
    final OutputStream outputStream;

    public JsonW3FSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3F data) {
        try {
            final String outString = KaitaiSerializer.serialize(data);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
