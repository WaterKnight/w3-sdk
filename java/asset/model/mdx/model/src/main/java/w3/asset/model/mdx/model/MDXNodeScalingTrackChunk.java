package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXNodeScalingTrackChunk extends MDXTracksChunk<MDXNodeScalingTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KGSC");
    }

    private List<MDXNodeScalingTrack> tracks;

    @Override
    public List<MDXNodeScalingTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXNodeScalingTrack> tracks) {
        this.tracks = tracks;
    }
}
