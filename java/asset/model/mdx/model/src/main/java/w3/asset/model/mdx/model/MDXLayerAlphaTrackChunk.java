package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLayerAlphaTrackChunk extends MDXTracksChunk<MDXLayerAlphaTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KMTA");
    }

    private List<MDXLayerAlphaTrack> tracks;

    @Override
    public List<MDXLayerAlphaTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLayerAlphaTrack> tracks) {
        this.tracks = tracks;
    }
}
