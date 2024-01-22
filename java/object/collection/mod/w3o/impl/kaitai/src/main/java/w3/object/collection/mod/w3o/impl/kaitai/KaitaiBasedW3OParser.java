package w3.object.collection.mod.w3o.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import org.modelmapper.ModelMapper;
import w3.object.collection.mod.w3o.api.W3OParser;
import w3.object.collection.mod.w3o.model.W3O;
import w3.object.collection.mod.w3o.model.kaitaiToW3W3oMapper;

public class KaitaiBasedW3OParser implements W3OParser {
    private final byte[] bytes;

    public KaitaiBasedW3OParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3O parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.object.collection.mod.w3o.model.kaitai.W3W3o w3w3o = new w3.object.collection.mod.w3o.model.kaitai.W3W3o(inKaitaiStream);
        return new ModelMapper().map(kaitaiToW3W3oMapper.map(w3w3o), W3O.class);
    }
}
