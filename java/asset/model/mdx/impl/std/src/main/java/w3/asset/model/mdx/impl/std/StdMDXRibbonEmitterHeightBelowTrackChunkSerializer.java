package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXRibbonEmitterHeightBelowTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXRibbonEmitterHeightBelowTrack;
import w3.asset.model.mdx.model.MDXRibbonEmitterHeightBelowTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXRibbonEmitterHeightBelowTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXRibbonEmitterHeightBelowTrackChunk, MDXRibbonEmitterHeightBelowTrack> implements MDXRibbonEmitterHeightBelowTrackChunkSerializer {
    public StdMDXRibbonEmitterHeightBelowTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXRibbonEmitterHeightBelowTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
