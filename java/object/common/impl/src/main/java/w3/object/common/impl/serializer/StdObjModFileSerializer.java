package w3.object.common.impl.serializer;

import w3.common.core.BinStream;
import w3.common.core.Wc3BinOutputStream;
import w3.object.common.api.serializer.ObjModFileSerializer;
import w3.object.common.api.serializer.ObjModSerializer;
import w3.object.common.core.EncodingFormat;
import w3.object.common.impl.model.W3ObjModFile;

import javax.annotation.Nonnull;

import static w3.object.common.core.EncodingFormat.*;

public class StdObjModFileSerializer<ObjModFileType extends W3ObjModFile<ObjModFileObjType, ObjModFileModType>, ObjModFileObjType extends W3ObjModFile.Obj<ObjModFileModType>, ObjModFileModType extends W3ObjModFile.Mod> implements ObjModFileSerializer<ObjModFileType, ObjModFileObjType, ObjModFileModType> {
    private final EncodingFormat format;
    private final ObjModSerializer<ObjModFileObjType, ObjModFileModType> objModSerializer;
    private final Wc3BinOutputStream stream;
    private final boolean isExtended;

    public StdObjModFileSerializer(@Nonnull Wc3BinOutputStream stream, @Nonnull EncodingFormat format, ObjModSerializer<ObjModFileObjType, ObjModFileModType> objModSerializer, boolean isExtended) {
        this.stream = stream;
        this.format = format;
        this.objModSerializer = objModSerializer;
        this.isExtended = isExtended;
    }

    public StdObjModFileSerializer(@Nonnull Wc3BinOutputStream stream, @Nonnull EncodingFormat format, boolean isExtended) {
        this(stream, format, new StdObjModFileObjSerializer<>(stream, format, isExtended), isExtended);
    }

    @Override
    public void serialize(ObjModFileType file) {
        try {
            write(file);
        } catch (BinStream.StreamException e) {
            throw new RuntimeException(e);
        }
    }

    private void write(ObjModFileType file) throws BinStream.StreamException {
        switch (format.toEnum()) {
            case AS_DEFINED: {
                write_as_defined(file);

                break;
            }
            case AUTO:
            case OBJ_0x3: {
                write_0x3(file);

                break;
            }
            case OBJ_0x2: {
                write_0x2(file);

                break;
            }
            case OBJ_0x1: {
                write_0x1(file);

                break;
            }
        }
    }

    private void write_as_defined(ObjModFileType file) throws BinStream.StreamException {
        switch (EncodingFormat.valueOf((int) file.getVersion()).toEnum()) {
            case OBJ_0x1: {
                write_0x1(file);

                break;
            }
            case OBJ_0x2: {
                write_0x2(file);

                break;
            }
            case OBJ_0x3: {
                write_0x3(file);

                break;
            }
        }
    }

    private void write_0x1(ObjModFileType file) throws BinStream.StreamException {
        stream.writeInt32(OBJ_0x1.getVersion());

        stream.writeInt32(file.getDefaultObjectsChunk().getObject().size());

        for (final ObjModFileObjType obj : file.getDefaultObjectsChunk().getObject()) {
            objModSerializer.serialize(obj);
        }

        stream.writeInt32(file.getCustomObjectsChunk().getObject().size());

        for (final ObjModFileObjType obj : file.getCustomObjectsChunk().getObject()) {
            objModSerializer.serialize(obj);
        }
    }

    private void write_0x2(ObjModFileType objMod) throws BinStream.StreamException {
        stream.writeInt32(OBJ_0x2.getVersion());

        stream.writeInt32(objMod.getDefaultObjectsChunk().getObject().size());

        for (int i = 0; i < objMod.getDefaultObjectsChunk().getObject().size(); i++) {
            final ObjModFileObjType obj = objMod.getDefaultObjectsChunk().getObject().get(i);

            objModSerializer.serialize(obj);
        }

        stream.writeInt32(objMod.getCustomObjectsChunk().getObject().size());

        for (int i = 0; i < objMod.getCustomObjectsChunk().getObject().size(); i++) {
            final ObjModFileObjType obj = objMod.getCustomObjectsChunk().getObject().get(i);

            objModSerializer.serialize(obj);
        }
    }

    private void write_0x3(ObjModFileType objMod) throws BinStream.StreamException {
        stream.writeInt32(OBJ_0x3.getVersion());

        stream.writeInt32(objMod.getDefaultObjectsChunk().getObject().size());

        for (int i = 0; i < objMod.getDefaultObjectsChunk().getObject().size(); i++) {
            final ObjModFileObjType obj = objMod.getDefaultObjectsChunk().getObject().get(i);

            objModSerializer.serialize(obj);
        }

        stream.writeInt32(objMod.getCustomObjectsChunk().getObject().size());

        for (int i = 0; i < objMod.getCustomObjectsChunk().getObject().size(); i++) {
            final ObjModFileObjType obj = objMod.getCustomObjectsChunk().getObject().get(i);

            objModSerializer.serialize(obj);
        }
    }
}
