package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXColorTrackSerializer;
import w3.asset.model.mdx.model.MDXColorTrack;
import w3.asset.model.mdx.model.MDXTrack;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXColorTrackSerializer implements MDXColorTrackSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXColorTrackSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXColorTrack data) {
        write_0x0(data);
    }

    private void write_0x0(MDXColorTrack colorTrack) {
    }
}
