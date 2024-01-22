package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2LengthTrackChunk extends MDXTracksChunk<MDXParticleEmitter2LengthTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KP2N");
    }

    private List<MDXParticleEmitter2LengthTrack> tracks;

    @Override
    public List<MDXParticleEmitter2LengthTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitter2LengthTrack> tracks) {
        this.tracks = tracks;
    }
}
