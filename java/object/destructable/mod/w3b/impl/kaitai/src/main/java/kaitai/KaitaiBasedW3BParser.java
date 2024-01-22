package kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.object.common.impl.KaitaiMappers;
import w3.object.common.impl.kaitai.W3ObjModFile;
import w3.object.destructable.mod.w3b.api.W3BParser;
import w3.object.destructable.mod.w3b.model.W3B;

public class KaitaiBasedW3BParser implements W3BParser {
    private final byte[] bytes;

    public KaitaiBasedW3BParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public W3B parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3ObjModFile objModFile = new W3ObjModFile(inKaitaiStream, 0);
        return new ObjModFileToW3BMapper().map(new KaitaiMappers().kaitaiObjModFileToObjModFile(objModFile));
    }
}
