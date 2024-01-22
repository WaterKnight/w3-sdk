package w3.object.upgrade.mod.w3q.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.object.common.impl.KaitaiMappers;
import w3.object.common.impl.kaitai.W3ObjModFile;
import w3.object.upgrade.mod.w3q.api.W3QParser;
import w3.object.upgrade.mod.w3q.model.W3Q;

public class KaitaiBasedW3QParser implements W3QParser {
    private final byte[] bytes;

    public KaitaiBasedW3QParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3Q parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3ObjModFile objModFile = new W3ObjModFile(inKaitaiStream, 1);
        return new ObjModFileToW3QMapper().map(new KaitaiMappers().kaitaiObjModFileToObjModFile(objModFile));
    }
}
