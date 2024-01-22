// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.ai.wai.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3W3a extends KaitaiStruct {
    public static W3W3a fromFile(String fileName) throws IOException {
        return new W3W3a(new ByteBufferKaitaiStream(fileName));
    }

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

    public W3W3a(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3a(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3a(KaitaiStream _io, KaitaiStruct _parent, W3W3a _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.defaultObjectsChunk = new ObjectsChunk(this._io, this, _root);
        this.customObjectsChunk = new ObjectsChunk(this._io, this, _root);
    }
    public static class ObjectsChunk extends KaitaiStruct {
        public static ObjectsChunk fromFile(String fileName) throws IOException {
            return new ObjectsChunk(new ByteBufferKaitaiStream(fileName));
        }

        public ObjectsChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ObjectsChunk(KaitaiStream _io, W3W3a _parent) {
            this(_io, _parent, null);
        }

        public ObjectsChunk(KaitaiStream _io, W3W3a _parent, W3W3a _root) {
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
        private W3W3a _root;
        private W3W3a _parent;
        public long numObject() { return numObject; }
        public ArrayList<Obj> object() { return object; }
        public W3W3a _root() { return _root; }
        public W3W3a _parent() { return _parent; }
    }
    public static class Obj extends KaitaiStruct {
        public static Obj fromFile(String fileName) throws IOException {
            return new Obj(new ByteBufferKaitaiStream(fileName));
        }

        public Obj(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Obj(KaitaiStream _io, W3W3a.ObjectsChunk _parent) {
            this(_io, _parent, null);
        }

        public Obj(KaitaiStream _io, W3W3a.ObjectsChunk _parent, W3W3a _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.baseId = new W3id(this._io);
            this.newId = new W3id(this._io);
            if (_root().version() == 3) {
                this.numUnknown = this._io.readU4le();
            }
            if (_root().version() == 3) {
                this.unknown = new ArrayList<Long>();
                for (int i = 0; i < numUnknown(); i++) {
                    this.unknown.add(this._io.readU4le());
                }
            }
            this.numMod = this._io.readU4le();
            this.mod = new ArrayList<Mod>();
            for (int i = 0; i < numMod(); i++) {
                this.mod.add(new Mod(this._io, this, _root));
            }
        }
        private W3id baseId;
        private W3id newId;
        private Long numUnknown;
        private ArrayList<Long> unknown;
        private long numMod;
        private ArrayList<Mod> mod;
        private W3W3a _root;
        private W3W3a.ObjectsChunk _parent;
        public W3id baseId() { return baseId; }
        public W3id newId() { return newId; }
        public Long numUnknown() { return numUnknown; }
        public ArrayList<Long> unknown() { return unknown; }
        public long numMod() { return numMod; }
        public ArrayList<Mod> mod() { return mod; }
        public W3W3a _root() { return _root; }
        public W3W3a.ObjectsChunk _parent() { return _parent; }
    }
    public static class Mod extends KaitaiStruct {
        public static Mod fromFile(String fileName) throws IOException {
            return new Mod(new ByteBufferKaitaiStream(fileName));
        }

        public Mod(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Mod(KaitaiStream _io, W3W3a.Obj _parent) {
            this(_io, _parent, null);
        }

        public Mod(KaitaiStream _io, W3W3a.Obj _parent, W3W3a _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = new W3id(this._io);
            this.valueType = W3W3a.ValueTypes.byId(this._io.readU4le());
            this.level = this._io.readU4le();
            this.dataPointer = this._io.readU4le();
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
        private long level;
        private long dataPointer;
        private Object value;
        private W3id endToken;
        private W3W3a _root;
        private W3W3a.Obj _parent;
        public W3id id() { return id; }
        public ValueTypes valueType() { return valueType; }
        public long level() { return level; }
        public long dataPointer() { return dataPointer; }
        public Object value() { return value; }
        public W3id endToken() { return endToken; }
        public W3W3a _root() { return _root; }
        public W3W3a.Obj _parent() { return _parent; }
    }
    private long version;
    private ObjectsChunk defaultObjectsChunk;
    private ObjectsChunk customObjectsChunk;
    private W3W3a _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public ObjectsChunk defaultObjectsChunk() { return defaultObjectsChunk; }
    public ObjectsChunk customObjectsChunk() { return customObjectsChunk; }
    public W3W3a _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
