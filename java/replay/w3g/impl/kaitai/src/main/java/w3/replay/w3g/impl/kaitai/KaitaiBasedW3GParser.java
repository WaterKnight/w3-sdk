package w3.replay.w3g.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.common.core.ZCompression;
import w3.common.core.Wc3BinInputStream;
import w3.replay.w3g.api.W3GParser;
import w3.replay.w3g.model.W3G;
import w3.replay.w3g.model.kaitaiToW3W3gMapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class KaitaiBasedW3GParser implements W3GParser {
    private final byte[] bytes;
    private boolean decompress;

    public KaitaiBasedW3GParser(byte[] bytes, boolean decompress) {
        this.bytes = bytes;
        this.decompress = decompress;
    }

    @Override
    public W3G parse() {
        byte[] bytes = this.bytes;
        if (decompress) {
            bytes = decompress(bytes);
        }
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.replay.w3g.impl.kaitai.W3W3g w3W3g = new w3.replay.w3g.impl.kaitai.W3W3g(inKaitaiStream);
        return new KaitaiMapper().map(kaitaiToW3W3gMapper.map(w3W3g), W3G.class);
    }

    private byte[] decompress(byte[] bytes) {
        try (final Wc3BinInputStream inputStream = new Wc3BinInputStream(new ByteArrayInputStream(bytes))) {
            return ZCompression.decompress(inputStream).writeToByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
