import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.env.placement.sound.w3s.impl.kaitai.KaitaiBasedW3SParser;
import w3.env.placement.sound.w3s.impl.std.StdW3SSerializer;
import w3.env.placement.sound.w3s.model.EncodingFormat;
import w3.env.placement.sound.w3s.model.W3S;

import java.net.URISyntaxException;

public class W3SReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("env/placement/sound/w3s"),
                "env/placement/sound/w3s",
                "w3s",
                KaitaiBasedW3SParser::new,
                (outputStream, inputData) -> new StdW3SSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3SReadWriteCycleTest::assertEqualsW3S
        );
    }

    private static void assertEqualsW3S(W3S inputData, W3S outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getSound(), outputData.getSound());
    }
}
