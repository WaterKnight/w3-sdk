// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.asset.imports.imp.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class W3Imp extends KaitaiStruct {
    public static W3Imp fromFile(String fileName) throws IOException {
        return new W3Imp(new ByteBufferKaitaiStream(fileName));
    }

    public W3Imp(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Imp(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Imp(KaitaiStream _io, KaitaiStruct _parent, W3Imp _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.numImportObj = this._io.readU4le();
        this.importObj = new ArrayList<ImportObj>();
        for (int i = 0; i < numImportObj(); i++) {
            this.importObj.add(new ImportObj(this._io, this, _root));
        }
    }
    public static class ImportObj extends KaitaiStruct {
        public static ImportObj fromFile(String fileName) throws IOException {
            return new ImportObj(new ByteBufferKaitaiStream(fileName));
        }

        public ImportObj(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ImportObj(KaitaiStream _io, W3Imp _parent) {
            this(_io, _parent, null);
        }

        public ImportObj(KaitaiStream _io, W3Imp _parent, W3Imp _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.flags = this._io.readU1();
            this.path = new W3str(this._io);
        }
        private int flags;
        private W3str path;
        private W3Imp _root;
        private W3Imp _parent;
        public int flags() { return flags; }
        public W3str path() { return path; }
        public W3Imp _root() { return _root; }
        public W3Imp _parent() { return _parent; }
    }
    private long version;
    private long numImportObj;
    private ArrayList<ImportObj> importObj;
    private W3Imp _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public long numImportObj() { return numImportObj; }
    public ArrayList<ImportObj> importObj() { return importObj; }
    public W3Imp _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
