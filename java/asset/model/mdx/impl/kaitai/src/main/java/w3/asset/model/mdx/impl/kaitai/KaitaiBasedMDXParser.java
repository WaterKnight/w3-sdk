package w3.asset.model.mdx.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import org.modelmapper.ModelMapper;
import w3.asset.model.mdx.api.MDXParser;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.kaitai.W3Mdx;
import w3.asset.model.mdx.model.kaitaiToW3MdxMapper;

public class KaitaiBasedMDXParser implements MDXParser {
    private final byte[] bytes;

    public KaitaiBasedMDXParser(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public MDX parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3Mdx w3Mdx = new W3Mdx(inKaitaiStream);
        return new ModelMapper().map(kaitaiToW3MdxMapper.map(w3Mdx), MDX.class);
    }
}
