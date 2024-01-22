package w3.object.ability.mod.w3a.impl.cli;

import java.util.HashMap;
import java.util.Map;

public enum Types {
    JSON("json"),
    W3A("w3a");

    private final String name;

    public String getName() {
        return name;
    }

    private static Map<String, Types> byNameMap;

    public static Types byName(String name) {
        if (byNameMap.containsKey(name)) {
            throw new IllegalArgumentException(String.format("type %s is unknown/not supported", name));
        }
        return byNameMap.get(name);
    }

    private void registerName(String name) {
        if (byNameMap == null) {
            byNameMap = new HashMap<>();
        }
        byNameMap.put(name, this);
    }

    Types(String name) {
        this.name = name;
        registerName(name);
    }
}
