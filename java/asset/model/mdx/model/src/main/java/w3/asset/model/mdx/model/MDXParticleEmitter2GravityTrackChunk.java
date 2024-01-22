package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2GravityTrackChunk extends MDXTracksChunk<MDXParticleEmitter2GravityTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KP2G");
    }

    private List<MDXParticleEmitter2GravityTrack> tracks;

    @Override
    public List<MDXParticleEmitter2GravityTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitter2GravityTrack> tracks) {
        this.tracks = tracks;
    }
}
