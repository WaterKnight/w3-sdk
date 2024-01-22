package w3.env.placement.sound.w3s.impl.kaitai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.env.placement.sound.w3s.api.W3SParser;
import w3.env.placement.sound.w3s.model.W3S;
import w3.env.placement.sound.w3s.model.W3str;
import w3.env.placement.sound.w3s.model.kaitai.W3W3s;

public class KaitaiBasedW3SParser implements W3SParser {
    private final byte[] bytes;

    public KaitaiBasedW3SParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public W3S parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3W3s w3W3s = new W3W3s(inKaitaiStream);
        return new KaitaiMapper(new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).addMixIn(W3str.class, W3strMixin.class)).map(w3W3s, W3S.class);
    }

    public static class W3strMixin {
        @JsonCreator
        public W3strMixin(@JsonProperty("value") String value) {

        }
    }
}
