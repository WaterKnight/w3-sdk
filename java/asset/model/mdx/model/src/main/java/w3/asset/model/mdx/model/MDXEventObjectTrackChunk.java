package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXEventObjectTrackChunk extends MDXTracksChunk<MDXEventObjectTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KEVT");
    }

    private long globalSequenceId;

    private List<MDXEventObjectTrack> tracks;

    public long getGlobalSequenceId() {
        return globalSequenceId;
    }

    public void setGlobalSequenceId(long globalSequenceId) {
        this.globalSequenceId = globalSequenceId;
    }

    public List<MDXEventObjectTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXEventObjectTrack> tracks) {
        this.tracks = tracks;
    }
}
