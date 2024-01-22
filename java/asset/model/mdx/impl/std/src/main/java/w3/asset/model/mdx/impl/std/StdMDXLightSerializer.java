package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXLightSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.model.MDXChunk;
import w3.asset.model.mdx.model.MDXLight;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXLightSerializer extends MDXObject implements MDXLightSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXNodeSerializer nodeSerializer;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXLightSerializer(Wc3BinOutputStream outputStream, MDXNodeSerializer nodeSerializer, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.nodeSerializer = nodeSerializer;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXLight data) {
        write(data);
    }

    private void write_0x0(MDXLight light) {
        //stream.writeUInt32(_inclusiveSize);
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        nodeSerializer.serialize(light.getNode());

        outputStream.writeUInt32(light.getType().ordinal());

        outputStream.writeFloat32(light.getAttentuationStart());
        outputStream.writeFloat32(light.getAttentuationEnd());

        outputStream.writeFloat32(light.getColor().getBlue());
        outputStream.writeFloat32(light.getColor().getGreen());
        outputStream.writeFloat32(light.getColor().getRed());

        outputStream.writeFloat32(light.getIntensity());

        outputStream.writeFloat32(light.getAmbientColor().getBlue());
        outputStream.writeFloat32(light.getAmbientColor().getGreen());
        outputStream.writeFloat32(light.getAmbientColor().getRed());

        outputStream.writeFloat32(light.getAmbientIntensity());

        for (MDXChunk chunk : light.getChunks()) {
            chunkSerializer.serialize(chunk);
        }

        sizeWriter.rewrite();
    }
}
