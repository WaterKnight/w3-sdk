package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXVertexGroupSerializer;
import w3.asset.model.mdx.model.MDXVertexGroup;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXVertexGroupSerializer implements MDXVertexGroupSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXVertexGroupSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXVertexGroup data) {
        write_0x0(data);
    }

    private void write_0x0(MDXVertexGroup vertexGroup) {
        outputStream.writeUInt8(vertexGroup.getIndex());
    }
}
