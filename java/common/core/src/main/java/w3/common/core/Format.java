package w3.common.core;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;

public abstract class Format<T> {
    public static class InvalidFormatException extends RuntimeException {
        private final Integer version;
        private final Format format;

        @Override
        @Nonnull
        public String toString() {
            if (format != null) return format.toString();

            if (version != null) return version.toString();

            return super.toString();
        }

        public InvalidFormatException(int version) {
            this.version = version;
            this.format = null;
        }

        public InvalidFormatException(@Nonnull Format format) {
            this.version = null;
            this.format = format;
        }
    }

    private final static Map<Class<? extends Format>, Map<Integer, Format>> _instanceMap = new LinkedHashMap<>();

    @Nonnull
    public static <FormatType extends Format> Map<Integer, Format> getAll(@Nonnull Class<FormatType> formatClass) {
        return _instanceMap.get(formatClass);
    }

    @Nullable
    public static <FormatType extends Format> FormatType get(@Nonnull Class<FormatType> formatClass, int version) {
        //noinspection unchecked
        return (FormatType) _instanceMap.get(formatClass).get(version);
    }

    @Nullable
    public static Format valueOf(@Nonnull Integer version) {
        return null;
    }

    private final T enumVal;

    @Nonnull
    public T toEnum() {
        return enumVal;
    }

    private final Integer version;

    @Nonnull
    public Integer getVersion() {
        return version;
    }

    public Format(@Nonnull T enumVal, @Nullable Integer val) {
        this.enumVal = enumVal;
        this.version = val;

        if (version != null) {
            if (!_instanceMap.containsKey(getClass())) _instanceMap.put(getClass(), new LinkedHashMap<>());

            if (_instanceMap.get(getClass()).containsKey(version)) throw new RuntimeException(version + " already used");

            _instanceMap.get(getClass()).put(version, this);
        }
    }
}
