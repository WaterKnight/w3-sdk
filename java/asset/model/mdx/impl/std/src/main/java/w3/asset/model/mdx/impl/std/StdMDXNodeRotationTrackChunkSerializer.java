package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXNodeRotationTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXNodeRotationTrackChunk;

public class StdMDXNodeRotationTrackChunkSerializer extends StdMDXTrackChunkSerializer implements MDXNodeRotationTrackChunkSerializer {
    @Override
    public void serialize(MDXNodeRotationTrackChunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXNodeRotationTrackChunk nodeRotationTrackChunk) {
    }
}
