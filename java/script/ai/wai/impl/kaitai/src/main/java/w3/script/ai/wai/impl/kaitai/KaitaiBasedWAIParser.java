package w3.script.ai.wai.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.script.ai.wai.api.WAIParser;
import w3.script.ai.wai.model.WAI;
import w3.common.core.KaitaiMapper;

public class KaitaiBasedWAIParser implements WAIParser {
    private final byte[] bytes;

    public KaitaiBasedWAIParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public WAI parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.ai.wai.impl.kaitai.W3Wai w3Wai = new w3.ai.wai.impl.kaitai.W3Wai(inKaitaiStream);
        return new KaitaiMapper().map(w3Wai, WAI.class);
    }
}
