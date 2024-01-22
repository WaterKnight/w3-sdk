// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.object.collection.mod.w3o.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3ObjModFile extends KaitaiStruct {

    public enum ValueTypes {
        INT(0),
        REAL(1),
        UNREAL(2),
        STRING(3);

        private final long id;
        ValueTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ValueTypes> byId = new HashMap<Long, ValueTypes>(4);
        static {
            for (ValueTypes e : ValueTypes.values())
                byId.put(e.id(), e);
        }
        public static ValueTypes byId(long id) { return byId.get(id); }
    }

    public W3ObjModFile(KaitaiStream _io, int useExtended) {
        this(_io, null, null, useExtended);
    }

    public W3ObjModFile(KaitaiStream _io, KaitaiStruct _parent, int useExtended) {
        this(_io, _parent, null, useExtended);
    }

    public W3ObjModFile(KaitaiStream _io, KaitaiStruct _parent, W3ObjModFile _root, int useExtended) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        this.useExtended = useExtended;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.defaultObjectsChunk = new ObjectsChunk(this._io, this, _root);
        this.customObjectsChunk = new ObjectsChunk(this._io, this, _root);
    }
    public static class Mod extends KaitaiStruct {
        public static Mod fromFile(String fileName) throws IOException {
            return new Mod(new ByteBufferKaitaiStream(fileName));
        }

        public Mod(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Mod(KaitaiStream _io, W3ObjModFile.Set _parent) {
            this(_io, _parent, null);
        }

        public Mod(KaitaiStream _io, W3ObjModFile.Set _parent, W3ObjModFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = new W3id(this._io);
            this.valueType = W3ObjModFile.ValueTypes.byId(this._io.readU4le());
            if (_root().useExtended() != 0) {
                this.levelOrVariation = this._io.readU4le();
            }
            if (_root().useExtended() != 0) {
                this.dataPointer = this._io.readU4le();
            }
            {
                ValueTypes on = valueType();
                if (on != null) {
                    switch (valueType()) {
                    case INT: {
                        this.value = (Object) (this._io.readU4le());
                        break;
                    }
                    case REAL: {
                        this.value = (Object) (this._io.readF4le());
                        break;
                    }
                    case UNREAL: {
                        this.value = (Object) (this._io.readF4le());
                        break;
                    }
                    default: {
                        this.value = new W3str(this._io);
                        break;
                    }
                    }
                } else {
                    this.value = new W3str(this._io);
                }
            }
            this.endToken = new W3id(this._io);
        }
        private W3id id;
        private ValueTypes valueType;
        private Long levelOrVariation;
        private Long dataPointer;
        private Object value;
        private W3id endToken;
        private W3ObjModFile _root;
        private W3ObjModFile.Set _parent;
        public W3id id() { return id; }
        public ValueTypes valueType() { return valueType; }
        public Long levelOrVariation() { return levelOrVariation; }
        public Long dataPointer() { return dataPointer; }
        public Object value() { return value; }
        public W3id endToken() { return endToken; }
        public W3ObjModFile _root() { return _root; }
        public W3ObjModFile.Set _parent() { return _parent; }
    }
    public static class Set extends KaitaiStruct {
        public static Set fromFile(String fileName) throws IOException {
            return new Set(new ByteBufferKaitaiStream(fileName));
        }

        public Set(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Set(KaitaiStream _io, W3ObjModFile.Obj _parent) {
            this(_io, _parent, null);
        }

        public Set(KaitaiStream _io, W3ObjModFile.Obj _parent, W3ObjModFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if (_root().version() >= 3) {
                this.setFlag = this._io.readU4le();
            }
            this.numMod = this._io.readU4le();
            this.mod = new ArrayList<Mod>();
            for (int i = 0; i < numMod(); i++) {
                this.mod.add(new Mod(this._io, this, _root));
            }
        }
        private Long setFlag;
        private long numMod;
        private ArrayList<Mod> mod;
        private W3ObjModFile _root;
        private W3ObjModFile.Obj _parent;
        public Long setFlag() { return setFlag; }
        public long numMod() { return numMod; }
        public ArrayList<Mod> mod() { return mod; }
        public W3ObjModFile _root() { return _root; }
        public W3ObjModFile.Obj _parent() { return _parent; }
    }
    public static class Obj extends KaitaiStruct {
        public static Obj fromFile(String fileName) throws IOException {
            return new Obj(new ByteBufferKaitaiStream(fileName));
        }

        public Obj(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Obj(KaitaiStream _io, W3ObjModFile.ObjectsChunk _parent) {
            this(_io, _parent, null);
        }

        public Obj(KaitaiStream _io, W3ObjModFile.ObjectsChunk _parent, W3ObjModFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.baseId = new W3id(this._io);
            this.newId = new W3id(this._io);
            this.numSet = new NumSet(this._io, this, _root);
            this.set = new ArrayList<Set>();
            for (int i = 0; i < numSet().value(); i++) {
                this.set.add(new Set(this._io, this, _root));
            }
        }
        private W3id baseId;
        private W3id newId;
        private NumSet numSet;
        private ArrayList<Set> set;
        private W3ObjModFile _root;
        private W3ObjModFile.ObjectsChunk _parent;
        public W3id baseId() { return baseId; }
        public W3id newId() { return newId; }
        public NumSet numSet() { return numSet; }
        public ArrayList<Set> set() { return set; }
        public W3ObjModFile _root() { return _root; }
        public W3ObjModFile.ObjectsChunk _parent() { return _parent; }
    }
    public static class NumSet extends KaitaiStruct {
        public static NumSet fromFile(String fileName) throws IOException {
            return new NumSet(new ByteBufferKaitaiStream(fileName));
        }

        public NumSet(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NumSet(KaitaiStream _io, W3ObjModFile.Obj _parent) {
            this(_io, _parent, null);
        }

        public NumSet(KaitaiStream _io, W3ObjModFile.Obj _parent, W3ObjModFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if (_root().version() >= 3) {
                this.numSet = this._io.readU4le();
            }
        }
        private Long value;
        public Long value() {
            if (this.value != null)
                return this.value;
            long _tmp = (long) ((_root().version() >= 3 ? numSet() : 1));
            this.value = _tmp;
            return this.value;
        }
        private Long numSet;
        private W3ObjModFile _root;
        private W3ObjModFile.Obj _parent;
        public Long numSet() { return numSet; }
        public W3ObjModFile _root() { return _root; }
        public W3ObjModFile.Obj _parent() { return _parent; }
    }
    public static class ObjectsChunk extends KaitaiStruct {
        public static ObjectsChunk fromFile(String fileName) throws IOException {
            return new ObjectsChunk(new ByteBufferKaitaiStream(fileName));
        }

        public ObjectsChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ObjectsChunk(KaitaiStream _io, W3ObjModFile _parent) {
            this(_io, _parent, null);
        }

        public ObjectsChunk(KaitaiStream _io, W3ObjModFile _parent, W3ObjModFile _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numObject = this._io.readU4le();
            this.object = new ArrayList<Obj>();
            for (int i = 0; i < numObject(); i++) {
                this.object.add(new Obj(this._io, this, _root));
            }
        }
        private long numObject;
        private ArrayList<Obj> object;
        private W3ObjModFile _root;
        private W3ObjModFile _parent;
        public long numObject() { return numObject; }
        public ArrayList<Obj> object() { return object; }
        public W3ObjModFile _root() { return _root; }
        public W3ObjModFile _parent() { return _parent; }
    }
    private long version;
    private ObjectsChunk defaultObjectsChunk;
    private ObjectsChunk customObjectsChunk;
    private int useExtended;
    private W3ObjModFile _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public ObjectsChunk defaultObjectsChunk() { return defaultObjectsChunk; }
    public ObjectsChunk customObjectsChunk() { return customObjectsChunk; }
    public int useExtended() { return useExtended; }
    public W3ObjModFile _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
