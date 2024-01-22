package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXTexCoordSerializer;
import w3.asset.model.mdx.model.MDXTexCoord;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXTexCoordSerializer implements MDXTexCoordSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXTexCoordSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXTexCoord data) {
        write_0x0(data);
    }

    private void write_0x0(MDXTexCoord texCoord) {
        outputStream.writeFloat32(texCoord.getX());
        outputStream.writeFloat32(texCoord.getY());
    }
}
