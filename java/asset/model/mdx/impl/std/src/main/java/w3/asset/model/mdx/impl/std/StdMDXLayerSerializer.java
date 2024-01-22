package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXLayerAlphaTrackChunkSerializer;
import w3.asset.model.mdx.api.MDXLayerSerializer;
import w3.asset.model.mdx.api.MDXTextureTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXLayer;
import w3.asset.model.mdx.model.MDXLayerAlphaTrackChunk;
import w3.asset.model.mdx.model.MDXTextureTrackChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXLayerSerializer implements MDXLayerSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXTextureTrackChunkSerializer textureTrackChunkSerializer;
    private final MDXLayerAlphaTrackChunkSerializer alphaTrackChunkSerializer;

    public StdMDXLayerSerializer(Wc3BinOutputStream outputStream, MDXTextureTrackChunkSerializer textureTrackChunkSerializer, MDXLayerAlphaTrackChunkSerializer alphaTrackChunkSerializer) {
        this.outputStream = outputStream;
        this.textureTrackChunkSerializer = textureTrackChunkSerializer;
        this.alphaTrackChunkSerializer = alphaTrackChunkSerializer;
    }

    @Override
    public void serialize(MDXLayer data) {
        write(data);
    }

    public void write_0x0(MDXLayer layer) {
        //stream.writeUInt32(_inclusiveSive);
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        outputStream.writeUInt32(layer.getFilterMode());
        outputStream.writeUInt32(layer.getShadingFlags());
        outputStream.writeUInt32(layer.getTextureId());
        outputStream.writeUInt32(layer.getTextureAnimId());
        outputStream.writeUInt32(layer.getCoordId());
        outputStream.writeFloat32(layer.getAlpha());

        for (MDXTextureTrackChunk textureTrackChunk : layer.getTextureTrackChunks()) {
            textureTrackChunkSerializer.serialize(textureTrackChunk);
        }
        for (MDXLayerAlphaTrackChunk alphaTrackChunk : layer.getAlphaTrackChunks()) {
            alphaTrackChunkSerializer.serialize(alphaTrackChunk);
        }

        sizeWriter.rewrite();
    }
}
