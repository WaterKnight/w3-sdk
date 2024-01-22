import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.env.placement.region.w3r.impl.kaitai.KaitaiBasedW3RParser;
import w3.env.placement.region.w3r.impl.std.StdW3RSerializer;
import w3.env.placement.region.w3r.model.EncodingFormat;
import w3.env.placement.region.w3r.model.W3R;

import java.net.URISyntaxException;

public class W3RReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("env/placement/region/w3r"),
                "env/placement/region/w3r",
                "w3r",
                KaitaiBasedW3RParser::new,
                (outputStream, inputData) -> new StdW3RSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3RReadWriteCycleTest::assertEqualsW3R
        );
    }

    private static void assertEqualsW3R(W3R inputData, W3R outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getRegion(), outputData.getRegion());
    }
}
