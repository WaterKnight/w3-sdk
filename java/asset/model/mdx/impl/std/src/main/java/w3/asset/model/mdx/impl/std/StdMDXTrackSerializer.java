package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXTrackSerializer;
import w3.asset.model.mdx.model.MDXTrack;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXTrackSerializer<TrackType extends MDXTrack<TrackValueType>, TrackValueType> implements MDXTrackSerializer<TrackType> {
    protected final Wc3BinOutputStream outputStream;
    protected final Serializer<TrackValueType> valueSerializer;

    public StdMDXTrackSerializer(Wc3BinOutputStream outputStream, Serializer<TrackValueType> valueSerializer) {
        this.outputStream = outputStream;
        this.valueSerializer = valueSerializer;
    }

    @Override
    public void serialize(TrackType data) {
        write_0x0(data);
    }

    protected void write_0x0(TrackType track) {
        outputStream.writeInt32(track.getFrame());
        valueSerializer.serialize(track.getValue());

        switch (track.getInterpolationType()) {
            case NONE:
                break;
            case LINEAR:
                break;
            case HERMITE:
            case BEZIER:
                valueSerializer.serialize(track.getInTanValue());
                valueSerializer.serialize(track.getOutTanValue());
                break;
        }
    }
}
