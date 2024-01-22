import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.env.placement.camera.w3c.impl.kaitai.KaitaiBasedW3CParser;
import w3.env.placement.camera.w3c.impl.std.StdW3CSerializer;
import w3.env.placement.camera.w3c.model.EncodingFormat;
import w3.env.placement.camera.w3c.model.W3C;

import java.net.URISyntaxException;

public class W3CReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("env/placement/camera/w3c"),
                "env/placement/camera/w3c",
                "w3c",
                KaitaiBasedW3CParser::new,
                (outputStream, inputData) -> new StdW3CSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3CReadWriteCycleTest::assertEqualsW3C
        );
    }

    private static void assertEqualsW3C(W3C inputData, W3C outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getCamera(), outputData.getCamera());
    }
}
