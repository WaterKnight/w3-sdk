// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.env.placement.object.doo.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;

public class W3DooPre132 extends KaitaiStruct {
    public static W3DooPre132 fromFile(String fileName) throws IOException {
        return new W3DooPre132(new ByteBufferKaitaiStream(fileName));
    }

    public W3DooPre132(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3DooPre132(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3DooPre132(KaitaiStream _io, KaitaiStruct _parent, W3DooPre132 _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.value = new W3Doo(this._io, 0);
    }
    private W3Doo value;
    private W3DooPre132 _root;
    private KaitaiStruct _parent;
    public W3Doo value() { return value; }
    public W3DooPre132 _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
