// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.object.collection.mod.w3o.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;

public class W3W3o extends KaitaiStruct {
    public static W3W3o fromFile(String fileName) throws IOException {
        return new W3W3o(new ByteBufferKaitaiStream(fileName));
    }

    public W3W3o(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3o(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3o(KaitaiStream _io, KaitaiStruct _parent, W3W3o _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.useUnit = this._io.readU4le();
        if (useUnit() == 1) {
            this.unit = new W3W3u(this._io);
        }
        this.useItem = this._io.readU4le();
        if (useItem() == 1) {
            this.item = new W3W3t(this._io);
        }
        this.useDestructable = this._io.readU4le();
        if (useDestructable() == 1) {
            this.destructable = new W3W3b(this._io);
        }
        this.useDoodad = this._io.readU4le();
        if (useDoodad() == 1) {
            this.doodad = new W3W3d(this._io);
        }
        this.useAbility = this._io.readU4le();
        if (useAbility() == 1) {
            this.ability = new W3W3a(this._io);
        }
        this.useBuff = this._io.readU4le();
        if (useBuff() == 1) {
            this.buff = new W3W3h(this._io);
        }
        this.useUpgrade = this._io.readU4le();
        if (useUpgrade() == 1) {
            this.upgrade = new W3W3q(this._io);
        }
    }
    private long version;
    private long useUnit;
    private W3W3u unit;
    private long useItem;
    private W3W3t item;
    private long useDestructable;
    private W3W3b destructable;
    private long useDoodad;
    private W3W3d doodad;
    private long useAbility;
    private W3W3a ability;
    private long useBuff;
    private W3W3h buff;
    private long useUpgrade;
    private W3W3q upgrade;
    private W3W3o _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public long useUnit() { return useUnit; }
    public W3W3u unit() { return unit; }
    public long useItem() { return useItem; }
    public W3W3t item() { return item; }
    public long useDestructable() { return useDestructable; }
    public W3W3b destructable() { return destructable; }
    public long useDoodad() { return useDoodad; }
    public W3W3d doodad() { return doodad; }
    public long useAbility() { return useAbility; }
    public W3W3a ability() { return ability; }
    public long useBuff() { return useBuff; }
    public W3W3h buff() { return buff; }
    public long useUpgrade() { return useUpgrade; }
    public W3W3q upgrade() { return upgrade; }
    public W3W3o _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
