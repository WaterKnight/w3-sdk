package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXRibbonEmitterTextureSlotTrackChunk extends MDXTracksChunk<MDXRibbonEmitterTextureSlotTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KRTX");
    }

    private List<MDXRibbonEmitterTextureSlotTrack> tracks;

    @Override
    public List<MDXRibbonEmitterTextureSlotTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXRibbonEmitterTextureSlotTrack> tracks) {
        this.tracks = tracks;
    }
}
