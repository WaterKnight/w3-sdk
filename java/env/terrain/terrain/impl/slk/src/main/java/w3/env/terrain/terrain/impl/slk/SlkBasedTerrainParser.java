package w3.env.terrain.terrain.impl.slk;

import w3.common.slk.impl.SlkFileToModelMapper;
import w3.common.slk.impl.AntlrBasedSlkFileParser;
import w3.common.slk.model.SlkFile;
import w3.env.terrain.terrain.api.TerrainParser;
import w3.env.terrain.terrain.model.Terrain;

public class SlkBasedTerrainParser implements TerrainParser {
    private final SlkFile slkFile;
    private final byte[] bytes;

    public SlkBasedTerrainParser(SlkFile slkFile, byte[] bytes) {
        this.slkFile = slkFile;
        this.bytes = bytes;
    }

    @Override
    public Terrain parse() {
        final SlkFile slkFile1 = new AntlrBasedSlkFileParser(slkFile, bytes).parse();
        return new SlkFileToModelMapper<>(Terrain.class).map(slkFile1);
    }
}
