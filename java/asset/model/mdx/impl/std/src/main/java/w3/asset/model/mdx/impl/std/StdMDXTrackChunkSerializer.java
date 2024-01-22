package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.model.MDXTrack;
import w3.asset.model.mdx.model.MDXTracksChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public abstract class StdMDXTrackChunkSerializer<TrackTypeChunk extends MDXTracksChunk<TrackType>, TrackType extends MDXTrack<?>> extends StdMDXChunkSerializer<TrackTypeChunk> {
    protected final Wc3BinOutputStream outputStream;
    protected final Serializer<TrackType> trackSerializer;

    public StdMDXTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<TrackType> trackSerializer) {
        this.outputStream = outputStream;
        this.trackSerializer = trackSerializer;
    }

    @Override
    public void serialize(TrackTypeChunk data) {
        write_0x0(data);
    }

    private void write_0x0(TrackTypeChunk tracksChunk) {
        outputStream.writeId(tracksChunk.getToken());

        outputStream.writeUInt32(tracksChunk.getTracks().size());

        outputStream.writeUInt32(tracksChunk.getInterpolationType().ordinal());
        outputStream.writeUInt32(tracksChunk.getGlobalSequenceId());

        for (TrackType track : tracksChunk.getTracks()) {
            trackSerializer.serialize(track);
        }
    }
}