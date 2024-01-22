package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2VisibilityTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXParticleEmitter2VisibilityTrack;
import w3.asset.model.mdx.model.MDXParticleEmitter2VisibilityTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXParticleEmitter2VisibilityTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitter2VisibilityTrackChunk, MDXParticleEmitter2VisibilityTrack> implements MDXParticleEmitter2VisibilityTrackChunkSerializer {
    public StdMDXParticleEmitter2VisibilityTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitter2VisibilityTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
