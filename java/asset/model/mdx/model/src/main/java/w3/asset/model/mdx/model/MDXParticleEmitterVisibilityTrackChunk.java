package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitterVisibilityTrackChunk extends MDXTracksChunk<MDXParticleEmitterVisibilityTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KPEV");
    }

    private List<MDXParticleEmitterVisibilityTrack> tracks;

    @Override
    public List<MDXParticleEmitterVisibilityTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitterVisibilityTrack> tracks) {
        this.tracks = tracks;
    }
}
