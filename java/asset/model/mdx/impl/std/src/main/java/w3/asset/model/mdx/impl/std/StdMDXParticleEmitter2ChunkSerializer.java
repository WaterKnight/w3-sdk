package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2ChunkSerializer;
import w3.asset.model.mdx.api.MDXParticleEmitter2Serializer;
import w3.asset.model.mdx.model.MDXParticleEmitter2;
import w3.asset.model.mdx.model.MDXParticleEmitter2Chunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitter2ChunkSerializer extends StdMDXChunkSerializer<MDXParticleEmitter2Chunk> implements MDXParticleEmitter2ChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXParticleEmitter2Serializer particleEmitter2Serializer;

    public StdMDXParticleEmitter2ChunkSerializer(Wc3BinOutputStream outputStream, MDXParticleEmitter2Serializer particleEmitter2Serializer) {
        this.outputStream = outputStream;
        this.particleEmitter2Serializer = particleEmitter2Serializer;
    }

    @Override
    public void serialize(MDXParticleEmitter2Chunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXParticleEmitter2Chunk particleEmitter2Chunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(particleEmitter2Chunk.getToken());

        for (MDXParticleEmitter2 particleEmitter2 : particleEmitter2Chunk.getParticleEmitter2s()) {
            particleEmitter2Serializer.serialize(particleEmitter2);
        }

        header.rewrite();
    }
}
