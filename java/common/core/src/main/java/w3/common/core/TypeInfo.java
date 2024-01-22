package w3.common.core;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TypeInfo<boundType> {
	private Class<? extends boundType> _type;

	@Nonnull
	public Class<? extends boundType> getType() {
		return _type;
	}
	
	private TypeInfo<? extends boundType>[] _generics;

	@Nullable
	public TypeInfo<? extends boundType>[] getGenerics() {
		return _generics;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(getClass().getSimpleName()).append(" -> ");
		
		sb.append(getType().getSimpleName());
		
		TypeInfo<? extends boundType>[] generics = getGenerics();
		
		if (generics != null) {
			sb.append("[");
			
			for (int i = 0; i < generics.length; i++) {
				sb.append(generics[i]);
				
				if (i > 0) {
					sb.append(";");
				}
			}
			
			sb.append("]");
		}
		
		return sb.toString();
	}

	@Nonnull
	public String getTypeName() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(getType().getSimpleName());
		
		TypeInfo<? extends boundType>[] generics = getGenerics();
		
		if (generics != null) {
			sb.append("<");
			
			for (int i = 0; i < generics.length; i++) {
				sb.append(generics[i].getTypeName());
				
				if (i > 0) {
					sb.append(";");
				}
			}
			
			sb.append(">");
		}
		
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) return true;

		return other instanceof TypeInfo && (hashCode() == other.hashCode());

	}
	
	public TypeInfo(@Nonnull Class<? extends boundType> type, @Nonnull Class<? extends boundType>[] generics) {
		_type = type;
		
		TypeInfo[] genericsInfo = new TypeInfo[generics.length];
		int c = 0;
		
		for (Class<? extends boundType> generic : generics) {
			genericsInfo[c] = new TypeInfo<boundType>(generic);
			
			c++;
		}
		
		_generics = genericsInfo;
	}

	public TypeInfo(@Nonnull Class<? extends boundType> type, @Nullable TypeInfo<? extends boundType>[] generics) {
		_type = type;
		_generics = generics;
	}
	
	public TypeInfo(@Nonnull Class<? extends boundType> type, @Nullable TypeInfo<? extends boundType> generics) {
		this(type, new TypeInfo[]{generics});
	}
	
	public TypeInfo(@Nonnull Class<? extends boundType> type, @Nullable Class<? extends boundType> generics) {
		this(type, new Class[]{generics});
	}
	
	public TypeInfo(@Nonnull Class<? extends boundType> type) {
		_type = type;
		_generics = null;
	}
}
