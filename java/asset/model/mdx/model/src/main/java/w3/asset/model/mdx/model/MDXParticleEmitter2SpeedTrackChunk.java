package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2SpeedTrackChunk extends MDXTracksChunk<MDXParticleEmitter2SpeedTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KP2S");
    }

    private List<MDXParticleEmitter2SpeedTrack> tracks;

    @Override
    public List<MDXParticleEmitter2SpeedTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitter2SpeedTrack> tracks) {
        this.tracks = tracks;
    }
}
