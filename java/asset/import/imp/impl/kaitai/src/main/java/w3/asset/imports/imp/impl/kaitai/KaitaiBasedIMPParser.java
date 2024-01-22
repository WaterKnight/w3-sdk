package w3.asset.imports.imp.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.asset.imports.imp.api.IMPParser;
import w3.asset.imports.imp.model.IMP;
import w3.common.core.KaitaiMapper;

public class KaitaiBasedIMPParser implements IMPParser {
    private final byte[] bytes;

    public KaitaiBasedIMPParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public IMP parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.asset.imports.imp.model.kaitai.W3Imp w3Imp = new w3.asset.imports.imp.model.kaitai.W3Imp(inKaitaiStream);
        return new KaitaiMapper().map(w3Imp, IMP.class);
    }
}
