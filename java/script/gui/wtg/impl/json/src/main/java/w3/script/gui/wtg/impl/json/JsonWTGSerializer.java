package w3.script.gui.wtg.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.script.gui.wtg.api.WTGSerializer;
import w3.script.gui.wtg.model.WTG;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonWTGSerializer implements WTGSerializer {
    final OutputStream outputStream;

    public JsonWTGSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(WTG wtg) {
        try {
            final String outString = KaitaiSerializer.serialize(wtg);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
