package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXEventObjectTrackSerializer;
import w3.asset.model.mdx.model.MDXEventObjectTrack;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXEventObjectTrackSerializer implements MDXEventObjectTrackSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXEventObjectTrackSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXEventObjectTrack data) {
        write_0x0(data);
    }

    private void write_0x0(MDXEventObjectTrack eventObjectTrack) {
        outputStream.writeUInt32(eventObjectTrack.getIndex());
    }
}
