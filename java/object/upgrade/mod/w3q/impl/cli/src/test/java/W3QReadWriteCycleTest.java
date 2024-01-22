import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.object.common.core.EncodingFormat;
import w3.object.upgrade.mod.w3q.impl.kaitai.KaitaiBasedW3QParser;
import w3.object.upgrade.mod.w3q.impl.std.StdW3QSerializer;
import w3.object.upgrade.mod.w3q.model.W3Q;

import java.net.URISyntaxException;

public class W3QReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("object/upgrade/mod"),
                "object/upgrade/mod",
                "w3q",
                KaitaiBasedW3QParser::new,
                (outputStream, inputData) -> new StdW3QSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3QReadWriteCycleTest::assertEqualsW3Q
        );
    }

    private static void assertEqualsW3Q(W3Q inputData, W3Q outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getDefaultObjectsChunk().getObject(), outputData.getDefaultObjectsChunk().getObject());
        Assert.assertEquals(inputData.getCustomObjectsChunk().getObject(), outputData.getCustomObjectsChunk().getObject());
    }
}
