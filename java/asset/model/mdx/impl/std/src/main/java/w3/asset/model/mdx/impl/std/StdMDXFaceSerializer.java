package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXFaceSerializer;
import w3.asset.model.mdx.model.MDXFace;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXFaceSerializer implements MDXFaceSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXFaceSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXFace data) {

    }

    private void write_0x0(MDXFace face) {
        outputStream.writeUInt16(face.getValue());
    }
}
