import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.env.placement.object.doo.impl.kaitai.KaitaiBasedDooParser;
import w3.env.placement.object.doo.impl.std.StdDooSerializer;
import w3.env.placement.object.doo.model.Doo;
import w3.env.placement.object.doo.model.EncodingFormat;

import java.net.URISyntaxException;

public class DooReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("env/placement/object/doo"),
                "env/placement/object/doo",
                "doo",
                (bytes) -> new KaitaiBasedDooParser(bytes, false),
                (outputStream, inputData) -> new StdDooSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion()), false),
                DooReadWriteCycleTest::assertEqualsDoo
        );
    }

    private static void assertEqualsDoo(Doo inputData, Doo outputData) {
        Assert.assertEquals(inputData.getFileId(), outputData.getFileId());
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getSubVersion(), outputData.getSubVersion());
        Assert.assertEquals(inputData.getDoodad(), outputData.getDoodad());
        Assert.assertEquals(inputData.getSpecialDoodadVersion(), outputData.getSpecialDoodadVersion());
        Assert.assertEquals(inputData.getSpecialDoodad(), outputData.getSpecialDoodad());
    }
}
