package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.api.MDXParticleEmitter2Serializer;
import w3.asset.model.mdx.model.MDXChunk;
import w3.asset.model.mdx.model.MDXParticleEmitter2;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitter2Serializer implements MDXParticleEmitter2Serializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXNodeSerializer nodeSerializer;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXParticleEmitter2Serializer(Wc3BinOutputStream outputStream, MDXNodeSerializer nodeSerializer, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.nodeSerializer = nodeSerializer;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXParticleEmitter2 data) {
        write_0x0(data);
    }

    private void write_0x0(MDXParticleEmitter2 particleEmitter2) {
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        nodeSerializer.serialize(particleEmitter2.getNode());
        outputStream.writeFloat32(particleEmitter2.getSpeed());
        outputStream.writeFloat32(particleEmitter2.getVariation());
        outputStream.writeFloat32(particleEmitter2.getLatitude());
        outputStream.writeFloat32(particleEmitter2.getGravity());
        outputStream.writeFloat32(particleEmitter2.getLifespan());
        outputStream.writeFloat32(particleEmitter2.getEmissionRate());
        outputStream.writeFloat32(particleEmitter2.getLength());
        outputStream.writeFloat32(particleEmitter2.getWidth());

        outputStream.writeUInt32(particleEmitter2.getFilterMode().ordinal());

        outputStream.writeUInt32(particleEmitter2.getRows());
        outputStream.writeUInt32(particleEmitter2.getColumns());

        outputStream.writeUInt32(particleEmitter2.getHeadTailFlag().ordinal());

        outputStream.writeFloat32(particleEmitter2.getTailLength());
        outputStream.writeFloat32(particleEmitter2.getTime());

        outputStream.writeFloat32(particleEmitter2.getStartColor().getBlue());
        outputStream.writeFloat32(particleEmitter2.getStartColor().getGreen());
        outputStream.writeFloat32(particleEmitter2.getStartColor().getRed());

        outputStream.writeFloat32(particleEmitter2.getMidColor().getBlue());
        outputStream.writeFloat32(particleEmitter2.getMidColor().getGreen());
        outputStream.writeFloat32(particleEmitter2.getMidColor().getRed());

        outputStream.writeFloat32(particleEmitter2.getEndColor().getBlue());
        outputStream.writeFloat32(particleEmitter2.getEndColor().getGreen());
        outputStream.writeFloat32(particleEmitter2.getEndColor().getRed());

        outputStream.writeUInt8(particleEmitter2.getStartColor().getAlpha());
        outputStream.writeUInt8(particleEmitter2.getMidColor().getAlpha());
        outputStream.writeUInt8(particleEmitter2.getEndColor().getAlpha());

        outputStream.writeFloat32(particleEmitter2.getStartScaling());
        outputStream.writeFloat32(particleEmitter2.getMidScaling());
        outputStream.writeFloat32(particleEmitter2.getEndScaling());

        outputStream.writeUInt32(particleEmitter2.getStartHeadInterval());
        outputStream.writeUInt32(particleEmitter2.getMidHeadInterval());
        outputStream.writeUInt32(particleEmitter2.getEndHeadInterval());

        outputStream.writeUInt32(particleEmitter2.getStartHeadDecayInterval());
        outputStream.writeUInt32(particleEmitter2.getMidHeadDecayInterval());
        outputStream.writeUInt32(particleEmitter2.getEndHeadDecayInterval());

        outputStream.writeUInt32(particleEmitter2.getStartTailInterval());
        outputStream.writeUInt32(particleEmitter2.getMidTailInterval());
        outputStream.writeUInt32(particleEmitter2.getEndTailInterval());

        outputStream.writeUInt32(particleEmitter2.getStartTailDecayInterval());
        outputStream.writeUInt32(particleEmitter2.getMidTailDecayInterval());
        outputStream.writeUInt32(particleEmitter2.getEndTailDecayInterval());

        outputStream.writeUInt32(particleEmitter2.getTextureId());
        outputStream.writeUInt32(particleEmitter2.getSquirt());
        outputStream.writeUInt32(particleEmitter2.getPriorityPlane());
        outputStream.writeUInt32(particleEmitter2.getReplaceableId());

        for (MDXChunk chunk : particleEmitter2.getChunks()) {
            chunkSerializer.serialize(chunk);
        }

        sizeWriter.rewrite();
    }
}
