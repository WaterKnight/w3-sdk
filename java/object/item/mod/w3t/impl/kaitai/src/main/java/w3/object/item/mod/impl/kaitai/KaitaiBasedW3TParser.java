package w3.object.item.mod.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.object.common.impl.KaitaiMappers;
import w3.object.common.impl.kaitai.W3ObjModFile;
import w3.object.item.mod.w3t.api.W3TParser;
import w3.object.item.mod.w3t.model.W3T;

public class KaitaiBasedW3TParser implements W3TParser {
    private final byte[] bytes;

    public KaitaiBasedW3TParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3T parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3ObjModFile objModFile = new W3ObjModFile(inKaitaiStream, 0);
        return new ObjModFileToW3TMapper().map(new KaitaiMappers().kaitaiObjModFileToObjModFile(objModFile));
    }
}
