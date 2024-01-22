package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.api.MDXParticleEmitterSerializer;
import w3.asset.model.mdx.model.MDXChunk;
import w3.asset.model.mdx.model.MDXParticleEmitter;
import w3.common.core.Wc3BinOutputStream;

import java.util.*;

public class StdMDXParticleEmitterSerializer implements MDXParticleEmitterSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXNodeSerializer nodeSerializer;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXParticleEmitterSerializer(Wc3BinOutputStream outputStream, MDXNodeSerializer nodeSerializer, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.nodeSerializer = nodeSerializer;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXParticleEmitter data) {

    }

    private void write_0x0(MDXParticleEmitter particleEmitter) {
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        nodeSerializer.serialize(particleEmitter.getNode());
        outputStream.writeFloat32(particleEmitter.getEmissionRate());
        outputStream.writeFloat32(particleEmitter.getGravity());
        outputStream.writeFloat32(particleEmitter.getLongitude());
        outputStream.writeFloat32(particleEmitter.getLatitude());
        outputStream.writeBytes(Arrays.copyOf(particleEmitter.getFileName().getBytes(), 260));
        outputStream.writeFloat32(particleEmitter.getLifespan());
        outputStream.writeFloat32(particleEmitter.getInitialSpeed());

        for (MDXChunk chunk : particleEmitter.getChunks()) {
            chunkSerializer.serialize(chunk);
        }

        sizeWriter.rewrite();
    }
}
