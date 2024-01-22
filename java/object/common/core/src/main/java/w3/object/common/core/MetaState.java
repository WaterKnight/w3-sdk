package w3.object.common.core;

import w3.common.core.DataType;
import w3.common.core.DataTypeInfo;
import w3.common.core.MetaFieldId;
import w3.common.core.DoodadModState;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MetaState<T extends DataType> extends DoodadModState<MetaFieldId, T> {
	public MetaState(@Nonnull String idS, @Nonnull DataTypeInfo typeInfo, @Nullable T defVal) {
		super(MetaFieldId.valueOf(idS), typeInfo, defVal);
	}
	
	public MetaState(@Nonnull String idString, @Nonnull DataTypeInfo typeInfo) {
		this(idString, typeInfo, null);
	}
}
