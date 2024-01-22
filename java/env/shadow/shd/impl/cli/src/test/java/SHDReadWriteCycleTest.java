import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.env.shadow.shd.impl.kaitai.KaitaiBasedSHDParser;
import w3.env.shadow.shd.impl.std.StdSHDSerializer;
import w3.env.shadow.shd.model.SHD;

import java.net.URISyntaxException;

public class SHDReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("env/shadow/shd"),
                "env/shadow/shd",
                "shd",
                KaitaiBasedSHDParser::new,
                (outputStream, inputData) -> new StdSHDSerializer(outputStream),
                SHDReadWriteCycleTest::assertEqualsSHD
        );
    }

    private static void assertEqualsSHD(SHD inputData, SHD outputData) {
        Assert.assertEquals(inputData.getShadowNode(), outputData.getShadowNode());
    }
}
