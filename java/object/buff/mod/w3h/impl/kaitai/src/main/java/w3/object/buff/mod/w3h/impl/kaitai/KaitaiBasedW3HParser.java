package w3.object.buff.mod.w3h.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.object.buff.mod.w3h.api.W3HParser;
import w3.object.buff.mod.w3h.model.W3H;
import w3.object.common.impl.KaitaiMappers;
import w3.object.common.impl.kaitai.W3ObjModFile;

public class KaitaiBasedW3HParser implements W3HParser {
    private final byte[] bytes;

    public KaitaiBasedW3HParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3H parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3ObjModFile objModFile = new W3ObjModFile(inKaitaiStream, 0);
        return new ObjModFileToW3HMapper().map(new KaitaiMappers().kaitaiObjModFileToObjModFile(objModFile));
    }
}
