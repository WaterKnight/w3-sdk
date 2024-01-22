import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.env.placement.terrain.w3e.EncodingFormat;
import w3.env.placement.terrain.w3e.W3E;
import w3.env.placement.terrain.w3e.impl.kaitai.KaitaiBasedW3EParser;
import w3.env.placement.terrain.w3e.impl.std.StdW3ESerializer;

import java.net.URISyntaxException;

public class W3EReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("env/terrain/w3e"),
                "env/terrain/w3e",
                "w3e",
                KaitaiBasedW3EParser::new,
                (outputStream, inputData) -> new StdW3ESerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3EReadWriteCycleTest::assertEqualsW3E
        );
    }

    private static void assertEqualsW3E(W3E inputData, W3E outputData) {
        Assert.assertEquals(inputData.getFileId(), outputData.getFileId());
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getTileset(), outputData.getTileset());
        Assert.assertEquals(inputData.getUseCustomTileset(), outputData.getUseCustomTileset());
        Assert.assertEquals(inputData.getTileId(), outputData.getTileId());
        Assert.assertEquals(inputData.getCliffTileId(), outputData.getCliffTileId());
        Assert.assertEquals(inputData.getMapWidth(), outputData.getMapWidth());
        Assert.assertEquals(inputData.getMapHeight(), outputData.getMapHeight());
        Assert.assertEquals(inputData.getCenterOffsetX(), outputData.getCenterOffsetX());
        Assert.assertEquals(inputData.getCenterOffsetY(), outputData.getCenterOffsetY());
        Assert.assertEquals(inputData.getTileNode(), outputData.getTileNode());
    }
}
