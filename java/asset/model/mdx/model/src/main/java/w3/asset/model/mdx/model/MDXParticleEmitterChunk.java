package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitterChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("PREM");
    }

    private List<MDXParticleEmitter> particleEmitters;

    public List<MDXParticleEmitter> getParticleEmitters() {
        return particleEmitters;
    }

    public void setParticleEmitters(List<MDXParticleEmitter> particleEmitters) {
        this.particleEmitters = particleEmitters;
    }
}
