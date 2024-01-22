package w3.object.unit.mod.w3u.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.object.common.impl.KaitaiMappers;
import w3.object.common.impl.kaitai.W3ObjModFile;
import w3.object.unit.mod.w3u.api.W3UParser;
import w3.object.unit.mod.w3u.model.W3U;

public class KaitaiBasedW3UParser implements W3UParser {
    private final byte[] bytes;

    public KaitaiBasedW3UParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3U parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3ObjModFile objModFile = new W3ObjModFile(inKaitaiStream, 0);
        return new ObjModFileToW3UMapper().map(new KaitaiMappers().kaitaiObjModFileToObjModFile(objModFile));
    }
}
