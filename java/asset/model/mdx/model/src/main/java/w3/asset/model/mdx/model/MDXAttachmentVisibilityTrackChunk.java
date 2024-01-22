package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXAttachmentVisibilityTrackChunk extends MDXTracksChunk<MDXAttachmentVisibilityTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KATV");
    }

    private List<MDXAttachmentVisibilityTrack> tracks;

    @Override
    public List<MDXAttachmentVisibilityTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXAttachmentVisibilityTrack> tracks) {
        this.tracks = tracks;
    }
}
