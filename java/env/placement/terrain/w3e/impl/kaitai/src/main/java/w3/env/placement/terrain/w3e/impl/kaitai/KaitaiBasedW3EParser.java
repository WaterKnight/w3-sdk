package w3.env.placement.terrain.w3e.impl.kaitai;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import org.modelmapper.ModelMapper;
import w3.common.core.KaitaiMapper;
import w3.env.placement.terrain.w3e.W3E;
import w3.env.placement.terrain.w3e.W3EParser;
import w3.env.placement.terrain.w3e.model.kaitai.W3W3e;
import w3.env.placement.terrain.w3e.model.kaitaiToW3W3eMapper;

public class KaitaiBasedW3EParser implements W3EParser {
    private final byte[] bytes;

    public KaitaiBasedW3EParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public W3E parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3W3e w3W3e = new W3W3e(inKaitaiStream);
        return new ModelMapper().map(kaitaiToW3W3eMapper.map(w3W3e), W3E.class);
    }
}
