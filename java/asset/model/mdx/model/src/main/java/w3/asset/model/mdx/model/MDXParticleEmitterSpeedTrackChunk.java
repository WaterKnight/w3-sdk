package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitterSpeedTrackChunk extends MDXTracksChunk<MDXParticleEmitterSpeedTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KPES");
    }

    private List<MDXParticleEmitterSpeedTrack> tracks;

    @Override
    public List<MDXParticleEmitterSpeedTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitterSpeedTrack> tracks) {
        this.tracks = tracks;
    }
}
