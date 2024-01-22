package w3.env.terrain.terrain.impl.slk;

import w3.common.slk.impl.ModelToSlkFileMapper;
import w3.common.slk.impl.StdSlkSerializer;
import w3.common.slk.model.SlkFile;
import w3.env.terrain.terrain.api.TerrainSerializer;
import w3.env.terrain.terrain.model.Terrain;

import java.io.DataOutput;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class SlkBasedTerrainSerializer implements TerrainSerializer {
    private final OutputStream outputStream;

    public SlkBasedTerrainSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(Terrain data) {
        final SlkFile slkFile = new ModelToSlkFileMapper<>().map(data);
        new StdSlkSerializer(outputStream).serialize(slkFile);
    }
}
