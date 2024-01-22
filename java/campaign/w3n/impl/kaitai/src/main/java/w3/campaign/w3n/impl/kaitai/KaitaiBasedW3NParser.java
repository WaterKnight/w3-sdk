package w3.campaign.w3n.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.campaign.w3n.api.W3NParser;
import w3.campaign.w3n.model.W3N;
import w3.common.core.KaitaiMapper;

public class KaitaiBasedW3NParser implements W3NParser {
    private final byte[] bytes;

    public KaitaiBasedW3NParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3N parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.campaign.w3n.model.kaitai. w3Imp = new w3.asset.imports.imp.model.kaitai.(inKaitaiStream);
        return new KaitaiMapper().map(w3Imp, W3N.class);
    }
}
