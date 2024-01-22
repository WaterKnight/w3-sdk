// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.asset.model.mdx.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class W3Mdx extends KaitaiStruct {
    public static W3Mdx fromFile(String fileName) throws IOException {
        return new W3Mdx(new ByteBufferKaitaiStream(fileName));
    }

    public W3Mdx(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Mdx(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Mdx(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.magic = new W3id(this._io);
        this.chunk = new ArrayList<ChunkRouter>();
        for (int i = 0; i < 6; i++) {
            this.chunk.add(new ChunkRouter(this._io, this, _root));
        }
    }
    public static class TangentChunk extends KaitaiStruct {
        public static TangentChunk fromFile(String fileName) throws IOException {
            return new TangentChunk(new ByteBufferKaitaiStream(fileName));
        }

        public TangentChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TangentChunk(KaitaiStream _io, W3Mdx.GeosetPayload _parent) {
            this(_io, _parent, null);
        }

        public TangentChunk(KaitaiStream _io, W3Mdx.GeosetPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            this.numTangent = this._io.readU4le();
            this.tangent = new ArrayList<Tangent>();
            for (int i = 0; i < numTangent(); i++) {
                this.tangent.add(new Tangent(this._io, this, _root));
            }
        }
        private W3id magic;
        private long numTangent;
        private ArrayList<Tangent> tangent;
        private W3Mdx _root;
        private W3Mdx.GeosetPayload _parent;
        public W3id magic() { return magic; }
        public long numTangent() { return numTangent; }
        public ArrayList<Tangent> tangent() { return tangent; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.GeosetPayload _parent() { return _parent; }
    }
    public static class Kp2gChunk extends KaitaiStruct {
        public static Kp2gChunk fromFile(String fileName) throws IOException {
            return new Kp2gChunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kp2gChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kp2gChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Kp2gChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.gravity = this._io.readF4le();
        }
        private float gravity;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2TrackChunkRouter _parent;
        public float gravity() { return gravity; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2TrackChunkRouter _parent() { return _parent; }
    }
    public static class ChunkBone extends KaitaiStruct {
        public static ChunkBone fromFile(String fileName) throws IOException {
            return new ChunkBone(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkBone(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkBone(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkBone(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.bone = new ArrayList<Bone>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.bone.add(new Bone(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<Bone> bone;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Bone> bone() { return bone; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class CameraPayload extends KaitaiStruct {
        public static CameraPayload fromFile(String fileName) throws IOException {
            return new CameraPayload(new ByteBufferKaitaiStream(fileName));
        }

        public CameraPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CameraPayload(KaitaiStream _io, W3Mdx.Camera _parent) {
            this(_io, _parent, null);
        }

        public CameraPayload(KaitaiStream _io, W3Mdx.Camera _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new String(this._io.readBytes(80), Charset.forName("UTF-8"));
            this.position1 = this._io.readF4le();
            this.position2 = this._io.readF4le();
            this.position3 = this._io.readF4le();
            this.fieldOfView = this._io.readF4le();
            this.farClippingPlane = this._io.readF4le();
            this.nearClippingPlane = this._io.readF4le();
            this.targetPosition1 = this._io.readF4le();
            this.targetPosition2 = this._io.readF4le();
            this.targetPosition3 = this._io.readF4le();
            this.cameraTrackChunkRouter = new ArrayList<CameraTrackChunkRouter>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.cameraTrackChunkRouter.add(new CameraTrackChunkRouter(this._io, this, _root));
                    i++;
                }
            }
        }
        private String name;
        private float position1;
        private float position2;
        private float position3;
        private float fieldOfView;
        private float farClippingPlane;
        private float nearClippingPlane;
        private float targetPosition1;
        private float targetPosition2;
        private float targetPosition3;
        private ArrayList<CameraTrackChunkRouter> cameraTrackChunkRouter;
        private W3Mdx _root;
        private W3Mdx.Camera _parent;
        public String name() { return name; }
        public float position1() { return position1; }
        public float position2() { return position2; }
        public float position3() { return position3; }
        public float fieldOfView() { return fieldOfView; }
        public float farClippingPlane() { return farClippingPlane; }
        public float nearClippingPlane() { return nearClippingPlane; }
        public float targetPosition1() { return targetPosition1; }
        public float targetPosition2() { return targetPosition2; }
        public float targetPosition3() { return targetPosition3; }
        public ArrayList<CameraTrackChunkRouter> cameraTrackChunkRouter() { return cameraTrackChunkRouter; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.Camera _parent() { return _parent; }
    }
    public static class KlacChunk extends KaitaiStruct {
        public static KlacChunk fromFile(String fileName) throws IOException {
            return new KlacChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KlacChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KlacChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KlacChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.color = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.color.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> color;
        private W3Mdx _root;
        private W3Mdx.LightTrackChunkRouter _parent;
        public ArrayList<Float> color() { return color; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LightTrackChunkRouter _parent() { return _parent; }
    }
    public static class KppcChunk extends KaitaiStruct {
        public static KppcChunk fromFile(String fileName) throws IOException {
            return new KppcChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KppcChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KppcChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KppcChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.color = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.color.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> color;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public ArrayList<Float> color() { return color; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KlaiChunk extends KaitaiStruct {
        public static KlaiChunk fromFile(String fileName) throws IOException {
            return new KlaiChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KlaiChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KlaiChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KlaiChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.intensity = this._io.readF4le();
        }
        private float intensity;
        private W3Mdx _root;
        private W3Mdx.LightTrackChunkRouter _parent;
        public float intensity() { return intensity; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LightTrackChunkRouter _parent() { return _parent; }
    }
    public static class ChunkPre2 extends KaitaiStruct {
        public static ChunkPre2 fromFile(String fileName) throws IOException {
            return new ChunkPre2(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkPre2(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkPre2(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkPre2(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.particleEmitter2 = new ArrayList<ParticleEmitter2>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.particleEmitter2.add(new ParticleEmitter2(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<ParticleEmitter2> particleEmitter2;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<ParticleEmitter2> particleEmitter2() { return particleEmitter2; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class KgscChunk extends KaitaiStruct {
        public static KgscChunk fromFile(String fileName) throws IOException {
            return new KgscChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KgscChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KgscChunk(KaitaiStream _io, W3Mdx.NodeTrackRouter _parent) {
            this(_io, _parent, null);
        }

        public KgscChunk(KaitaiStream _io, W3Mdx.NodeTrackRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "f4_3");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.NodeTrackRouter _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.NodeTrackRouter _parent() { return _parent; }
    }
    public static class KrhaChunk extends KaitaiStruct {
        public static KrhaChunk fromFile(String fileName) throws IOException {
            return new KrhaChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KrhaChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KrhaChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KrhaChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.heightAbove = this._io.readF4le();
        }
        private float heightAbove;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float heightAbove() { return heightAbove; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ChunkGeos extends KaitaiStruct {
        public static ChunkGeos fromFile(String fileName) throws IOException {
            return new ChunkGeos(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkGeos(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkGeos(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkGeos(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.geoset = new ArrayList<Geoset>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.geoset.add(new Geoset(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<Geoset> geoset;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Geoset> geoset() { return geoset; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class KtatChunk extends KaitaiStruct {
        public static KtatChunk fromFile(String fileName) throws IOException {
            return new KtatChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KtatChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KtatChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KtatChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.translation = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.translation.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> translation;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public ArrayList<Float> translation() { return translation; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class GeosetAnimTrackChunkRouter extends KaitaiStruct {
        public static GeosetAnimTrackChunkRouter fromFile(String fileName) throws IOException {
            return new GeosetAnimTrackChunkRouter(new ByteBufferKaitaiStream(fileName));
        }

        public GeosetAnimTrackChunkRouter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GeosetAnimTrackChunkRouter(KaitaiStream _io, W3Mdx.GeosetAnimPayload _parent) {
            this(_io, _parent, null);
        }

        public GeosetAnimTrackChunkRouter(KaitaiStream _io, W3Mdx.GeosetAnimPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            switch (magic().value()) {
            case "KGAO": {
                this.chunk = new KgaoChunk(this._io, this, _root);
                break;
            }
            case "KGAC": {
                this.chunk = new KgacChunk(this._io, this, _root);
                break;
            }
            }
        }
        private W3id magic;
        private KaitaiStruct chunk;
        private W3Mdx _root;
        private W3Mdx.GeosetAnimPayload _parent;
        public W3id magic() { return magic; }
        public KaitaiStruct chunk() { return chunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.GeosetAnimPayload _parent() { return _parent; }
    }
    public static class Kp2eChunk extends KaitaiStruct {
        public static Kp2eChunk fromFile(String fileName) throws IOException {
            return new Kp2eChunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kp2eChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kp2eChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Kp2eChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.emissionRate = this._io.readF4le();
        }
        private float emissionRate;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2TrackChunkRouter _parent;
        public float emissionRate() { return emissionRate; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2TrackChunkRouter _parent() { return _parent; }
    }
    public static class ParticleEmitter extends KaitaiStruct {
        public static ParticleEmitter fromFile(String fileName) throws IOException {
            return new ParticleEmitter(new ByteBufferKaitaiStream(fileName));
        }

        public ParticleEmitter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ParticleEmitter(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public ParticleEmitter(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this.node = new Node(this._io, this, _root);
            this.emissionRate = this._io.readF4le();
            this.gravity = this._io.readF4le();
            this.longitude = this._io.readF4le();
            this.latitude = this._io.readF4le();
            this.spawnModelFileName = new String(this._io.readBytes(260), Charset.forName("UTF-8"));
            this.lifespan = this._io.readF4le();
            this.initialVelocity = this._io.readF4le();
            this.kpeeChunk = new KpeeChunk(this._io, this, _root);
            this.kpegChunk = new KpegChunk(this._io, this, _root);
            this.kplnChunk = new KplnChunk(this._io, this, _root);
            this.kpltChunk = new KpltChunk(this._io, this, _root);
            this.kpelChunk = new KpelChunk(this._io, this, _root);
            this.kpesChunk = new KpesChunk(this._io, this, _root);
            this.kpevChunk = new KpevChunk(this._io, this, _root);
        }
        private long inclusiveSize;
        private Node node;
        private float emissionRate;
        private float gravity;
        private float longitude;
        private float latitude;
        private String spawnModelFileName;
        private float lifespan;
        private float initialVelocity;
        private KpeeChunk kpeeChunk;
        private KpegChunk kpegChunk;
        private KplnChunk kplnChunk;
        private KpltChunk kpltChunk;
        private KpelChunk kpelChunk;
        private KpesChunk kpesChunk;
        private KpevChunk kpevChunk;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public long inclusiveSize() { return inclusiveSize; }
        public Node node() { return node; }
        public float emissionRate() { return emissionRate; }
        public float gravity() { return gravity; }
        public float longitude() { return longitude; }
        public float latitude() { return latitude; }
        public String spawnModelFileName() { return spawnModelFileName; }
        public float lifespan() { return lifespan; }
        public float initialVelocity() { return initialVelocity; }
        public KpeeChunk kpeeChunk() { return kpeeChunk; }
        public KpegChunk kpegChunk() { return kpegChunk; }
        public KplnChunk kplnChunk() { return kplnChunk; }
        public KpltChunk kpltChunk() { return kpltChunk; }
        public KpelChunk kpelChunk() { return kpelChunk; }
        public KpesChunk kpesChunk() { return kpesChunk; }
        public KpevChunk kpevChunk() { return kpevChunk; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KtasChunk extends KaitaiStruct {
        public static KtasChunk fromFile(String fileName) throws IOException {
            return new KtasChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KtasChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KtasChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KtasChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.scaling = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.scaling.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> scaling;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public ArrayList<Float> scaling() { return scaling; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KppvChunk extends KaitaiStruct {
        public static KppvChunk fromFile(String fileName) throws IOException {
            return new KppvChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KppvChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KppvChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KppvChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.visibility = this._io.readF4le();
        }
        private float visibility;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float visibility() { return visibility; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ParticleEmitter2TrackChunkRouter extends KaitaiStruct {
        public static ParticleEmitter2TrackChunkRouter fromFile(String fileName) throws IOException {
            return new ParticleEmitter2TrackChunkRouter(new ByteBufferKaitaiStream(fileName));
        }

        public ParticleEmitter2TrackChunkRouter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ParticleEmitter2TrackChunkRouter(KaitaiStream _io, W3Mdx.ParticleEmitter2Payload _parent) {
            this(_io, _parent, null);
        }

        public ParticleEmitter2TrackChunkRouter(KaitaiStream _io, W3Mdx.ParticleEmitter2Payload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            switch (magic().value()) {
            case "KP2S": {
                this.chunk = new Kp2sChunk(this._io, this, _root);
                break;
            }
            case "KP2L": {
                this.chunk = new Kp2lChunk(this._io, this, _root);
                break;
            }
            case "KP2R": {
                this.chunk = new Kp2rChunk(this._io, this, _root);
                break;
            }
            case "KP2W": {
                this.chunk = new Kp2wChunk(this._io, this, _root);
                break;
            }
            case "KP2N": {
                this.chunk = new Kp2nChunk(this._io, this, _root);
                break;
            }
            case "KP2G": {
                this.chunk = new Kp2gChunk(this._io, this, _root);
                break;
            }
            case "KP2E": {
                this.chunk = new Kp2eChunk(this._io, this, _root);
                break;
            }
            case "KP2V": {
                this.chunk = new Kp2vChunk(this._io, this, _root);
                break;
            }
            }
        }
        private W3id magic;
        private KaitaiStruct chunk;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2Payload _parent;
        public W3id magic() { return magic; }
        public KaitaiStruct chunk() { return chunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2Payload _parent() { return _parent; }
    }
    public static class ParticleEmitter2 extends KaitaiStruct {
        public static ParticleEmitter2 fromFile(String fileName) throws IOException {
            return new ParticleEmitter2(new ByteBufferKaitaiStream(fileName));
        }

        public ParticleEmitter2(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ParticleEmitter2(KaitaiStream _io, W3Mdx.ChunkPre2 _parent) {
            this(_io, _parent, null);
        }

        public ParticleEmitter2(KaitaiStream _io, W3Mdx.ChunkPre2 _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_particleEmitter2Payload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_particleEmitter2Payload = new ByteBufferKaitaiStream(_raw_particleEmitter2Payload);
            this.particleEmitter2Payload = new ParticleEmitter2Payload(_io__raw_particleEmitter2Payload, this, _root);
        }
        private long inclusiveSize;
        private ParticleEmitter2Payload particleEmitter2Payload;
        private W3Mdx _root;
        private W3Mdx.ChunkPre2 _parent;
        private byte[] _raw_particleEmitter2Payload;
        public long inclusiveSize() { return inclusiveSize; }
        public ParticleEmitter2Payload particleEmitter2Payload() { return particleEmitter2Payload; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkPre2 _parent() { return _parent; }
        public byte[] _raw_particleEmitter2Payload() { return _raw_particleEmitter2Payload; }
    }
    public static class Extent extends KaitaiStruct {
        public static Extent fromFile(String fileName) throws IOException {
            return new Extent(new ByteBufferKaitaiStream(fileName));
        }

        public Extent(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Extent(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Extent(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.boundsRadius = this._io.readF4le();
            this.minimum = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.minimum.add(this._io.readF4le());
            }
            this.maximum = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.maximum.add(this._io.readF4le());
            }
        }
        private float boundsRadius;
        private ArrayList<Float> minimum;
        private ArrayList<Float> maximum;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float boundsRadius() { return boundsRadius; }
        public ArrayList<Float> minimum() { return minimum; }
        public ArrayList<Float> maximum() { return maximum; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class GeosetAnimPayload extends KaitaiStruct {
        public static GeosetAnimPayload fromFile(String fileName) throws IOException {
            return new GeosetAnimPayload(new ByteBufferKaitaiStream(fileName));
        }

        public GeosetAnimPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GeosetAnimPayload(KaitaiStream _io, W3Mdx.GeosetAnim _parent) {
            this(_io, _parent, null);
        }

        public GeosetAnimPayload(KaitaiStream _io, W3Mdx.GeosetAnim _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.alpha = this._io.readF4le();
            this.flags = this._io.readU4le();
            this.color1 = this._io.readF4le();
            this.color2 = this._io.readF4le();
            this.color3 = this._io.readF4le();
            this.geosetId = this._io.readU4le();
            this.trackChunk = new ArrayList<GeosetAnimTrackChunkRouter>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.trackChunk.add(new GeosetAnimTrackChunkRouter(this._io, this, _root));
                    i++;
                }
            }
        }
        private float alpha;
        private long flags;
        private float color1;
        private float color2;
        private float color3;
        private long geosetId;
        private ArrayList<GeosetAnimTrackChunkRouter> trackChunk;
        private W3Mdx _root;
        private W3Mdx.GeosetAnim _parent;
        public float alpha() { return alpha; }
        public long flags() { return flags; }
        public float color1() { return color1; }
        public float color2() { return color2; }
        public float color3() { return color3; }
        public long geosetId() { return geosetId; }
        public ArrayList<GeosetAnimTrackChunkRouter> trackChunk() { return trackChunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.GeosetAnim _parent() { return _parent; }
    }
    public static class LightPayload extends KaitaiStruct {
        public static LightPayload fromFile(String fileName) throws IOException {
            return new LightPayload(new ByteBufferKaitaiStream(fileName));
        }

        public LightPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LightPayload(KaitaiStream _io, W3Mdx.Light _parent) {
            this(_io, _parent, null);
        }

        public LightPayload(KaitaiStream _io, W3Mdx.Light _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.node = new Node(this._io, this, _root);
            this.type = this._io.readU4le();
            this.attenuationStart = this._io.readF4le();
            this.attenuationEnd = this._io.readF4le();
            this.color1 = this._io.readF4le();
            this.color2 = this._io.readF4le();
            this.color3 = this._io.readF4le();
            this.intensity = this._io.readF4le();
            this.ambientColor1 = this._io.readF4le();
            this.ambientColor2 = this._io.readF4le();
            this.ambientColor3 = this._io.readF4le();
            this.ambientIntensity = this._io.readF4le();
            this.lightTrackChunkRouter = new ArrayList<LightTrackChunkRouter>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.lightTrackChunkRouter.add(new LightTrackChunkRouter(this._io, this, _root));
                    i++;
                }
            }
        }
        private Node node;
        private long type;
        private float attenuationStart;
        private float attenuationEnd;
        private float color1;
        private float color2;
        private float color3;
        private float intensity;
        private float ambientColor1;
        private float ambientColor2;
        private float ambientColor3;
        private float ambientIntensity;
        private ArrayList<LightTrackChunkRouter> lightTrackChunkRouter;
        private W3Mdx _root;
        private W3Mdx.Light _parent;
        public Node node() { return node; }
        public long type() { return type; }
        public float attenuationStart() { return attenuationStart; }
        public float attenuationEnd() { return attenuationEnd; }
        public float color1() { return color1; }
        public float color2() { return color2; }
        public float color3() { return color3; }
        public float intensity() { return intensity; }
        public float ambientColor1() { return ambientColor1; }
        public float ambientColor2() { return ambientColor2; }
        public float ambientColor3() { return ambientColor3; }
        public float ambientIntensity() { return ambientIntensity; }
        public ArrayList<LightTrackChunkRouter> lightTrackChunkRouter() { return lightTrackChunkRouter; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.Light _parent() { return _parent; }
    }
    public static class RibbonEmitter extends KaitaiStruct {
        public static RibbonEmitter fromFile(String fileName) throws IOException {
            return new RibbonEmitter(new ByteBufferKaitaiStream(fileName));
        }

        public RibbonEmitter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RibbonEmitter(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public RibbonEmitter(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this.node = new Node(this._io, this, _root);
            this.heightAbove = this._io.readF4le();
            this.heightBelow = this._io.readF4le();
            this.alpha = this._io.readF4le();
            this.color1 = this._io.readF4le();
            this.color2 = this._io.readF4le();
            this.color3 = this._io.readF4le();
            this.lifespan = this._io.readF4le();
            this.textureSlot = this._io.readU4le();
            this.emissionRate = this._io.readU4le();
            this.numRow = this._io.readU4le();
            this.numColumn = this._io.readU4le();
            this.materialId = this._io.readU4le();
            this.gravity = this._io.readF4le();
            this.krhaChunk = new KrhaChunk(this._io, this, _root);
            this.krhbChunk = new KrhbChunk(this._io, this, _root);
            this.kralChunk = new KralChunk(this._io, this, _root);
            this.krcoChunk = new KrcoChunk(this._io, this, _root);
            this.krtxChunk = new KrtxChunk(this._io, this, _root);
            this.krvsChunk = new KrvsChunk(this._io, this, _root);
        }
        private long inclusiveSize;
        private Node node;
        private float heightAbove;
        private float heightBelow;
        private float alpha;
        private float color1;
        private float color2;
        private float color3;
        private float lifespan;
        private long textureSlot;
        private long emissionRate;
        private long numRow;
        private long numColumn;
        private long materialId;
        private float gravity;
        private KrhaChunk krhaChunk;
        private KrhbChunk krhbChunk;
        private KralChunk kralChunk;
        private KrcoChunk krcoChunk;
        private KrtxChunk krtxChunk;
        private KrvsChunk krvsChunk;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public long inclusiveSize() { return inclusiveSize; }
        public Node node() { return node; }
        public float heightAbove() { return heightAbove; }
        public float heightBelow() { return heightBelow; }
        public float alpha() { return alpha; }
        public float color1() { return color1; }
        public float color2() { return color2; }
        public float color3() { return color3; }
        public float lifespan() { return lifespan; }
        public long textureSlot() { return textureSlot; }
        public long emissionRate() { return emissionRate; }
        public long numRow() { return numRow; }
        public long numColumn() { return numColumn; }
        public long materialId() { return materialId; }
        public float gravity() { return gravity; }
        public KrhaChunk krhaChunk() { return krhaChunk; }
        public KrhbChunk krhbChunk() { return krhbChunk; }
        public KralChunk kralChunk() { return kralChunk; }
        public KrcoChunk krcoChunk() { return krcoChunk; }
        public KrtxChunk krtxChunk() { return krtxChunk; }
        public KrvsChunk krvsChunk() { return krvsChunk; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KpltChunk extends KaitaiStruct {
        public static KpltChunk fromFile(String fileName) throws IOException {
            return new KpltChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KpltChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KpltChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KpltChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.latitude = this._io.readF4le();
        }
        private float latitude;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float latitude() { return latitude; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ParticleEmitter2Payload extends KaitaiStruct {
        public static ParticleEmitter2Payload fromFile(String fileName) throws IOException {
            return new ParticleEmitter2Payload(new ByteBufferKaitaiStream(fileName));
        }

        public ParticleEmitter2Payload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ParticleEmitter2Payload(KaitaiStream _io, W3Mdx.ParticleEmitter2 _parent) {
            this(_io, _parent, null);
        }

        public ParticleEmitter2Payload(KaitaiStream _io, W3Mdx.ParticleEmitter2 _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.node = new Node(this._io, this, _root);
            this.speed = this._io.readF4le();
            this.variation = this._io.readF4le();
            this.latitude = this._io.readF4le();
            this.gravity = this._io.readF4le();
            this.lifespan = this._io.readF4le();
            this.emissionRate = this._io.readF4le();
            this.length = this._io.readF4le();
            this.width = this._io.readF4le();
            this.filterMode = this._io.readU4le();
            this.numRow = this._io.readU4le();
            this.numColumn = this._io.readU4le();
            this.headOrTail = this._io.readU4le();
            this.tailLength = this._io.readF4le();
            this.time = this._io.readF4le();
            this.segmentColor = new ArrayList<SegmentColor>();
            for (int i = 0; i < 3; i++) {
                this.segmentColor.add(new SegmentColor(this._io, this, _root));
            }
            this.segment1Alpha = this._io.readU1();
            this.segment2Alpha = this._io.readU1();
            this.segmen3tAlpha = this._io.readU1();
            this.segment1Scale = this._io.readF4le();
            this.segment2Scale = this._io.readF4le();
            this.segment3Scale = this._io.readF4le();
            this.segment1HeadInterval = this._io.readU4le();
            this.segment2HeadInterval = this._io.readU4le();
            this.segment3HeadInterval = this._io.readU4le();
            this.segment1HeadDecayInterval = this._io.readU4le();
            this.segment2HeadDecayInterval = this._io.readU4le();
            this.segment3HeadDecayInterval = this._io.readU4le();
            this.segment1TailInterval = this._io.readU4le();
            this.segment2TailInterval = this._io.readU4le();
            this.segment3TailInterval = this._io.readU4le();
            this.segment1TailDecayInterval = this._io.readU4le();
            this.segment2TailDecayInterval = this._io.readU4le();
            this.segment3TailDecayInterval = this._io.readU4le();
            this.textureId = this._io.readU4le();
            this.squirt = this._io.readU4le();
            this.priorityPlane = this._io.readU4le();
            this.replaceableId = this._io.readU4le();
            this.particleEmitter2TrackChunkRouter = new ArrayList<ParticleEmitter2TrackChunkRouter>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.particleEmitter2TrackChunkRouter.add(new ParticleEmitter2TrackChunkRouter(this._io, this, _root));
                    i++;
                }
            }
        }
        private Node node;
        private float speed;
        private float variation;
        private float latitude;
        private float gravity;
        private float lifespan;
        private float emissionRate;
        private float length;
        private float width;
        private long filterMode;
        private long numRow;
        private long numColumn;
        private long headOrTail;
        private float tailLength;
        private float time;
        private ArrayList<SegmentColor> segmentColor;
        private int segment1Alpha;
        private int segment2Alpha;
        private int segmen3tAlpha;
        private float segment1Scale;
        private float segment2Scale;
        private float segment3Scale;
        private long segment1HeadInterval;
        private long segment2HeadInterval;
        private long segment3HeadInterval;
        private long segment1HeadDecayInterval;
        private long segment2HeadDecayInterval;
        private long segment3HeadDecayInterval;
        private long segment1TailInterval;
        private long segment2TailInterval;
        private long segment3TailInterval;
        private long segment1TailDecayInterval;
        private long segment2TailDecayInterval;
        private long segment3TailDecayInterval;
        private long textureId;
        private long squirt;
        private long priorityPlane;
        private long replaceableId;
        private ArrayList<ParticleEmitter2TrackChunkRouter> particleEmitter2TrackChunkRouter;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2 _parent;
        public Node node() { return node; }
        public float speed() { return speed; }
        public float variation() { return variation; }
        public float latitude() { return latitude; }
        public float gravity() { return gravity; }
        public float lifespan() { return lifespan; }
        public float emissionRate() { return emissionRate; }
        public float length() { return length; }
        public float width() { return width; }
        public long filterMode() { return filterMode; }
        public long numRow() { return numRow; }
        public long numColumn() { return numColumn; }
        public long headOrTail() { return headOrTail; }
        public float tailLength() { return tailLength; }
        public float time() { return time; }
        public ArrayList<SegmentColor> segmentColor() { return segmentColor; }
        public int segment1Alpha() { return segment1Alpha; }
        public int segment2Alpha() { return segment2Alpha; }
        public int segmen3tAlpha() { return segmen3tAlpha; }
        public float segment1Scale() { return segment1Scale; }
        public float segment2Scale() { return segment2Scale; }
        public float segment3Scale() { return segment3Scale; }
        public long segment1HeadInterval() { return segment1HeadInterval; }
        public long segment2HeadInterval() { return segment2HeadInterval; }
        public long segment3HeadInterval() { return segment3HeadInterval; }
        public long segment1HeadDecayInterval() { return segment1HeadDecayInterval; }
        public long segment2HeadDecayInterval() { return segment2HeadDecayInterval; }
        public long segment3HeadDecayInterval() { return segment3HeadDecayInterval; }
        public long segment1TailInterval() { return segment1TailInterval; }
        public long segment2TailInterval() { return segment2TailInterval; }
        public long segment3TailInterval() { return segment3TailInterval; }
        public long segment1TailDecayInterval() { return segment1TailDecayInterval; }
        public long segment2TailDecayInterval() { return segment2TailDecayInterval; }
        public long segment3TailDecayInterval() { return segment3TailDecayInterval; }
        public long textureId() { return textureId; }
        public long squirt() { return squirt; }
        public long priorityPlane() { return priorityPlane; }
        public long replaceableId() { return replaceableId; }
        public ArrayList<ParticleEmitter2TrackChunkRouter> particleEmitter2TrackChunkRouter() { return particleEmitter2TrackChunkRouter; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2 _parent() { return _parent; }
    }
    public static class Kfc3Chunk extends KaitaiStruct {
        public static Kfc3Chunk fromFile(String fileName) throws IOException {
            return new Kfc3Chunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kfc3Chunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kfc3Chunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Kfc3Chunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.fresnelColor = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.fresnelColor.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> fresnelColor;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public ArrayList<Float> fresnelColor() { return fresnelColor; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Kp2wChunk extends KaitaiStruct {
        public static Kp2wChunk fromFile(String fileName) throws IOException {
            return new Kp2wChunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kp2wChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kp2wChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Kp2wChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.width = this._io.readF4le();
        }
        private float width;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2TrackChunkRouter _parent;
        public float width() { return width; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2TrackChunkRouter _parent() { return _parent; }
    }
    public static class ChunkGlbs extends KaitaiStruct {
        public static ChunkGlbs fromFile(String fileName) throws IOException {
            return new ChunkGlbs(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkGlbs(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkGlbs(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkGlbs(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.globalSequence = new ArrayList<Long>();
            for (int i = 0; i < (_parent().size() / 4); i++) {
                this.globalSequence.add(this._io.readU4le());
            }
        }
        private ArrayList<Long> globalSequence;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Long> globalSequence() { return globalSequence; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class EventObject extends KaitaiStruct {
        public static EventObject fromFile(String fileName) throws IOException {
            return new EventObject(new ByteBufferKaitaiStream(fileName));
        }

        public EventObject(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EventObject(KaitaiStream _io, W3Mdx.ChunkEvts _parent) {
            this(_io, _parent, null);
        }

        public EventObject(KaitaiStream _io, W3Mdx.ChunkEvts _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.node = new Node(this._io, this, _root);
            this.kevtMagic = new W3id(this._io);
            this.numTrackChunk = this._io.readU4le();
            this.globalSequenceId = this._io.readU4le();
            this.trackChunk = new ArrayList<Long>();
            for (int i = 0; i < numTrackChunk(); i++) {
                this.trackChunk.add(this._io.readU4le());
            }
        }
        private Node node;
        private W3id kevtMagic;
        private long numTrackChunk;
        private long globalSequenceId;
        private ArrayList<Long> trackChunk;
        private W3Mdx _root;
        private W3Mdx.ChunkEvts _parent;
        public Node node() { return node; }
        public W3id kevtMagic() { return kevtMagic; }
        public long numTrackChunk() { return numTrackChunk; }
        public long globalSequenceId() { return globalSequenceId; }
        public ArrayList<Long> trackChunk() { return trackChunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkEvts _parent() { return _parent; }
    }
    public static class KgrtChunk extends KaitaiStruct {
        public static KgrtChunk fromFile(String fileName) throws IOException {
            return new KgrtChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KgrtChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KgrtChunk(KaitaiStream _io, W3Mdx.NodeTrackRouter _parent) {
            this(_io, _parent, null);
        }

        public KgrtChunk(KaitaiStream _io, W3Mdx.NodeTrackRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "f4_4");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.NodeTrackRouter _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.NodeTrackRouter _parent() { return _parent; }
    }
    public static class ChunkCams extends KaitaiStruct {
        public static ChunkCams fromFile(String fileName) throws IOException {
            return new ChunkCams(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkCams(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkCams(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkCams(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.camera = new ArrayList<Camera>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.camera.add(new Camera(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<Camera> camera;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Camera> camera() { return camera; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class ChunkPivt extends KaitaiStruct {
        public static ChunkPivt fromFile(String fileName) throws IOException {
            return new ChunkPivt(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkPivt(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkPivt(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkPivt(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.point = new ArrayList<F43>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.point.add(new F43(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<F43> point;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<F43> point() { return point; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class KlavChunk extends KaitaiStruct {
        public static KlavChunk fromFile(String fileName) throws IOException {
            return new KlavChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KlavChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KlavChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KlavChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.visibility = this._io.readF4le();
        }
        private float visibility;
        private W3Mdx _root;
        private W3Mdx.LightTrackChunkRouter _parent;
        public float visibility() { return visibility; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LightTrackChunkRouter _parent() { return _parent; }
    }
    public static class Tangent extends KaitaiStruct {
        public static Tangent fromFile(String fileName) throws IOException {
            return new Tangent(new ByteBufferKaitaiStream(fileName));
        }

        public Tangent(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Tangent(KaitaiStream _io, W3Mdx.TangentChunk _parent) {
            this(_io, _parent, null);
        }

        public Tangent(KaitaiStream _io, W3Mdx.TangentChunk _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new ArrayList<Float>();
            for (int i = 0; i < 4; i++) {
                this.value.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> value;
        private W3Mdx _root;
        private W3Mdx.TangentChunk _parent;
        public ArrayList<Float> value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.TangentChunk _parent() { return _parent; }
    }
    public static class KatvChunk extends KaitaiStruct {
        public static KatvChunk fromFile(String fileName) throws IOException {
            return new KatvChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KatvChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KatvChunk(KaitaiStream _io, W3Mdx.AttachmentTrackRouter _parent) {
            this(_io, _parent, null);
        }

        public KatvChunk(KaitaiStream _io, W3Mdx.AttachmentTrackRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "f4");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.AttachmentTrackRouter _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.AttachmentTrackRouter _parent() { return _parent; }
    }
    public static class KpevChunk extends KaitaiStruct {
        public static KpevChunk fromFile(String fileName) throws IOException {
            return new KpevChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KpevChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KpevChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KpevChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.visibility = this._io.readF4le();
        }
        private float visibility;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float visibility() { return visibility; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KttrChunk extends KaitaiStruct {
        public static KttrChunk fromFile(String fileName) throws IOException {
            return new KttrChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KttrChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KttrChunk(KaitaiStream _io, W3Mdx.CameraTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KttrChunk(KaitaiStream _io, W3Mdx.CameraTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.targetTranslation = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.targetTranslation.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> targetTranslation;
        private W3Mdx _root;
        private W3Mdx.CameraTrackChunkRouter _parent;
        public ArrayList<Float> targetTranslation() { return targetTranslation; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.CameraTrackChunkRouter _parent() { return _parent; }
    }
    public static class KlasChunk extends KaitaiStruct {
        public static KlasChunk fromFile(String fileName) throws IOException {
            return new KlasChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KlasChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KlasChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KlasChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.attenuationStart = this._io.readF4le();
        }
        private float attenuationStart;
        private W3Mdx _root;
        private W3Mdx.LightTrackChunkRouter _parent;
        public float attenuationStart() { return attenuationStart; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LightTrackChunkRouter _parent() { return _parent; }
    }
    public static class Track extends KaitaiStruct {

        public Track(KaitaiStream _io, String valueType, long interpolationType) {
            this(_io, null, null, valueType, interpolationType);
        }

        public Track(KaitaiStream _io, W3Mdx.TrackChunk _parent, String valueType, long interpolationType) {
            this(_io, _parent, null, valueType, interpolationType);
        }

        public Track(KaitaiStream _io, W3Mdx.TrackChunk _parent, W3Mdx _root, String valueType, long interpolationType) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.valueType = valueType;
            this.interpolationType = interpolationType;
            _read();
        }
        private void _read() {
            this.frame = this._io.readS4le();
            switch (valueType()) {
            case "f4_4": {
                this.value = new F44(this._io, this, _root);
                break;
            }
            case "u4": {
                this.value = (Object) (this._io.readU4le());
                break;
            }
            case "f4": {
                this.value = (Object) (this._io.readF4le());
                break;
            }
            case "f4_3": {
                this.value = new F43(this._io, this, _root);
                break;
            }
            default: {
                this.value = (Object) (this._io.readU4le());
                break;
            }
            }
            if (interpolationType() > 1) {
                switch (valueType()) {
                case "f4_4": {
                    this.inTan = new F44(this._io, this, _root);
                    break;
                }
                case "u4": {
                    this.inTan = (Object) (this._io.readU4le());
                    break;
                }
                case "f4": {
                    this.inTan = (Object) (this._io.readF4le());
                    break;
                }
                case "f4_3": {
                    this.inTan = new F43(this._io, this, _root);
                    break;
                }
                default: {
                    this.inTan = (Object) (this._io.readU4le());
                    break;
                }
                }
            }
            if (interpolationType() > 1) {
                switch (valueType()) {
                case "f4_4": {
                    this.outTan = new F44(this._io, this, _root);
                    break;
                }
                case "u4": {
                    this.outTan = (Object) (this._io.readU4le());
                    break;
                }
                case "f4": {
                    this.outTan = (Object) (this._io.readF4le());
                    break;
                }
                case "f4_3": {
                    this.outTan = new F43(this._io, this, _root);
                    break;
                }
                default: {
                    this.outTan = (Object) (this._io.readU4le());
                    break;
                }
                }
            }
        }
        private int frame;
        private Object value;
        private Object inTan;
        private Object outTan;
        private String valueType;
        private long interpolationType;
        private W3Mdx _root;
        private W3Mdx.TrackChunk _parent;
        public int frame() { return frame; }
        public Object value() { return value; }
        public Object inTan() { return inTan; }
        public Object outTan() { return outTan; }
        public String valueType() { return valueType; }
        public long interpolationType() { return interpolationType; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.TrackChunk _parent() { return _parent; }
    }
    public static class ChunkTexs extends KaitaiStruct {
        public static ChunkTexs fromFile(String fileName) throws IOException {
            return new ChunkTexs(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkTexs(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkTexs(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkTexs(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.texsTex = new ArrayList<TexsTex>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.texsTex.add(new TexsTex(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<TexsTex> texsTex;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<TexsTex> texsTex() { return texsTex; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class Camera extends KaitaiStruct {
        public static Camera fromFile(String fileName) throws IOException {
            return new Camera(new ByteBufferKaitaiStream(fileName));
        }

        public Camera(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Camera(KaitaiStream _io, W3Mdx.ChunkCams _parent) {
            this(_io, _parent, null);
        }

        public Camera(KaitaiStream _io, W3Mdx.ChunkCams _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_cameraPayload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_cameraPayload = new ByteBufferKaitaiStream(_raw_cameraPayload);
            this.cameraPayload = new CameraPayload(_io__raw_cameraPayload, this, _root);
        }
        private long inclusiveSize;
        private CameraPayload cameraPayload;
        private W3Mdx _root;
        private W3Mdx.ChunkCams _parent;
        private byte[] _raw_cameraPayload;
        public long inclusiveSize() { return inclusiveSize; }
        public CameraPayload cameraPayload() { return cameraPayload; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkCams _parent() { return _parent; }
        public byte[] _raw_cameraPayload() { return _raw_cameraPayload; }
    }
    public static class ChunkVers extends KaitaiStruct {
        public static ChunkVers fromFile(String fileName) throws IOException {
            return new ChunkVers(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkVers(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkVers(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkVers(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.version = this._io.readU4le();
        }
        private long version;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public long version() { return version; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class GeosetAnim extends KaitaiStruct {
        public static GeosetAnim fromFile(String fileName) throws IOException {
            return new GeosetAnim(new ByteBufferKaitaiStream(fileName));
        }

        public GeosetAnim(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GeosetAnim(KaitaiStream _io, W3Mdx.ChunkGeoa _parent) {
            this(_io, _parent, null);
        }

        public GeosetAnim(KaitaiStream _io, W3Mdx.ChunkGeoa _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_geosetAnimPayload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_geosetAnimPayload = new ByteBufferKaitaiStream(_raw_geosetAnimPayload);
            this.geosetAnimPayload = new GeosetAnimPayload(_io__raw_geosetAnimPayload, this, _root);
        }
        private long inclusiveSize;
        private GeosetAnimPayload geosetAnimPayload;
        private W3Mdx _root;
        private W3Mdx.ChunkGeoa _parent;
        private byte[] _raw_geosetAnimPayload;
        public long inclusiveSize() { return inclusiveSize; }
        public GeosetAnimPayload geosetAnimPayload() { return geosetAnimPayload; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkGeoa _parent() { return _parent; }
        public byte[] _raw_geosetAnimPayload() { return _raw_geosetAnimPayload; }
    }
    public static class KpeeChunk extends KaitaiStruct {
        public static KpeeChunk fromFile(String fileName) throws IOException {
            return new KpeeChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KpeeChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KpeeChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KpeeChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.emissionRate = this._io.readF4le();
        }
        private float emissionRate;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float emissionRate() { return emissionRate; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class CornEmitter extends KaitaiStruct {
        public static CornEmitter fromFile(String fileName) throws IOException {
            return new CornEmitter(new ByteBufferKaitaiStream(fileName));
        }

        public CornEmitter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CornEmitter(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public CornEmitter(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this.node = new Node(this._io, this, _root);
            this.lifespan = this._io.readF4le();
            this.emissionRate = this._io.readF4le();
            this.speed = this._io.readF4le();
            this.color1 = this._io.readF4le();
            this.color2 = this._io.readF4le();
            this.color3 = this._io.readF4le();
            this.color4 = this._io.readF4le();
            this.replaceableId = this._io.readU4le();
            this.path = new String(this._io.readBytes(260), Charset.forName("UTF-8"));
            this.flags = new String(this._io.readBytes(260), Charset.forName("UTF-8"));
            this.kppaChunk = new KppaChunk(this._io, this, _root);
            this.kppcChunk = new KppcChunk(this._io, this, _root);
            this.kppeChunk = new KppeChunk(this._io, this, _root);
            this.kpplChunk = new KpplChunk(this._io, this, _root);
            this.kppsChunk = new KppsChunk(this._io, this, _root);
            this.kppvChunk = new KppvChunk(this._io, this, _root);
        }
        private long inclusiveSize;
        private Node node;
        private float lifespan;
        private float emissionRate;
        private float speed;
        private float color1;
        private float color2;
        private float color3;
        private float color4;
        private long replaceableId;
        private String path;
        private String flags;
        private KppaChunk kppaChunk;
        private KppcChunk kppcChunk;
        private KppeChunk kppeChunk;
        private KpplChunk kpplChunk;
        private KppsChunk kppsChunk;
        private KppvChunk kppvChunk;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public long inclusiveSize() { return inclusiveSize; }
        public Node node() { return node; }
        public float lifespan() { return lifespan; }
        public float emissionRate() { return emissionRate; }
        public float speed() { return speed; }
        public float color1() { return color1; }
        public float color2() { return color2; }
        public float color3() { return color3; }
        public float color4() { return color4; }
        public long replaceableId() { return replaceableId; }
        public String path() { return path; }
        public String flags() { return flags; }
        public KppaChunk kppaChunk() { return kppaChunk; }
        public KppcChunk kppcChunk() { return kppcChunk; }
        public KppeChunk kppeChunk() { return kppeChunk; }
        public KpplChunk kpplChunk() { return kpplChunk; }
        public KppsChunk kppsChunk() { return kppsChunk; }
        public KppvChunk kppvChunk() { return kppvChunk; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KppeChunk extends KaitaiStruct {
        public static KppeChunk fromFile(String fileName) throws IOException {
            return new KppeChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KppeChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KppeChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KppeChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.emissionRate = this._io.readF4le();
        }
        private float emissionRate;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float emissionRate() { return emissionRate; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KlaeChunk extends KaitaiStruct {
        public static KlaeChunk fromFile(String fileName) throws IOException {
            return new KlaeChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KlaeChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KlaeChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KlaeChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.attenuationEnd = this._io.readF4le();
        }
        private float attenuationEnd;
        private W3Mdx _root;
        private W3Mdx.LightTrackChunkRouter _parent;
        public float attenuationEnd() { return attenuationEnd; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LightTrackChunkRouter _parent() { return _parent; }
    }
    public static class ChunkModl extends KaitaiStruct {
        public static ChunkModl fromFile(String fileName) throws IOException {
            return new ChunkModl(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkModl(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkModl(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkModl(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new String(this._io.readBytes(80), Charset.forName("UTF-8"));
            this.animFileName = new String(this._io.readBytes(260), Charset.forName("UTF-8"));
            this.extent = new Extent(this._io, this, _root);
            this.blendTime = this._io.readU4le();
        }
        private String name;
        private String animFileName;
        private Extent extent;
        private long blendTime;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public String name() { return name; }
        public String animFileName() { return animFileName; }
        public Extent extent() { return extent; }
        public long blendTime() { return blendTime; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class SegmentColor extends KaitaiStruct {
        public static SegmentColor fromFile(String fileName) throws IOException {
            return new SegmentColor(new ByteBufferKaitaiStream(fileName));
        }

        public SegmentColor(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SegmentColor(KaitaiStream _io, W3Mdx.ParticleEmitter2Payload _parent) {
            this(_io, _parent, null);
        }

        public SegmentColor(KaitaiStream _io, W3Mdx.ParticleEmitter2Payload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.color1 = this._io.readF4le();
            this.color2 = this._io.readF4le();
            this.color3 = this._io.readF4le();
        }
        private float color1;
        private float color2;
        private float color3;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2Payload _parent;
        public float color1() { return color1; }
        public float color2() { return color2; }
        public float color3() { return color3; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2Payload _parent() { return _parent; }
    }
    public static class SkinChunk extends KaitaiStruct {
        public static SkinChunk fromFile(String fileName) throws IOException {
            return new SkinChunk(new ByteBufferKaitaiStream(fileName));
        }

        public SkinChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SkinChunk(KaitaiStream _io, W3Mdx.GeosetPayload _parent) {
            this(_io, _parent, null);
        }

        public SkinChunk(KaitaiStream _io, W3Mdx.GeosetPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            this.numSkin = this._io.readU4le();
            this.skin = new ArrayList<Integer>();
            for (int i = 0; i < numSkin(); i++) {
                this.skin.add(this._io.readU1());
            }
        }
        private W3id magic;
        private long numSkin;
        private ArrayList<Integer> skin;
        private W3Mdx _root;
        private W3Mdx.GeosetPayload _parent;
        public W3id magic() { return magic; }
        public long numSkin() { return numSkin; }
        public ArrayList<Integer> skin() { return skin; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.GeosetPayload _parent() { return _parent; }
    }
    public static class CameraTrackChunkRouter extends KaitaiStruct {
        public static CameraTrackChunkRouter fromFile(String fileName) throws IOException {
            return new CameraTrackChunkRouter(new ByteBufferKaitaiStream(fileName));
        }

        public CameraTrackChunkRouter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CameraTrackChunkRouter(KaitaiStream _io, W3Mdx.CameraPayload _parent) {
            this(_io, _parent, null);
        }

        public CameraTrackChunkRouter(KaitaiStream _io, W3Mdx.CameraPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            switch (magic().value()) {
            case "KCTR": {
                this.chunk = new KctrChunk(this._io, this, _root);
                break;
            }
            case "KTTR": {
                this.chunk = new KttrChunk(this._io, this, _root);
                break;
            }
            case "KCRL": {
                this.chunk = new KcrlChunk(this._io, this, _root);
                break;
            }
            }
        }
        private W3id magic;
        private KaitaiStruct chunk;
        private W3Mdx _root;
        private W3Mdx.CameraPayload _parent;
        public W3id magic() { return magic; }
        public KaitaiStruct chunk() { return chunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.CameraPayload _parent() { return _parent; }
    }
    public static class KpesChunk extends KaitaiStruct {
        public static KpesChunk fromFile(String fileName) throws IOException {
            return new KpesChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KpesChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KpesChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KpesChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.speed = this._io.readF4le();
        }
        private float speed;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float speed() { return speed; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KlbcChunk extends KaitaiStruct {
        public static KlbcChunk fromFile(String fileName) throws IOException {
            return new KlbcChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KlbcChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KlbcChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KlbcChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.ambientColor = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.ambientColor.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> ambientColor;
        private W3Mdx _root;
        private W3Mdx.LightTrackChunkRouter _parent;
        public ArrayList<Float> ambientColor() { return ambientColor; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LightTrackChunkRouter _parent() { return _parent; }
    }
    public static class KgacChunk extends KaitaiStruct {
        public static KgacChunk fromFile(String fileName) throws IOException {
            return new KgacChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KgacChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KgacChunk(KaitaiStream _io, W3Mdx.GeosetAnimTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KgacChunk(KaitaiStream _io, W3Mdx.GeosetAnimTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "f4_3");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.GeosetAnimTrackChunkRouter _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.GeosetAnimTrackChunkRouter _parent() { return _parent; }
    }
    public static class KlbiChunk extends KaitaiStruct {
        public static KlbiChunk fromFile(String fileName) throws IOException {
            return new KlbiChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KlbiChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KlbiChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KlbiChunk(KaitaiStream _io, W3Mdx.LightTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.ambientIntensity = this._io.readF4le();
        }
        private float ambientIntensity;
        private W3Mdx _root;
        private W3Mdx.LightTrackChunkRouter _parent;
        public float ambientIntensity() { return ambientIntensity; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LightTrackChunkRouter _parent() { return _parent; }
    }
    public static class AttachmentPayload extends KaitaiStruct {
        public static AttachmentPayload fromFile(String fileName) throws IOException {
            return new AttachmentPayload(new ByteBufferKaitaiStream(fileName));
        }

        public AttachmentPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public AttachmentPayload(KaitaiStream _io, W3Mdx.Attachment _parent) {
            this(_io, _parent, null);
        }

        public AttachmentPayload(KaitaiStream _io, W3Mdx.Attachment _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.node = new Node(this._io, this, _root);
            this.path = new String(this._io.readBytes(260), Charset.forName("UTF-8"));
            this.attachmentId = this._io.readU4le();
            this.trackChunk = new ArrayList<AttachmentTrackRouter>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.trackChunk.add(new AttachmentTrackRouter(this._io, this, _root));
                    i++;
                }
            }
        }
        private Node node;
        private String path;
        private long attachmentId;
        private ArrayList<AttachmentTrackRouter> trackChunk;
        private W3Mdx _root;
        private W3Mdx.Attachment _parent;
        public Node node() { return node; }
        public String path() { return path; }
        public long attachmentId() { return attachmentId; }
        public ArrayList<AttachmentTrackRouter> trackChunk() { return trackChunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.Attachment _parent() { return _parent; }
    }
    public static class F43 extends KaitaiStruct {
        public static F43 fromFile(String fileName) throws IOException {
            return new F43(new ByteBufferKaitaiStream(fileName));
        }

        public F43(KaitaiStream _io) {
            this(_io, null, null);
        }

        public F43(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public F43(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.value.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> value;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public ArrayList<Float> value() { return value; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class LightTrackChunkRouter extends KaitaiStruct {
        public static LightTrackChunkRouter fromFile(String fileName) throws IOException {
            return new LightTrackChunkRouter(new ByteBufferKaitaiStream(fileName));
        }

        public LightTrackChunkRouter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LightTrackChunkRouter(KaitaiStream _io, W3Mdx.LightPayload _parent) {
            this(_io, _parent, null);
        }

        public LightTrackChunkRouter(KaitaiStream _io, W3Mdx.LightPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            switch (magic().value()) {
            case "KLAS": {
                this.chunk = new KlasChunk(this._io, this, _root);
                break;
            }
            case "KLBC": {
                this.chunk = new KlbcChunk(this._io, this, _root);
                break;
            }
            case "KLAC": {
                this.chunk = new KlacChunk(this._io, this, _root);
                break;
            }
            case "KLAE": {
                this.chunk = new KlaeChunk(this._io, this, _root);
                break;
            }
            case "KLAI": {
                this.chunk = new KlaiChunk(this._io, this, _root);
                break;
            }
            case "KLBI": {
                this.chunk = new KlbiChunk(this._io, this, _root);
                break;
            }
            case "KLAV": {
                this.chunk = new KlavChunk(this._io, this, _root);
                break;
            }
            }
        }
        private W3id magic;
        private KaitaiStruct chunk;
        private W3Mdx _root;
        private W3Mdx.LightPayload _parent;
        public W3id magic() { return magic; }
        public KaitaiStruct chunk() { return chunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LightPayload _parent() { return _parent; }
    }
    public static class KgtrChunk extends KaitaiStruct {
        public static KgtrChunk fromFile(String fileName) throws IOException {
            return new KgtrChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KgtrChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KgtrChunk(KaitaiStream _io, W3Mdx.NodeTrackRouter _parent) {
            this(_io, _parent, null);
        }

        public KgtrChunk(KaitaiStream _io, W3Mdx.NodeTrackRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "f4_3");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.NodeTrackRouter _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.NodeTrackRouter _parent() { return _parent; }
    }
    public static class Bone extends KaitaiStruct {
        public static Bone fromFile(String fileName) throws IOException {
            return new Bone(new ByteBufferKaitaiStream(fileName));
        }

        public Bone(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Bone(KaitaiStream _io, W3Mdx.ChunkBone _parent) {
            this(_io, _parent, null);
        }

        public Bone(KaitaiStream _io, W3Mdx.ChunkBone _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.node = new Node(this._io, this, _root);
            this.geosetId = this._io.readU4le();
            this.geosetAnimId = this._io.readU4le();
        }
        private Node node;
        private long geosetId;
        private long geosetAnimId;
        private W3Mdx _root;
        private W3Mdx.ChunkBone _parent;
        public Node node() { return node; }
        public long geosetId() { return geosetId; }
        public long geosetAnimId() { return geosetAnimId; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkBone _parent() { return _parent; }
    }
    public static class ChunkMtls extends KaitaiStruct {

        public ChunkMtls(KaitaiStream _io, long size) {
            this(_io, null, null, size);
        }

        public ChunkMtls(KaitaiStream _io, W3Mdx.ChunkRouter _parent, long size) {
            this(_io, _parent, null, size);
        }

        public ChunkMtls(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root, long size) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.size = size;
            _read();
        }
        private void _read() {
            this.material = new ArrayList<Material>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.material.add(new Material(this._io, this, _root, 0));
                    i++;
                }
            }
        }
        private ArrayList<Material> material;
        private long size;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Material> material() { return material; }
        public long size() { return size; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class TextureCoordinateSet extends KaitaiStruct {
        public static TextureCoordinateSet fromFile(String fileName) throws IOException {
            return new TextureCoordinateSet(new ByteBufferKaitaiStream(fileName));
        }

        public TextureCoordinateSet(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TextureCoordinateSet(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public TextureCoordinateSet(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            this.numTextureCoordinate = this._io.readU4le();
            this.textureCoordinate = new ArrayList<TextureCoordinate>();
            for (int i = 0; i < numTextureCoordinate(); i++) {
                this.textureCoordinate.add(new TextureCoordinate(this._io, this, _root));
            }
        }
        private W3id magic;
        private long numTextureCoordinate;
        private ArrayList<TextureCoordinate> textureCoordinate;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public W3id magic() { return magic; }
        public long numTextureCoordinate() { return numTextureCoordinate; }
        public ArrayList<TextureCoordinate> textureCoordinate() { return textureCoordinate; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KfctChunk extends KaitaiStruct {
        public static KfctChunk fromFile(String fileName) throws IOException {
            return new KfctChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KfctChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KfctChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KfctChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.fresnelTeamColor = this._io.readF4le();
        }
        private float fresnelTeamColor;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float fresnelTeamColor() { return fresnelTeamColor; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Layer extends KaitaiStruct {

        public Layer(KaitaiStream _io, long index) {
            this(_io, null, null, index);
        }

        public Layer(KaitaiStream _io, W3Mdx.MaterialPayload _parent, long index) {
            this(_io, _parent, null, index);
        }

        public Layer(KaitaiStream _io, W3Mdx.MaterialPayload _parent, W3Mdx _root, long index) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.index = index;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_layerPayload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_layerPayload = new ByteBufferKaitaiStream(_raw_layerPayload);
            this.layerPayload = new LayerPayload(_io__raw_layerPayload, this, _root, index());
        }
        private long inclusiveSize;
        private LayerPayload layerPayload;
        private long index;
        private W3Mdx _root;
        private W3Mdx.MaterialPayload _parent;
        private byte[] _raw_layerPayload;
        public long inclusiveSize() { return inclusiveSize; }
        public LayerPayload layerPayload() { return layerPayload; }
        public long index() { return index; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.MaterialPayload _parent() { return _parent; }
        public byte[] _raw_layerPayload() { return _raw_layerPayload; }
    }
    public static class VertexPosition extends KaitaiStruct {
        public static VertexPosition fromFile(String fileName) throws IOException {
            return new VertexPosition(new ByteBufferKaitaiStream(fileName));
        }

        public VertexPosition(KaitaiStream _io) {
            this(_io, null, null);
        }

        public VertexPosition(KaitaiStream _io, W3Mdx.GeosetPayload _parent) {
            this(_io, _parent, null);
        }

        public VertexPosition(KaitaiStream _io, W3Mdx.GeosetPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
            this.z = this._io.readF4le();
        }
        private float x;
        private float y;
        private float z;
        private W3Mdx _root;
        private W3Mdx.GeosetPayload _parent;
        public float x() { return x; }
        public float y() { return y; }
        public float z() { return z; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.GeosetPayload _parent() { return _parent; }
    }
    public static class Kp2rChunk extends KaitaiStruct {
        public static Kp2rChunk fromFile(String fileName) throws IOException {
            return new Kp2rChunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kp2rChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kp2rChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Kp2rChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.variation = this._io.readF4le();
        }
        private float variation;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2TrackChunkRouter _parent;
        public float variation() { return variation; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2TrackChunkRouter _parent() { return _parent; }
    }
    public static class KmteChunk extends KaitaiStruct {
        public static KmteChunk fromFile(String fileName) throws IOException {
            return new KmteChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KmteChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KmteChunk(KaitaiStream _io, W3Mdx.TexElement _parent) {
            this(_io, _parent, null);
        }

        public KmteChunk(KaitaiStream _io, W3Mdx.TexElement _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "f4");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.TexElement _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.TexElement _parent() { return _parent; }
    }
    public static class ChunkAtch extends KaitaiStruct {
        public static ChunkAtch fromFile(String fileName) throws IOException {
            return new ChunkAtch(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkAtch(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkAtch(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkAtch(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.attachment = new ArrayList<Attachment>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.attachment.add(new Attachment(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<Attachment> attachment;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Attachment> attachment() { return attachment; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class Sequence extends KaitaiStruct {
        public static Sequence fromFile(String fileName) throws IOException {
            return new Sequence(new ByteBufferKaitaiStream(fileName));
        }

        public Sequence(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sequence(KaitaiStream _io, W3Mdx.ChunkSeqs _parent) {
            this(_io, _parent, null);
        }

        public Sequence(KaitaiStream _io, W3Mdx.ChunkSeqs _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new String(this._io.readBytes(80), Charset.forName("UTF-8"));
            this.interval = new ArrayList<Long>();
            for (int i = 0; i < 2; i++) {
                this.interval.add(this._io.readU4le());
            }
            this.moveSpeed = this._io.readF4le();
            this.flags = this._io.readU4le();
            this.rarity = this._io.readF4le();
            this.syncPoint = this._io.readU4le();
            this.extent = new Extent(this._io, this, _root);
        }
        private String name;
        private ArrayList<Long> interval;
        private float moveSpeed;
        private long flags;
        private float rarity;
        private long syncPoint;
        private Extent extent;
        private W3Mdx _root;
        private W3Mdx.ChunkSeqs _parent;
        public String name() { return name; }
        public ArrayList<Long> interval() { return interval; }
        public float moveSpeed() { return moveSpeed; }
        public long flags() { return flags; }
        public float rarity() { return rarity; }
        public long syncPoint() { return syncPoint; }
        public Extent extent() { return extent; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkSeqs _parent() { return _parent; }
    }
    public static class TexsTex extends KaitaiStruct {
        public static TexsTex fromFile(String fileName) throws IOException {
            return new TexsTex(new ByteBufferKaitaiStream(fileName));
        }

        public TexsTex(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TexsTex(KaitaiStream _io, W3Mdx.ChunkTexs _parent) {
            this(_io, _parent, null);
        }

        public TexsTex(KaitaiStream _io, W3Mdx.ChunkTexs _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
            this.path = new String(this._io.readBytes(260), Charset.forName("UTF-8"));
            this.flags = this._io.readU4le();
        }
        private long id;
        private String path;
        private long flags;
        private W3Mdx _root;
        private W3Mdx.ChunkTexs _parent;
        public long id() { return id; }
        public String path() { return path; }
        public long flags() { return flags; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkTexs _parent() { return _parent; }
    }
    public static class Error extends KaitaiStruct {
        public static Error fromFile(String fileName) throws IOException {
            return new Error(new ByteBufferKaitaiStream(fileName));
        }

        public Error(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Error(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Error(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.rest = new ArrayList<Integer>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.rest.add(this._io.readU1());
                    i++;
                }
            }
            this.more = new String(this._io.readBytes(100), Charset.forName("ASCII"));
        }
        private ArrayList<Integer> rest;
        private String more;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Integer> rest() { return rest; }
        public String more() { return more; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class VertexNormal extends KaitaiStruct {
        public static VertexNormal fromFile(String fileName) throws IOException {
            return new VertexNormal(new ByteBufferKaitaiStream(fileName));
        }

        public VertexNormal(KaitaiStream _io) {
            this(_io, null, null);
        }

        public VertexNormal(KaitaiStream _io, W3Mdx.GeosetPayload _parent) {
            this(_io, _parent, null);
        }

        public VertexNormal(KaitaiStream _io, W3Mdx.GeosetPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.value.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> value;
        private W3Mdx _root;
        private W3Mdx.GeosetPayload _parent;
        public ArrayList<Float> value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.GeosetPayload _parent() { return _parent; }
    }
    public static class LayerPayload extends KaitaiStruct {

        public LayerPayload(KaitaiStream _io, long index) {
            this(_io, null, null, index);
        }

        public LayerPayload(KaitaiStream _io, W3Mdx.Layer _parent, long index) {
            this(_io, _parent, null, index);
        }

        public LayerPayload(KaitaiStream _io, W3Mdx.Layer _parent, W3Mdx _root, long index) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.index = index;
            _read();
        }
        private void _read() {
            this.filterMode = this._io.readU4le();
            this.shadingFlags = this._io.readU4le();
            this.textureId = this._io.readU4le();
            this.textureAnimId = this._io.readU4le();
            this.textureCoordId = this._io.readU4le();
            this.alpha = this._io.readF4le();
            if (_root().chunk().get((int) 0).version() > 800) {
                this.emissiveGain = this._io.readF4le();
            }
            if (_root().chunk().get((int) 0).version() > 800) {
                this.fresnelColor = new ArrayList<Float>();
                for (int i = 0; i < 3; i++) {
                    this.fresnelColor.add(this._io.readF4le());
                }
            }
            if (_root().chunk().get((int) 0).version() > 800) {
                this.fresnelOpacity = this._io.readF4le();
            }
            if (_root().chunk().get((int) 0).version() > 800) {
                this.fresnelTeamColor = this._io.readF4le();
            }
            this.hd = this._io.readU4le();
            this.numTex = this._io.readU4le();
            this.texElement = new ArrayList<TexElement>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.texElement.add(new TexElement(this._io, this, _root));
                    i++;
                }
            }
        }
        private long filterMode;
        private long shadingFlags;
        private long textureId;
        private long textureAnimId;
        private long textureCoordId;
        private float alpha;
        private Float emissiveGain;
        private ArrayList<Float> fresnelColor;
        private Float fresnelOpacity;
        private Float fresnelTeamColor;
        private long hd;
        private long numTex;
        private ArrayList<TexElement> texElement;
        private long index;
        private W3Mdx _root;
        private W3Mdx.Layer _parent;
        public long filterMode() { return filterMode; }
        public long shadingFlags() { return shadingFlags; }
        public long textureId() { return textureId; }
        public long textureAnimId() { return textureAnimId; }
        public long textureCoordId() { return textureCoordId; }
        public float alpha() { return alpha; }
        public Float emissiveGain() { return emissiveGain; }
        public ArrayList<Float> fresnelColor() { return fresnelColor; }
        public Float fresnelOpacity() { return fresnelOpacity; }
        public Float fresnelTeamColor() { return fresnelTeamColor; }
        public long hd() { return hd; }
        public long numTex() { return numTex; }
        public ArrayList<TexElement> texElement() { return texElement; }
        public long index() { return index; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.Layer _parent() { return _parent; }
    }
    public static class TrackChunk extends KaitaiStruct {

        public TrackChunk(KaitaiStream _io, String valueType) {
            this(_io, null, null, valueType);
        }

        public TrackChunk(KaitaiStream _io, KaitaiStruct _parent, String valueType) {
            this(_io, _parent, null, valueType);
        }

        public TrackChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root, String valueType) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.valueType = valueType;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            this.numTrack = this._io.readU4le();
            this.interpolationType = this._io.readU4le();
            this.globalSequenceId = this._io.readU4le();
            this.track = new ArrayList<Track>();
            for (int i = 0; i < numTrack(); i++) {
                this.track.add(new Track(this._io, this, _root, valueType(), interpolationType()));
            }
        }
        private W3id magic;
        private long numTrack;
        private long interpolationType;
        private long globalSequenceId;
        private ArrayList<Track> track;
        private String valueType;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public W3id magic() { return magic; }
        public long numTrack() { return numTrack; }
        public long interpolationType() { return interpolationType; }
        public long globalSequenceId() { return globalSequenceId; }
        public ArrayList<Track> track() { return track; }
        public String valueType() { return valueType; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KmtfChunk extends KaitaiStruct {
        public static KmtfChunk fromFile(String fileName) throws IOException {
            return new KmtfChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KmtfChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KmtfChunk(KaitaiStream _io, W3Mdx.TexElement _parent) {
            this(_io, _parent, null);
        }

        public KmtfChunk(KaitaiStream _io, W3Mdx.TexElement _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "u4");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.TexElement _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.TexElement _parent() { return _parent; }
    }
    public static class ChunkRouter extends KaitaiStruct {
        public static ChunkRouter fromFile(String fileName) throws IOException {
            return new ChunkRouter(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkRouter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkRouter(KaitaiStream _io, W3Mdx _parent) {
            this(_io, _parent, null);
        }

        public ChunkRouter(KaitaiStream _io, W3Mdx _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            this.size = this._io.readU4le();
            switch (magic().value()) {
            case "GEOS": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkGeos(_io__raw_chunkData, this, _root);
                break;
            }
            case "CAMS": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkCams(_io__raw_chunkData, this, _root);
                break;
            }
            case "HELP": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkHelp(_io__raw_chunkData, this, _root);
                break;
            }
            case "TEXS": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkTexs(_io__raw_chunkData, this, _root);
                break;
            }
            case "PRE2": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkPre2(_io__raw_chunkData, this, _root);
                break;
            }
            case "VERS": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkVers(_io__raw_chunkData, this, _root);
                break;
            }
            case "PIVT": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkPivt(_io__raw_chunkData, this, _root);
                break;
            }
            case "MTLS": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkMtls(_io__raw_chunkData, this, _root, size());
                break;
            }
            case "ATCH": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkAtch(_io__raw_chunkData, this, _root);
                break;
            }
            case "SEQS": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkSeqs(_io__raw_chunkData, this, _root);
                break;
            }
            case "EVTS": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkEvts(_io__raw_chunkData, this, _root);
                break;
            }
            case "LITE": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkLite(_io__raw_chunkData, this, _root);
                break;
            }
            case "BONE": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkBone(_io__raw_chunkData, this, _root);
                break;
            }
            case "GEOA": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkGeoa(_io__raw_chunkData, this, _root);
                break;
            }
            case "MODL": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkModl(_io__raw_chunkData, this, _root);
                break;
            }
            case "GLBS": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkGlbs(_io__raw_chunkData, this, _root);
                break;
            }
            case "CLID": {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new ChunkClid(_io__raw_chunkData, this, _root);
                break;
            }
            default: {
                this._raw_chunkData = this._io.readBytes(size());
                KaitaiStream _io__raw_chunkData = new ByteBufferKaitaiStream(_raw_chunkData);
                this.chunkData = new Error(_io__raw_chunkData, this, _root);
                break;
            }
            }
        }
        private Integer version;
        public Integer version() {
            if (this.version != null)
                return this.version;
            int _tmp = (int) (800);
            this.version = _tmp;
            return this.version;
        }
        private W3id magic;
        private long size;
        private KaitaiStruct chunkData;
        private W3Mdx _root;
        private W3Mdx _parent;
        private byte[] _raw_chunkData;
        public W3id magic() { return magic; }
        public long size() { return size; }
        public KaitaiStruct chunkData() { return chunkData; }
        public W3Mdx _root() { return _root; }
        public W3Mdx _parent() { return _parent; }
        public byte[] _raw_chunkData() { return _raw_chunkData; }
    }
    public static class ChunkSeqs extends KaitaiStruct {
        public static ChunkSeqs fromFile(String fileName) throws IOException {
            return new ChunkSeqs(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkSeqs(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkSeqs(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkSeqs(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sequence = new ArrayList<Sequence>();
            for (int i = 0; i < (_parent().size() / 132); i++) {
                this.sequence.add(new Sequence(this._io, this, _root));
            }
        }
        private ArrayList<Sequence> sequence;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Sequence> sequence() { return sequence; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class Kp2sChunk extends KaitaiStruct {
        public static Kp2sChunk fromFile(String fileName) throws IOException {
            return new Kp2sChunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kp2sChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kp2sChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Kp2sChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.speed = this._io.readF4le();
        }
        private float speed;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2TrackChunkRouter _parent;
        public float speed() { return speed; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2TrackChunkRouter _parent() { return _parent; }
    }
    public static class ChunkClid extends KaitaiStruct {
        public static ChunkClid fromFile(String fileName) throws IOException {
            return new ChunkClid(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkClid(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkClid(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkClid(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.collisionShape = new ArrayList<CollisionShape>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.collisionShape.add(new CollisionShape(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<CollisionShape> collisionShape;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<CollisionShape> collisionShape() { return collisionShape; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class ChunkLite extends KaitaiStruct {
        public static ChunkLite fromFile(String fileName) throws IOException {
            return new ChunkLite(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkLite(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkLite(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkLite(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.light = new ArrayList<Light>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.light.add(new Light(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<Light> light;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Light> light() { return light; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class NodePayload extends KaitaiStruct {
        public static NodePayload fromFile(String fileName) throws IOException {
            return new NodePayload(new ByteBufferKaitaiStream(fileName));
        }

        public NodePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NodePayload(KaitaiStream _io, W3Mdx.Node _parent) {
            this(_io, _parent, null);
        }

        public NodePayload(KaitaiStream _io, W3Mdx.Node _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new String(this._io.readBytes(80), Charset.forName("UTF-8"));
            this.objectId = this._io.readU4le();
            this.parentId = this._io.readU4le();
            this.flags = this._io.readU4le();
            this.trackChunk = new ArrayList<NodeTrackRouter>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.trackChunk.add(new NodeTrackRouter(this._io, this, _root));
                    i++;
                }
            }
        }
        private String name;
        private long objectId;
        private long parentId;
        private long flags;
        private ArrayList<NodeTrackRouter> trackChunk;
        private W3Mdx _root;
        private W3Mdx.Node _parent;
        public String name() { return name; }
        public long objectId() { return objectId; }
        public long parentId() { return parentId; }
        public long flags() { return flags; }
        public ArrayList<NodeTrackRouter> trackChunk() { return trackChunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.Node _parent() { return _parent; }
    }
    public static class KtarChunk extends KaitaiStruct {
        public static KtarChunk fromFile(String fileName) throws IOException {
            return new KtarChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KtarChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KtarChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KtarChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.rotation = new ArrayList<Float>();
            for (int i = 0; i < 4; i++) {
                this.rotation.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> rotation;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public ArrayList<Float> rotation() { return rotation; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class TextureCoordinate extends KaitaiStruct {
        public static TextureCoordinate fromFile(String fileName) throws IOException {
            return new TextureCoordinate(new ByteBufferKaitaiStream(fileName));
        }

        public TextureCoordinate(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TextureCoordinate(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public TextureCoordinate(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
        }
        private float x;
        private float y;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float x() { return x; }
        public float y() { return y; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Geoset extends KaitaiStruct {
        public static Geoset fromFile(String fileName) throws IOException {
            return new Geoset(new ByteBufferKaitaiStream(fileName));
        }

        public Geoset(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Geoset(KaitaiStream _io, W3Mdx.ChunkGeos _parent) {
            this(_io, _parent, null);
        }

        public Geoset(KaitaiStream _io, W3Mdx.ChunkGeos _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_geosetPayload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_geosetPayload = new ByteBufferKaitaiStream(_raw_geosetPayload);
            this.geosetPayload = new GeosetPayload(_io__raw_geosetPayload, this, _root);
        }
        private long inclusiveSize;
        private GeosetPayload geosetPayload;
        private W3Mdx _root;
        private W3Mdx.ChunkGeos _parent;
        private byte[] _raw_geosetPayload;
        public long inclusiveSize() { return inclusiveSize; }
        public GeosetPayload geosetPayload() { return geosetPayload; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkGeos _parent() { return _parent; }
        public byte[] _raw_geosetPayload() { return _raw_geosetPayload; }
    }
    public static class GeosetPayload extends KaitaiStruct {
        public static GeosetPayload fromFile(String fileName) throws IOException {
            return new GeosetPayload(new ByteBufferKaitaiStream(fileName));
        }

        public GeosetPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GeosetPayload(KaitaiStream _io, W3Mdx.Geoset _parent) {
            this(_io, _parent, null);
        }

        public GeosetPayload(KaitaiStream _io, W3Mdx.Geoset _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.vrtxMagic = new W3id(this._io);
            this.numVertexPosition = this._io.readU4le();
            this.vertexPosition = new ArrayList<VertexPosition>();
            for (int i = 0; i < numVertexPosition(); i++) {
                this.vertexPosition.add(new VertexPosition(this._io, this, _root));
            }
            this.nrmsMagic = new W3id(this._io);
            this.numVertexNormal = this._io.readU4le();
            this.vertexNormal = new ArrayList<VertexNormal>();
            for (int i = 0; i < numVertexNormal(); i++) {
                this.vertexNormal.add(new VertexNormal(this._io, this, _root));
            }
            this.ptypMagic = new W3id(this._io);
            this.numFaceTypeGroup = this._io.readU4le();
            this.faceTypeGroup = new ArrayList<Long>();
            for (int i = 0; i < numFaceTypeGroup(); i++) {
                this.faceTypeGroup.add(this._io.readU4le());
            }
            this.pcntMagic = new W3id(this._io);
            this.numFaceGroup = this._io.readU4le();
            this.faceGroup = new ArrayList<Long>();
            for (int i = 0; i < numFaceGroup(); i++) {
                this.faceGroup.add(this._io.readU4le());
            }
            this.pvtxMagic = new W3id(this._io);
            this.numFace = this._io.readU4le();
            this.face = new ArrayList<Integer>();
            for (int i = 0; i < numFace(); i++) {
                this.face.add(this._io.readU2le());
            }
            this.gndxMagic = new W3id(this._io);
            this.numVertexGroup = this._io.readU4le();
            this.vertexGroup = new ArrayList<Integer>();
            for (int i = 0; i < numVertexGroup(); i++) {
                this.vertexGroup.add(this._io.readU1());
            }
            this.mtgcMagic = new W3id(this._io);
            this.numMatrixGroup = this._io.readU4le();
            this.matrixGroup = new ArrayList<Long>();
            for (int i = 0; i < numMatrixGroup(); i++) {
                this.matrixGroup.add(this._io.readU4le());
            }
            this.matsMagic = new W3id(this._io);
            this.numMatrixIndex = this._io.readU4le();
            this.matrixIndex = new ArrayList<Long>();
            for (int i = 0; i < numMatrixIndex(); i++) {
                this.matrixIndex.add(this._io.readU4le());
            }
            this.materialId = new W3id(this._io);
            this.selectionGroup = this._io.readU4le();
            this.selectionFlags = this._io.readU4le();
            if (_root().chunk().get((int) 0).version() > 800) {
                this.lod = this._io.readU4le();
            }
            if (_root().chunk().get((int) 0).version() > 800) {
                this.lodName = new String(this._io.readBytes(80), Charset.forName("UTF-8"));
            }
            this.extent = new Extent(this._io, this, _root);
            this.numSequenceExtent = this._io.readU4le();
            this.sequenceExtent = new ArrayList<Extent>();
            for (int i = 0; i < numSequenceExtent(); i++) {
                this.sequenceExtent.add(new Extent(this._io, this, _root));
            }
            if ( ((_root().chunk().get((int) 0).version() > 800) && (_root().chunk().get((int) 0).version() < 1200)) ) {
                this.tangentChunk = new TangentChunk(this._io, this, _root);
            }
            if ( ((_root().chunk().get((int) 0).version() > 800) && (_root().chunk().get((int) 0).version() < 1200)) ) {
                this.skinChunk = new SkinChunk(this._io, this, _root);
            }
        }
        private W3id vrtxMagic;
        private long numVertexPosition;
        private ArrayList<VertexPosition> vertexPosition;
        private W3id nrmsMagic;
        private long numVertexNormal;
        private ArrayList<VertexNormal> vertexNormal;
        private W3id ptypMagic;
        private long numFaceTypeGroup;
        private ArrayList<Long> faceTypeGroup;
        private W3id pcntMagic;
        private long numFaceGroup;
        private ArrayList<Long> faceGroup;
        private W3id pvtxMagic;
        private long numFace;
        private ArrayList<Integer> face;
        private W3id gndxMagic;
        private long numVertexGroup;
        private ArrayList<Integer> vertexGroup;
        private W3id mtgcMagic;
        private long numMatrixGroup;
        private ArrayList<Long> matrixGroup;
        private W3id matsMagic;
        private long numMatrixIndex;
        private ArrayList<Long> matrixIndex;
        private W3id materialId;
        private long selectionGroup;
        private long selectionFlags;
        private Long lod;
        private String lodName;
        private Extent extent;
        private long numSequenceExtent;
        private ArrayList<Extent> sequenceExtent;
        private TangentChunk tangentChunk;
        private SkinChunk skinChunk;
        private W3Mdx _root;
        private W3Mdx.Geoset _parent;
        public W3id vrtxMagic() { return vrtxMagic; }
        public long numVertexPosition() { return numVertexPosition; }
        public ArrayList<VertexPosition> vertexPosition() { return vertexPosition; }
        public W3id nrmsMagic() { return nrmsMagic; }
        public long numVertexNormal() { return numVertexNormal; }
        public ArrayList<VertexNormal> vertexNormal() { return vertexNormal; }
        public W3id ptypMagic() { return ptypMagic; }
        public long numFaceTypeGroup() { return numFaceTypeGroup; }
        public ArrayList<Long> faceTypeGroup() { return faceTypeGroup; }
        public W3id pcntMagic() { return pcntMagic; }
        public long numFaceGroup() { return numFaceGroup; }
        public ArrayList<Long> faceGroup() { return faceGroup; }
        public W3id pvtxMagic() { return pvtxMagic; }
        public long numFace() { return numFace; }
        public ArrayList<Integer> face() { return face; }
        public W3id gndxMagic() { return gndxMagic; }
        public long numVertexGroup() { return numVertexGroup; }
        public ArrayList<Integer> vertexGroup() { return vertexGroup; }
        public W3id mtgcMagic() { return mtgcMagic; }
        public long numMatrixGroup() { return numMatrixGroup; }
        public ArrayList<Long> matrixGroup() { return matrixGroup; }
        public W3id matsMagic() { return matsMagic; }
        public long numMatrixIndex() { return numMatrixIndex; }
        public ArrayList<Long> matrixIndex() { return matrixIndex; }
        public W3id materialId() { return materialId; }
        public long selectionGroup() { return selectionGroup; }
        public long selectionFlags() { return selectionFlags; }
        public Long lod() { return lod; }
        public String lodName() { return lodName; }
        public Extent extent() { return extent; }
        public long numSequenceExtent() { return numSequenceExtent; }
        public ArrayList<Extent> sequenceExtent() { return sequenceExtent; }
        public TangentChunk tangentChunk() { return tangentChunk; }
        public SkinChunk skinChunk() { return skinChunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.Geoset _parent() { return _parent; }
    }
    public static class KrvsChunk extends KaitaiStruct {
        public static KrvsChunk fromFile(String fileName) throws IOException {
            return new KrvsChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KrvsChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KrvsChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KrvsChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.visibility = this._io.readF4le();
        }
        private float visibility;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float visibility() { return visibility; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ChunkHelp extends KaitaiStruct {
        public static ChunkHelp fromFile(String fileName) throws IOException {
            return new ChunkHelp(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkHelp(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkHelp(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkHelp(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.helper = new ArrayList<Helper>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.helper.add(new Helper(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<Helper> helper;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<Helper> helper() { return helper; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class Attachment extends KaitaiStruct {
        public static Attachment fromFile(String fileName) throws IOException {
            return new Attachment(new ByteBufferKaitaiStream(fileName));
        }

        public Attachment(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Attachment(KaitaiStream _io, W3Mdx.ChunkAtch _parent) {
            this(_io, _parent, null);
        }

        public Attachment(KaitaiStream _io, W3Mdx.ChunkAtch _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_attachmentPayload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_attachmentPayload = new ByteBufferKaitaiStream(_raw_attachmentPayload);
            this.attachmentPayload = new AttachmentPayload(_io__raw_attachmentPayload, this, _root);
        }
        private long inclusiveSize;
        private AttachmentPayload attachmentPayload;
        private W3Mdx _root;
        private W3Mdx.ChunkAtch _parent;
        private byte[] _raw_attachmentPayload;
        public long inclusiveSize() { return inclusiveSize; }
        public AttachmentPayload attachmentPayload() { return attachmentPayload; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkAtch _parent() { return _parent; }
        public byte[] _raw_attachmentPayload() { return _raw_attachmentPayload; }
    }
    public static class KpplChunk extends KaitaiStruct {
        public static KpplChunk fromFile(String fileName) throws IOException {
            return new KpplChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KpplChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KpplChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KpplChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.lifespan = this._io.readF4le();
        }
        private float lifespan;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float lifespan() { return lifespan; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KralChunk extends KaitaiStruct {
        public static KralChunk fromFile(String fileName) throws IOException {
            return new KralChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KralChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KralChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KralChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.alpha = this._io.readF4le();
        }
        private float alpha;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float alpha() { return alpha; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ChunkGeoa extends KaitaiStruct {
        public static ChunkGeoa fromFile(String fileName) throws IOException {
            return new ChunkGeoa(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkGeoa(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkGeoa(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkGeoa(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.geosetAnim = new ArrayList<GeosetAnim>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.geosetAnim.add(new GeosetAnim(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<GeosetAnim> geosetAnim;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<GeosetAnim> geosetAnim() { return geosetAnim; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class Helper extends KaitaiStruct {
        public static Helper fromFile(String fileName) throws IOException {
            return new Helper(new ByteBufferKaitaiStream(fileName));
        }

        public Helper(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Helper(KaitaiStream _io, W3Mdx.ChunkHelp _parent) {
            this(_io, _parent, null);
        }

        public Helper(KaitaiStream _io, W3Mdx.ChunkHelp _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.node = new Node(this._io, this, _root);
        }
        private Node node;
        private W3Mdx _root;
        private W3Mdx.ChunkHelp _parent;
        public Node node() { return node; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkHelp _parent() { return _parent; }
    }
    public static class Material extends KaitaiStruct {

        public Material(KaitaiStream _io, long index) {
            this(_io, null, null, index);
        }

        public Material(KaitaiStream _io, W3Mdx.ChunkMtls _parent, long index) {
            this(_io, _parent, null, index);
        }

        public Material(KaitaiStream _io, W3Mdx.ChunkMtls _parent, W3Mdx _root, long index) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.index = index;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_payload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_payload = new ByteBufferKaitaiStream(_raw_payload);
            this.payload = new MaterialPayload(_io__raw_payload, this, _root, index());
        }
        private long inclusiveSize;
        private MaterialPayload payload;
        private long index;
        private W3Mdx _root;
        private W3Mdx.ChunkMtls _parent;
        private byte[] _raw_payload;
        public long inclusiveSize() { return inclusiveSize; }
        public MaterialPayload payload() { return payload; }
        public long index() { return index; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkMtls _parent() { return _parent; }
        public byte[] _raw_payload() { return _raw_payload; }
    }
    public static class Kp2nChunk extends KaitaiStruct {
        public static Kp2nChunk fromFile(String fileName) throws IOException {
            return new Kp2nChunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kp2nChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kp2nChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Kp2nChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.length = this._io.readF4le();
        }
        private float length;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2TrackChunkRouter _parent;
        public float length() { return length; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2TrackChunkRouter _parent() { return _parent; }
    }
    public static class Node extends KaitaiStruct {
        public static Node fromFile(String fileName) throws IOException {
            return new Node(new ByteBufferKaitaiStream(fileName));
        }

        public Node(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Node(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Node(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_nodePayload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_nodePayload = new ByteBufferKaitaiStream(_raw_nodePayload);
            this.nodePayload = new NodePayload(_io__raw_nodePayload, this, _root);
        }
        private long inclusiveSize;
        private NodePayload nodePayload;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        private byte[] _raw_nodePayload;
        public long inclusiveSize() { return inclusiveSize; }
        public NodePayload nodePayload() { return nodePayload; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
        public byte[] _raw_nodePayload() { return _raw_nodePayload; }
    }
    public static class AttachmentTrackRouter extends KaitaiStruct {
        public static AttachmentTrackRouter fromFile(String fileName) throws IOException {
            return new AttachmentTrackRouter(new ByteBufferKaitaiStream(fileName));
        }

        public AttachmentTrackRouter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public AttachmentTrackRouter(KaitaiStream _io, W3Mdx.AttachmentPayload _parent) {
            this(_io, _parent, null);
        }

        public AttachmentTrackRouter(KaitaiStream _io, W3Mdx.AttachmentPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            switch (magic().value()) {
            case "KATV": {
                this.chunk = new KatvChunk(this._io, this, _root);
                break;
            }
            }
        }
        private W3id magic;
        private KatvChunk chunk;
        private W3Mdx _root;
        private W3Mdx.AttachmentPayload _parent;
        public W3id magic() { return magic; }
        public KatvChunk chunk() { return chunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.AttachmentPayload _parent() { return _parent; }
    }
    public static class ChunkEvts extends KaitaiStruct {
        public static ChunkEvts fromFile(String fileName) throws IOException {
            return new ChunkEvts(new ByteBufferKaitaiStream(fileName));
        }

        public ChunkEvts(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChunkEvts(KaitaiStream _io, W3Mdx.ChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public ChunkEvts(KaitaiStream _io, W3Mdx.ChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.eventObject = new ArrayList<EventObject>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.eventObject.add(new EventObject(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<EventObject> eventObject;
        private W3Mdx _root;
        private W3Mdx.ChunkRouter _parent;
        public ArrayList<EventObject> eventObject() { return eventObject; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkRouter _parent() { return _parent; }
    }
    public static class KrcoChunk extends KaitaiStruct {
        public static KrcoChunk fromFile(String fileName) throws IOException {
            return new KrcoChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KrcoChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KrcoChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KrcoChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.color = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.color.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> color;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public ArrayList<Float> color() { return color; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class F44 extends KaitaiStruct {
        public static F44 fromFile(String fileName) throws IOException {
            return new F44(new ByteBufferKaitaiStream(fileName));
        }

        public F44(KaitaiStream _io) {
            this(_io, null, null);
        }

        public F44(KaitaiStream _io, W3Mdx.Track _parent) {
            this(_io, _parent, null);
        }

        public F44(KaitaiStream _io, W3Mdx.Track _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new ArrayList<Float>();
            for (int i = 0; i < 4; i++) {
                this.value.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> value;
        private W3Mdx _root;
        private W3Mdx.Track _parent;
        public ArrayList<Float> value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.Track _parent() { return _parent; }
    }
    public static class MaterialPayload extends KaitaiStruct {

        public MaterialPayload(KaitaiStream _io, long index) {
            this(_io, null, null, index);
        }

        public MaterialPayload(KaitaiStream _io, W3Mdx.Material _parent, long index) {
            this(_io, _parent, null, index);
        }

        public MaterialPayload(KaitaiStream _io, W3Mdx.Material _parent, W3Mdx _root, long index) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.index = index;
            _read();
        }
        private void _read() {
            this.priorityPlane = this._io.readU4le();
            this.flags = this._io.readU4le();
            if ( ((_root().chunk().get((int) 0).version() > 800) && (_root().chunk().get((int) 0).version() < 1100)) ) {
                this.shader = new String(this._io.readBytes(80), Charset.forName("UTF-8"));
            }
            this.laysMagic = new W3id(this._io);
            this.numLayer = this._io.readU4le();
            this.layer = new ArrayList<Layer>();
            for (int i = 0; i < numLayer(); i++) {
                this.layer.add(new Layer(this._io, this, _root, index()));
            }
        }
        private long priorityPlane;
        private long flags;
        private String shader;
        private W3id laysMagic;
        private long numLayer;
        private ArrayList<Layer> layer;
        private long index;
        private W3Mdx _root;
        private W3Mdx.Material _parent;
        public long priorityPlane() { return priorityPlane; }
        public long flags() { return flags; }
        public String shader() { return shader; }
        public W3id laysMagic() { return laysMagic; }
        public long numLayer() { return numLayer; }
        public ArrayList<Layer> layer() { return layer; }
        public long index() { return index; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.Material _parent() { return _parent; }
    }
    public static class KcrlChunk extends KaitaiStruct {
        public static KcrlChunk fromFile(String fileName) throws IOException {
            return new KcrlChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KcrlChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KcrlChunk(KaitaiStream _io, W3Mdx.CameraTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KcrlChunk(KaitaiStream _io, W3Mdx.CameraTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.rotation = this._io.readF4le();
        }
        private float rotation;
        private W3Mdx _root;
        private W3Mdx.CameraTrackChunkRouter _parent;
        public float rotation() { return rotation; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.CameraTrackChunkRouter _parent() { return _parent; }
    }
    public static class KplnChunk extends KaitaiStruct {
        public static KplnChunk fromFile(String fileName) throws IOException {
            return new KplnChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KplnChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KplnChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KplnChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.longitude = this._io.readF4le();
        }
        private float longitude;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float longitude() { return longitude; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class TexElement extends KaitaiStruct {
        public static TexElement fromFile(String fileName) throws IOException {
            return new TexElement(new ByteBufferKaitaiStream(fileName));
        }

        public TexElement(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TexElement(KaitaiStream _io, W3Mdx.LayerPayload _parent) {
            this(_io, _parent, null);
        }

        public TexElement(KaitaiStream _io, W3Mdx.LayerPayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.discriminator = this._io.readBytes(4);
            switch (new String(discriminator(), Charset.forName("ASCII"))) {
            case "KMTF": {
                this.payload = new KmtfChunk(this._io, this, _root);
                break;
            }
            case "KMTA": {
                this.payload = new KmtaChunk(this._io, this, _root);
                break;
            }
            case "KMTE": {
                this.payload = new KmteChunk(this._io, this, _root);
                break;
            }
            default: {
                this.payload = (Object) (this._io.readU4le());
                break;
            }
            }
        }
        private Integer id;
        public Integer id() {
            if (this.id != null)
                return this.id;
            if (discriminator()[0] != 75) {
                int _tmp = (int) (discriminator()[0]);
                this.id = _tmp;
            }
            return this.id;
        }
        private Object index;
        public Object index() {
            if (this.index != null)
                return this.index;
            if (discriminator()[0] != 75) {
                this.index = payload();
            }
            return this.index;
        }
        private String trackMagic;
        public String trackMagic() {
            if (this.trackMagic != null)
                return this.trackMagic;
            if (discriminator()[0] == 75) {
                this.trackMagic = new String(discriminator(), Charset.forName("ASCII"));
            }
            return this.trackMagic;
        }
        private byte[] discriminator;
        private Object payload;
        private W3Mdx _root;
        private W3Mdx.LayerPayload _parent;
        public byte[] discriminator() { return discriminator; }
        public Object payload() { return payload; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.LayerPayload _parent() { return _parent; }
    }
    public static class FaceEffect extends KaitaiStruct {
        public static FaceEffect fromFile(String fileName) throws IOException {
            return new FaceEffect(new ByteBufferKaitaiStream(fileName));
        }

        public FaceEffect(KaitaiStream _io) {
            this(_io, null, null);
        }

        public FaceEffect(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public FaceEffect(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.target = new String(this._io.readBytes(80), Charset.forName("UTF-8"));
            this.path = new String(this._io.readBytes(260), Charset.forName("UTF-8"));
        }
        private String target;
        private String path;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public String target() { return target; }
        public String path() { return path; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Kp2vChunk extends KaitaiStruct {
        public static Kp2vChunk fromFile(String fileName) throws IOException {
            return new Kp2vChunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kp2vChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kp2vChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Kp2vChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.visibility = this._io.readF4le();
        }
        private float visibility;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2TrackChunkRouter _parent;
        public float visibility() { return visibility; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2TrackChunkRouter _parent() { return _parent; }
    }
    public static class KrtxChunk extends KaitaiStruct {
        public static KrtxChunk fromFile(String fileName) throws IOException {
            return new KrtxChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KrtxChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KrtxChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KrtxChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.textureSlot = this._io.readU4le();
        }
        private long textureSlot;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public long textureSlot() { return textureSlot; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KppaChunk extends KaitaiStruct {
        public static KppaChunk fromFile(String fileName) throws IOException {
            return new KppaChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KppaChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KppaChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KppaChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.alpha = this._io.readF4le();
        }
        private float alpha;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float alpha() { return alpha; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KpelChunk extends KaitaiStruct {
        public static KpelChunk fromFile(String fileName) throws IOException {
            return new KpelChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KpelChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KpelChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KpelChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.lifespan = this._io.readF4le();
        }
        private float lifespan;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float lifespan() { return lifespan; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KfcaChunk extends KaitaiStruct {
        public static KfcaChunk fromFile(String fileName) throws IOException {
            return new KfcaChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KfcaChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KfcaChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KfcaChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.fresnelAlpha = this._io.readF4le();
        }
        private float fresnelAlpha;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float fresnelAlpha() { return fresnelAlpha; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Light extends KaitaiStruct {
        public static Light fromFile(String fileName) throws IOException {
            return new Light(new ByteBufferKaitaiStream(fileName));
        }

        public Light(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Light(KaitaiStream _io, W3Mdx.ChunkLite _parent) {
            this(_io, _parent, null);
        }

        public Light(KaitaiStream _io, W3Mdx.ChunkLite _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this._raw_lightPayload = this._io.readBytes((inclusiveSize() - 4));
            KaitaiStream _io__raw_lightPayload = new ByteBufferKaitaiStream(_raw_lightPayload);
            this.lightPayload = new LightPayload(_io__raw_lightPayload, this, _root);
        }
        private long inclusiveSize;
        private LightPayload lightPayload;
        private W3Mdx _root;
        private W3Mdx.ChunkLite _parent;
        private byte[] _raw_lightPayload;
        public long inclusiveSize() { return inclusiveSize; }
        public LightPayload lightPayload() { return lightPayload; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkLite _parent() { return _parent; }
        public byte[] _raw_lightPayload() { return _raw_lightPayload; }
    }
    public static class KctrChunk extends KaitaiStruct {
        public static KctrChunk fromFile(String fileName) throws IOException {
            return new KctrChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KctrChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KctrChunk(KaitaiStream _io, W3Mdx.CameraTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KctrChunk(KaitaiStream _io, W3Mdx.CameraTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.translation = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.translation.add(this._io.readF4le());
            }
        }
        private ArrayList<Float> translation;
        private W3Mdx _root;
        private W3Mdx.CameraTrackChunkRouter _parent;
        public ArrayList<Float> translation() { return translation; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.CameraTrackChunkRouter _parent() { return _parent; }
    }
    public static class CollisionShape extends KaitaiStruct {
        public static CollisionShape fromFile(String fileName) throws IOException {
            return new CollisionShape(new ByteBufferKaitaiStream(fileName));
        }

        public CollisionShape(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CollisionShape(KaitaiStream _io, W3Mdx.ChunkClid _parent) {
            this(_io, _parent, null);
        }

        public CollisionShape(KaitaiStream _io, W3Mdx.ChunkClid _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.node = new Node(this._io, this, _root);
            this.type = this._io.readU4le();
            this.vertex = new ArrayList<Float>();
            for (int i = 0; i < 3; i++) {
                this.vertex.add(this._io.readF4le());
            }
            if ( ((type() == 2) || (type() == 3)) ) {
                this.radius = this._io.readF4le();
            }
        }
        private Node node;
        private long type;
        private ArrayList<Float> vertex;
        private Float radius;
        private W3Mdx _root;
        private W3Mdx.ChunkClid _parent;
        public Node node() { return node; }
        public long type() { return type; }
        public ArrayList<Float> vertex() { return vertex; }
        public Float radius() { return radius; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ChunkClid _parent() { return _parent; }
    }
    public static class KgaoChunk extends KaitaiStruct {
        public static KgaoChunk fromFile(String fileName) throws IOException {
            return new KgaoChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KgaoChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KgaoChunk(KaitaiStream _io, W3Mdx.GeosetAnimTrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public KgaoChunk(KaitaiStream _io, W3Mdx.GeosetAnimTrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "f4");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.GeosetAnimTrackChunkRouter _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.GeosetAnimTrackChunkRouter _parent() { return _parent; }
    }
    public static class KpegChunk extends KaitaiStruct {
        public static KpegChunk fromFile(String fileName) throws IOException {
            return new KpegChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KpegChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KpegChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KpegChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.gravity = this._io.readF4le();
        }
        private float gravity;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float gravity() { return gravity; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KrhbChunk extends KaitaiStruct {
        public static KrhbChunk fromFile(String fileName) throws IOException {
            return new KrhbChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KrhbChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KrhbChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KrhbChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.heightBelow = this._io.readF4le();
        }
        private float heightBelow;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float heightBelow() { return heightBelow; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class KppsChunk extends KaitaiStruct {
        public static KppsChunk fromFile(String fileName) throws IOException {
            return new KppsChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KppsChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KppsChunk(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public KppsChunk(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.speed = this._io.readF4le();
        }
        private float speed;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public float speed() { return speed; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Kp2lChunk extends KaitaiStruct {
        public static Kp2lChunk fromFile(String fileName) throws IOException {
            return new Kp2lChunk(new ByteBufferKaitaiStream(fileName));
        }

        public Kp2lChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Kp2lChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent) {
            this(_io, _parent, null);
        }

        public Kp2lChunk(KaitaiStream _io, W3Mdx.ParticleEmitter2TrackChunkRouter _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.latitude = this._io.readF4le();
        }
        private float latitude;
        private W3Mdx _root;
        private W3Mdx.ParticleEmitter2TrackChunkRouter _parent;
        public float latitude() { return latitude; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.ParticleEmitter2TrackChunkRouter _parent() { return _parent; }
    }
    public static class NodeTrackRouter extends KaitaiStruct {
        public static NodeTrackRouter fromFile(String fileName) throws IOException {
            return new NodeTrackRouter(new ByteBufferKaitaiStream(fileName));
        }

        public NodeTrackRouter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public NodeTrackRouter(KaitaiStream _io, W3Mdx.NodePayload _parent) {
            this(_io, _parent, null);
        }

        public NodeTrackRouter(KaitaiStream _io, W3Mdx.NodePayload _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magic = new W3id(this._io);
            switch (magic().value()) {
            case "KGTR": {
                this.chunk = new KgtrChunk(this._io, this, _root);
                break;
            }
            case "KGRT": {
                this.chunk = new KgrtChunk(this._io, this, _root);
                break;
            }
            case "KGSC": {
                this.chunk = new KgscChunk(this._io, this, _root);
                break;
            }
            }
        }
        private W3id magic;
        private KaitaiStruct chunk;
        private W3Mdx _root;
        private W3Mdx.NodePayload _parent;
        public W3id magic() { return magic; }
        public KaitaiStruct chunk() { return chunk; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.NodePayload _parent() { return _parent; }
    }
    public static class KmtaChunk extends KaitaiStruct {
        public static KmtaChunk fromFile(String fileName) throws IOException {
            return new KmtaChunk(new ByteBufferKaitaiStream(fileName));
        }

        public KmtaChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public KmtaChunk(KaitaiStream _io, W3Mdx.TexElement _parent) {
            this(_io, _parent, null);
        }

        public KmtaChunk(KaitaiStream _io, W3Mdx.TexElement _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new TrackChunk(this._io, this, _root, "f4");
        }
        private TrackChunk value;
        private W3Mdx _root;
        private W3Mdx.TexElement _parent;
        public TrackChunk value() { return value; }
        public W3Mdx _root() { return _root; }
        public W3Mdx.TexElement _parent() { return _parent; }
    }
    public static class TextureAnim extends KaitaiStruct {
        public static TextureAnim fromFile(String fileName) throws IOException {
            return new TextureAnim(new ByteBufferKaitaiStream(fileName));
        }

        public TextureAnim(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TextureAnim(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public TextureAnim(KaitaiStream _io, KaitaiStruct _parent, W3Mdx _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.inclusiveSize = this._io.readU4le();
            this.ktatChunk = new KtatChunk(this._io, this, _root);
            this.ktarChunk = new KtarChunk(this._io, this, _root);
            this.ktasChunk = new KtasChunk(this._io, this, _root);
        }
        private long inclusiveSize;
        private KtatChunk ktatChunk;
        private KtarChunk ktarChunk;
        private KtasChunk ktasChunk;
        private W3Mdx _root;
        private KaitaiStruct _parent;
        public long inclusiveSize() { return inclusiveSize; }
        public KtatChunk ktatChunk() { return ktatChunk; }
        public KtarChunk ktarChunk() { return ktarChunk; }
        public KtasChunk ktasChunk() { return ktasChunk; }
        public W3Mdx _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    private W3id magic;
    private ArrayList<ChunkRouter> chunk;
    private W3Mdx _root;
    private KaitaiStruct _parent;
    public W3id magic() { return magic; }
    public ArrayList<ChunkRouter> chunk() { return chunk; }
    public W3Mdx _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
