package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXSoundChunkSerializer;
import w3.asset.model.mdx.api.MDXSoundSerializer;
import w3.asset.model.mdx.model.MDXSound;
import w3.asset.model.mdx.model.MDXSoundChunk;

public class StdMDXSoundChunkSerializer extends StdMDXChunkSerializer implements MDXSoundChunkSerializer {
    private final MDXSoundSerializer soundSerializer;

    public StdMDXSoundChunkSerializer(MDXSoundSerializer soundSerializer) {
        this.soundSerializer = soundSerializer;
    }

    @Override
    public void serialize(MDXSoundChunk data) {
        write(data);
    }

    public void write(MDXSoundChunk data) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(stream);

                break;
        }
    }

    private void write_0x0(MDXSoundChunk data) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(stream);

        for (MDXSound sound : data.getSounds()) {
            soundSerializer.serialize(sound);
        }

        header.rewrite();
    }
}
