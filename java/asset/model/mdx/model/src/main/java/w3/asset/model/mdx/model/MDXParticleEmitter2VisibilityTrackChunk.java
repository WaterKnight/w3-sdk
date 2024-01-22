package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2VisibilityTrackChunk extends MDXTracksChunk<MDXParticleEmitter2VisibilityTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KP2V");
    }

    private List<MDXParticleEmitter2VisibilityTrack> tracks;

    @Override
    public List<MDXParticleEmitter2VisibilityTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitter2VisibilityTrack> tracks) {
        this.tracks = tracks;
    }
}
