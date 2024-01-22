import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.object.buff.mod.w3h.impl.kaitai.KaitaiBasedW3HParser;
import w3.object.buff.mod.w3h.impl.std.StdW3HSerializer;
import w3.object.buff.mod.w3h.model.W3H;
import w3.object.common.core.EncodingFormat;

import java.net.URISyntaxException;

public class W3HReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("object/buff/mod"),
                "object/buff/mod",
                "w3h",
                KaitaiBasedW3HParser::new,
                (outputStream, inputData) -> new StdW3HSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3HReadWriteCycleTest::assertEqualsW3H
        );
    }

    private static void assertEqualsW3H(W3H inputData, W3H outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getDefaultObjectsChunk().getObject(), outputData.getDefaultObjectsChunk().getObject());
        Assert.assertEquals(inputData.getCustomObjectsChunk().getObject(), outputData.getCustomObjectsChunk().getObject());
    }
}
