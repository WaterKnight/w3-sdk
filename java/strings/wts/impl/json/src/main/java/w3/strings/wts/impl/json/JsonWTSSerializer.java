package w3.strings.wts.impl.json;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import w3.common.core.KaitaiSerializer;
import w3.strings.wts.api.WTSSerializer;
import w3.strings.wts.model.WTS;

public class JsonWTSSerializer implements WTSSerializer {
    final OutputStream outputStream;

    public JsonWTSSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(WTS wts) {
        try {
            final String outString = KaitaiSerializer.serialize(wts);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
