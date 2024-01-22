package w3.object.doodad.mod.w3d.impl.json;

import w3.common.core.KaitaiSerializer;
import w3.object.doodad.mod.w3d.api.W3DSerializer;
import w3.object.doodad.mod.w3d.model.W3D;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class JsonW3DSerializer implements W3DSerializer {
    final OutputStream outputStream;

    public JsonW3DSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(W3D w3d) {
        try {
            final String outString = KaitaiSerializer.serialize(w3d);
            outputStream.write(outString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
