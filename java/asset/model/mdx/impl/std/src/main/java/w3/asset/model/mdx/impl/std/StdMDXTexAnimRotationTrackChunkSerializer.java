package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXTexAnimRotationTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXTexAnimRotationTrack;
import w3.asset.model.mdx.model.MDXTexAnimRotationTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXTexAnimRotationTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXTexAnimRotationTrackChunk, MDXTexAnimRotationTrack> implements MDXTexAnimRotationTrackChunkSerializer {
    public StdMDXTexAnimRotationTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXTexAnimRotationTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
