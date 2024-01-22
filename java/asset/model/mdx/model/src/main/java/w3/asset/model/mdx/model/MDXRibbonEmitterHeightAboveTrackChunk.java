package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXRibbonEmitterHeightAboveTrackChunk extends MDXTracksChunk<MDXRibbonEmitterHeightAboveTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KRHA");
    }

    private List<MDXRibbonEmitterHeightAboveTrack> tracks;

    @Override
    public List<MDXRibbonEmitterHeightAboveTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXRibbonEmitterHeightAboveTrack> tracks) {
        this.tracks = tracks;
    }
}
