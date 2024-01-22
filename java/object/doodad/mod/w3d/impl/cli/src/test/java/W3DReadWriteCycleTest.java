import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.object.common.core.EncodingFormat;
import w3.object.doodad.mod.w3d.impl.kaitai.KaitaiBasedW3DParser;
import w3.object.doodad.mod.w3d.impl.std.StdW3DSerializer;
import w3.object.doodad.mod.w3d.model.W3D;

import java.net.URISyntaxException;

public class W3DReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("object/doodad/mod"),
                "object/doodad/mod",
                "w3d",
                KaitaiBasedW3DParser::new,
                (outputStream, inputData) -> new StdW3DSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                W3DReadWriteCycleTest::assertEqualsW3D
        );
    }

    private static void assertEqualsW3D(W3D inputData, W3D outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getDefaultObjectsChunk().getObject(), outputData.getDefaultObjectsChunk().getObject());
        Assert.assertEquals(inputData.getCustomObjectsChunk().getObject(), outputData.getCustomObjectsChunk().getObject());
    }
}
