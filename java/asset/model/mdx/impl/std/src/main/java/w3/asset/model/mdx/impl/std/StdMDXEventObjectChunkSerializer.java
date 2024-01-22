package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXEventObjectChunkSerializer;
import w3.asset.model.mdx.api.MDXEventObjectSerializer;
import w3.asset.model.mdx.model.MDXEventObject;
import w3.asset.model.mdx.model.MDXEventObjectChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXEventObjectChunkSerializer extends StdMDXChunkSerializer implements MDXEventObjectChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXEventObjectSerializer eventObjectSerializer;

    public StdMDXEventObjectChunkSerializer(Wc3BinOutputStream outputStream, MDXEventObjectSerializer eventObjectSerializer) {
        this.outputStream = outputStream;
        this.eventObjectSerializer = eventObjectSerializer;
    }

    @Override
    public void serialize(MDXEventObjectChunk data) {

    }

    private void write(MDXEventObjectChunk eventObjectChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(eventObjectChunk);

                break;
        }
    }

    private void write_0x0(MDXEventObjectChunk eventObjectChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(eventObjectChunk.getToken());

        for (MDXEventObject eventObject : eventObjectChunk.getEventObjects()) {
            eventObjectSerializer.serialize(eventObject);
        }

        header.rewrite();
    }
}
