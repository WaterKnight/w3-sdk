package w3.env.shadow.shd.impl.kaitai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.env.shadow.shd.api.SHDParser;
import w3.env.shadow.shd.model.SHD;
import w3.env.shadow.shd.model.kaitai.W3Shd;

public class KaitaiBasedSHDParser implements SHDParser {
    private final byte[] bytes;

    public KaitaiBasedSHDParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public SHD parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3Shd w3Shd = new W3Shd(inKaitaiStream);
        return new KaitaiMapper().map(w3Shd, SHD.class);
    }
}
