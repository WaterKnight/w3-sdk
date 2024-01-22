// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.info.w3f.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3W3f extends KaitaiStruct {
    public static W3W3f fromFile(String fileName) throws IOException {
        return new W3W3f(new ByteBufferKaitaiStream(fileName));
    }

    public enum VariableDifficultyLevelsFlagAndExpansionFlag {
        FIXED(0),
        VARIABLE(1),
        FIXED_W3X(2),
        VARIABLE_W3X(3);

        private final long id;
        VariableDifficultyLevelsFlagAndExpansionFlag(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, VariableDifficultyLevelsFlagAndExpansionFlag> byId = new HashMap<Long, VariableDifficultyLevelsFlagAndExpansionFlag>(4);
        static {
            for (VariableDifficultyLevelsFlagAndExpansionFlag e : VariableDifficultyLevelsFlagAndExpansionFlag.values())
                byId.put(e.id(), e);
        }
        public static VariableDifficultyLevelsFlagAndExpansionFlag byId(long id) { return byId.get(id); }
    }

    public enum MapVisibility {
        INVISIBLE(0),
        VISIBLE(1);

        private final long id;
        MapVisibility(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, MapVisibility> byId = new HashMap<Long, MapVisibility>(2);
        static {
            for (MapVisibility e : MapVisibility.values())
                byId.put(e.id(), e);
        }
        public static MapVisibility byId(long id) { return byId.get(id); }
    }

    public W3W3f(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3f(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3f(KaitaiStream _io, KaitaiStruct _parent, W3W3f _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.saves = this._io.readU4le();
        this.editorVersion = this._io.readU4le();
        this.name = new W3str(this._io);
        this.difficulty = new W3str(this._io);
        this.author = new W3str(this._io);
        this.description = new W3str(this._io);
        this.variableDifficultyLevelsFlagAndExpansionFlag = VariableDifficultyLevelsFlagAndExpansionFlag.byId(this._io.readU4le());
        this.backgroundScreenIndex = this._io.readU4le();
        this.backgroundScreenPath = new W3str(this._io);
        this.minimapPicturePath = new W3str(this._io);
        this.ambientSoundIndex = this._io.readU4le();
        this.customAmbientSoundPath = new W3str(this._io);
        this.useTerrainFog = this._io.readU4le();
        this.fogZHeight = this._io.readF4le();
        this.fogZEnd = this._io.readF4le();
        this.fogDensity = this._io.readF4le();
        this.fogRed = this._io.readU1();
        this.fogGreen = this._io.readU1();
        this.fogBlue = this._io.readU1();
        this.fogAlpha = this._io.readU1();
        this.cursorRaceIndex = this._io.readU4le();
        this.numMap = this._io.readU4le();
        this.map = new ArrayList<W3Map>();
        for (int i = 0; i < numMap(); i++) {
            this.map.add(new W3Map(this._io, this, _root));
        }
        this.numMapOrder = this._io.readU4le();
        this.mapOrder = new ArrayList<W3MapOrder>();
        for (int i = 0; i < numMapOrder(); i++) {
            this.mapOrder.add(new W3MapOrder(this._io, this, _root));
        }
    }
    public static class W3Map extends KaitaiStruct {
        public static W3Map fromFile(String fileName) throws IOException {
            return new W3Map(new ByteBufferKaitaiStream(fileName));
        }

        public W3Map(KaitaiStream _io) {
            this(_io, null, null);
        }

        public W3Map(KaitaiStream _io, W3W3f _parent) {
            this(_io, _parent, null);
        }

        public W3Map(KaitaiStream _io, W3W3f _parent, W3W3f _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.visibility = W3W3f.MapVisibility.byId(this._io.readU4le());
            this.chapterTitle = new W3str(this._io);
            this.mapTitle = new W3str(this._io);
            this.path = new W3str(this._io);
        }
        private MapVisibility visibility;
        private W3str chapterTitle;
        private W3str mapTitle;
        private W3str path;
        private W3W3f _root;
        private W3W3f _parent;
        public MapVisibility visibility() { return visibility; }
        public W3str chapterTitle() { return chapterTitle; }
        public W3str mapTitle() { return mapTitle; }
        public W3str path() { return path; }
        public W3W3f _root() { return _root; }
        public W3W3f _parent() { return _parent; }
    }
    public static class W3MapOrder extends KaitaiStruct {
        public static W3MapOrder fromFile(String fileName) throws IOException {
            return new W3MapOrder(new ByteBufferKaitaiStream(fileName));
        }

        public W3MapOrder(KaitaiStream _io) {
            this(_io, null, null);
        }

        public W3MapOrder(KaitaiStream _io, W3W3f _parent) {
            this(_io, _parent, null);
        }

        public W3MapOrder(KaitaiStream _io, W3W3f _parent, W3W3f _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknown = new W3str(this._io);
            this.path = new W3str(this._io);
        }
        private W3str unknown;
        private W3str path;
        private W3W3f _root;
        private W3W3f _parent;
        public W3str unknown() { return unknown; }
        public W3str path() { return path; }
        public W3W3f _root() { return _root; }
        public W3W3f _parent() { return _parent; }
    }
    private long version;
    private long saves;
    private long editorVersion;
    private W3str name;
    private W3str difficulty;
    private W3str author;
    private W3str description;
    private VariableDifficultyLevelsFlagAndExpansionFlag variableDifficultyLevelsFlagAndExpansionFlag;
    private long backgroundScreenIndex;
    private W3str backgroundScreenPath;
    private W3str minimapPicturePath;
    private long ambientSoundIndex;
    private W3str customAmbientSoundPath;
    private long useTerrainFog;
    private float fogZHeight;
    private float fogZEnd;
    private float fogDensity;
    private int fogRed;
    private int fogGreen;
    private int fogBlue;
    private int fogAlpha;
    private long cursorRaceIndex;
    private long numMap;
    private ArrayList<W3Map> map;
    private long numMapOrder;
    private ArrayList<W3MapOrder> mapOrder;
    private W3W3f _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public long saves() { return saves; }
    public long editorVersion() { return editorVersion; }
    public W3str name() { return name; }
    public W3str difficulty() { return difficulty; }
    public W3str author() { return author; }
    public W3str description() { return description; }
    public VariableDifficultyLevelsFlagAndExpansionFlag variableDifficultyLevelsFlagAndExpansionFlag() { return variableDifficultyLevelsFlagAndExpansionFlag; }
    public long backgroundScreenIndex() { return backgroundScreenIndex; }
    public W3str backgroundScreenPath() { return backgroundScreenPath; }
    public W3str minimapPicturePath() { return minimapPicturePath; }
    public long ambientSoundIndex() { return ambientSoundIndex; }
    public W3str customAmbientSoundPath() { return customAmbientSoundPath; }
    public long useTerrainFog() { return useTerrainFog; }
    public float fogZHeight() { return fogZHeight; }
    public float fogZEnd() { return fogZEnd; }
    public float fogDensity() { return fogDensity; }
    public int fogRed() { return fogRed; }
    public int fogGreen() { return fogGreen; }
    public int fogBlue() { return fogBlue; }
    public int fogAlpha() { return fogAlpha; }
    public long cursorRaceIndex() { return cursorRaceIndex; }
    public long numMap() { return numMap; }
    public ArrayList<W3Map> map() { return map; }
    public long numMapOrder() { return numMapOrder; }
    public ArrayList<W3MapOrder> mapOrder() { return mapOrder; }
    public W3W3f _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
