package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitterChunkSerializer;
import w3.asset.model.mdx.api.MDXParticleEmitterSerializer;
import w3.asset.model.mdx.model.MDXParticleEmitter;
import w3.asset.model.mdx.model.MDXParticleEmitterChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitterChunkSerializer extends StdMDXChunkSerializer implements MDXParticleEmitterChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXParticleEmitterSerializer particleEmitterSerializer;

    public StdMDXParticleEmitterChunkSerializer(Wc3BinOutputStream outputStream, MDXParticleEmitterSerializer particleEmitterSerializer) {
        this.outputStream = outputStream;
        this.particleEmitterSerializer = particleEmitterSerializer;
    }

    @Override
    public void serialize(MDXParticleEmitterChunk data) {
        write(data);
    }

    private void write(MDXParticleEmitterChunk particleEmitterChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(particleEmitterChunk);

                break;
        }
    }

    private void write_0x0(MDXParticleEmitterChunk particleEmitterChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(particleEmitterChunk.getToken());

        for (MDXParticleEmitter particleEmitter : particleEmitterChunk.getParticleEmitters()) {
            particleEmitterSerializer.serialize(particleEmitter);
        }

        header.rewrite();
    }
}
