// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.object.collection.mod.w3o.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;

public class W3W3d extends KaitaiStruct {
    public static W3W3d fromFile(String fileName) throws IOException {
        return new W3W3d(new ByteBufferKaitaiStream(fileName));
    }

    public W3W3d(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3d(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3d(KaitaiStream _io, KaitaiStruct _parent, W3W3d _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.objModFile = new W3ObjModFile(this._io, 1);
    }
    private W3ObjModFile objModFile;
    private W3W3d _root;
    private KaitaiStruct _parent;
    public W3ObjModFile objModFile() { return objModFile; }
    public W3W3d _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
