import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.strings.wts.impl.antlr.AntlrBasedWTSParser;
import w3.strings.wts.impl.std.StdWTSSerializer;
import w3.strings.wts.model.WTS;

import java.net.URISyntaxException;

public class WTSReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().testPrint(
                getClass().getResource("strings/wts"),
                "strings/wts",
                "wts",
                AntlrBasedWTSParser::new,
                (outputStream, inputData) -> new StdWTSSerializer(outputStream),
                WTSReadWriteCycleTest::assertEqualsWTS
        );
    }

    private static void assertEqualsWTS(WTS inputData, WTS outputData) {
        Assert.assertEquals(inputData.blocks, outputData.blocks);
    }
}
