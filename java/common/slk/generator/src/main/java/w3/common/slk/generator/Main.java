package w3.common.slk.generator;

import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        new CommandLine(new ConvertCommand()).execute(args);
    }
}
