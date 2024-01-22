package w3.ai.wai.impl.json;

import w3.script.ai.wai.api.WAISerializer;
import w3.script.ai.wai.model.WAI;
import w3.common.core.KaitaiSerializer;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonWAISerializer implements WAISerializer {
    final OutputStream outputStream;

    public JsonWAISerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(WAI wai) {
        try {
            final String outString = KaitaiSerializer.serialize(wai);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
