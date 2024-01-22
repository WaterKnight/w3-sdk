import kaitai.KaitaiBasedW3BParser;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.object.common.core.EncodingFormat;
import w3.object.destructable.mod.w3b.impl.std.StdW3BSerializer;
import w3.object.destructable.mod.w3b.model.W3B;

import java.net.URISyntaxException;

public class W3BReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("object/destructable/mod"),
                "object/destructable/mod",
                "w3b",
                KaitaiBasedW3BParser::new,
                (outputStream, inputData) -> new StdW3BSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3BReadWriteCycleTest::assertEqualsW3B
        );
    }

    private static void assertEqualsW3B(W3B inputData, W3B outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getDefaultObjectsChunk().getObject(), outputData.getDefaultObjectsChunk().getObject());
        Assert.assertEquals(inputData.getCustomObjectsChunk().getObject(), outputData.getCustomObjectsChunk().getObject());
    }
}
