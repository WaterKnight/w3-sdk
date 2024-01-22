package w3.common.core;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class DataType implements Serializable, TypeInfoed {
    public abstract DataType decode(Object val) throws DataTypeInfo.CastException;

    @Nonnull
    @Override
    public DataTypeInfo getTypeInfo() {
        return new DataTypeInfo(getClass());
    }

    private final static Map<String, DataTypeInfo> _typeInfoMap = new LinkedHashMap<>();

    @Nullable
    public static DataTypeInfo getTypeInfoFromName(@Nonnull String name) {
        return _typeInfoMap.get(name);
    }

    public static void regClass(@Nonnull String name, @Nonnull DataTypeInfo typeInfo) {
        _typeInfoMap.put(name, typeInfo);
    }

    public static void regClass(@Nonnull String name, @Nonnull Class<? extends DataType> type) {
        regClass(name, new DataTypeInfo(type));
    }

    protected DataType() {
    }
}
