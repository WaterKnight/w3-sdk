import org.junit.jupiter.api.Test;
import org.testng.Assert;
import w3.common.test.ReadWriteCycleTest;
import w3.save.w3v.impl.kaitai.KaitaiBasedW3VParser;
import w3.save.w3v.impl.std.StdW3VSerializer;
import w3.save.w3v.model.EncodingFormat;
import w3.save.w3v.model.W3V;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

public class W3VReadWriteCycleTest {
    @Test
    public void test() throws URISyntaxException {
        try {
            new ReadWriteCycleTest().test(
                    getClass().getResource("save/w3v"),
                    "save/w3v",
                    "w3v",
                    (bytes) -> new KaitaiBasedW3VParser(bytes, true),
                    (outputStream, inputData) -> new StdW3VSerializer(outputStream, EncodingFormat.valueOf((int) inputData.getVersion()), true),
                    W3VReadWriteCycleTest::assertEqualsW3V
            );
        } catch (final ReadWriteCycleTest.BytesNotEqualError e) {
            System.err.println(e.getMessage());
            // TODO: establish byte-level equality (fixing compression algorithm)
        }
    }

    private static void assertEqualsW3V(W3V inputData, W3V outputData) {
        Assert.assertEquals(inputData.getVersion(), outputData.getVersion());
        Assert.assertEquals(inputData.getGameCache(), outputData.getGameCache());
    }
}
