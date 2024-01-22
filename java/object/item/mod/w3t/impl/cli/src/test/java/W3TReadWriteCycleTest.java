import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.object.common.core.EncodingFormat;
import w3.object.item.mod.impl.kaitai.KaitaiBasedW3TParser;
import w3.object.item.mod.w3t.impl.std.StdW3TSerializer;
import w3.object.item.mod.w3t.model.W3T;

import java.net.URISyntaxException;

public class W3TReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("object/item/mod"),
                "object/item/mod",
                "w3t",
                KaitaiBasedW3TParser::new,
                (outputStream, inputData) -> new StdW3TSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3TReadWriteCycleTest::assertEqualsW3T
        );
    }

    private static void assertEqualsW3T(W3T inputData, W3T outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getDefaultObjectsChunk().getObject(), outputData.getDefaultObjectsChunk().getObject());
        Assert.assertEquals(inputData.getCustomObjectsChunk().getObject(), outputData.getCustomObjectsChunk().getObject());
    }
}
