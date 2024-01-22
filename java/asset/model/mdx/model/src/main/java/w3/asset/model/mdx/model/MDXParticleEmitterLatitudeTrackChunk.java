package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitterLatitudeTrackChunk extends MDXTracksChunk<MDXParticleEmitterLatitudeTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KPLT");
    }

    private List<MDXParticleEmitterLatitudeTrack> tracks;

    @Override
    public List<MDXParticleEmitterLatitudeTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitterLatitudeTrack> tracks) {
        this.tracks = tracks;
    }
}
