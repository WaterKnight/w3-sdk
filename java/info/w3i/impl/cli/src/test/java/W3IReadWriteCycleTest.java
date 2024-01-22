import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.info.w3i.impl.kaitai.KaitaiBasedW3IParser;
import w3.info.w3i.impl.std.EncodingFormat;
import w3.info.w3i.impl.std.StdW3ISerializer;
import w3.info.w3i.model.W3I;

import java.net.URISyntaxException;

public class W3IReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("info/w3i"),
                "info/w3i",
                "w3i",
                KaitaiBasedW3IParser::new,
                (outputStream, inputData) -> new StdW3ISerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3IReadWriteCycleTest::assertEqualsW3I
        );
    }

    private static void assertEqualsW3I(W3I inputData, W3I outputData) {
        Assert.assertEquals(outputData.getMapHeight(), inputData.getMapHeight());
        Assert.assertEquals(outputData.getMapWidth(), inputData.getMapWidth());
        Assert.assertEquals(outputData.getMargins().getLeft(), inputData.getMargins().getLeft());
        Assert.assertEquals(outputData.getMargins().getBottom(), inputData.getMargins().getBottom());
        Assert.assertEquals(outputData.getMargins().getRight(), inputData.getMargins().getRight());
        Assert.assertEquals(outputData.getMargins().getTop(), inputData.getMargins().getTop());
        Assert.assertEquals(outputData.getPlayersChunk().getPlayer().toArray(), inputData.getPlayersChunk().getPlayer().toArray());
        Assert.assertEquals(outputData.getPrologueScreen(), inputData.getPrologueScreen());
        Assert.assertEquals(outputData.getLoadingScreen(), inputData.getLoadingScreen());
        Assert.assertEquals(outputData.getDescription(), inputData.getDescription());
        Assert.assertEquals(outputData.getFlags(), inputData.getFlags());
        Assert.assertEquals(outputData.getSaves(), inputData.getSaves());
        Assert.assertEquals(outputData.getTileset(), inputData.getTileset());
        Assert.assertEquals(outputData.getGameDataSet(), inputData.getGameDataSet());
        Assert.assertEquals(outputData.getWaterColor(), inputData.getWaterColor());
        Assert.assertEquals(outputData.getUpgradesChunk().getUpgrade().toArray(), inputData.getUpgradesChunk().getUpgrade().toArray());
        Assert.assertEquals(outputData.getTechsChunk().getTech().toArray(), inputData.getTechsChunk().getTech().toArray());
        Assert.assertEquals(outputData.getForcesChunk().getForce().toArray(), inputData.getForcesChunk().getForce().toArray());
        Assert.assertEquals(outputData.getRandomItemTablesChunk().getTable().toArray(), inputData.getRandomItemTablesChunk().getTable().toArray());
        Assert.assertEquals(outputData.getRandomUnitTablesChunk().getTable().toArray(), inputData.getRandomUnitTablesChunk().getTable().toArray());
        Assert.assertEquals(outputData.getRecommendedPlayers(), inputData.getRecommendedPlayers());
        Assert.assertEquals(outputData.getCameraBounds().getCameraBoundBottomLeft(), inputData.getCameraBounds().getCameraBoundBottomLeft());
        Assert.assertEquals(outputData.getCameraBounds().getCameraBoundBottomRight(), inputData.getCameraBounds().getCameraBoundBottomRight());
        Assert.assertEquals(outputData.getCameraBounds().getCameraBoundTopLeft(), inputData.getCameraBounds().getCameraBoundTopLeft());
        Assert.assertEquals(outputData.getCameraBounds().getCameraBoundTopRight(), inputData.getCameraBounds().getCameraBoundTopRight());
        Assert.assertEquals(outputData.getFog(), inputData.getFog());
        Assert.assertEquals(outputData.getGlobalWeatherId(), inputData.getGlobalWeatherId());
    }
}
