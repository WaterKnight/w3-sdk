package w3.object.doodad.mod.w3d.impl.json;

import w3.common.json.W3ObjectMapper;
import w3.common.core.W3idMixin;
import w3.object.doodad.mod.w3d.api.W3DParser;
import w3.object.doodad.mod.w3d.impl.kaitai.W3id;
import w3.object.doodad.mod.w3d.model.W3D;

import java.io.IOException;
import java.io.InputStream;

public class JsonW3DParser implements W3DParser {
    private final InputStream inputStream;

    public JsonW3DParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public W3D parse() {
        try {
            return new W3ObjectMapper()
                    .addMixIn(W3id.class, W3idMixin.class)
                    .readValue(inputStream, W3D.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
