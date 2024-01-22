import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.asset.model.mdx.impl.kaitai.KaitaiBasedMDXParser;
import w3.asset.model.mdx.impl.std.StdMDXSerializer;
import w3.asset.model.mdx.model.EncodingFormat;
import w3.asset.model.mdx.model.MDX;
import w3.common.test.ReadWriteCycleTest;

import java.net.URISyntaxException;

public class MDXReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().test(
                getClass().getResource("asset/model/mdx"),
                "asset/model/mdx",
                "mdx",
                KaitaiBasedMDXParser::new,
                (outputStream, inputData) -> new StdMDXSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion())),
                MDXReadWriteCycleTest::assertEqualsMDX
        );
    }

    private static void assertEqualsMDX(MDX inputData, MDX outputData) {
    }
}
