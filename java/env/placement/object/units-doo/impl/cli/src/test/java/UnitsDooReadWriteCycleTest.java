import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.env.placement.object.units_doo.impl.kaitai.KaitaiBasedUnitsDooParser;
import w3.env.placement.object.units_doo.impl.std.StdUnitsDooSerializer;
import w3.env.placement.object.units_doo.model.EncodingFormat;
import w3.env.placement.object.units_doo.model.UnitsDoo;

import java.net.URISyntaxException;

public class UnitsDooReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("env/placement/object/doo-units"),
                "env/placement/object/doo-units",
                "doo",
                (bytes) -> new KaitaiBasedUnitsDooParser(bytes, false),
                (outputStream, inputData) -> new StdUnitsDooSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion()), false),
                UnitsDooReadWriteCycleTest::assertEqualsDoo
        );
    }

    private static void assertEqualsDoo(UnitsDoo inputData, UnitsDoo outputData) {
        Assert.assertEquals(inputData.getFileId(), outputData.getFileId());
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getSubVersion(), outputData.getSubVersion());
        Assert.assertEquals(inputData.getUnit(), outputData.getUnit());
    }
}
