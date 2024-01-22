import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.info.mmp.impl.kaitai.KaitaiBasedMMPParser;
import w3.info.mmp.impl.std.StdMMPSerializer;
import w3.info.mmp.model.EncodingFormat;
import w3.info.mmp.model.MMP;

import java.net.URISyntaxException;

public class MMPReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("info/mmp"),
                "info/mmp",
                "mmp",
                KaitaiBasedMMPParser::new,
                (outputStream, inputData) -> new StdMMPSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                MMPReadWriteCycleTest::assertEqualsMMP
        );
    }

    private static void assertEqualsMMP(MMP inputData, MMP outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getIconsChunk(), outputData.getIconsChunk());
    }
}
