package w3.object.ability.mod.w3a.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.object.ability.mod.w3a.api.W3AParser;
import w3.object.ability.mod.w3a.model.W3A;
import w3.object.common.impl.KaitaiMappers;
import w3.object.common.impl.kaitai.W3ObjModFile;

public class KaitaiBasedW3AParser implements W3AParser {
    private final byte[] bytes;

    public KaitaiBasedW3AParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public W3A parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3ObjModFile objModFile = new W3ObjModFile(inKaitaiStream, 1);
        return new ObjModFileToW3AMapper().map(new KaitaiMappers().kaitaiObjModFileToObjModFile(objModFile));
    }
}
