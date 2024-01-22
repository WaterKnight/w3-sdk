// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.script.gui.wtg.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3Wtg131 extends KaitaiStruct {
    public static W3Wtg131 fromFile(String fileName) throws IOException {
        return new W3Wtg131(new ByteBufferKaitaiStream(fileName));
    }

    public enum ElementType {
        HEADER(1),
        LIBRARY(2),
        CATEGORY(4),
        TRIG(8),
        COMMENT(16),
        SCRIPT(32),
        VAR(64);

        private final long id;
        ElementType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ElementType> byId = new HashMap<Long, ElementType>(7);
        static {
            for (ElementType e : ElementType.values())
                byId.put(e.id(), e);
        }
        public static ElementType byId(long id) { return byId.get(id); }
    }

    public enum ParamType {
        PRESET(0),
        VARIABLE(1),
        FUNCTION(2),
        STRING(3);

        private final long id;
        ParamType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ParamType> byId = new HashMap<Long, ParamType>(4);
        static {
            for (ParamType e : ParamType.values())
                byId.put(e.id(), e);
        }
        public static ParamType byId(long id) { return byId.get(id); }
    }

    public enum EcaType {
        EVENT(0),
        CONDITION(1),
        ACTION(2);

        private final long id;
        EcaType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, EcaType> byId = new HashMap<Long, EcaType>(3);
        static {
            for (EcaType e : EcaType.values())
                byId.put(e.id(), e);
        }
        public static EcaType byId(long id) { return byId.get(id); }
    }

    public W3Wtg131(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Wtg131(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Wtg131(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.magic = new W3id(this._io);
        this.magic2 = this._io.readU4le();
        this.version = this._io.readU4le();
        this.numHeader = this._io.readU4le();
        this.numRemovedHeader = this._io.readU4le();
        this.removedHeader = new ArrayList<RemovedHeader>();
        for (int i = 0; i < numRemovedHeader(); i++) {
            this.removedHeader.add(new RemovedHeader(this._io, this, _root));
        }
        this.numLibrary = this._io.readU4le();
        this.numRemovedLibrary = this._io.readU4le();
        this.removedLibrary = new ArrayList<RemovedLibrary>();
        for (int i = 0; i < numRemovedLibrary(); i++) {
            this.removedLibrary.add(new RemovedLibrary(this._io, this, _root));
        }
        this.numCategory = this._io.readU4le();
        this.numRemovedCategory = this._io.readU4le();
        this.removedCategory = new ArrayList<RemovedCategory>();
        for (int i = 0; i < numRemovedCategory(); i++) {
            this.removedCategory.add(new RemovedCategory(this._io, this, _root));
        }
        this.numTrig = this._io.readU4le();
        this.numRemovedTrig = this._io.readU4le();
        this.removedTrig = new ArrayList<RemovedTrig>();
        for (int i = 0; i < numRemovedTrig(); i++) {
            this.removedTrig.add(new RemovedTrig(this._io, this, _root));
        }
        this.numComment = this._io.readU4le();
        this.numRemovedComment = this._io.readU4le();
        this.removedComment = new ArrayList<RemovedComment>();
        for (int i = 0; i < numRemovedComment(); i++) {
            this.removedComment.add(new RemovedComment(this._io, this, _root));
        }
        this.numScript = this._io.readU4le();
        this.numRemovedScript = this._io.readU4le();
        this.removedScript = new ArrayList<RemovedScript>();
        for (int i = 0; i < numRemovedScript(); i++) {
            this.removedScript.add(new RemovedScript(this._io, this, _root));
        }
        this.numVarElement = this._io.readU4le();
        this.numRemovedVar = this._io.readU4le();
        this.removedVar = new ArrayList<RemovedVar>();
        for (int i = 0; i < numRemovedVar(); i++) {
            this.removedVar.add(new RemovedVar(this._io, this, _root));
        }
        this.unknown2 = this._io.readU4le();
        this.unknown3 = this._io.readU4le();
        this.trigVersion = this._io.readU4le();
        this.numExistingVar = this._io.readU4le();
        this.existingVar = new ArrayList<Var>();
        for (int i = 0; i < numExistingVar(); i++) {
            this.existingVar.add(new Var(this._io, this, _root));
        }
        this.numElement = this._io.readU4le();
        this.element = new ArrayList<Element>();
        for (int i = 0; i < numElement(); i++) {
            this.element.add(new Element(this._io, this, _root));
        }
    }
    public static class Param extends KaitaiStruct {
        public static Param fromFile(String fileName) throws IOException {
            return new Param(new ByteBufferKaitaiStream(fileName));
        }

        public Param(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Param(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Param(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.paramType = W3Wtg131.ParamType.byId(this._io.readU4le());
            this.value = new W3str(this._io);
            this.hasSub = this._io.readU4le();
            if (hasSub() != 0) {
                this.subParam = new SubParam(this._io, this, _root);
            }
            if ( ((_root().version() == 7) && (!(hasSub() == 0))) ) {
                this.unknown2 = this._io.readU4le();
            }
            this.isArray = this._io.readU4le();
            if (isArray() != 0) {
                this.arrayIndex = new Param(this._io, this, _root);
            }
        }
        private ParamType paramType;
        private W3str value;
        private long hasSub;
        private SubParam subParam;
        private Long unknown2;
        private long isArray;
        private Param arrayIndex;
        private W3Wtg131 _root;
        private KaitaiStruct _parent;
        public ParamType paramType() { return paramType; }
        public W3str value() { return value; }
        public long hasSub() { return hasSub; }
        public SubParam subParam() { return subParam; }
        public Long unknown2() { return unknown2; }
        public long isArray() { return isArray; }
        public Param arrayIndex() { return arrayIndex; }
        public W3Wtg131 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class RemovedComment extends KaitaiStruct {
        public static RemovedComment fromFile(String fileName) throws IOException {
            return new RemovedComment(new ByteBufferKaitaiStream(fileName));
        }

        public RemovedComment(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemovedComment(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public RemovedComment(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
        }
        private long id;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public long id() { return id; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class RemovedLibrary extends KaitaiStruct {
        public static RemovedLibrary fromFile(String fileName) throws IOException {
            return new RemovedLibrary(new ByteBufferKaitaiStream(fileName));
        }

        public RemovedLibrary(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemovedLibrary(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public RemovedLibrary(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
        }
        private long id;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public long id() { return id; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class RemovedScript extends KaitaiStruct {
        public static RemovedScript fromFile(String fileName) throws IOException {
            return new RemovedScript(new ByteBufferKaitaiStream(fileName));
        }

        public RemovedScript(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemovedScript(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public RemovedScript(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
        }
        private long id;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public long id() { return id; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class Eca extends KaitaiStruct {

        public Eca(KaitaiStream _io, boolean isChild, long numParam) {
            this(_io, null, null, isChild, numParam);
        }

        public Eca(KaitaiStream _io, KaitaiStruct _parent, boolean isChild, long numParam) {
            this(_io, _parent, null, isChild, numParam);
        }

        public Eca(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root, boolean isChild, long numParam) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.isChild = isChild;
            this.numParam = numParam;
            _read();
        }
        private void _read() {
            this.type = W3Wtg131.EcaType.byId(this._io.readU4le());
            if (isChild() == true) {
                this.groupNumber = this._io.readU4le();
            }
            this.func = new Func(this._io, this, _root);
            this.isEnabled = this._io.readU4le();
            this.param = new ArrayList<Param>();
            for (int i = 0; i < func().numParam(); i++) {
                this.param.add(new Param(this._io, this, _root));
            }
            this.numChildEca = this._io.readU4le();
            if (_root().version() == 7) {
                this.childEca = new ArrayList<Eca>();
                for (int i = 0; i < numChildEca(); i++) {
                    this.childEca.add(new Eca(this._io, this, _root, true, 0));
                }
            }
        }
        private EcaType type;
        private Long groupNumber;
        private Func func;
        private long isEnabled;
        private ArrayList<Param> param;
        private long numChildEca;
        private ArrayList<Eca> childEca;
        private boolean isChild;
        private long numParam;
        private W3Wtg131 _root;
        private KaitaiStruct _parent;
        public EcaType type() { return type; }
        public Long groupNumber() { return groupNumber; }
        public Func func() { return func; }
        public long isEnabled() { return isEnabled; }
        public ArrayList<Param> param() { return param; }
        public long numChildEca() { return numChildEca; }
        public ArrayList<Eca> childEca() { return childEca; }
        public boolean isChild() { return isChild; }
        public long numParam() { return numParam; }
        public W3Wtg131 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class RemovedVar extends KaitaiStruct {
        public static RemovedVar fromFile(String fileName) throws IOException {
            return new RemovedVar(new ByteBufferKaitaiStream(fileName));
        }

        public RemovedVar(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemovedVar(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public RemovedVar(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
        }
        private long id;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public long id() { return id; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class Element extends KaitaiStruct {
        public static Element fromFile(String fileName) throws IOException {
            return new Element(new ByteBufferKaitaiStream(fileName));
        }

        public Element(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Element(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public Element(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.type = W3Wtg131.ElementType.byId(this._io.readU4le());
            if ( ((type() == W3Wtg131.ElementType.HEADER) || (type() == W3Wtg131.ElementType.LIBRARY) || (type() == W3Wtg131.ElementType.CATEGORY)) ) {
                this.header = new Header(this._io, this, _root);
            }
            if (type() == W3Wtg131.ElementType.TRIG) {
                this.trig = new Trig(this._io, this, _root);
            }
            if (type() == W3Wtg131.ElementType.VAR) {
                this.var = new VarElement(this._io, this, _root);
            }
        }
        private ElementType type;
        private Header header;
        private Trig trig;
        private VarElement var;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public ElementType type() { return type; }
        public Header header() { return header; }
        public Trig trig() { return trig; }
        public VarElement var() { return var; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class VarElement extends KaitaiStruct {
        public static VarElement fromFile(String fileName) throws IOException {
            return new VarElement(new ByteBufferKaitaiStream(fileName));
        }

        public VarElement(KaitaiStream _io) {
            this(_io, null, null);
        }

        public VarElement(KaitaiStream _io, W3Wtg131.Element _parent) {
            this(_io, _parent, null);
        }

        public VarElement(KaitaiStream _io, W3Wtg131.Element _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
            this.name = new W3str(this._io);
            this.parentId = this._io.readU4le();
        }
        private long id;
        private W3str name;
        private long parentId;
        private W3Wtg131 _root;
        private W3Wtg131.Element _parent;
        public long id() { return id; }
        public W3str name() { return name; }
        public long parentId() { return parentId; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131.Element _parent() { return _parent; }
    }
    public static class RemovedTrig extends KaitaiStruct {
        public static RemovedTrig fromFile(String fileName) throws IOException {
            return new RemovedTrig(new ByteBufferKaitaiStream(fileName));
        }

        public RemovedTrig(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemovedTrig(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public RemovedTrig(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
        }
        private long id;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public long id() { return id; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class Trig extends KaitaiStruct {
        public static Trig fromFile(String fileName) throws IOException {
            return new Trig(new ByteBufferKaitaiStream(fileName));
        }

        public Trig(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Trig(KaitaiStream _io, W3Wtg131.Element _parent) {
            this(_io, _parent, null);
        }

        public Trig(KaitaiStream _io, W3Wtg131.Element _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.description = new W3str(this._io);
            if (_root().version() == 7) {
                this.isComment = this._io.readU4le();
            }
            this.id = this._io.readU4le();
            this.isActivated = this._io.readU4le();
            this.isCustomScript = this._io.readU4le();
            this.isInitiallyDisabled = this._io.readU4le();
            this.runOnInit = this._io.readU4le();
            this.parentId = this._io.readU4le();
            this.numEca = this._io.readU4le();
            this.eca = new ArrayList<Eca>();
            for (int i = 0; i < numEca(); i++) {
                this.eca.add(new Eca(this._io, this, _root, false, 2));
            }
        }
        private W3str name;
        private W3str description;
        private Long isComment;
        private long id;
        private long isActivated;
        private long isCustomScript;
        private long isInitiallyDisabled;
        private long runOnInit;
        private long parentId;
        private long numEca;
        private ArrayList<Eca> eca;
        private W3Wtg131 _root;
        private W3Wtg131.Element _parent;
        public W3str name() { return name; }
        public W3str description() { return description; }
        public Long isComment() { return isComment; }
        public long id() { return id; }
        public long isActivated() { return isActivated; }
        public long isCustomScript() { return isCustomScript; }
        public long isInitiallyDisabled() { return isInitiallyDisabled; }
        public long runOnInit() { return runOnInit; }
        public long parentId() { return parentId; }
        public long numEca() { return numEca; }
        public ArrayList<Eca> eca() { return eca; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131.Element _parent() { return _parent; }
    }
    public static class Comment extends KaitaiStruct {
        public static Comment fromFile(String fileName) throws IOException {
            return new Comment(new ByteBufferKaitaiStream(fileName));
        }

        public Comment(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Comment(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Comment(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.description = new W3str(this._io);
            if (_root().version() == 7) {
                this.isComment = this._io.readU4le();
            }
            this.id = this._io.readU4le();
            this.isActivated = this._io.readU4le();
            this.isCustomScript = this._io.readU4le();
            this.isInitiallyEnabled = this._io.readU4le();
            this.runOnInit = this._io.readU4le();
            this.parentId = this._io.readU4le();
        }
        private W3str name;
        private W3str description;
        private Long isComment;
        private long id;
        private long isActivated;
        private long isCustomScript;
        private long isInitiallyEnabled;
        private long runOnInit;
        private long parentId;
        private W3Wtg131 _root;
        private KaitaiStruct _parent;
        public W3str name() { return name; }
        public W3str description() { return description; }
        public Long isComment() { return isComment; }
        public long id() { return id; }
        public long isActivated() { return isActivated; }
        public long isCustomScript() { return isCustomScript; }
        public long isInitiallyEnabled() { return isInitiallyEnabled; }
        public long runOnInit() { return runOnInit; }
        public long parentId() { return parentId; }
        public W3Wtg131 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Library extends KaitaiStruct {
        public static Library fromFile(String fileName) throws IOException {
            return new Library(new ByteBufferKaitaiStream(fileName));
        }

        public Library(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Library(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Library(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.name = new W3str(this._io);
            if (_root().version() == 7) {
                this.isComment = this._io.readU4le();
            }
            this.categoryHasChildren = this._io.readU4le();
            this.categoryParentId = this._io.readU4le();
        }
        private long index;
        private W3str name;
        private Long isComment;
        private long categoryHasChildren;
        private long categoryParentId;
        private W3Wtg131 _root;
        private KaitaiStruct _parent;
        public long index() { return index; }
        public W3str name() { return name; }
        public Long isComment() { return isComment; }
        public long categoryHasChildren() { return categoryHasChildren; }
        public long categoryParentId() { return categoryParentId; }
        public W3Wtg131 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class SubParam extends KaitaiStruct {
        public static SubParam fromFile(String fileName) throws IOException {
            return new SubParam(new ByteBufferKaitaiStream(fileName));
        }

        public SubParam(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SubParam(KaitaiStream _io, W3Wtg131.Param _parent) {
            this(_io, _parent, null);
        }

        public SubParam(KaitaiStream _io, W3Wtg131.Param _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.subType = this._io.readU4le();
            this.func = new Func(this._io, this, _root);
            this.hasParam = this._io.readU4le();
            this.param = new ArrayList<Param>();
            for (int i = 0; i < func().numParam(); i++) {
                this.param.add(new Param(this._io, this, _root));
            }
        }
        private long subType;
        private Func func;
        private long hasParam;
        private ArrayList<Param> param;
        private W3Wtg131 _root;
        private W3Wtg131.Param _parent;
        public long subType() { return subType; }
        public Func func() { return func; }
        public long hasParam() { return hasParam; }
        public ArrayList<Param> param() { return param; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131.Param _parent() { return _parent; }
    }
    public static class Func extends KaitaiStruct {
        public static Func fromFile(String fileName) throws IOException {
            return new Func(new ByteBufferKaitaiStream(fileName));
        }

        public Func(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Func(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Func(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this._raw__raw_numArgumentsAndName = this._io.readBytesTerm((byte) 0, false, true, true);
            WtgFuncLookup _process__raw__raw_numArgumentsAndName = new WtgFuncLookup();
            this._raw_numArgumentsAndName = _process__raw__raw_numArgumentsAndName.decode(_raw__raw_numArgumentsAndName);
            KaitaiStream _io__raw_numArgumentsAndName = new ByteBufferKaitaiStream(_raw_numArgumentsAndName);
            this.numArgumentsAndName = new W3str(_io__raw_numArgumentsAndName);
        }
        private Long numParam;
        public Long numParam() {
            if (this.numParam != null)
                return this.numParam;
            KaitaiStream io = numArgumentsAndName()._io();
            long _pos = io.pos();
            io.seek(0);
            this.numParam = io.readU4le();
            io.seek(_pos);
            return this.numParam;
        }
        private W3str name;
        public W3str name() {
            if (this.name != null)
                return this.name;
            KaitaiStream io = numArgumentsAndName()._io();
            long _pos = io.pos();
            io.seek(4);
            this.name = new W3str(io);
            io.seek(_pos);
            return this.name;
        }
        private W3str numArgumentsAndName;
        private W3Wtg131 _root;
        private KaitaiStruct _parent;
        private byte[] _raw_numArgumentsAndName;
        private byte[] _raw__raw_numArgumentsAndName;
        public W3str numArgumentsAndName() { return numArgumentsAndName; }
        public W3Wtg131 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
        public byte[] _raw_numArgumentsAndName() { return _raw_numArgumentsAndName; }
        public byte[] _raw__raw_numArgumentsAndName() { return _raw__raw_numArgumentsAndName; }
    }
    public static class Category extends KaitaiStruct {
        public static Category fromFile(String fileName) throws IOException {
            return new Category(new ByteBufferKaitaiStream(fileName));
        }

        public Category(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Category(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Category(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.name = new W3str(this._io);
            if (_root().version() == 7) {
                this.isComment = this._io.readU4le();
            }
            this.categoryHasChildren = this._io.readU4le();
            this.categoryParentId = this._io.readU4le();
        }
        private long index;
        private W3str name;
        private Long isComment;
        private long categoryHasChildren;
        private long categoryParentId;
        private W3Wtg131 _root;
        private KaitaiStruct _parent;
        public long index() { return index; }
        public W3str name() { return name; }
        public Long isComment() { return isComment; }
        public long categoryHasChildren() { return categoryHasChildren; }
        public long categoryParentId() { return categoryParentId; }
        public W3Wtg131 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Header extends KaitaiStruct {
        public static Header fromFile(String fileName) throws IOException {
            return new Header(new ByteBufferKaitaiStream(fileName));
        }

        public Header(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Header(KaitaiStream _io, W3Wtg131.Element _parent) {
            this(_io, _parent, null);
        }

        public Header(KaitaiStream _io, W3Wtg131.Element _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.name = new W3str(this._io);
            if (_root().version() == 7) {
                this.isComment = this._io.readU4le();
            }
            this.categoryHasChildren = this._io.readU4le();
            this.categoryParentId = this._io.readU4le();
        }
        private long index;
        private W3str name;
        private Long isComment;
        private long categoryHasChildren;
        private long categoryParentId;
        private W3Wtg131 _root;
        private W3Wtg131.Element _parent;
        public long index() { return index; }
        public W3str name() { return name; }
        public Long isComment() { return isComment; }
        public long categoryHasChildren() { return categoryHasChildren; }
        public long categoryParentId() { return categoryParentId; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131.Element _parent() { return _parent; }
    }
    public static class RemovedCategory extends KaitaiStruct {
        public static RemovedCategory fromFile(String fileName) throws IOException {
            return new RemovedCategory(new ByteBufferKaitaiStream(fileName));
        }

        public RemovedCategory(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemovedCategory(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public RemovedCategory(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
        }
        private long id;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public long id() { return id; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class RemovedHeader extends KaitaiStruct {
        public static RemovedHeader fromFile(String fileName) throws IOException {
            return new RemovedHeader(new ByteBufferKaitaiStream(fileName));
        }

        public RemovedHeader(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RemovedHeader(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public RemovedHeader(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU4le();
        }
        private long id;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public long id() { return id; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class Script extends KaitaiStruct {
        public static Script fromFile(String fileName) throws IOException {
            return new Script(new ByteBufferKaitaiStream(fileName));
        }

        public Script(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Script(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Script(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.description = new W3str(this._io);
            if (_root().version() == 7) {
                this.isComment = this._io.readU4le();
            }
            this.id = this._io.readU4le();
            this.isActivated = this._io.readU4le();
            this.isCustomScript = this._io.readU4le();
            this.isInitiallyEnabled = this._io.readU4le();
            this.runOnInit = this._io.readU4le();
            this.parentId = this._io.readU4le();
        }
        private W3str name;
        private W3str description;
        private Long isComment;
        private long id;
        private long isActivated;
        private long isCustomScript;
        private long isInitiallyEnabled;
        private long runOnInit;
        private long parentId;
        private W3Wtg131 _root;
        private KaitaiStruct _parent;
        public W3str name() { return name; }
        public W3str description() { return description; }
        public Long isComment() { return isComment; }
        public long id() { return id; }
        public long isActivated() { return isActivated; }
        public long isCustomScript() { return isCustomScript; }
        public long isInitiallyEnabled() { return isInitiallyEnabled; }
        public long runOnInit() { return runOnInit; }
        public long parentId() { return parentId; }
        public W3Wtg131 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Var extends KaitaiStruct {
        public static Var fromFile(String fileName) throws IOException {
            return new Var(new ByteBufferKaitaiStream(fileName));
        }

        public Var(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Var(KaitaiStream _io, W3Wtg131 _parent) {
            this(_io, _parent, null);
        }

        public Var(KaitaiStream _io, W3Wtg131 _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.type = new W3str(this._io);
            this.unknown = this._io.readU4le();
            this.isArray = this._io.readU4le();
            if (_root().version() == 7) {
                this.arraySize = this._io.readU4le();
            }
            this.useInitialValue = this._io.readU4le();
            this.initialValue = new W3str(this._io);
            this.id = this._io.readU4le();
            this.parentId = this._io.readU4le();
        }
        private W3str name;
        private W3str type;
        private long unknown;
        private long isArray;
        private Long arraySize;
        private long useInitialValue;
        private W3str initialValue;
        private long id;
        private long parentId;
        private W3Wtg131 _root;
        private W3Wtg131 _parent;
        public W3str name() { return name; }
        public W3str type() { return type; }
        public long unknown() { return unknown; }
        public long isArray() { return isArray; }
        public Long arraySize() { return arraySize; }
        public long useInitialValue() { return useInitialValue; }
        public W3str initialValue() { return initialValue; }
        public long id() { return id; }
        public long parentId() { return parentId; }
        public W3Wtg131 _root() { return _root; }
        public W3Wtg131 _parent() { return _parent; }
    }
    public static class Param2 extends KaitaiStruct {
        public static Param2 fromFile(String fileName) throws IOException {
            return new Param2(new ByteBufferKaitaiStream(fileName));
        }

        public Param2(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Param2(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Param2(KaitaiStream _io, KaitaiStruct _parent, W3Wtg131 _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.paramType = W3Wtg131.ParamType.byId(this._io.readU4le());
            this.value = new W3str(this._io);
            this.hasSub = this._io.readU4le();
            if (hasSub() != 0) {
                this.subParam = new SubParam(this._io, this, _root);
            }
            if ( ((_root().version() == 7) && (!(hasSub() == 0))) ) {
                this.unknown2 = this._io.readU4le();
            }
            this.isArray = this._io.readU4le();
        }
        private ParamType paramType;
        private W3str value;
        private long hasSub;
        private SubParam subParam;
        private Long unknown2;
        private long isArray;
        private W3Wtg131 _root;
        private KaitaiStruct _parent;
        public ParamType paramType() { return paramType; }
        public W3str value() { return value; }
        public long hasSub() { return hasSub; }
        public SubParam subParam() { return subParam; }
        public Long unknown2() { return unknown2; }
        public long isArray() { return isArray; }
        public W3Wtg131 _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    private W3id magic;
    private long magic2;
    private long version;
    private long numHeader;
    private long numRemovedHeader;
    private ArrayList<RemovedHeader> removedHeader;
    private long numLibrary;
    private long numRemovedLibrary;
    private ArrayList<RemovedLibrary> removedLibrary;
    private long numCategory;
    private long numRemovedCategory;
    private ArrayList<RemovedCategory> removedCategory;
    private long numTrig;
    private long numRemovedTrig;
    private ArrayList<RemovedTrig> removedTrig;
    private long numComment;
    private long numRemovedComment;
    private ArrayList<RemovedComment> removedComment;
    private long numScript;
    private long numRemovedScript;
    private ArrayList<RemovedScript> removedScript;
    private long numVarElement;
    private long numRemovedVar;
    private ArrayList<RemovedVar> removedVar;
    private long unknown2;
    private long unknown3;
    private long trigVersion;
    private long numExistingVar;
    private ArrayList<Var> existingVar;
    private long numElement;
    private ArrayList<Element> element;
    private W3Wtg131 _root;
    private KaitaiStruct _parent;
    public W3id magic() { return magic; }
    public long magic2() { return magic2; }
    public long version() { return version; }
    public long numHeader() { return numHeader; }
    public long numRemovedHeader() { return numRemovedHeader; }
    public ArrayList<RemovedHeader> removedHeader() { return removedHeader; }
    public long numLibrary() { return numLibrary; }
    public long numRemovedLibrary() { return numRemovedLibrary; }
    public ArrayList<RemovedLibrary> removedLibrary() { return removedLibrary; }
    public long numCategory() { return numCategory; }
    public long numRemovedCategory() { return numRemovedCategory; }
    public ArrayList<RemovedCategory> removedCategory() { return removedCategory; }
    public long numTrig() { return numTrig; }
    public long numRemovedTrig() { return numRemovedTrig; }
    public ArrayList<RemovedTrig> removedTrig() { return removedTrig; }
    public long numComment() { return numComment; }
    public long numRemovedComment() { return numRemovedComment; }
    public ArrayList<RemovedComment> removedComment() { return removedComment; }
    public long numScript() { return numScript; }
    public long numRemovedScript() { return numRemovedScript; }
    public ArrayList<RemovedScript> removedScript() { return removedScript; }
    public long numVarElement() { return numVarElement; }
    public long numRemovedVar() { return numRemovedVar; }
    public ArrayList<RemovedVar> removedVar() { return removedVar; }
    public long unknown2() { return unknown2; }
    public long unknown3() { return unknown3; }
    public long trigVersion() { return trigVersion; }
    public long numExistingVar() { return numExistingVar; }
    public ArrayList<Var> existingVar() { return existingVar; }
    public long numElement() { return numElement; }
    public ArrayList<Element> element() { return element; }
    public W3Wtg131 _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
