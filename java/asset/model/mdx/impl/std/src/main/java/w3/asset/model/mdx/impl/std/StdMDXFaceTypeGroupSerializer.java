package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXFaceTypeGroupSerializer;
import w3.asset.model.mdx.model.MDXFaceTypeGroup;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXFaceTypeGroupSerializer implements MDXFaceTypeGroupSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXFaceTypeGroupSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXFaceTypeGroup data) {
        write_0x0(data);
    }

    public void write_0x0(MDXFaceTypeGroup faceTypeGroup) {
        outputStream.writeUInt32(faceTypeGroup.getType().ordinal());
    }
}
