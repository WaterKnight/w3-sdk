package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXRibbonEmitterHeightBelowTrackChunk extends MDXTracksChunk<MDXRibbonEmitterHeightBelowTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KRHB");
    }

    private List<MDXRibbonEmitterHeightBelowTrack> tracks;

    @Override
    public List<MDXRibbonEmitterHeightBelowTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXRibbonEmitterHeightBelowTrack> tracks) {
        this.tracks = tracks;
    }
}
