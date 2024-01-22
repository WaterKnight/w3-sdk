import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.object.common.core.EncodingFormat;
import w3.object.unit.mod.w3u.impl.kaitai.KaitaiBasedW3UParser;
import w3.object.unit.mod.w3u.impl.std.StdW3USerializer;
import w3.object.unit.mod.w3u.model.W3U;

import java.net.URISyntaxException;

public class W3UReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("object/unit/mod"),
                "object/unit/mod",
                "w3u",
                KaitaiBasedW3UParser::new,
                (outputStream, inputData) -> new StdW3USerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3UReadWriteCycleTest::assertEqualsW3U
        );
    }

    private static void assertEqualsW3U(W3U inputData, W3U outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getDefaultObjectsChunk().getObject(), outputData.getDefaultObjectsChunk().getObject());
        Assert.assertEquals(inputData.getCustomObjectsChunk().getObject(), outputData.getCustomObjectsChunk().getObject());
    }
}
