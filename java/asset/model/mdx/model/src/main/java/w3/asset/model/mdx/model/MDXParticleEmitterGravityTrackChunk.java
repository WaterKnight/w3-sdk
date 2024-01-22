package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitterGravityTrackChunk extends MDXTracksChunk<MDXParticleEmitterGravityTrack> {

    @Override
    public Id getToken() {
        return Id.valueOf("KPEG");
    }

    private List<MDXParticleEmitterGravityTrack> tracks;

    @Override
    public List<MDXParticleEmitterGravityTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitterGravityTrack> tracks) {
        this.tracks = tracks;
    }
}
