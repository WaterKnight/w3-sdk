import spoon.Launcher;
import spoon.reflect.declaration.CtType;

public class Main {
    public static void main(String[] args) {
        final Launcher launcher = new Launcher();

        launcher.addInputResource("java/object/ability/mod/w3a/model/generator/W3ObjModFile.java");

        launcher.buildModel();

        final var model = launcher.getModel();

        final CtType clazz = model.getAllTypes().stream().findFirst().get();

        clazz.setSimpleName("W3A");
    }
}
