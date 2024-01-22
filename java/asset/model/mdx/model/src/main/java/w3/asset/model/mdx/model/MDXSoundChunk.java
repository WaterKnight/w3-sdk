package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXSoundChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("SNDS");
    }

    private List<MDXSound> sounds;

    public List<MDXSound> getSounds() {
        return sounds;
    }

    public void setSounds(List<MDXSound> sounds) {
        this.sounds = sounds;
    }
}
