package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXEventObjectSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXEventObject;

public class StdMDXEventObjectSerializer implements MDXEventObjectSerializer {
    private final MDXNodeSerializer nodeSerializer;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXEventObjectSerializer(MDXNodeSerializer nodeSerializer, MDXChunkSerializer chunkSerializer) {
        this.nodeSerializer = nodeSerializer;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXEventObject data) {
        write_0x0(data);
    }

    private void write_0x0(MDXEventObject eventObject) {
        nodeSerializer.serialize(eventObject.getNode());

        chunkSerializer.serialize(eventObject.getChunk());
    }
}
