package w3.object.collection.mod.w3o.impl.cli;

import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        new CommandLine(new ConvertCommand()).execute(args);
    }
}
