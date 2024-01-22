package w3.info.mmp.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.info.mmp.api.MMPSerializer;
import w3.info.mmp.model.MMP;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonMMPSerializer implements MMPSerializer {
    final OutputStream outputStream;

    public JsonMMPSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MMP mmp) {
        try {
            final String outString = KaitaiSerializer.serialize(mmp);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
