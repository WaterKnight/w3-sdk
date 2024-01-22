package w3.common.core;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;

abstract public class DoodadModState<FieldIdType extends FieldId, T extends DataType> {
	private final T _defVal;

	@Nullable
	public T getDefVal() {
		return _defVal;
	}

	private final FieldIdType _field;

	@Nonnull
	public FieldIdType getFieldId() {
		return _field;
	}

	@Override
	public String toString() {
		return _field.toString();
	}

	private DataTypeInfo _info;

	@Nonnull
	public DataTypeInfo getInfo() {
		return _info;
	}

	public T getValue(@Nullable DataType val) {
		if (getInfo().getType().isInstance(val)) {
			return (T) getInfo().getType().cast(val);
		}

		return null;
	}

	public T tryCastVal(DataType val) throws DataTypeInfo.CastException {
		return (T) getInfo().tryCastVal(val);
	}

	public T tryCastVal(DataType val, @Nullable T defVal) {
		try {
			return (T) getInfo().tryCastVal(val);
		} catch (DataTypeInfo.CastException e) {
			return defVal;
		}
	}

	private static class ClassAssignment {
		private final Map<FieldId, DoodadModState> _states = new LinkedHashMap<>();

		private void addState(@Nonnull FieldId fieldId, @Nonnull DoodadModState state) {
			_states.put(fieldId, state);
		}

		private ClassAssignment() {

		}
	}

	private final static Map<Class<? extends DoodadModState>, ClassAssignment> _typeValues = new LinkedHashMap<>();

	private final static Set<Class> _loadedClasses = new LinkedHashSet<>();

	private static void initializeClass(Class c) {
		if (_loadedClasses.contains(c)) return;

		_loadedClasses.add(c);

		try {
			Class.forName(c.getName(), true, c.getClassLoader());

			Class enclosingClass = c.getEnclosingClass();

			if (enclosingClass != null) initializeClass(enclosingClass);

			Class superClass = c.getSuperclass();

			if (superClass != null) initializeClass(superClass);
		} catch (ClassNotFoundException e) {
			throw new AssertionError(e);
		}
	}

	@Nonnull
	public static <T extends DoodadModState> Collection<DoodadModState> allValues(@Nonnull Class<T> specificClass) {
		initializeClass(specificClass);

		Collection<DoodadModState> ret = new LinkedHashSet<>();

		for (Map.Entry<Class<? extends DoodadModState>, ClassAssignment> entry : _typeValues.entrySet()) {
			Class<? extends DoodadModState> otherClass = entry.getKey();

			if (otherClass.isAssignableFrom(specificClass)) {
				Collection<DoodadModState> states = entry.getValue()._states.values();

				for (DoodadModState state : states) {
					ret.add(state);
				}
			}
		}

		//if (!_typeValues.containsKey(specificClass)) return null;

		//return new LinkedHashSet<>(_typeValues.get(specificClass)._states.values());

		return ret;
	}

	private static Map<Class<? extends DoodadModState>, Collection<? extends DoodadModState>> _values = new LinkedHashMap<>();

	@Nonnull
	public static <T extends DoodadModState> Collection<T> values(@Nonnull Class<T> specificClass) {
		initializeClass(specificClass);

		Collection<T> ret = new LinkedHashSet<>();

		for (Map.Entry<Class<? extends DoodadModState>, ClassAssignment> entry : _typeValues.entrySet()) {
			Class<? extends DoodadModState> otherClass = entry.getKey();

			if (otherClass.isAssignableFrom(specificClass)) {
				Collection<DoodadModState> states = entry.getValue()._states.values();

				for (DoodadModState state : states) {
					if (specificClass.isInstance(state)) {
						ret.add(specificClass.cast(state));
					}
				}
			}
		}

		if (!_values.containsKey(specificClass)) _values.put(specificClass, ret);

		return (Collection<T>) _values.get(specificClass);
	}

	@Nullable
	public static DoodadModState valueByField(@Nonnull Class<? extends DoodadModState> specificClass, @Nonnull FieldId fieldId) {
		for (DoodadModState state : values(specificClass)) {
			if (state.getFieldId().equals(fieldId)) return state;
		}

		//return _typeValues.get(specificClass)._states.get(fieldId);
		return null;
	}

	public DoodadModState(@Nonnull FieldIdType fieldId, @Nonnull DataTypeInfo info, @Nullable T defVal) {
		_field = fieldId;
		_info = info;
		_defVal = defVal;

		Class<? extends DoodadModState> specificClass = getClass();

		if (!_typeValues.containsKey(specificClass)) _typeValues.put(specificClass, new ClassAssignment());

		_typeValues.get(specificClass).addState(getFieldId(), this);
	}
}
