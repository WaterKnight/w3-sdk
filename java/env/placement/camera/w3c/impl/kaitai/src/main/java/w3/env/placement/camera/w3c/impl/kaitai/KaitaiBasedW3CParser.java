package w3.env.placement.camera.w3c.impl.kaitai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.env.placement.camera.w3c.model.W3C;
import w3.env.placement.camera.w3c.model.W3str;
import w3.env.placement.camera.w3c.model.kaitai.W3W3c;
import w3.placement.camera.w3c.api.W3CParser;

public class KaitaiBasedW3CParser implements W3CParser {
    private final byte[] bytes;

    public KaitaiBasedW3CParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public W3C parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3W3c w3W3c = new W3W3c(inKaitaiStream);
        return new KaitaiMapper(new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).addMixIn(W3str.class, W3strMixin.class)).map(w3W3c, W3C.class);
    }

    public static class W3strMixin {
        @JsonCreator
        public W3strMixin(@JsonProperty("value") String value) {

        }
    }
}
