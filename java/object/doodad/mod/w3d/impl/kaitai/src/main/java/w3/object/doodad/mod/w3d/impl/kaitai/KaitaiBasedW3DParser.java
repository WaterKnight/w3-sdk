package w3.object.doodad.mod.w3d.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.object.common.impl.KaitaiMappers;
import w3.object.common.impl.kaitai.W3ObjModFile;
import w3.object.doodad.mod.w3d.api.W3DParser;
import w3.object.doodad.mod.w3d.model.W3D;

public class KaitaiBasedW3DParser implements W3DParser {
    private final byte[] bytes;

    public KaitaiBasedW3DParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3D parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3ObjModFile objModFile = new W3ObjModFile(inKaitaiStream, 1);
        return new ObjModFileToW3DMapper().map(new KaitaiMappers().kaitaiObjModFileToObjModFile(objModFile));
    }
}
