// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.script.gui.wct.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class W3Wct extends KaitaiStruct {
    public static W3Wct fromFile(String fileName) throws IOException {
        return new W3Wct(new ByteBufferKaitaiStream(fileName));
    }

    public W3Wct(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Wct(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Wct(KaitaiStream _io, KaitaiStruct _parent, W3Wct _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = new Version(this._io, this, _root);
        if (version().val() == 1) {
            this.headComment = new String(this._io.readBytesTerm((byte) 0, false, true, true), Charset.forName("UTF-8"));
        }
        if (version().val() == 1) {
            this.headTrigger = new Trigger(this._io, this, _root);
        }
        this.numTrigger = this._io.readU4le();
        this.trigger = new ArrayList<Trigger>();
        for (int i = 0; i < numTrigger(); i++) {
            this.trigger.add(new Trigger(this._io, this, _root));
        }
    }
    public static class Version extends KaitaiStruct {
        public static Version fromFile(String fileName) throws IOException {
            return new Version(new ByteBufferKaitaiStream(fileName));
        }

        public Version(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Version(KaitaiStream _io, W3Wct _parent) {
            this(_io, _parent, null);
        }

        public Version(KaitaiStream _io, W3Wct _parent, W3Wct _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.firstVersion = this._io.readU4le();
            if (firstVersion() == 2147483652L) {
                this.secondVersion = this._io.readU4le();
            }
        }
        private Long val;
        public Long val() {
            if (this.val != null)
                return this.val;
            long _tmp = (long) ((firstVersion() == 2147483652L ? secondVersion() : firstVersion()));
            this.val = _tmp;
            return this.val;
        }
        private long firstVersion;
        private Long secondVersion;
        private W3Wct _root;
        private W3Wct _parent;
        public long firstVersion() { return firstVersion; }
        public Long secondVersion() { return secondVersion; }
        public W3Wct _root() { return _root; }
        public W3Wct _parent() { return _parent; }
    }
    public static class Trigger extends KaitaiStruct {
        public static Trigger fromFile(String fileName) throws IOException {
            return new Trigger(new ByteBufferKaitaiStream(fileName));
        }

        public Trigger(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Trigger(KaitaiStream _io, W3Wct _parent) {
            this(_io, _parent, null);
        }

        public Trigger(KaitaiStream _io, W3Wct _parent, W3Wct _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.length = this._io.readU4le();
            this.content = new String(this._io.readBytes(length()), Charset.forName("UTF-8"));
        }
        private long length;
        private String content;
        private W3Wct _root;
        private W3Wct _parent;
        public long length() { return length; }
        public String content() { return content; }
        public W3Wct _root() { return _root; }
        public W3Wct _parent() { return _parent; }
    }
    private Version version;
    private String headComment;
    private Trigger headTrigger;
    private long numTrigger;
    private ArrayList<Trigger> trigger;
    private W3Wct _root;
    private KaitaiStruct _parent;
    public Version version() { return version; }
    public String headComment() { return headComment; }
    public Trigger headTrigger() { return headTrigger; }
    public long numTrigger() { return numTrigger; }
    public ArrayList<Trigger> trigger() { return trigger; }
    public W3Wct _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
