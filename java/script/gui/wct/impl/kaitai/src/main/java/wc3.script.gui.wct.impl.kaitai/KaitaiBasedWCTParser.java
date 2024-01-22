package wc3.script.gui.wct.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.common.core.KaitaiSerializer;
import w3.script.gui.wct.api.WCTParser;
import wc3.script.gui.wct.model.WCT;

import java.io.IOException;

public class KaitaiBasedWCTParser implements WCTParser {
    private final byte[] bytes;

    public KaitaiBasedWCTParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public WCT parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.script.gui.wct.model.kaitai.W3Wct w3Wct = new w3.script.gui.wct.model.kaitai.W3Wct(inKaitaiStream);
        try {
            return new KaitaiMapper().map(KaitaiSerializer.serialize(w3Wct), WCT.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
