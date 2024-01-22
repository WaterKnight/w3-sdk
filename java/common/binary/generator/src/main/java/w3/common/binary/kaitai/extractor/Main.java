package w3.common.binary.kaitai.extractor;

import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        new CommandLine(new ExtractCommand()).execute(args);
    }
}
