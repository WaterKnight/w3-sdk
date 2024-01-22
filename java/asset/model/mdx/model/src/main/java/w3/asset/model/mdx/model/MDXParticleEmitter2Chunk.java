package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2Chunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("PRE2");
    }

    private List<MDXParticleEmitter2> particleEmitter2s;

    public List<MDXParticleEmitter2> getParticleEmitter2s() {
        return particleEmitter2s;
    }

    public void setParticleEmitter2s(List<MDXParticleEmitter2> particleEmitter2s) {
        this.particleEmitter2s = particleEmitter2s;
    }
}
