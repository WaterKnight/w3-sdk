package w3.info.w3f.impl.json;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import org.modelmapper.ModelMapper;
import w3.info.w3f.api.W3FParser;
import w3.info.w3f.model.W3F;
import w3.info.w3f.model.kaitaiToW3W3fMapper;

public class JsonW3FParser implements W3FParser {
    private final byte[] bytes;

    public JsonW3FParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3F parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.info.w3f.model.kaitai.W3W3f w3W3f = new w3.info.w3f.model.kaitai.W3W3f(inKaitaiStream);
        return new ModelMapper().map(kaitaiToW3W3fMapper.map(w3W3f), W3F.class);
    }
}
