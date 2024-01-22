package w3.asset.model.mdx.impl.std;


import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXGeosetAnimSerializer;
import w3.asset.model.mdx.model.MDXChunk;
import w3.asset.model.mdx.model.MDXGeosetAnim;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXGeosetAnimSerializer extends MDXObject implements MDXGeosetAnimSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXGeosetAnimSerializer(Wc3BinOutputStream outputStream, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXGeosetAnim data) {

    }

    private void write_0x0(MDXGeosetAnim geosetAnim) {
        //stream.writeUInt32(_inclusiveSize);
        final SizeWriter sizeWriter = new SizeWriter();

        sizeWriter.write(outputStream);

        outputStream.writeFloat32(geosetAnim.getAlpha());
        outputStream.writeUInt32(geosetAnim.getFlags());

        outputStream.writeFloat32(geosetAnim.getColor().getBlue());
        outputStream.writeFloat32(geosetAnim.getColor().getGreen());
        outputStream.writeFloat32(geosetAnim.getColor().getRed());

        outputStream.writeUInt32(geosetAnim.getGeosetId());

        for (MDXChunk chunk : geosetAnim.getChunks()) {
            chunkSerializer.serialize(chunk);
        }

        sizeWriter.rewrite();
    }
}
