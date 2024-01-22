package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.api.MDXRibbonEmitterSerializer;
import w3.asset.model.mdx.model.MDXChunk;
import w3.asset.model.mdx.model.MDXRibbonEmitter;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXRibbonEmitterSerializer implements MDXRibbonEmitterSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXNodeSerializer nodeSerializer;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXRibbonEmitterSerializer(Wc3BinOutputStream outputStream, MDXNodeSerializer nodeSerializer, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.nodeSerializer = nodeSerializer;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXRibbonEmitter data) {

    }

    public void write_0x0(MDXRibbonEmitter ribbonEmitter) {
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        nodeSerializer.serialize(ribbonEmitter.getNode());
        outputStream.writeFloat32(ribbonEmitter.getHeightAbove());
        outputStream.writeFloat32(ribbonEmitter.getHeightBelow());

        outputStream.writeFloat32(ribbonEmitter.getColor().getAlpha());
        outputStream.writeFloat32(ribbonEmitter.getColor().getBlue());
        outputStream.writeFloat32(ribbonEmitter.getColor().getGreen());
        outputStream.writeFloat32(ribbonEmitter.getColor().getRed());

        outputStream.writeFloat32(ribbonEmitter.getLifespan());

        outputStream.writeUInt32(ribbonEmitter.getTextureSlot());
        outputStream.writeUInt32(ribbonEmitter.getEmissionRate());

        outputStream.writeUInt32(ribbonEmitter.getRows());
        outputStream.writeUInt32(ribbonEmitter.getColumns());

        outputStream.writeUInt32(ribbonEmitter.getMaterialId());
        outputStream.writeFloat32(ribbonEmitter.getGravity());

        for (MDXChunk chunk : ribbonEmitter.getChunks()) {
            chunkSerializer.serialize(chunk);
        }

        sizeWriter.rewrite();
    }
}
