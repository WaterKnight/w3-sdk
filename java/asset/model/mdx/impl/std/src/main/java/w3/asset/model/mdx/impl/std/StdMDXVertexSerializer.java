package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXVertexSerializer;
import w3.asset.model.mdx.model.MDXVertex;
import w3.common.core.BinStream;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXVertexSerializer implements MDXVertexSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXVertexSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXVertex data) {
        try {
            write_0x0(data);
        } catch (BinStream.StreamException e) {
            throw new RuntimeException(e);
        }
    }

    public void write_0x0(MDXVertex vertex) throws BinStream.StreamException {
        outputStream.writeFloat32(vertex.getX());
        outputStream.writeFloat32(vertex.getY());
        outputStream.writeFloat32(vertex.getZ());
    }
}
