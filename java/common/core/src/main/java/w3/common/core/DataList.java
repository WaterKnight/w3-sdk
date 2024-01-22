package w3.common.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import w3.common.core.app.FlagsInt;
import w3.common.core.app.War3String;

import javax.annotation.Nonnull;
import java.util.*;

public class DataList<T extends DataType> extends DataType implements List<T> {
	private static final Logger log = LoggerFactory.getLogger(FlagsInt.class.getName());

	@Nonnull
	public static DataTypeInfo getTypeDescriptor() {
		return new DataTypeInfo(DataList.class);
	}
	
	private final List<T> list = new ArrayList<>();

	@Nonnull
	public List<T> getValue() {
		return list;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) {
				s.append(",");
			}
			
			s.append(list.get(i));
		}
		
		return s.toString();
	}
	
	public List<T> asList() {
		return list;
	}
	
	private DataTypeInfo _elementsTypeInfo;
	
	public DataTypeInfo getElementsTypeInfo() {
		return _elementsTypeInfo;
	}
	
	public String name() {
		return "abc";
		//return String.format("dataList<%s>", getElementsTypeInfo().getTypeName());
	}
	
	@Nonnull
    @Override
	public DataTypeInfo getTypeInfo() {
		return new DataTypeInfo(getClass(), getElementsTypeInfo());
	}

	public DataList(@Nonnull DataTypeInfo elementsTypeInfo) {
		_elementsTypeInfo = elementsTypeInfo;
	}
	
	public DataList(@Nonnull Class<? extends DataType> elementsType) {
		this(new DataTypeInfo(elementsType));
	}

	@Override
	public boolean add(T e) {
		return list.add(e);
	}

	@Override
	public void add(int index, T element) {
		list.add(index, element);
	}

	@Override
	public boolean addAll(@Nonnull Collection c) {
		return list.addAll(c);
	}

	@Override
	public boolean addAll(int index, @Nonnull Collection c) {
		return list.addAll(index, c);
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public boolean contains(@Nonnull Object o) {
		return list.contains(o);
	}

	@Override
	public boolean containsAll(@Nonnull Collection c) {
		return list.containsAll(c);
	}

	@Override
	public T get(int index) {
		return list.get(index);
	}

	@Override
	public int indexOf(@Nonnull Object o) {
		return list.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Nonnull
	@Override
	public Iterator iterator() {
		return list.iterator();
	}

	@Override
	public int lastIndexOf(@Nonnull Object o) {
		return list.lastIndexOf(o);
	}

	@Nonnull
	@Override
	public ListIterator listIterator() {
		return list.listIterator();
	}

	@Nonnull
	@Override
	public ListIterator listIterator(int index) {
		return list.listIterator(index);
	}

	@Override
	public boolean remove(@Nonnull Object o) {
		return list.remove(o);
	}

	@Override
	public T remove(int index) {
		return list.remove(index);
	}

	@Override
	public boolean removeAll(@Nonnull Collection c) {
		return list.removeAll(c);
	}

	@Override
	public boolean retainAll(@Nonnull Collection c) {
		return list.retainAll(c);
	}

	@Override
	public T set(int index, T element) {
		return list.set(index, element);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Nonnull
	@Override
	public List subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}

	@Nonnull
	@Override
	public Object[] toArray() {
		return list.toArray();
	}

	@Nonnull
	@Override
	public Object[] toArray(Object[] a) {
		return list.toArray(a);
	}

	public DataList<T> decode(Object val, Class<? extends DataType> elementsType) throws DataTypeInfo.CastException {
		DataList<T> ret = new DataList<>(elementsType);
		
		for (String s : val.toString().split(",")) {
			try {
				ret.add((T) elementsType.newInstance().decode(val));
			} catch (InstantiationException | IllegalAccessException e) {
				log.error(e.getMessage(), e);
			}
		}
		
		return ret;
	}

	@Override
	public DataList<T> decode(Object val) throws DataTypeInfo.CastException {
		return decode(val, War3String.class);
	}
	
	@Override
	public DataList<T> clone() throws CloneNotSupportedException {
		DataList<T> ts = (DataList<T>) super.clone();
		DataList<T> other = new DataList<>(getElementsTypeInfo());
		
		for (T val : this) {
			if (val instanceof DataList) {
				val = (T) ((DataList) val).clone();
			}
			
			other.add(val);
		}
		
		return other;
	}
}
