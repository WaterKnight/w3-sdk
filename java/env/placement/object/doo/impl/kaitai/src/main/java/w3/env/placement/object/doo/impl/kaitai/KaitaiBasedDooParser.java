package w3.env.placement.object.doo.impl.kaitai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.env.placement.object.doo.api.DooParser;
import w3.env.placement.object.doo.model.Doo;
import w3.env.placement.object.doo.model.W3id;
import w3.env.placement.object.doo.model.kaitai.W3Doo;

public class KaitaiBasedDooParser implements DooParser {
    private final byte[] bytes;
    private final boolean use_skin;

    public KaitaiBasedDooParser(byte[] bytes, boolean use_skin) {
        this.bytes = bytes;
        this.use_skin = use_skin;
    }
    @Override
    public Doo parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3Doo w3Doo = new W3Doo(inKaitaiStream, use_skin ? 1 : 0);
        return new KaitaiMapper(new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).addMixIn(W3id.class, W3idMixin.class)).map(w3Doo, Doo.class);
    }

    public static class W3idMixin {
        @JsonCreator
        public W3idMixin(@JsonProperty("value") String value) {

        }
    }
}
