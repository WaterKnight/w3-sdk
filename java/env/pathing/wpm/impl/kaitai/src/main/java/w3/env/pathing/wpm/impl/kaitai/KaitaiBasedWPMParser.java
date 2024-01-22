package w3.env.pathing.wpm.impl.kaitai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.env.pathing.wpm.WPMParser;
import w3.env.pathing.wpm.model.W3id;
import w3.env.pathing.wpm.model.WPM;
import w3.env.pathing.wpm.model.kaitai.W3Wpm;

public class KaitaiBasedWPMParser implements WPMParser {
    private final byte[] bytes;

    public KaitaiBasedWPMParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public WPM parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3Wpm w3Wpm = new W3Wpm(inKaitaiStream);
        return new KaitaiMapper(new ObjectMapper().addMixIn(W3id.class, W3idMixin.class)).map(w3Wpm, WPM.class);
    }

    public static class W3idMixin {
        @JsonCreator
        public W3idMixin(@JsonProperty("val") String value) {

        }
    }
}
