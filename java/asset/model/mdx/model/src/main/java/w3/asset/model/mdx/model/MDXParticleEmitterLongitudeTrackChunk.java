package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitterLongitudeTrackChunk extends MDXTracksChunk<MDXParticleEmitterLongitudeTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KPLN");
    }

    private List<MDXParticleEmitterLongitudeTrack> tracks;

    @Override
    public List<MDXParticleEmitterLongitudeTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitterLongitudeTrack> tracks) {
        this.tracks = tracks;
    }
}
