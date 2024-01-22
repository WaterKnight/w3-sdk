package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitterVisibilityTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXParticleEmitterVisibilityTrack;
import w3.asset.model.mdx.model.MDXParticleEmitterVisibilityTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXParticleEmitterVisibilityTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitterVisibilityTrackChunk, MDXParticleEmitterVisibilityTrack> implements MDXParticleEmitterVisibilityTrackChunkSerializer {
    public StdMDXParticleEmitterVisibilityTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitterVisibilityTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
