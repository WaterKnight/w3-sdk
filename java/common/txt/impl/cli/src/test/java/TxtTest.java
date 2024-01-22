import w3.common.test.ReadWriteCycleTest;
import w3.common.txt.impl.AntlrBasedTxtFileParser;
import w3.common.txt.impl.StdTxtFileSerializer;
import w3.common.txt.model.TxtFile;

import java.net.URISyntaxException;

public class TxtTest {
    @org.junit.jupiter.api.Test
    public void test() throws URISyntaxException {
        new ReadWriteCycleTest().testPrint(
                getClass().getResource("skin/skin"),
                "skin/skin",
                "txt",
                AntlrBasedTxtFileParser::new,
                (outputStream, inputData) -> new StdTxtFileSerializer(outputStream),
                TxtTest::assertEqualsTxt
        );
    }

    private static void assertEqualsTxt(TxtFile inputData, TxtFile outputData) {

    }
}
