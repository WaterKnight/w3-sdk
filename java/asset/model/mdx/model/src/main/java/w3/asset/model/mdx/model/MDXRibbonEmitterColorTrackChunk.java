package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXRibbonEmitterColorTrackChunk extends MDXTracksChunk<MDXRibbonEmitterColorTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KRCO");
    }

    private List<MDXRibbonEmitterColorTrack> tracks;

    @Override
    public List<MDXRibbonEmitterColorTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXRibbonEmitterColorTrack> tracks) {
        this.tracks = tracks;
    }
}
