package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2SpeedTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXParticleEmitter2SpeedTrack;
import w3.asset.model.mdx.model.MDXParticleEmitter2SpeedTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXParticleEmitter2SpeedTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitter2SpeedTrackChunk, MDXParticleEmitter2SpeedTrack> implements MDXParticleEmitter2SpeedTrackChunkSerializer {
    public StdMDXParticleEmitter2SpeedTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitter2SpeedTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
