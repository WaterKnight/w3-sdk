package w3.info.mmp.impl.cli;

import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        new CommandLine(new ConvertCommand()).execute(args);
    }
}
