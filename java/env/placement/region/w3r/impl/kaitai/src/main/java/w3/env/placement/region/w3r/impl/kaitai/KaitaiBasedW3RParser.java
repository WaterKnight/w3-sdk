package w3.env.placement.region.w3r.impl.kaitai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.env.placement.region.w3r.api.W3RParser;
import w3.env.placement.region.w3r.model.W3R;
import w3.env.placement.region.w3r.model.W3str;
import w3.env.placement.region.w3r.model.kaitai.W3W3r;

public class KaitaiBasedW3RParser implements W3RParser {
    private final byte[] bytes;

    public KaitaiBasedW3RParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public W3R parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3W3r w3W3r = new W3W3r(inKaitaiStream);
        return new KaitaiMapper(new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).addMixIn(W3str.class, W3strMixin.class)).map(w3W3r, W3R.class);
    }

    public static class W3strMixin {
        @JsonCreator
        public W3strMixin(@JsonProperty("value") String value) {

        }
    }
}
