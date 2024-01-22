// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.ai.wai.model.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class W3Wai extends KaitaiStruct {
    public static W3Wai fromFile(String fileName) throws IOException {
        return new W3Wai(new ByteBufferKaitaiStream(fileName));
    }

    public enum ParameterType {
        PRESET(0),
        OPERATOR_FUNCTION(1),
        FUNCTION(2),
        STRING(3);

        private final long id;
        ParameterType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ParameterType> byId = new HashMap<Long, ParameterType>(4);
        static {
            for (ParameterType e : ParameterType.values())
                byId.put(e.id(), e);
        }
        public static ParameterType byId(long id) { return byId.get(id); }
    }

    public enum BuildPriorityTechType {
        UNIT(0),
        UPGRADE(1),
        EXPANSION_TOWN(2);

        private final long id;
        BuildPriorityTechType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, BuildPriorityTechType> byId = new HashMap<Long, BuildPriorityTechType>(3);
        static {
            for (BuildPriorityTechType e : BuildPriorityTechType.values())
                byId.put(e.id(), e);
        }
        public static BuildPriorityTechType byId(long id) { return byId.get(id); }
    }

    public enum AiRace {
        CUSTOM(0),
        HUMAN(1),
        ORC(2),
        UNDEAD(3),
        NIGHT_ELF(4);

        private final long id;
        AiRace(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, AiRace> byId = new HashMap<Long, AiRace>(5);
        static {
            for (AiRace e : AiRace.values())
                byId.put(e.id(), e);
        }
        public static AiRace byId(long id) { return byId.get(id); }
    }

    public enum BuildPriorityConditionIndex {
        CUSTOM(4294967294L),
        NONE(4294967295L);

        private final long id;
        BuildPriorityConditionIndex(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, BuildPriorityConditionIndex> byId = new HashMap<Long, BuildPriorityConditionIndex>(2);
        static {
            for (BuildPriorityConditionIndex e : BuildPriorityConditionIndex.values())
                byId.put(e.id(), e);
        }
        public static BuildPriorityConditionIndex byId(long id) { return byId.get(id); }
    }

    public enum PlayerRace {
        HUMAN(0),
        ORC(2),
        NIGHT_ELF(4),
        UNDEAD(8),
        RANDOM(20);

        private final long id;
        PlayerRace(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, PlayerRace> byId = new HashMap<Long, PlayerRace>(5);
        static {
            for (PlayerRace e : PlayerRace.values())
                byId.put(e.id(), e);
        }
        public static PlayerRace byId(long id) { return byId.get(id); }
    }

    public enum AiDifficulty {
        EASY(0),
        NORMAL(1),
        INSANE(2);

        private final long id;
        AiDifficulty(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, AiDifficulty> byId = new HashMap<Long, AiDifficulty>(3);
        static {
            for (AiDifficulty e : AiDifficulty.values())
                byId.put(e.id(), e);
        }
        public static AiDifficulty byId(long id) { return byId.get(id); }
    }

    public enum AllowFlyers {
        FALSE(0),
        TRUE(1);

        private final long id;
        AllowFlyers(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, AllowFlyers> byId = new HashMap<Long, AllowFlyers>(2);
        static {
            for (AllowFlyers e : AllowFlyers.values())
                byId.put(e.id(), e);
        }
        public static AllowFlyers byId(long id) { return byId.get(id); }
    }

    public enum Ai {
        STANDARD(0),
        USER(1),
        CUSTOM(4),
        CURRENT(12);

        private final long id;
        Ai(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Ai> byId = new HashMap<Long, Ai>(4);
        static {
            for (Ai e : Ai.values())
                byId.put(e.id(), e);
        }
        public static Ai byId(long id) { return byId.get(id); }
    }

    public enum Target {
        COMMON_ALLIANCE_TARGET(0),
        NEW_EXPANSION_LOCATION(1),
        ENEMY_MAJOR_ASSAULT(2),
        ENEMY_EXPANSION(3),
        ENEMY_ANY_TOWN(4),
        CREEP_CAMP(5),
        PURCHASE_GOBLIN_ZEPPELIN(6);

        private final long id;
        Target(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Target> byId = new HashMap<Long, Target>(7);
        static {
            for (Target e : Target.values())
                byId.put(e.id(), e);
        }
        public static Target byId(long id) { return byId.get(id); }
    }

    public enum HarvestType {
        GOLD(0),
        LUMBER(1);

        private final long id;
        HarvestType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, HarvestType> byId = new HashMap<Long, HarvestType>(2);
        static {
            for (HarvestType e : HarvestType.values())
                byId.put(e.id(), e);
        }
        public static HarvestType byId(long id) { return byId.get(id); }
    }

    public enum BuildPriorityTarget {
        MAIN(0),
        EXPANSION_1(1),
        EXPANSION_2(2),
        EXPANSION_3(3),
        EXPANSION_4(4),
        EXPANSION_5(5),
        EXPANSION_6(6),
        EXPANSION_7(7),
        EXPANSION_8(8),
        EXPANSION_9(9),
        MINE_9(4294967285L),
        MINE_8(4294967286L),
        MINE_7(4294967287L),
        MINE_6(4294967288L),
        MINE_5(4294967289L),
        MINE_4(4294967290L),
        MINE_3(4294967291L),
        MINE_2(4294967292L),
        MINE_1(4294967293L),
        ANY(4294967295L);

        private final long id;
        BuildPriorityTarget(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, BuildPriorityTarget> byId = new HashMap<Long, BuildPriorityTarget>(20);
        static {
            for (BuildPriorityTarget e : BuildPriorityTarget.values())
                byId.put(e.id(), e);
        }
        public static BuildPriorityTarget byId(long id) { return byId.get(id); }
    }

    public enum ConditionType {
        NONE(0),
        USED(1);

        private final long id;
        ConditionType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ConditionType> byId = new HashMap<Long, ConditionType>(2);
        static {
            for (ConditionType e : ConditionType.values())
                byId.put(e.id(), e);
        }
        public static ConditionType byId(long id) { return byId.get(id); }
    }

    public W3Wai(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Wai(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Wai(KaitaiStream _io, KaitaiStruct _parent, W3Wai _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.name = new W3str(this._io);
        this.race = AiRace.byId(this._io.readU4le());
        this._raw_flags = this._io.readBytes(4);
        KaitaiStream _io__raw_flags = new ByteBufferKaitaiStream(_raw_flags);
        this.flags = new Flags(_io__raw_flags, this, _root);
        this.numPeonsAndBuildings = this._io.readU4le();
        this.goldWorker = new W3id(this._io);
        this.lumberWorker = new W3id(this._io);
        this.baseBuilding = new W3id(this._io);
        this.mineBuilding = new W3id(this._io);
        this.numCondition = this._io.readU4le();
        this.unknown = this._io.readU4le();
        this.condition = new ArrayList<Condition>();
        for (int i = 0; i < numCondition(); i++) {
            this.condition.add(new Condition(this._io, this, _root));
        }
        this.firstHero = new W3id(this._io);
        this.secondHero = new W3id(this._io);
        this.thirdHero = new W3id(this._io);
        this.trainingChanceFirstSecondThird = this._io.readU4le();
        this.trainingChanceFirstThirdSecond = this._io.readU4le();
        this.trainingChanceSecondFirstThird = this._io.readU4le();
        this.trainingChanceSecondThirdFirst = this._io.readU4le();
        this.trainingChanceThirdFirstSecond = this._io.readU4le();
        this.trainingChanceThirdSecondFirst = this._io.readU4le();
        this.skillChunk = new SkillChunk(this._io, this, _root);
        this.numBuildPriority = this._io.readU4le();
        this.buildPriority = new ArrayList<BuildPriority>();
        for (int i = 0; i < numBuildPriority(); i++) {
            this.buildPriority.add(new BuildPriority(this._io, this, _root));
        }
        this.numHarvestPriority = this._io.readU4le();
        this.harvestPriority = new ArrayList<HarvestPriority>();
        for (int i = 0; i < numHarvestPriority(); i++) {
            this.harvestPriority.add(new HarvestPriority(this._io, this, _root));
        }
        this.numTargetPriority = this._io.readU4le();
        this.targetPriority = new ArrayList<TargetPriority>();
        for (int i = 0; i < numTargetPriority(); i++) {
            this.targetPriority.add(new TargetPriority(this._io, this, _root));
        }
        this.repeatWaves = this._io.readU4le();
        this.minimumForcesAttackGroupIndex = this._io.readU4le();
        this.initialDelay = this._io.readU4le();
        this.numAttackGroup = this._io.readU4le();
        this.attackGroup = new ArrayList<AttackGroup>();
        for (int i = 0; i < numAttackGroup(); i++) {
            this.attackGroup.add(new AttackGroup(this._io, this, _root));
        }
        this.numAttackWave = this._io.readU4le();
        this.attackWave = new ArrayList<AttackWave>();
        for (int i = 0; i < numAttackWave(); i++) {
            this.attackWave.add(new AttackWave(this._io, this, _root));
        }
        this.unknown2 = this._io.readU4le();
        this.gameOptions = new GameOptions(this._io, this, _root);
        this.regularGameSpeed = this._io.readU4le();
        this.mapPath = new W3str(this._io);
        this.numPlayer = this._io.readU4le();
        this.player = new ArrayList<Player>();
        for (int i = 0; i < numPlayer(); i++) {
            this.player.add(new Player(this._io, this, _root));
        }
        this.useImportObj = this._io.readU4le();
        this.importObj = new ImportObj(this._io, this, _root);
        this.w3o = new W3W3o(this._io);
    }
    public static class OperatorFunctionParameterExt extends KaitaiStruct {
        public static OperatorFunctionParameterExt fromFile(String fileName) throws IOException {
            return new OperatorFunctionParameterExt(new ByteBufferKaitaiStream(fileName));
        }

        public OperatorFunctionParameterExt(KaitaiStream _io) {
            this(_io, null, null);
        }

        public OperatorFunctionParameterExt(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public OperatorFunctionParameterExt(KaitaiStream _io, KaitaiStruct _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.beginFunction = this._io.readU4le();
            this.parameterList = new ParameterList(this._io, this, _root, 0);
            this.endFunction = this._io.readU4le();
        }
        private long beginFunction;
        private ParameterList parameterList;
        private long endFunction;
        private W3Wai _root;
        private KaitaiStruct _parent;
        public long beginFunction() { return beginFunction; }
        public ParameterList parameterList() { return parameterList; }
        public long endFunction() { return endFunction; }
        public W3Wai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class TargetPriority extends KaitaiStruct {
        public static TargetPriority fromFile(String fileName) throws IOException {
            return new TargetPriority(new ByteBufferKaitaiStream(fileName));
        }

        public TargetPriority(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TargetPriority(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public TargetPriority(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.priorityType = this._io.readU4le();
            this.target = W3Wai.Target.byId(this._io.readU4le());
            this.creepMinStrength = this._io.readU4le();
            if (target() == W3Wai.Target.CREEP_CAMP) {
                this.creepMaxStrength = this._io.readU4le();
            }
            if (target() == W3Wai.Target.CREEP_CAMP) {
                this.allowFlyers = W3Wai.AllowFlyers.byId(this._io.readU4le());
            }
            this.conditionIndex = W3Wai.BuildPriorityConditionIndex.byId(this._io.readU4le());
            if (target() == W3Wai.Target.CREEP_CAMP) {
                this.fill2 = new ArrayList<Integer>();
                for (int i = 0; i < 4; i++) {
                    this.fill2.add(this._io.readU1());
                }
            }
            this.fill = new ArrayList<Integer>();
            for (int i = 0; i < 1; i++) {
                this.fill.add(this._io.readU1());
            }
        }
        private long priorityType;
        private Target target;
        private long creepMinStrength;
        private Long creepMaxStrength;
        private AllowFlyers allowFlyers;
        private BuildPriorityConditionIndex conditionIndex;
        private ArrayList<Integer> fill2;
        private ArrayList<Integer> fill;
        private W3Wai _root;
        private W3Wai _parent;
        public long priorityType() { return priorityType; }
        public Target target() { return target; }
        public long creepMinStrength() { return creepMinStrength; }
        public Long creepMaxStrength() { return creepMaxStrength; }
        public AllowFlyers allowFlyers() { return allowFlyers; }
        public BuildPriorityConditionIndex conditionIndex() { return conditionIndex; }
        public ArrayList<Integer> fill2() { return fill2; }
        public ArrayList<Integer> fill() { return fill; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class Parameter extends KaitaiStruct {
        public static Parameter fromFile(String fileName) throws IOException {
            return new Parameter(new ByteBufferKaitaiStream(fileName));
        }

        public Parameter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Parameter(KaitaiStream _io, W3Wai.ParameterList _parent) {
            this(_io, _parent, null);
        }

        public Parameter(KaitaiStream _io, W3Wai.ParameterList _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.type = W3Wai.ParameterType.byId(this._io.readU4le());
            this.value = new W3str(this._io);
            this.beginFunction = this._io.readU4le();
            if ( ((type() == W3Wai.ParameterType.FUNCTION) && (value().value().equals(""))) ) {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
            }
            if ( ((type() == W3Wai.ParameterType.FUNCTION) && (!(value().value()).equals(""))) ) {
                this.functionParameterExt = new FunctionParameterExt(this._io, this, _root);
            }
            if (type() == W3Wai.ParameterType.OPERATOR_FUNCTION) {
                this.parameterListOp = new ParameterList(this._io, this, _root, 3);
            }
            this.endFunction = this._io.readU4le();
        }
        private ParameterType type;
        private W3str value;
        private long beginFunction;
        private ParameterList parameterList;
        private FunctionParameterExt functionParameterExt;
        private ParameterList parameterListOp;
        private long endFunction;
        private W3Wai _root;
        private W3Wai.ParameterList _parent;
        public ParameterType type() { return type; }
        public W3str value() { return value; }
        public long beginFunction() { return beginFunction; }
        public ParameterList parameterList() { return parameterList; }
        public FunctionParameterExt functionParameterExt() { return functionParameterExt; }
        public ParameterList parameterListOp() { return parameterListOp; }
        public long endFunction() { return endFunction; }
        public W3Wai _root() { return _root; }
        public W3Wai.ParameterList _parent() { return _parent; }
    }
    public static class Flags extends KaitaiStruct {
        public static Flags fromFile(String fileName) throws IOException {
            return new Flags(new ByteBufferKaitaiStream(fileName));
        }

        public Flags(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Flags(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public Flags(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.defendUsers = this._io.readBitsIntBe(1) != 0;
            this.randomPaths = this._io.readBitsIntBe(1) != 0;
            this.setPlayerName = this._io.readBitsIntBe(1) != 0;
            this.removeInjuries = this._io.readBitsIntBe(1) != 0;
            this.smartArtillery = this._io.readBitsIntBe(1) != 0;
            this.allowHomeChanges = this._io.readBitsIntBe(1) != 0;
            this.slowHarvesting = this._io.readBitsIntBe(1) != 0;
            this.takeItems = this._io.readBitsIntBe(1) != 0;
            this.ignoreInjuries = this._io.readBitsIntBe(1) != 0;
            this.haveNoMercy = this._io.readBitsIntBe(1) != 0;
            this.groupsFlee = this._io.readBitsIntBe(1) != 0;
            this.unitsFlee = this._io.readBitsIntBe(1) != 0;
            this.heroesFlee = this._io.readBitsIntBe(1) != 0;
            this.repairStructures = this._io.readBitsIntBe(1) != 0;
            this.targetHeroes = this._io.readBitsIntBe(1) != 0;
            this.melee = this._io.readBitsIntBe(1) != 0;
            this.rest = new ArrayList<Boolean>();
            for (int i = 0; i < 15; i++) {
                this.rest.add(this._io.readBitsIntBe(1) != 0);
            }
            this.buyItems = this._io.readBitsIntBe(1) != 0;
        }
        private boolean defendUsers;
        private boolean randomPaths;
        private boolean setPlayerName;
        private boolean removeInjuries;
        private boolean smartArtillery;
        private boolean allowHomeChanges;
        private boolean slowHarvesting;
        private boolean takeItems;
        private boolean ignoreInjuries;
        private boolean haveNoMercy;
        private boolean groupsFlee;
        private boolean unitsFlee;
        private boolean heroesFlee;
        private boolean repairStructures;
        private boolean targetHeroes;
        private boolean melee;
        private ArrayList<Boolean> rest;
        private boolean buyItems;
        private W3Wai _root;
        private W3Wai _parent;
        public boolean defendUsers() { return defendUsers; }
        public boolean randomPaths() { return randomPaths; }
        public boolean setPlayerName() { return setPlayerName; }
        public boolean removeInjuries() { return removeInjuries; }
        public boolean smartArtillery() { return smartArtillery; }
        public boolean allowHomeChanges() { return allowHomeChanges; }
        public boolean slowHarvesting() { return slowHarvesting; }
        public boolean takeItems() { return takeItems; }
        public boolean ignoreInjuries() { return ignoreInjuries; }
        public boolean haveNoMercy() { return haveNoMercy; }
        public boolean groupsFlee() { return groupsFlee; }
        public boolean unitsFlee() { return unitsFlee; }
        public boolean heroesFlee() { return heroesFlee; }
        public boolean repairStructures() { return repairStructures; }
        public boolean targetHeroes() { return targetHeroes; }
        public boolean melee() { return melee; }
        public ArrayList<Boolean> rest() { return rest; }
        public boolean buyItems() { return buyItems; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class GameOptions extends KaitaiStruct {
        public static GameOptions fromFile(String fileName) throws IOException {
            return new GameOptions(new ByteBufferKaitaiStream(fileName));
        }

        public GameOptions(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GameOptions(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public GameOptions(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.rest = new ArrayList<Boolean>();
            for (int i = 0; i < 6; i++) {
                this.rest.add(this._io.readBitsIntBe(1) != 0);
            }
            this.disableVictoryDefeatConditions = this._io.readBitsIntBe(1) != 0;
            this.disableFogOfWar = this._io.readBitsIntBe(1) != 0;
            this.rest2 = new ArrayList<Boolean>();
            for (int i = 0; i < 24; i++) {
                this.rest2.add(this._io.readBitsIntBe(1) != 0);
            }
        }
        private ArrayList<Boolean> rest;
        private boolean disableVictoryDefeatConditions;
        private boolean disableFogOfWar;
        private ArrayList<Boolean> rest2;
        private W3Wai _root;
        private W3Wai _parent;
        public ArrayList<Boolean> rest() { return rest; }
        public boolean disableVictoryDefeatConditions() { return disableVictoryDefeatConditions; }
        public boolean disableFogOfWar() { return disableFogOfWar; }
        public ArrayList<Boolean> rest2() { return rest2; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class ConditionWithoutIndex extends KaitaiStruct {
        public static ConditionWithoutIndex fromFile(String fileName) throws IOException {
            return new ConditionWithoutIndex(new ByteBufferKaitaiStream(fileName));
        }

        public ConditionWithoutIndex(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ConditionWithoutIndex(KaitaiStream _io, W3Wai.Condition _parent) {
            this(_io, _parent, null);
        }

        public ConditionWithoutIndex(KaitaiStream _io, W3Wai.Condition _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new String(this._io.readBytesTerm((byte) 0, false, true, true), Charset.forName("UTF-8"));
            this.type = W3Wai.ConditionType.byId(this._io.readU4le());
            if (type() == W3Wai.ConditionType.USED) {
                this.operatorFunctionName = new W3str(this._io);
            }
            this.beginFunction = this._io.readU4le();
            switch (operatorFunctionName().value()) {
            case "OperatorCompareBoolean": {
                this.parameterList = new ParameterList(this._io, this, _root, 3);
                break;
            }
            case "OperatorCompareInteger": {
                this.parameterList = new ParameterList(this._io, this, _root, 3);
                break;
            }
            case "GetBooleanAnd": {
                this.parameterList = new ParameterList(this._io, this, _root, 2);
                break;
            }
            case "GetBooleanOr": {
                this.parameterList = new ParameterList(this._io, this, _root, 2);
                break;
            }
            }
            this.endFunction = this._io.readU4le();
        }
        private String name;
        private ConditionType type;
        private W3str operatorFunctionName;
        private long beginFunction;
        private ParameterList parameterList;
        private long endFunction;
        private W3Wai _root;
        private W3Wai.Condition _parent;
        public String name() { return name; }
        public ConditionType type() { return type; }
        public W3str operatorFunctionName() { return operatorFunctionName; }
        public long beginFunction() { return beginFunction; }
        public ParameterList parameterList() { return parameterList; }
        public long endFunction() { return endFunction; }
        public W3Wai _root() { return _root; }
        public W3Wai.Condition _parent() { return _parent; }
    }
    public static class BuildPriority extends KaitaiStruct {
        public static BuildPriority fromFile(String fileName) throws IOException {
            return new BuildPriority(new ByteBufferKaitaiStream(fileName));
        }

        public BuildPriority(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BuildPriority(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public BuildPriority(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.priorityType = this._io.readU4le();
            this.techType = W3Wai.BuildPriorityTechType.byId(this._io.readU4le());
            this.tech = new W3id(this._io);
            this.target = W3Wai.BuildPriorityTarget.byId(this._io.readU4le());
            this.conditionIndex = W3Wai.BuildPriorityConditionIndex.byId(this._io.readU4le());
            this.fill = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++) {
                this.fill.add(this._io.readU1());
            }
        }
        private long priorityType;
        private BuildPriorityTechType techType;
        private W3id tech;
        private BuildPriorityTarget target;
        private BuildPriorityConditionIndex conditionIndex;
        private ArrayList<Integer> fill;
        private W3Wai _root;
        private W3Wai _parent;
        public long priorityType() { return priorityType; }
        public BuildPriorityTechType techType() { return techType; }
        public W3id tech() { return tech; }
        public BuildPriorityTarget target() { return target; }
        public BuildPriorityConditionIndex conditionIndex() { return conditionIndex; }
        public ArrayList<Integer> fill() { return fill; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class HarvestPriority extends KaitaiStruct {
        public static HarvestPriority fromFile(String fileName) throws IOException {
            return new HarvestPriority(new ByteBufferKaitaiStream(fileName));
        }

        public HarvestPriority(KaitaiStream _io) {
            this(_io, null, null);
        }

        public HarvestPriority(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public HarvestPriority(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.harvestPriorityType = this._io.readU4le();
            this.harvestType = W3Wai.HarvestType.byId(this._io.readU4le());
            this.target = W3Wai.BuildPriorityTarget.byId(this._io.readU4le());
            this.workers = this._io.readU4le();
            this.conditionIndex = W3Wai.BuildPriorityConditionIndex.byId(this._io.readU4le());
            this.fill = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++) {
                this.fill.add(this._io.readU1());
            }
        }
        private long harvestPriorityType;
        private HarvestType harvestType;
        private BuildPriorityTarget target;
        private long workers;
        private BuildPriorityConditionIndex conditionIndex;
        private ArrayList<Integer> fill;
        private W3Wai _root;
        private W3Wai _parent;
        public long harvestPriorityType() { return harvestPriorityType; }
        public HarvestType harvestType() { return harvestType; }
        public BuildPriorityTarget target() { return target; }
        public long workers() { return workers; }
        public BuildPriorityConditionIndex conditionIndex() { return conditionIndex; }
        public ArrayList<Integer> fill() { return fill; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class AttackWave extends KaitaiStruct {
        public static AttackWave fromFile(String fileName) throws IOException {
            return new AttackWave(new ByteBufferKaitaiStream(fileName));
        }

        public AttackWave(KaitaiStream _io) {
            this(_io, null, null);
        }

        public AttackWave(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public AttackWave(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.attackGroupIndex = this._io.readU4le();
            this.delay = this._io.readU4le();
        }
        private long attackGroupIndex;
        private long delay;
        private W3Wai _root;
        private W3Wai _parent;
        public long attackGroupIndex() { return attackGroupIndex; }
        public long delay() { return delay; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class SkillChunk extends KaitaiStruct {
        public static SkillChunk fromFile(String fileName) throws IOException {
            return new SkillChunk(new ByteBufferKaitaiStream(fileName));
        }

        public SkillChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SkillChunk(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public SkillChunk(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.firstAsFirst = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.firstAsFirst.add(new W3id(this._io));
            }
            this.firstAsSecond = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.firstAsSecond.add(new W3id(this._io));
            }
            this.firstAsThird = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.firstAsThird.add(new W3id(this._io));
            }
            this.secondAsFirst = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.secondAsFirst.add(new W3id(this._io));
            }
            this.secondAsSecond = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.secondAsSecond.add(new W3id(this._io));
            }
            this.secondAsThird = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.secondAsThird.add(new W3id(this._io));
            }
            this.thirdAsFirst = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.thirdAsFirst.add(new W3id(this._io));
            }
            this.thirdAsSecond = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.thirdAsSecond.add(new W3id(this._io));
            }
            this.thirdAsThird = new ArrayList<W3id>();
            for (int i = 0; i < 10; i++) {
                this.thirdAsThird.add(new W3id(this._io));
            }
        }
        private ArrayList<W3id> firstAsFirst;
        private ArrayList<W3id> firstAsSecond;
        private ArrayList<W3id> firstAsThird;
        private ArrayList<W3id> secondAsFirst;
        private ArrayList<W3id> secondAsSecond;
        private ArrayList<W3id> secondAsThird;
        private ArrayList<W3id> thirdAsFirst;
        private ArrayList<W3id> thirdAsSecond;
        private ArrayList<W3id> thirdAsThird;
        private W3Wai _root;
        private W3Wai _parent;
        public ArrayList<W3id> firstAsFirst() { return firstAsFirst; }
        public ArrayList<W3id> firstAsSecond() { return firstAsSecond; }
        public ArrayList<W3id> firstAsThird() { return firstAsThird; }
        public ArrayList<W3id> secondAsFirst() { return secondAsFirst; }
        public ArrayList<W3id> secondAsSecond() { return secondAsSecond; }
        public ArrayList<W3id> secondAsThird() { return secondAsThird; }
        public ArrayList<W3id> thirdAsFirst() { return thirdAsFirst; }
        public ArrayList<W3id> thirdAsSecond() { return thirdAsSecond; }
        public ArrayList<W3id> thirdAsThird() { return thirdAsThird; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class Condition extends KaitaiStruct {
        public static Condition fromFile(String fileName) throws IOException {
            return new Condition(new ByteBufferKaitaiStream(fileName));
        }

        public Condition(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Condition(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public Condition(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.rest = new ConditionWithoutIndex(this._io, this, _root);
        }
        private long index;
        private ConditionWithoutIndex rest;
        private W3Wai _root;
        private W3Wai _parent;
        public long index() { return index; }
        public ConditionWithoutIndex rest() { return rest; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class Player extends KaitaiStruct {
        public static Player fromFile(String fileName) throws IOException {
            return new Player(new ByteBufferKaitaiStream(fileName));
        }

        public Player(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Player(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public Player(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.teamNumber = this._io.readU4le();
            this.race = W3Wai.PlayerRace.byId(this._io.readU4le());
            this.color = this._io.readU4le();
            this.handicap = this._io.readU4le();
            this.ai = W3Wai.Ai.byId(this._io.readU4le());
            this.aiDifficulty = W3Wai.AiDifficulty.byId(this._io.readU4le());
            this.aiScriptPath = new W3str(this._io);
        }
        private long index;
        private long teamNumber;
        private PlayerRace race;
        private long color;
        private long handicap;
        private Ai ai;
        private AiDifficulty aiDifficulty;
        private W3str aiScriptPath;
        private W3Wai _root;
        private W3Wai _parent;
        public long index() { return index; }
        public long teamNumber() { return teamNumber; }
        public PlayerRace race() { return race; }
        public long color() { return color; }
        public long handicap() { return handicap; }
        public Ai ai() { return ai; }
        public AiDifficulty aiDifficulty() { return aiDifficulty; }
        public W3str aiScriptPath() { return aiScriptPath; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class ImportObj extends KaitaiStruct {
        public static ImportObj fromFile(String fileName) throws IOException {
            return new ImportObj(new ByteBufferKaitaiStream(fileName));
        }

        public ImportObj(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ImportObj(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public ImportObj(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.path = new W3str(this._io);
            this.importTime = new W3str(this._io);
        }
        private W3str path;
        private W3str importTime;
        private W3Wai _root;
        private W3Wai _parent;
        public W3str path() { return path; }
        public W3str importTime() { return importTime; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class AttackGroup extends KaitaiStruct {
        public static AttackGroup fromFile(String fileName) throws IOException {
            return new AttackGroup(new ByteBufferKaitaiStream(fileName));
        }

        public AttackGroup(KaitaiStream _io) {
            this(_io, null, null);
        }

        public AttackGroup(KaitaiStream _io, W3Wai _parent) {
            this(_io, _parent, null);
        }

        public AttackGroup(KaitaiStream _io, W3Wai _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.name = new W3str(this._io);
            this.numCurrentGroup = this._io.readU4le();
            this.currentGroup = new ArrayList<CurrentGroup>();
            for (int i = 0; i < numCurrentGroup(); i++) {
                this.currentGroup.add(new CurrentGroup(this._io, this, _root));
            }
        }
        private long index;
        private W3str name;
        private long numCurrentGroup;
        private ArrayList<CurrentGroup> currentGroup;
        private W3Wai _root;
        private W3Wai _parent;
        public long index() { return index; }
        public W3str name() { return name; }
        public long numCurrentGroup() { return numCurrentGroup; }
        public ArrayList<CurrentGroup> currentGroup() { return currentGroup; }
        public W3Wai _root() { return _root; }
        public W3Wai _parent() { return _parent; }
    }
    public static class FunctionParameterExt extends KaitaiStruct {
        public static FunctionParameterExt fromFile(String fileName) throws IOException {
            return new FunctionParameterExt(new ByteBufferKaitaiStream(fileName));
        }

        public FunctionParameterExt(KaitaiStream _io) {
            this(_io, null, null);
        }

        public FunctionParameterExt(KaitaiStream _io, W3Wai.Parameter _parent) {
            this(_io, _parent, null);
        }

        public FunctionParameterExt(KaitaiStream _io, W3Wai.Parameter _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.type = this._io.readU4le();
            this.value = new W3str(this._io);
            this.beginFunction = this._io.readU4le();
            switch (_parent().value().value()) {
            case "CaptainRetreating": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "TownWithMine": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "FoodUsed": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetGold": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "CaptainInCombat": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "MeleeDifficulty": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetUpgradeWoodCost": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "CheckLastCommand": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "TownThreatened": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetGoldOwned": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetMinesOwned": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetUpgradeGoldCost": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "GetTownUnitCount": {
                this.parameterList = new ParameterList(this._io, this, _root, 3);
                break;
            }
            case "CurrentAttackWave": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetUnitGoldCost": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "GetUnitBuildTime": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "CaptainReadinessHP": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "ExpansionNeeded": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "CaptainIsFull": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetUpgradeLevel": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "TotalFoodProduced": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "CheckLastCommandData": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "TownHasMine": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "CreepsOnMap": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "CaptainGroupSize": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "CommandsWaiting": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "CaptainAtGoal": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetWood": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetFoodMade": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "CaptainReadinessMa": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetUnitWoodCost": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "OperatorInt": {
                this.parameterList = new ParameterList(this._io, this, _root, 3);
                break;
            }
            case "GetUnitCount": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "CaptainIsEmpty": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "CaptainIsHome": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "TownHasHall": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            case "GetNextExpansion": {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            case "GetUnitCountDone": {
                this.parameterList = new ParameterList(this._io, this, _root, 1);
                break;
            }
            default: {
                this.parameterList = new ParameterList(this._io, this, _root, 0);
                break;
            }
            }
            this.endFunction = this._io.readU4le();
        }
        private long type;
        private W3str value;
        private long beginFunction;
        private ParameterList parameterList;
        private long endFunction;
        private W3Wai _root;
        private W3Wai.Parameter _parent;
        public long type() { return type; }
        public W3str value() { return value; }
        public long beginFunction() { return beginFunction; }
        public ParameterList parameterList() { return parameterList; }
        public long endFunction() { return endFunction; }
        public W3Wai _root() { return _root; }
        public W3Wai.Parameter _parent() { return _parent; }
    }
    public static class CurrentGroup extends KaitaiStruct {
        public static CurrentGroup fromFile(String fileName) throws IOException {
            return new CurrentGroup(new ByteBufferKaitaiStream(fileName));
        }

        public CurrentGroup(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CurrentGroup(KaitaiStream _io, W3Wai.AttackGroup _parent) {
            this(_io, _parent, null);
        }

        public CurrentGroup(KaitaiStream _io, W3Wai.AttackGroup _parent, W3Wai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unit = new W3id(this._io);
            this.quantity = this._io.readU4le();
            this.maxQuantity = this._io.readU4le();
            this.conditionIndex = W3Wai.BuildPriorityConditionIndex.byId(this._io.readU4le());
            this.fill = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++) {
                this.fill.add(this._io.readU1());
            }
        }
        private W3id unit;
        private long quantity;
        private long maxQuantity;
        private BuildPriorityConditionIndex conditionIndex;
        private ArrayList<Integer> fill;
        private W3Wai _root;
        private W3Wai.AttackGroup _parent;
        public W3id unit() { return unit; }
        public long quantity() { return quantity; }
        public long maxQuantity() { return maxQuantity; }
        public BuildPriorityConditionIndex conditionIndex() { return conditionIndex; }
        public ArrayList<Integer> fill() { return fill; }
        public W3Wai _root() { return _root; }
        public W3Wai.AttackGroup _parent() { return _parent; }
    }
    public static class ParameterList extends KaitaiStruct {

        public ParameterList(KaitaiStream _io, int numParameter) {
            this(_io, null, null, numParameter);
        }

        public ParameterList(KaitaiStream _io, KaitaiStruct _parent, int numParameter) {
            this(_io, _parent, null, numParameter);
        }

        public ParameterList(KaitaiStream _io, KaitaiStruct _parent, W3Wai _root, int numParameter) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.numParameter = numParameter;
            _read();
        }
        private void _read() {
            this.parameter = new ArrayList<Parameter>();
            for (int i = 0; i < numParameter(); i++) {
                this.parameter.add(new Parameter(this._io, this, _root));
            }
        }
        private ArrayList<Parameter> parameter;
        private int numParameter;
        private W3Wai _root;
        private KaitaiStruct _parent;
        public ArrayList<Parameter> parameter() { return parameter; }
        public int numParameter() { return numParameter; }
        public W3Wai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    private long version;
    private W3str name;
    private AiRace race;
    private Flags flags;
    private long numPeonsAndBuildings;
    private W3id goldWorker;
    private W3id lumberWorker;
    private W3id baseBuilding;
    private W3id mineBuilding;
    private long numCondition;
    private long unknown;
    private ArrayList<Condition> condition;
    private W3id firstHero;
    private W3id secondHero;
    private W3id thirdHero;
    private long trainingChanceFirstSecondThird;
    private long trainingChanceFirstThirdSecond;
    private long trainingChanceSecondFirstThird;
    private long trainingChanceSecondThirdFirst;
    private long trainingChanceThirdFirstSecond;
    private long trainingChanceThirdSecondFirst;
    private SkillChunk skillChunk;
    private long numBuildPriority;
    private ArrayList<BuildPriority> buildPriority;
    private long numHarvestPriority;
    private ArrayList<HarvestPriority> harvestPriority;
    private long numTargetPriority;
    private ArrayList<TargetPriority> targetPriority;
    private long repeatWaves;
    private long minimumForcesAttackGroupIndex;
    private long initialDelay;
    private long numAttackGroup;
    private ArrayList<AttackGroup> attackGroup;
    private long numAttackWave;
    private ArrayList<AttackWave> attackWave;
    private long unknown2;
    private GameOptions gameOptions;
    private long regularGameSpeed;
    private W3str mapPath;
    private long numPlayer;
    private ArrayList<Player> player;
    private long useImportObj;
    private ImportObj importObj;
    private W3W3o w3o;
    private W3Wai _root;
    private KaitaiStruct _parent;
    private byte[] _raw_flags;
    public long version() { return version; }
    public W3str name() { return name; }
    public AiRace race() { return race; }
    public Flags flags() { return flags; }
    public long numPeonsAndBuildings() { return numPeonsAndBuildings; }
    public W3id goldWorker() { return goldWorker; }
    public W3id lumberWorker() { return lumberWorker; }
    public W3id baseBuilding() { return baseBuilding; }
    public W3id mineBuilding() { return mineBuilding; }
    public long numCondition() { return numCondition; }
    public long unknown() { return unknown; }
    public ArrayList<Condition> condition() { return condition; }
    public W3id firstHero() { return firstHero; }
    public W3id secondHero() { return secondHero; }
    public W3id thirdHero() { return thirdHero; }
    public long trainingChanceFirstSecondThird() { return trainingChanceFirstSecondThird; }
    public long trainingChanceFirstThirdSecond() { return trainingChanceFirstThirdSecond; }
    public long trainingChanceSecondFirstThird() { return trainingChanceSecondFirstThird; }
    public long trainingChanceSecondThirdFirst() { return trainingChanceSecondThirdFirst; }
    public long trainingChanceThirdFirstSecond() { return trainingChanceThirdFirstSecond; }
    public long trainingChanceThirdSecondFirst() { return trainingChanceThirdSecondFirst; }
    public SkillChunk skillChunk() { return skillChunk; }
    public long numBuildPriority() { return numBuildPriority; }
    public ArrayList<BuildPriority> buildPriority() { return buildPriority; }
    public long numHarvestPriority() { return numHarvestPriority; }
    public ArrayList<HarvestPriority> harvestPriority() { return harvestPriority; }
    public long numTargetPriority() { return numTargetPriority; }
    public ArrayList<TargetPriority> targetPriority() { return targetPriority; }
    public long repeatWaves() { return repeatWaves; }
    public long minimumForcesAttackGroupIndex() { return minimumForcesAttackGroupIndex; }
    public long initialDelay() { return initialDelay; }
    public long numAttackGroup() { return numAttackGroup; }
    public ArrayList<AttackGroup> attackGroup() { return attackGroup; }
    public long numAttackWave() { return numAttackWave; }
    public ArrayList<AttackWave> attackWave() { return attackWave; }
    public long unknown2() { return unknown2; }
    public GameOptions gameOptions() { return gameOptions; }
    public long regularGameSpeed() { return regularGameSpeed; }
    public W3str mapPath() { return mapPath; }
    public long numPlayer() { return numPlayer; }
    public ArrayList<Player> player() { return player; }
    public long useImportObj() { return useImportObj; }
    public ImportObj importObj() { return importObj; }
    public W3W3o w3o() { return w3o; }
    public W3Wai _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
    public byte[] _raw_flags() { return _raw_flags; }
}
