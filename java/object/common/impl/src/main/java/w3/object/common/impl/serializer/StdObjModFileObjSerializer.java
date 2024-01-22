package w3.object.common.impl.serializer;

import w3.common.core.*;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3Real;
import w3.object.common.api.serializer.ObjModSerializer;
import w3.object.common.core.*;
import w3.object.common.impl.model.W3ObjModFile;

import javax.annotation.Nonnull;
import java.util.Optional;

public class StdObjModFileObjSerializer<ObjModFileObjType extends W3ObjModFile.Obj<ObjModFileModType>, ObjModFileModType extends W3ObjModFile.Mod> implements ObjModSerializer<ObjModFileObjType, ObjModFileModType> {
    private final EncodingFormat format;
    private final Wc3BinOutputStream stream;
    private final boolean isExtended;

    public StdObjModFileObjSerializer(@Nonnull Wc3BinOutputStream stream, @Nonnull EncodingFormat format, boolean isExtended) {
        this.stream = stream;
        this.format = format;
        this.isExtended = isExtended;
    }

    @Override
    public void serialize(ObjModFileObjType obj) {
        try {
            write(obj);
        } catch (BinStream.StreamException e) {
            throw new RuntimeException(e);
        }
    }

    private void write(ObjModFileObjType objMod) throws BinStream.StreamException {
        switch (format.toEnum()) {
            case AUTO:
            case OBJ_0x3: {
                write_0x3(objMod);

                break;
            }
            case OBJ_0x2: {
                write_0x2(objMod);

                break;
            }
            case OBJ_0x1: {
                write_0x1(objMod);

                break;
            }
        }
    }

    private void write_0x1(ObjModFileObjType obj) throws BinStream.StreamException {
        final ObjId baseId = ObjId.valueOf(obj.getBaseId().toString());
        final ObjId newId = Optional.ofNullable(obj.getNewId()).map(s -> ObjId.valueOf(s.toString())).orElse(null);

        stream.writeId(baseId);
        stream.writeId((newId == null) ? Id.valueOf("\0\0\0\0") : newId);

        final var mods = obj.getMod();

        int modsAmount = mods.size();

        stream.writeInt32(modsAmount);

        for (final ObjModFileModType mod : mods) {
            final MetaFieldId fieldId = MetaFieldId.valueOf(mod.getId());
            final int dataPt = mod.getDataPointer().intValue();
            final int level = mod.getLevelOrVariation().intValue();

            final W3ObjModFile.ValueTypes valueType = mod.getValueType();
            final Object value = mod.getValue();

            stream.writeId(fieldId);

            stream.writeInt32((int) valueType.id());

            if (isExtended) {
                stream.writeInt32(level);
                stream.writeInt32(dataPt);
            }

            switch (valueType) {
                case INT: {
                    try {
                        stream.writeInt32(War3Int.valueOf(value).toInt());
                    } catch (DataTypeInfo.CastException e) {
                        throw new BinStream.StreamException(stream, "no int: " + value);
                    }

                    break;
                }
                case REAL:
                case UNREAL: {
                    try {
                        stream.writeFloat32(War3Real.valueOf(value).toFloat());
                    } catch (DataTypeInfo.CastException e) {
                        throw new BinStream.StreamException(stream, "no real: " + value);
                    }

                    break;
                }
                case STRING: {
                    String valS = value == null ? "" : value.toString();

                    stream.writeString(valS);

                    break;
                }
                default: {
                    String valS = value == null ? "" : value.toString();

                    stream.writeString(valS);
                }
            }

            stream.writeId(mod.getEndToken());
        }
    }

    private void write_0x2(ObjModFileObjType obj) throws BinStream.StreamException {
        final ObjId baseId = Optional.ofNullable(obj.getBaseId()).map(s -> ObjId.valueOf(s.getValue())).orElse(null);;
        final ObjId newId = Optional.ofNullable(obj.getNewId()).map(s -> ObjId.valueOf(s.getValue())).orElse(null);

        stream.writeId(baseId);
        stream.writeId((newId == null) ? Id.valueOf("\0\0\0\0") : newId);

        final var mods = obj.getMod();

        int modsAmount = mods.size();

        stream.writeInt32(modsAmount);

        for (final ObjModFileModType mod : mods) {
            final MetaFieldId fieldId = MetaFieldId.valueOf(mod.getId());

            final W3ObjModFile.ValueTypes valueType = mod.getValueType();
            final Object value = mod.getValue();

            stream.writeId(fieldId);

            stream.writeInt32((int) valueType.id());

            if (isExtended) {
                final int levelOrVariation = mod.getLevelOrVariation().intValue();
                stream.writeInt32(levelOrVariation);
                final int dataPt = mod.getDataPointer().intValue();
                stream.writeInt32(dataPt);
            }

            switch (valueType) {
                case INT: {
                    try {
                        stream.writeInt32(War3Int.valueOf(value).toInt());
                    } catch (DataTypeInfo.CastException e) {
                        throw new BinStream.StreamException(stream, "no int: " + value);
                    }

                    break;
                }
                case REAL:
                case UNREAL: {
                    try {
                        stream.writeFloat32(War3Real.valueOf(value).toFloat());
                    } catch (DataTypeInfo.CastException e) {
                        throw new BinStream.StreamException(stream, "no real: " + value);
                    }

                    break;
                }
                case STRING: {
                    String valS = value == null ? "" : value.toString();

                    stream.writeString(valS);

                    break;
                }
                default: {
                    String valS = value == null ? "" : value.toString();

                    stream.writeString(valS);
                }
            }

            stream.writeId(mod.getEndToken());
        }
    }

    private void write_0x3(ObjModFileObjType obj) throws BinStream.StreamException {
        final ObjId baseId = ObjId.valueOf(obj.getBaseId().toString());
        final ObjId newId = Optional.ofNullable(obj.getNewId()).map(s -> ObjId.valueOf(s.toString())).orElse(null);

        stream.writeId(baseId);
        stream.writeId((newId == null) ? Id.valueOf("\0\0\0\0") : newId);

        final var unknown = obj.getUnknown();

        if (unknown != null && unknown.size() > 0) {
            stream.writeInt32(unknown.size());

            for (Long val : unknown) {
                stream.writeInt32(val.intValue());
            }
        } else {
            stream.writeInt32(1);
            stream.writeInt32(0);
        }

        final var mods = obj.getMod();

        int modsAmount = mods.size();

        stream.writeInt32(modsAmount);

        for (final ObjModFileModType mod : mods) {
            final MetaFieldId fieldId = MetaFieldId.valueOf(mod.getId());
            final int dataPt = mod.getDataPointer().intValue();
            final int level = mod.getLevelOrVariation().intValue();

            final W3ObjModFile.ValueTypes valueType = mod.getValueType();
            final Object value = mod.getValue();

            stream.writeId(fieldId);

            stream.writeInt32((int) valueType.id());

            if (isExtended) {
                stream.writeInt32(level);
                stream.writeInt32(dataPt);
            }

            switch (valueType) {
                case INT: {
                    try {
                        stream.writeInt32(War3Int.valueOf(value).toInt());
                    } catch (DataTypeInfo.CastException e) {
                        throw new BinStream.StreamException(stream, "no int: " + value);
                    }

                    break;
                }
                case REAL:
                case UNREAL: {
                    try {
                        stream.writeFloat32(War3Real.valueOf(value).toFloat());
                    } catch (DataTypeInfo.CastException e) {
                        throw new BinStream.StreamException(stream, "no real: " + value);
                    }

                    break;
                }
                case STRING: {
                    String valS = value == null ? "" : value.toString();

                    stream.writeString(valS);

                    break;
                }
                default: {
                    String valS = value == null ? "" : value.toString();

                    stream.writeString(valS);
                }
            }

            stream.writeId(mod.getEndToken());
        }
    }
}
