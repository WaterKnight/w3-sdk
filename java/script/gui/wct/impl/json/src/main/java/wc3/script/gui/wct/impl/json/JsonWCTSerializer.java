package wc3.script.gui.wct.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.script.gui.wct.api.WCTSerializer;
import wc3.script.gui.wct.model.WCT;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonWCTSerializer implements WCTSerializer {
    final OutputStream outputStream;

    public JsonWCTSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(WCT wct) {
        try {
            final String outString = KaitaiSerializer.serialize(wct);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
