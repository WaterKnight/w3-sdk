package w3.script.gui.wtg.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.common.core.KaitaiSerializer;
import w3.script.gui.wtg.api.WTGParser;
import w3.script.gui.wtg.model.WTG;

import java.io.IOException;

public class KaitaiBasedWTGParser implements WTGParser {
    private final byte[] bytes;

    public KaitaiBasedWTGParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public WTG parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.script.gui.wtg.model.kaitai.W3Wtg w3Wtg = new w3.script.gui.wtg.model.kaitai.W3Wtg(inKaitaiStream);
        try {
            return new KaitaiMapper().map(KaitaiSerializer.serialize(w3Wtg), WTG.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
