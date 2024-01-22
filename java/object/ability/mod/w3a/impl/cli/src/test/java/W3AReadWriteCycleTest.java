import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.object.ability.mod.impl.std.StdW3ASerializer;
import w3.object.ability.mod.w3a.impl.kaitai.KaitaiBasedW3AParser;
import w3.object.ability.mod.w3a.model.W3A;
import w3.object.common.core.EncodingFormat;

import java.net.URISyntaxException;

public class W3AReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("object/ability/mod"),
                "object/ability/mod",
                "w3a",
                KaitaiBasedW3AParser::new,
                (outputStream, inputData) -> new StdW3ASerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3AReadWriteCycleTest::assertEqualsW3A
        );
    }

    private static void assertEqualsW3A(W3A inputData, W3A outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getDefaultObjectsChunk().getObject(), outputData.getDefaultObjectsChunk().getObject());
        Assert.assertEquals(inputData.getCustomObjectsChunk().getObject(), outputData.getCustomObjectsChunk().getObject());
    }
}
