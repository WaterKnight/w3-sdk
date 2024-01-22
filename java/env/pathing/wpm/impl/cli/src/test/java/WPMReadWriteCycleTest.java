import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.env.pathing.wpm.impl.kaitai.KaitaiBasedWPMParser;
import w3.env.pathing.wpm.impl.std.StdWPMSerializer;
import w3.env.pathing.wpm.model.EncodingFormat;
import w3.env.pathing.wpm.model.WPM;

import java.net.URISyntaxException;

public class WPMReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("env/pathing/wpm"),
                "env/pathing/wpm",
                "wpm",
                KaitaiBasedWPMParser::new,
                (outputStream, inputData) -> new StdWPMSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                WPMReadWriteCycleTest::assertEqualsWPM
        );
    }

    private static void assertEqualsWPM(WPM inputData, WPM outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getWidth(), outputData.getWidth());
        Assert.assertEquals(inputData.getHeight(), outputData.getHeight());
        Assert.assertEquals(inputData.getFileId(), outputData.getFileId());
        Assert.assertEquals(inputData.getPathingNode(), outputData.getPathingNode());
    }
}
