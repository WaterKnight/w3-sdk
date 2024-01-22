package w3.asset.imports.imp.impl.json;

import w3.asset.imports.imp.api.IMPSerializer;
import w3.asset.imports.imp.model.IMP;
import w3.common.core.KaitaiSerializer;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonIMPSerializer implements IMPSerializer {
    final OutputStream outputStream;

    public JsonIMPSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(IMP imp) {
        try {
            final String outString = KaitaiSerializer.serialize(imp);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
