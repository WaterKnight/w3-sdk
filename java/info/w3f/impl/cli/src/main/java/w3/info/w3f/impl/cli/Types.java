package w3.info.w3f.impl.cli;

import java.util.HashMap;
import java.util.Map;

public enum Types {
    JSON("json"),
    W3F("w3f");

    private String name;

    public String getName() {
        return name;
    }

    private final static Map<String, Types> byName = new HashMap<>();

    public static Types byName(String name) {
        if (byName.containsKey(name)) {
            throw new IllegalArgumentException(String.format("type %s is unknown/not supported", name));
        }
        return byName.get(name);
    }

    private void registerName(String name) {
        byName.put(name, this);
    }

    Types(String name) {
        this.name = name;
        registerName(name);
    }
}
