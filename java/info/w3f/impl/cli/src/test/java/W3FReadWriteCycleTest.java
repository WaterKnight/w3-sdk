import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.info.w3f.impl.kaitai.KaitaiBasedW3FParser;
import w3.info.w3f.impl.std.StdW3FSerializer;
import w3.info.w3f.model.EncodingFormat;
import w3.info.w3f.model.W3F;

import java.net.URISyntaxException;

public class W3FReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("info/w3f"),
                "info/w3f",
                "w3f",
                KaitaiBasedW3FParser::new,
                (outputStream, inputData) -> new StdW3FSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3FReadWriteCycleTest::assertEqualsW3F
        );
    }

    private static void assertEqualsW3F(W3F inputData, W3F outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getSaves(), outputData.getSaves());
        Assert.assertEquals(inputData.getEditorVersion(), outputData.getEditorVersion());
        Assert.assertEquals(inputData.getName(), outputData.getName());
        Assert.assertEquals(inputData.getDifficulty(), outputData.getDifficulty());
        Assert.assertEquals(inputData.getAuthor(), outputData.getAuthor());
        Assert.assertEquals(inputData.getDescription(), outputData.getDescription());
        Assert.assertEquals(inputData.getVariableDifficultyLevelsFlagAndExpansionFlag(), outputData.getVariableDifficultyLevelsFlagAndExpansionFlag());
        Assert.assertEquals(inputData.getBackgroundScreenIndex(), outputData.getBackgroundScreenIndex());
        Assert.assertEquals(inputData.getBackgroundScreenPath(), outputData.getBackgroundScreenPath());
        Assert.assertEquals(inputData.getMinimapPicturePath(), outputData.getMinimapPicturePath());
        Assert.assertEquals(inputData.getAmbientSoundIndex(), outputData.getAmbientSoundIndex());
        Assert.assertEquals(inputData.getCustomAmbientSoundPath(), outputData.getCustomAmbientSoundPath());
        Assert.assertEquals(inputData.getUseTerrainFog(), outputData.getUseTerrainFog());
        Assert.assertEquals(inputData.getFogZHeight(), outputData.getFogZHeight());
        Assert.assertEquals(inputData.getFogZEnd(), outputData.getFogZEnd());
        Assert.assertEquals(inputData.getFogDensity(), outputData.getFogDensity());
        Assert.assertEquals(inputData.getFogRed(), outputData.getFogRed());
        Assert.assertEquals(inputData.getFogGreen(), outputData.getFogGreen());
        Assert.assertEquals(inputData.getFogBlue(), outputData.getFogBlue());
        Assert.assertEquals(inputData.getFogAlpha(), outputData.getFogAlpha());
        Assert.assertEquals(inputData.getCursorRaceIndex(), outputData.getCursorRaceIndex());
        Assert.assertEquals(inputData.getMap(), outputData.getMap());
        Assert.assertEquals(inputData.getMapOrder(), outputData.getMapOrder());
    }
}
