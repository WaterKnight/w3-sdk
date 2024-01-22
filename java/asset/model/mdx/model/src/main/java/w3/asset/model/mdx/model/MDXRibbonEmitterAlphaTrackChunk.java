package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXRibbonEmitterAlphaTrackChunk extends MDXTracksChunk<MDXRibbonEmitterAlphaTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KRAL");
    }

    private List<MDXRibbonEmitterAlphaTrack> tracks;

    @Override
    public List<MDXRibbonEmitterAlphaTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXRibbonEmitterAlphaTrack> tracks) {
        this.tracks = tracks;
    }
}
