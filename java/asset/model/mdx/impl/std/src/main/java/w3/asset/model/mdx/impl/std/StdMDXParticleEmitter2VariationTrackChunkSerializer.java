package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2VariationTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXParticleEmitter2VariationTrack;
import w3.asset.model.mdx.model.MDXParticleEmitter2VariationTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitter2VariationTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitter2VariationTrackChunk, MDXParticleEmitter2VariationTrack> implements MDXParticleEmitter2VariationTrackChunkSerializer {
    public StdMDXParticleEmitter2VariationTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitter2VariationTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
