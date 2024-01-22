package w3.save.w3v.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.common.core.ZCompression;
import w3.save.w3v.api.W3VParser;
import w3.save.w3v.model.W3V;
import w3.save.w3v.model.kaitaiToW3W3vMapper;

public class KaitaiBasedW3VParser implements W3VParser {
    private final byte[] bytes;
    private final boolean decompress;

    public KaitaiBasedW3VParser(byte[] bytes, boolean decompress) {
        this.bytes = bytes;
        this.decompress = decompress;
    }

    @Override
    public W3V parse() {
        final byte[] bytes = this.decompress ? ZCompression.decompress(this.bytes) : this.bytes;
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.save.w3v.impl.kaitai.W3W3v w3W3v = new w3.save.w3v.impl.kaitai.W3W3v(inKaitaiStream);
        //return new W3W3vToW3VMapper().map(w3W3v);
        return new KaitaiMapper().map(kaitaiToW3W3vMapper.map(w3W3v), W3V.class);
    }
}
