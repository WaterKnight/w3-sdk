package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXExtentSerializer;
import w3.asset.model.mdx.model.EncodingFormat;
import w3.asset.model.mdx.model.MDXExtent;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXExtentSerializer implements MDXExtentSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat encodingFormat;

    public StdMDXExtentSerializer(Wc3BinOutputStream outputStream, EncodingFormat encodingFormat) {
        this.outputStream = outputStream;
        this.encodingFormat = encodingFormat;
    }

    @Override
    public void serialize(MDXExtent data) {
        write(data);
    }

    public void write_0x0(MDXExtent extent) {
        outputStream.writeFloat32(extent.getBoundsRadius());
        outputStream.writeFloat32(extent.getMinX());
        outputStream.writeFloat32(extent.getMinY());
        outputStream.writeFloat32(extent.getMinZ());
        outputStream.writeFloat32(extent.getMaxX());
        outputStream.writeFloat32(extent.getMaxY());
        outputStream.writeFloat32(extent.getMaxZ());
    }
}
