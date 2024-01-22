// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.env.placement.sound.w3s.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3W3s extends KaitaiStruct {
    public static W3W3s fromFile(String fileName) throws IOException {
        return new W3W3s(new ByteBufferKaitaiStream(fileName));
    }

    public enum Channel {
        DEFAULT(-1),
        GENERAL(0),
        UNIT_SELECTION(1),
        UNIT_ACKNOWLEDGEMENT(2),
        UNIT_MOVEMENT(3),
        UNIT_READY(4),
        COMBAT(5),
        ERROR(6),
        MUSIC(7),
        USER_INTERFACE(8),
        MOVEMENT_LOOPING(9),
        AMBIENT(10),
        ANIMATION(11),
        BUILDING(12),
        BIRTH(13),
        FIRE(14);

        private final long id;
        Channel(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Channel> byId = new HashMap<Long, Channel>(16);
        static {
            for (Channel e : Channel.values())
                byId.put(e.id(), e);
        }
        public static Channel byId(long id) { return byId.get(id); }
    }

    public W3W3s(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3s(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3s(KaitaiStream _io, KaitaiStruct _parent, W3W3s _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.numSound = this._io.readU4le();
        this.sound = new ArrayList<Sound>();
        for (int i = 0; i < numSound(); i++) {
            this.sound.add(new Sound(this._io, this, _root));
        }
    }
    public static class Sound extends KaitaiStruct {
        public static Sound fromFile(String fileName) throws IOException {
            return new Sound(new ByteBufferKaitaiStream(fileName));
        }

        public Sound(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sound(KaitaiStream _io, W3W3s _parent) {
            this(_io, _parent, null);
        }

        public Sound(KaitaiStream _io, W3W3s _parent, W3W3s _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.path = new W3str(this._io);
            this.eax = new W3str(this._io);
            this._raw_flags = this._io.readBytes(4);
            KaitaiStream _io__raw_flags = new ByteBufferKaitaiStream(_raw_flags);
            this.flags = new Flags(_io__raw_flags, this, _root);
            this.fadeInRate = this._io.readU4le();
            this.fadeOutRate = this._io.readU4le();
            this.volume = this._io.readS4le();
            this.pitch = this._io.readF4le();
            this.pitchVariance = this._io.readF4le();
            this.priority = this._io.readS4le();
            this.channel = W3W3s.Channel.byId(this._io.readS4le());
            this.minDistance = this._io.readF4le();
            this.maxDistance = this._io.readF4le();
            this.cutoffDistance = this._io.readF4le();
            this.coneInside = this._io.readF4le();
            this.coneOutside = this._io.readF4le();
            this.coneOutsideVolume = this._io.readS4le();
            this.coneOrientationX = this._io.readF4le();
            this.coneOrientationY = this._io.readF4le();
            this.coneOrientationZ = this._io.readF4le();
            if (_root().version() >= 2) {
                this.varName = new W3str(this._io);
            }
            if (_root().version() >= 2) {
                this.internalSoundName = new W3str(this._io);
            }
            if (_root().version() >= 2) {
                this.soundPath = new W3str(this._io);
            }
            if (_root().version() >= 2) {
                this.unknown9 = this._io.readS4le();
            }
            if (_root().version() >= 2) {
                this.unknown10 = new W3str(this._io);
            }
            if (_root().version() >= 2) {
                this.unknown11 = this._io.readS4le();
            }
            if (_root().version() >= 2) {
                this.unknown12 = new W3str(this._io);
            }
            if (_root().version() >= 2) {
                this.unknown13 = this._io.readS4le();
            }
            if (_root().version() >= 2) {
                this.unknown14 = new W3str(this._io);
            }
            if (_root().version() >= 2) {
                this.unknown15 = new W3str(this._io);
            }
            if (_root().version() >= 2) {
                this.unknown16 = new W3str(this._io);
            }
            if (_root().version() >= 2) {
                this.unknown17 = new W3str(this._io);
            }
            if (_root().version() >= 3) {
                this.unknown18 = this._io.readS4le();
            }
        }
        private W3str name;
        private W3str path;
        private W3str eax;
        private Flags flags;
        private long fadeInRate;
        private long fadeOutRate;
        private int volume;
        private float pitch;
        private float pitchVariance;
        private int priority;
        private Channel channel;
        private float minDistance;
        private float maxDistance;
        private float cutoffDistance;
        private float coneInside;
        private float coneOutside;
        private int coneOutsideVolume;
        private float coneOrientationX;
        private float coneOrientationY;
        private float coneOrientationZ;
        private W3str varName;
        private W3str internalSoundName;
        private W3str soundPath;
        private Integer unknown9;
        private W3str unknown10;
        private Integer unknown11;
        private W3str unknown12;
        private Integer unknown13;
        private W3str unknown14;
        private W3str unknown15;
        private W3str unknown16;
        private W3str unknown17;
        private Integer unknown18;
        private W3W3s _root;
        private W3W3s _parent;
        private byte[] _raw_flags;
        public W3str name() { return name; }
        public W3str path() { return path; }
        public W3str eax() { return eax; }
        public Flags flags() { return flags; }
        public long fadeInRate() { return fadeInRate; }
        public long fadeOutRate() { return fadeOutRate; }
        public int volume() { return volume; }
        public float pitch() { return pitch; }
        public float pitchVariance() { return pitchVariance; }
        public int priority() { return priority; }
        public Channel channel() { return channel; }
        public float minDistance() { return minDistance; }
        public float maxDistance() { return maxDistance; }
        public float cutoffDistance() { return cutoffDistance; }
        public float coneInside() { return coneInside; }
        public float coneOutside() { return coneOutside; }
        public int coneOutsideVolume() { return coneOutsideVolume; }
        public float coneOrientationX() { return coneOrientationX; }
        public float coneOrientationY() { return coneOrientationY; }
        public float coneOrientationZ() { return coneOrientationZ; }
        public W3str varName() { return varName; }
        public W3str internalSoundName() { return internalSoundName; }
        public W3str soundPath() { return soundPath; }
        public Integer unknown9() { return unknown9; }
        public W3str unknown10() { return unknown10; }
        public Integer unknown11() { return unknown11; }
        public W3str unknown12() { return unknown12; }
        public Integer unknown13() { return unknown13; }
        public W3str unknown14() { return unknown14; }
        public W3str unknown15() { return unknown15; }
        public W3str unknown16() { return unknown16; }
        public W3str unknown17() { return unknown17; }
        public Integer unknown18() { return unknown18; }
        public W3W3s _root() { return _root; }
        public W3W3s _parent() { return _parent; }
        public byte[] _raw_flags() { return _raw_flags; }
    }
    public static class Flags extends KaitaiStruct {
        public static Flags fromFile(String fileName) throws IOException {
            return new Flags(new ByteBufferKaitaiStream(fileName));
        }

        public Flags(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Flags(KaitaiStream _io, W3W3s.Sound _parent) {
            this(_io, _parent, null);
        }

        public Flags(KaitaiStream _io, W3W3s.Sound _parent, W3W3s _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.rest = new ArrayList<Boolean>();
            for (int i = 0; i < 3; i++) {
                this.rest.add(this._io.readBitsIntBe(1) != 0);
            }
            this.isImported = this._io.readBitsIntBe(1) != 0;
            this.isMusic = this._io.readBitsIntBe(1) != 0;
            this.stopWhenOutOfRange = this._io.readBitsIntBe(1) != 0;
            this.is3d = this._io.readBitsIntBe(1) != 0;
            this.isLooping = this._io.readBitsIntBe(1) != 0;
        }
        private ArrayList<Boolean> rest;
        private boolean isImported;
        private boolean isMusic;
        private boolean stopWhenOutOfRange;
        private boolean is3d;
        private boolean isLooping;
        private W3W3s _root;
        private W3W3s.Sound _parent;
        public ArrayList<Boolean> rest() { return rest; }
        public boolean isImported() { return isImported; }
        public boolean isMusic() { return isMusic; }
        public boolean stopWhenOutOfRange() { return stopWhenOutOfRange; }
        public boolean is3d() { return is3d; }
        public boolean isLooping() { return isLooping; }
        public W3W3s _root() { return _root; }
        public W3W3s.Sound _parent() { return _parent; }
    }
    private long version;
    private long numSound;
    private ArrayList<Sound> sound;
    private W3W3s _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public long numSound() { return numSound; }
    public ArrayList<Sound> sound() { return sound; }
    public W3W3s _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
