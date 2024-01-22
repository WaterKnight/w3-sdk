package w3.info.mmp.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import org.modelmapper.ModelMapper;
import w3.info.mmp.api.MMPParser;
import w3.info.mmp.model.MMP;
import w3.info.mmp.model.kaitaiToW3MmpMapper;

public class KaitaiBasedMMPParser implements MMPParser {
    private final byte[] bytes;

    public KaitaiBasedMMPParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public MMP parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.info.mmp.model.kaitai.W3Mmp w3Mmp = new w3.info.mmp.model.kaitai.W3Mmp(inKaitaiStream);
        return new ModelMapper().map(kaitaiToW3MmpMapper.map(w3Mmp), MMP.class);
    }
}
