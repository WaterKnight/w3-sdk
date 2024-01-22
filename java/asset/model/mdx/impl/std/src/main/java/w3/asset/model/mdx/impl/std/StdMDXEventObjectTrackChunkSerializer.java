package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXEventObjectTrackChunkSerializer;
import w3.asset.model.mdx.api.MDXEventObjectTrackSerializer;
import w3.asset.model.mdx.model.MDXEventObjectTrack;
import w3.asset.model.mdx.model.MDXEventObjectTrackChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXEventObjectTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXEventObjectTrackChunk, MDXEventObjectTrack> implements MDXEventObjectTrackChunkSerializer {
    public StdMDXEventObjectTrackChunkSerializer(Wc3BinOutputStream outputStream, MDXEventObjectTrackSerializer eventObjectTrackSerializer) {
        super(outputStream, eventObjectTrackSerializer);
    }
}
