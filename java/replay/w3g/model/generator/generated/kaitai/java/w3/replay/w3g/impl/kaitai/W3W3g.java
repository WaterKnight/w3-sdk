// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package w3.replay.w3g.impl.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.HashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class W3W3g extends KaitaiStruct {
    public static W3W3g fromFile(String fileName) throws IOException {
        return new W3W3g(new ByteBufferKaitaiStream(fileName));
    }

    public enum SetGameSpeedSpeed {
        SLOW(0),
        NORMAL(1),
        FAST(2);

        private final long id;
        SetGameSpeedSpeed(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, SetGameSpeedSpeed> byId = new HashMap<Long, SetGameSpeedSpeed>(3);
        static {
            for (SetGameSpeedSpeed e : SetGameSpeedSpeed.values())
                byId.put(e.id(), e);
        }
        public static SetGameSpeedSpeed byId(long id) { return byId.get(id); }
    }

    public enum ActionId {
        PAUSE_GAME(1),
        RESUME_GAME(2),
        SET_GAME_SPEED(3),
        INCREASE_GAME_SPEED(4),
        DECREASE_GAME_SPEED(5),
        SAVE_GAME(6),
        SAVE_GAME_FINISHED(7),
        UNIT_BUILDING_ABILITY(16),
        UNIT_BUILDING_ABILITY_WITH_TARGET_POSITION(17),
        UNIT_BUILDING_ABILITY_WITH_TARGET_POSITION_AND_OBJECT(18),
        GIVE_OR_DROP_ITEM(19),
        UNIT_BUILDING_ABILITY_WITH_TWO_TARGET_POSITIONS_AND_TWO_ITEM_IDS(20),
        CHANGE_SELECTION(22),
        ASSIGN_GROUP_HOTKEY(23),
        SELECT_GROUP_HOTKEY(24),
        SELECT_SUBGROUP(25),
        PRE_SUBSELECTION(26),
        UNKNOWN_0X1B(27),
        SELECT_GROUND_ITEM(28),
        CANCEL_HERO_REVIVAL(29),
        REMOVE_UNIT_FROM_BUILDING_QUEUE(30),
        CHEAT_THE_DUDE_ABIDES(32),
        UNKNOWN_0X21(33),
        CHEAT_SOMEBODY_SET_UP_US_THE_BOMB(34),
        CHEAT_WARP_TEN(35),
        CHEAT_IOCAINE_POWDER(36),
        CHEAT_POINT_BREAK(37),
        CHEAT_WHOS_YOUR_DADDY(38),
        CHEAT_KEYSER_SOZE(39),
        CHEAT_LEAFIT_TO_ME(40),
        CHEAT_THERE_IS_NO_SPOON(41),
        CHEAT_STRENGTH_AND_HONOR(42),
        CHEAT_IT_VEXES_ME(43),
        CHEAT_WHO_IS_JOHN_GALT(44),
        CHEAT_GREED_IS_GOOD(45),
        CHEAT_DAY_LIGHT_SAVINGS(46),
        CHEAT_I_SEE_DEAD_PEOPLE(47),
        CHEAT_SYNERGY(48),
        CHEAT_SHARP_AND_SHINY(49),
        CHEAT_ALL_YOUR_BASE_ARE_BELONG_TO_US(50),
        CHANGE_ALLY_OPTIONS(80),
        TRANSFER_RESOURCES(81),
        MAP_TRIGGER_CHAT_COMMAND(96),
        ESC_PRESSED(97),
        SCENARIO_TRIGGER(98),
        ENTER_CHOOSE_HERO_SKILL_SUBMENU(102),
        ENTER_CHOOSE_BUILDING_SUBMENU(103),
        MINIMAP_SIGNAL(104),
        CONTINUE_GAME_AFTER_WIN_OR_DEFEAT(105),
        CONTINUE_GAME_AFTER_WIN_OR_DEFEAT2(106),
        UNKNOWN_0X75(117),
        UNKNOWN_0X7B(123);

        private final long id;
        ActionId(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ActionId> byId = new HashMap<Long, ActionId>(52);
        static {
            for (ActionId e : ActionId.values())
                byId.put(e.id(), e);
        }
        public static ActionId byId(long id) { return byId.get(id); }
    }

    public enum SlotStatus {
        EMPTY(0),
        CLOSED(1),
        USED(2);

        private final long id;
        SlotStatus(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, SlotStatus> byId = new HashMap<Long, SlotStatus>(3);
        static {
            for (SlotStatus e : SlotStatus.values())
                byId.put(e.id(), e);
        }
        public static SlotStatus byId(long id) { return byId.get(id); }
    }

    public enum Reason {
        REMOTE(1),
        LOCAL(12);

        private final long id;
        Reason(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Reason> byId = new HashMap<Long, Reason>(2);
        static {
            for (Reason e : Reason.values())
                byId.put(e.id(), e);
        }
        public static Reason byId(long id) { return byId.get(id); }
    }

    public enum CustomOrLadder {
        CUSTOM0(0),
        CUSTOM1(1),
        CUSTOM2(2),
        CUSTOM3(3),
        CUSTOM4(4),
        CUSTOM5(5),
        CUSTOM6(6),
        CUSTOM7(7),
        LADDER(8);

        private final long id;
        CustomOrLadder(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, CustomOrLadder> byId = new HashMap<Long, CustomOrLadder>(9);
        static {
            for (CustomOrLadder e : CustomOrLadder.values())
                byId.put(e.id(), e);
        }
        public static CustomOrLadder byId(long id) { return byId.get(id); }
    }

    public enum SlotController {
        HUMAN(0),
        COMPUTER(1);

        private final long id;
        SlotController(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, SlotController> byId = new HashMap<Long, SlotController>(2);
        static {
            for (SlotController e : SlotController.values())
                byId.put(e.id(), e);
        }
        public static SlotController byId(long id) { return byId.get(id); }
    }

    public enum Race {
        NONE(0),
        HUMAN(1),
        ORC(2),
        NIGHTELF(4),
        UNDEAD(8),
        DEMON(16),
        RANDOM(32),
        SELECTABLE_OR_FIXED(64);

        private final long id;
        Race(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Race> byId = new HashMap<Long, Race>(8);
        static {
            for (Race e : Race.values())
                byId.put(e.id(), e);
        }
        public static Race byId(long id) { return byId.get(id); }
    }

    public enum ChatTarget {
        ALL(0),
        ALLIES(1),
        OBSERVERS_OR_REFEREES(2);

        private final long id;
        ChatTarget(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ChatTarget> byId = new HashMap<Long, ChatTarget>(3);
        static {
            for (ChatTarget e : ChatTarget.values())
                byId.put(e.id(), e);
        }
        public static ChatTarget byId(long id) { return byId.get(id); }
    }

    public enum ChangeSelectionMode {
        ADD(1),
        REMOVE(2);

        private final long id;
        ChangeSelectionMode(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ChangeSelectionMode> byId = new HashMap<Long, ChangeSelectionMode>(2);
        static {
            for (ChangeSelectionMode e : ChangeSelectionMode.values())
                byId.put(e.id(), e);
        }
        public static ChangeSelectionMode byId(long id) { return byId.get(id); }
    }

    public enum SlotAiStrength {
        EASY(0),
        NORMAL(1),
        INSANE(2);

        private final long id;
        SlotAiStrength(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, SlotAiStrength> byId = new HashMap<Long, SlotAiStrength>(3);
        static {
            for (SlotAiStrength e : SlotAiStrength.values())
                byId.put(e.id(), e);
        }
        public static SlotAiStrength byId(long id) { return byId.get(id); }
    }

    public enum PrivatePublicEnum {
        PUBLIC(0),
        PRIVATE(8);

        private final long id;
        PrivatePublicEnum(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, PrivatePublicEnum> byId = new HashMap<Long, PrivatePublicEnum>(2);
        static {
            for (PrivatePublicEnum e : PrivatePublicEnum.values())
                byId.put(e.id(), e);
        }
        public static PrivatePublicEnum byId(long id) { return byId.get(id); }
    }

    public W3W3g(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3g(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3g(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.versionOrSmth = this._io.readU4le();
        this.player = new Player(this._io, this, _root, 1);
        this.gameName = new String(this._io.readBytesTerm((byte) 0, false, true, true), Charset.forName("UTF-8"));
        this.nullByte = this._io.readU1();
        this.compressedArea = new CompressedArea(this._io, this, _root);
        this.playerCount = this._io.readU4le();
        this.gameType = this._io.readU1();
        this.priv = this._io.readU1();
        this.unknown = this._io.readU2le();
        this.languageId = this._io.readU4le();
        this.playerOr0x19 = new PlayerOr0x19(this._io, this, _root);
        this.slotRecordsHeader = new SlotRecordsHeader(this._io, this, _root);
        this._raw_slotRecord = this._io.readBytes((slotRecordsHeader().slotRecordSize() * slotRecordsHeader().numSlotRecord()));
        KaitaiStream _io__raw_slotRecord = new ByteBufferKaitaiStream(_raw_slotRecord);
        this.slotRecord = new SlotRecordChunk(_io__raw_slotRecord, this, _root, slotRecordsHeader().slotRecordSize(), slotRecordsHeader().numSlotRecord());
        this.randomSeed = this._io.readU4le();
        this.selectMode = this._io.readU1();
        this.numStartPosition = this._io.readU1();
        this.block = new ArrayList<Block>();
        {
            int i = 0;
            while (!this._io.isEof()) {
                this.block.add(new Block(this._io, this, _root));
                i++;
            }
        }
    }
    public static class ActionCheatWhosYourDaddyPayload extends KaitaiStruct {
        public static ActionCheatWhosYourDaddyPayload fromFile(String fileName) throws IOException {
            return new ActionCheatWhosYourDaddyPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatWhosYourDaddyPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatWhosYourDaddyPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatWhosYourDaddyPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatISeeDeadPeoplePayload extends KaitaiStruct {
        public static ActionCheatISeeDeadPeoplePayload fromFile(String fileName) throws IOException {
            return new ActionCheatISeeDeadPeoplePayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatISeeDeadPeoplePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatISeeDeadPeoplePayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatISeeDeadPeoplePayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionSetGameSpeedPayload extends KaitaiStruct {
        public static ActionSetGameSpeedPayload fromFile(String fileName) throws IOException {
            return new ActionSetGameSpeedPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionSetGameSpeedPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionSetGameSpeedPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionSetGameSpeedPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.speed = W3W3g.SetGameSpeedSpeed.byId(this._io.readU1());
        }
        private SetGameSpeedSpeed speed;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public SetGameSpeedSpeed speed() { return speed; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCancelHeroRevivalPayload extends KaitaiStruct {
        public static ActionCancelHeroRevivalPayload fromFile(String fileName) throws IOException {
            return new ActionCancelHeroRevivalPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCancelHeroRevivalPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCancelHeroRevivalPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCancelHeroRevivalPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unitId1 = this._io.readU4le();
            this.unitId2 = this._io.readU4le();
        }
        private long unitId1;
        private long unitId2;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public long unitId1() { return unitId1; }
        public long unitId2() { return unitId2; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatTheDudeAbidesPayload extends KaitaiStruct {
        public static ActionCheatTheDudeAbidesPayload fromFile(String fileName) throws IOException {
            return new ActionCheatTheDudeAbidesPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatTheDudeAbidesPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatTheDudeAbidesPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatTheDudeAbidesPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatSomebodySetUpUsTheBombPayload extends KaitaiStruct {
        public static ActionCheatSomebodySetUpUsTheBombPayload fromFile(String fileName) throws IOException {
            return new ActionCheatSomebodySetUpUsTheBombPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatSomebodySetUpUsTheBombPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatSomebodySetUpUsTheBombPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatSomebodySetUpUsTheBombPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class OrderId extends KaitaiStruct {
        public static OrderId fromFile(String fileName) throws IOException {
            return new OrderId(new ByteBufferKaitaiStream(fileName));
        }

        public OrderId(KaitaiStream _io) {
            this(_io, null, null);
        }

        public OrderId(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public OrderId(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.rawBytes = this._io.readBytes(4);
        }
        private Integer orderId;
        public Integer orderId() {
            if (this.orderId != null)
                return this.orderId;
            int _tmp = (int) (((((((rawBytes()[3] * 256) * 256) * 256) + ((rawBytes()[2] * 256) * 256)) + (rawBytes()[1] * 256)) + rawBytes()[0]));
            this.orderId = _tmp;
            return this.orderId;
        }
        private String abilityId;
        public String abilityId() {
            if (this.abilityId != null)
                return this.abilityId;
            if (rawBytes()[3] > 0) {
                this.abilityId = new StringBuilder(new String(rawBytes(), StandardCharsets.US_ASCII)).reverse().toString();
            }
            return this.abilityId;
        }
        private byte[] rawBytes;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public byte[] rawBytes() { return rawBytes; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ActionAssignGroupHotkeyPayloadItem extends KaitaiStruct {
        public static ActionAssignGroupHotkeyPayloadItem fromFile(String fileName) throws IOException {
            return new ActionAssignGroupHotkeyPayloadItem(new ByteBufferKaitaiStream(fileName));
        }

        public ActionAssignGroupHotkeyPayloadItem(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionAssignGroupHotkeyPayloadItem(KaitaiStream _io, W3W3g.ActionAssignGroupHotkeyPayload _parent) {
            this(_io, _parent, null);
        }

        public ActionAssignGroupHotkeyPayloadItem(KaitaiStream _io, W3W3g.ActionAssignGroupHotkeyPayload _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.objectId1 = this._io.readU4le();
            this.objectId2 = this._io.readU4le();
        }
        private long objectId1;
        private long objectId2;
        private W3W3g _root;
        private W3W3g.ActionAssignGroupHotkeyPayload _parent;
        public long objectId1() { return objectId1; }
        public long objectId2() { return objectId2; }
        public W3W3g _root() { return _root; }
        public W3W3g.ActionAssignGroupHotkeyPayload _parent() { return _parent; }
    }
    public static class SlotRecordsHeader extends KaitaiStruct {
        public static SlotRecordsHeader fromFile(String fileName) throws IOException {
            return new SlotRecordsHeader(new ByteBufferKaitaiStream(fileName));
        }

        public SlotRecordsHeader(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SlotRecordsHeader(KaitaiStream _io, W3W3g _parent) {
            this(_io, _parent, null);
        }

        public SlotRecordsHeader(KaitaiStream _io, W3W3g _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numStartBytes = this._io.readU2le();
            this.numSlotRecord = this._io.readU1();
        }
        private Integer slotRecordSize;
        public Integer slotRecordSize() {
            if (this.slotRecordSize != null)
                return this.slotRecordSize;
            int _tmp = (int) ((((numStartBytes() - 4) - 3) / numSlotRecord()));
            this.slotRecordSize = _tmp;
            return this.slotRecordSize;
        }
        private int numStartBytes;
        private int numSlotRecord;
        private W3W3g _root;
        private W3W3g _parent;
        public int numStartBytes() { return numStartBytes; }
        public int numSlotRecord() { return numSlotRecord; }
        public W3W3g _root() { return _root; }
        public W3W3g _parent() { return _parent; }
    }
    public static class AbilityFlags extends KaitaiStruct {
        public static AbilityFlags fromFile(String fileName) throws IOException {
            return new AbilityFlags(new ByteBufferKaitaiStream(fileName));
        }

        public AbilityFlags(KaitaiStream _io) {
            this(_io, null, null);
        }

        public AbilityFlags(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public AbilityFlags(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.queueCommand = this._io.readU1();
            this.applyToAllUnitsInSubgroup = this._io.readU1();
            this.areaEffect = this._io.readU1();
            this.applyToAllUnitsInSelection = this._io.readU1();
            this.moveGroupWithoutFormation = this._io.readU1();
            this.unknown = this._io.readU1();
            this.subgroupCommand = this._io.readU1();
            this.unknown2 = this._io.readU1();
            this.autocast = this._io.readU1();
        }
        private int queueCommand;
        private int applyToAllUnitsInSubgroup;
        private int areaEffect;
        private int applyToAllUnitsInSelection;
        private int moveGroupWithoutFormation;
        private int unknown;
        private int subgroupCommand;
        private int unknown2;
        private int autocast;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public int queueCommand() { return queueCommand; }
        public int applyToAllUnitsInSubgroup() { return applyToAllUnitsInSubgroup; }
        public int areaEffect() { return areaEffect; }
        public int applyToAllUnitsInSelection() { return applyToAllUnitsInSelection; }
        public int moveGroupWithoutFormation() { return moveGroupWithoutFormation; }
        public int unknown() { return unknown; }
        public int subgroupCommand() { return subgroupCommand; }
        public int unknown2() { return unknown2; }
        public int autocast() { return autocast; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class PlayerMetaData extends KaitaiStruct {
        public static PlayerMetaData fromFile(String fileName) throws IOException {
            return new PlayerMetaData(new ByteBufferKaitaiStream(fileName));
        }

        public PlayerMetaData(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlayerMetaData(KaitaiStream _io, W3W3g.PlayerMetaDataLoop _parent) {
            this(_io, _parent, null);
        }

        public PlayerMetaData(KaitaiStream _io, W3W3g.PlayerMetaDataLoop _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.lenPlayerMetaDataContent = this._io.readU1();
            this._raw_playerMetaDataContent = this._io.readBytes(lenPlayerMetaDataContent());
            KaitaiStream _io__raw_playerMetaDataContent = new ByteBufferKaitaiStream(_raw_playerMetaDataContent);
            this.playerMetaDataContent = new PlayerMetaDataContent(_io__raw_playerMetaDataContent, this, _root);
        }
        private int lenPlayerMetaDataContent;
        private PlayerMetaDataContent playerMetaDataContent;
        private W3W3g _root;
        private W3W3g.PlayerMetaDataLoop _parent;
        private byte[] _raw_playerMetaDataContent;
        public int lenPlayerMetaDataContent() { return lenPlayerMetaDataContent; }
        public PlayerMetaDataContent playerMetaDataContent() { return playerMetaDataContent; }
        public W3W3g _root() { return _root; }
        public W3W3g.PlayerMetaDataLoop _parent() { return _parent; }
        public byte[] _raw_playerMetaDataContent() { return _raw_playerMetaDataContent; }
    }
    public static class ActionSaveGameFinishedPayload extends KaitaiStruct {
        public static ActionSaveGameFinishedPayload fromFile(String fileName) throws IOException {
            return new ActionSaveGameFinishedPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionSaveGameFinishedPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionSaveGameFinishedPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionSaveGameFinishedPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknown = this._io.readU4le();
        }
        private long unknown;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public long unknown() { return unknown; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatWarpTenPayload extends KaitaiStruct {
        public static ActionCheatWarpTenPayload fromFile(String fileName) throws IOException {
            return new ActionCheatWarpTenPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatWarpTenPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatWarpTenPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatWarpTenPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class SlotRecordChunk extends KaitaiStruct {

        public SlotRecordChunk(KaitaiStream _io, int slotRecordSize, int numSlotRecord) {
            this(_io, null, null, slotRecordSize, numSlotRecord);
        }

        public SlotRecordChunk(KaitaiStream _io, W3W3g _parent, int slotRecordSize, int numSlotRecord) {
            this(_io, _parent, null, slotRecordSize, numSlotRecord);
        }

        public SlotRecordChunk(KaitaiStream _io, W3W3g _parent, W3W3g _root, int slotRecordSize, int numSlotRecord) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.slotRecordSize = slotRecordSize;
            this.numSlotRecord = numSlotRecord;
            _read();
        }
        private void _read() {
            this.slotRecord = new ArrayList<SlotRecord>();
            for (int i = 0; i < numSlotRecord(); i++) {
                this.slotRecord.add(new SlotRecord(this._io, this, _root, slotRecordSize()));
            }
        }
        private ArrayList<SlotRecord> slotRecord;
        private int slotRecordSize;
        private int numSlotRecord;
        private W3W3g _root;
        private W3W3g _parent;
        public ArrayList<SlotRecord> slotRecord() { return slotRecord; }
        public int slotRecordSize() { return slotRecordSize; }
        public int numSlotRecord() { return numSlotRecord; }
        public W3W3g _root() { return _root; }
        public W3W3g _parent() { return _parent; }
    }
    public static class ActionChangeSelectionPayload extends KaitaiStruct {
        public static ActionChangeSelectionPayload fromFile(String fileName) throws IOException {
            return new ActionChangeSelectionPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionChangeSelectionPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionChangeSelectionPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionChangeSelectionPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.mode = W3W3g.ChangeSelectionMode.byId(this._io.readU1());
            this.numUnit = this._io.readU2le();
            this.unit = new ArrayList<ActionChangeSelectionPayloadUnit>();
            for (int i = 0; i < numUnit(); i++) {
                this.unit.add(new ActionChangeSelectionPayloadUnit(this._io, this, _root));
            }
        }
        private ChangeSelectionMode mode;
        private int numUnit;
        private ArrayList<ActionChangeSelectionPayloadUnit> unit;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public ChangeSelectionMode mode() { return mode; }
        public int numUnit() { return numUnit; }
        public ArrayList<ActionChangeSelectionPayloadUnit> unit() { return unit; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionUnitBuildingAbilityPayload extends KaitaiStruct {
        public static ActionUnitBuildingAbilityPayload fromFile(String fileName) throws IOException {
            return new ActionUnitBuildingAbilityPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionUnitBuildingAbilityPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionUnitBuildingAbilityPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionUnitBuildingAbilityPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.abilityFlags = this._io.readU2le();
            this.orderId = new OrderId(this._io, this, _root);
            this.unknownA = this._io.readU4le();
            this.unknownB = this._io.readU4le();
        }
        private int abilityFlags;
        private OrderId orderId;
        private long unknownA;
        private long unknownB;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int abilityFlags() { return abilityFlags; }
        public OrderId orderId() { return orderId; }
        public long unknownA() { return unknownA; }
        public long unknownB() { return unknownB; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionScenarioTriggerPayload extends KaitaiStruct {
        public static ActionScenarioTriggerPayload fromFile(String fileName) throws IOException {
            return new ActionScenarioTriggerPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionScenarioTriggerPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionScenarioTriggerPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionScenarioTriggerPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknownA = this._io.readU4le();
            this.unknownB = this._io.readU4le();
            this.unknownCounter = this._io.readU4le();
        }
        private long unknownA;
        private long unknownB;
        private long unknownCounter;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public long unknownA() { return unknownA; }
        public long unknownB() { return unknownB; }
        public long unknownCounter() { return unknownCounter; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class TimeSlot extends KaitaiStruct {
        public static TimeSlot fromFile(String fileName) throws IOException {
            return new TimeSlot(new ByteBufferKaitaiStream(fileName));
        }

        public TimeSlot(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TimeSlot(KaitaiStream _io, W3W3g.Block _parent) {
            this(_io, _parent, null);
        }

        public TimeSlot(KaitaiStream _io, W3W3g.Block _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.n = this._io.readU2le();
            this.timeIncrementMs = this._io.readU2le();
            if (n() > 2) {
                this._raw_commandData = this._io.readBytes((n() - 2));
                KaitaiStream _io__raw_commandData = new ByteBufferKaitaiStream(_raw_commandData);
                this.commandData = new CommandData(_io__raw_commandData, this, _root);
            }
        }
        private int n;
        private int timeIncrementMs;
        private CommandData commandData;
        private W3W3g _root;
        private W3W3g.Block _parent;
        private byte[] _raw_commandData;
        public int n() { return n; }
        public int timeIncrementMs() { return timeIncrementMs; }
        public CommandData commandData() { return commandData; }
        public W3W3g _root() { return _root; }
        public W3W3g.Block _parent() { return _parent; }
        public byte[] _raw_commandData() { return _raw_commandData; }
    }
    public static class ActionMapTriggerChatCommandPayload extends KaitaiStruct {
        public static ActionMapTriggerChatCommandPayload fromFile(String fileName) throws IOException {
            return new ActionMapTriggerChatCommandPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionMapTriggerChatCommandPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionMapTriggerChatCommandPayload(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public ActionMapTriggerChatCommandPayload(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknownA = this._io.readU4le();
            this.unknownB = this._io.readU4le();
            this.chatCommandOrTriggerName = new String(this._io.readBytesTerm((byte) 0, false, true, true), Charset.forName("UTF-8"));
        }
        private long unknownA;
        private long unknownB;
        private String chatCommandOrTriggerName;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public long unknownA() { return unknownA; }
        public long unknownB() { return unknownB; }
        public String chatCommandOrTriggerName() { return chatCommandOrTriggerName; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ActionChangeSelectionPayloadUnit extends KaitaiStruct {
        public static ActionChangeSelectionPayloadUnit fromFile(String fileName) throws IOException {
            return new ActionChangeSelectionPayloadUnit(new ByteBufferKaitaiStream(fileName));
        }

        public ActionChangeSelectionPayloadUnit(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionChangeSelectionPayloadUnit(KaitaiStream _io, W3W3g.ActionChangeSelectionPayload _parent) {
            this(_io, _parent, null);
        }

        public ActionChangeSelectionPayloadUnit(KaitaiStream _io, W3W3g.ActionChangeSelectionPayload _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.objectId1 = this._io.readU4le();
            if (!(_io().isEof())) {
                this.objectId2 = this._io.readU4le();
            }
        }
        private long objectId1;
        private Long objectId2;
        private W3W3g _root;
        private W3W3g.ActionChangeSelectionPayload _parent;
        public long objectId1() { return objectId1; }
        public Long objectId2() { return objectId2; }
        public W3W3g _root() { return _root; }
        public W3W3g.ActionChangeSelectionPayload _parent() { return _parent; }
    }
    public static class ActionUnknown0x21Payload extends KaitaiStruct {
        public static ActionUnknown0x21Payload fromFile(String fileName) throws IOException {
            return new ActionUnknown0x21Payload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionUnknown0x21Payload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionUnknown0x21Payload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionUnknown0x21Payload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknownA = this._io.readU4le();
            this.unknownB = this._io.readU4le();
        }
        private long unknownA;
        private long unknownB;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public long unknownA() { return unknownA; }
        public long unknownB() { return unknownB; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionMinimapSignalPayload extends KaitaiStruct {
        public static ActionMinimapSignalPayload fromFile(String fileName) throws IOException {
            return new ActionMinimapSignalPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionMinimapSignalPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionMinimapSignalPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionMinimapSignalPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
            this.unknown = this._io.readU4le();
        }
        private float x;
        private float y;
        private long unknown;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public float x() { return x; }
        public float y() { return y; }
        public long unknown() { return unknown; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionUnknown0x7bPayload extends KaitaiStruct {
        public static ActionUnknown0x7bPayload fromFile(String fileName) throws IOException {
            return new ActionUnknown0x7bPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionUnknown0x7bPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionUnknown0x7bPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionUnknown0x7bPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.x = this._io.readU4le();
            this.y = this._io.readU4le();
            this.orderId1 = new OrderId(this._io, this, _root);
            this.orderId2 = new OrderId(this._io, this, _root);
        }
        private long x;
        private long y;
        private OrderId orderId1;
        private OrderId orderId2;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public long x() { return x; }
        public long y() { return y; }
        public OrderId orderId1() { return orderId1; }
        public OrderId orderId2() { return orderId2; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionSaveGamePayload extends KaitaiStruct {
        public static ActionSaveGamePayload fromFile(String fileName) throws IOException {
            return new ActionSaveGamePayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionSaveGamePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionSaveGamePayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionSaveGamePayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new String(this._io.readBytesTerm((byte) 0, false, true, true), Charset.forName("UTF-8"));
        }
        private String name;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public String name() { return name; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class LeaveGame extends KaitaiStruct {
        public static LeaveGame fromFile(String fileName) throws IOException {
            return new LeaveGame(new ByteBufferKaitaiStream(fileName));
        }

        public LeaveGame(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LeaveGame(KaitaiStream _io, W3W3g.Block _parent) {
            this(_io, _parent, null);
        }

        public LeaveGame(KaitaiStream _io, W3W3g.Block _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.reason = W3W3g.Reason.byId(this._io.readU4le());
            this.playerId = this._io.readU1();
            this.res = this._io.readU4le();
            this.unknownFlag = this._io.readU4le();
        }
        private Reason reason;
        private int playerId;
        private long res;
        private long unknownFlag;
        private W3W3g _root;
        private W3W3g.Block _parent;
        public Reason reason() { return reason; }
        public int playerId() { return playerId; }
        public long res() { return res; }
        public long unknownFlag() { return unknownFlag; }
        public W3W3g _root() { return _root; }
        public W3W3g.Block _parent() { return _parent; }
    }
    public static class ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload extends KaitaiStruct {
        public static ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload fromFile(String fileName) throws IOException {
            return new ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.abilityFlags = this._io.readU2le();
            this.orderId = new OrderId(this._io, this, _root);
            this.unknownA = this._io.readU4le();
            this.unknownB = this._io.readU4le();
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
            this.objectId1 = this._io.readU4le();
            this.objectId2 = this._io.readU4le();
        }
        private int abilityFlags;
        private OrderId orderId;
        private long unknownA;
        private long unknownB;
        private float x;
        private float y;
        private long objectId1;
        private long objectId2;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int abilityFlags() { return abilityFlags; }
        public OrderId orderId() { return orderId; }
        public long unknownA() { return unknownA; }
        public long unknownB() { return unknownB; }
        public float x() { return x; }
        public float y() { return y; }
        public long objectId1() { return objectId1; }
        public long objectId2() { return objectId2; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionEscPressedPayload extends KaitaiStruct {
        public static ActionEscPressedPayload fromFile(String fileName) throws IOException {
            return new ActionEscPressedPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionEscPressedPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionEscPressedPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionEscPressedPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionSelectGroundItemPayload extends KaitaiStruct {
        public static ActionSelectGroundItemPayload fromFile(String fileName) throws IOException {
            return new ActionSelectGroundItemPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionSelectGroundItemPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionSelectGroundItemPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionSelectGroundItemPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknown = this._io.readU1();
            this.objectId1 = this._io.readU4le();
            this.objectId2 = this._io.readU4le();
        }
        private int unknown;
        private long objectId1;
        private long objectId2;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int unknown() { return unknown; }
        public long objectId1() { return objectId1; }
        public long objectId2() { return objectId2; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatIocainePowderPayload extends KaitaiStruct {
        public static ActionCheatIocainePowderPayload fromFile(String fileName) throws IOException {
            return new ActionCheatIocainePowderPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatIocainePowderPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatIocainePowderPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatIocainePowderPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatAllYourBaseAreBelongToUsPayload extends KaitaiStruct {
        public static ActionCheatAllYourBaseAreBelongToUsPayload fromFile(String fileName) throws IOException {
            return new ActionCheatAllYourBaseAreBelongToUsPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatAllYourBaseAreBelongToUsPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatAllYourBaseAreBelongToUsPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatAllYourBaseAreBelongToUsPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class PlayerOr0x19Loop extends KaitaiStruct {

        public PlayerOr0x19Loop(KaitaiStream _io, int count) {
            this(_io, null, null, count);
        }

        public PlayerOr0x19Loop(KaitaiStream _io, KaitaiStruct _parent, int count) {
            this(_io, _parent, null, count);
        }

        public PlayerOr0x19Loop(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root, int count) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.count = count;
            _read();
        }
        private void _read() {
            this.discriminator = this._io.readU1();
            if (discriminator() == 22) {
                this.player = new Player(this._io, this, _root, 0);
            }
            if (discriminator() == 22) {
                this.padding = this._io.readU4le();
            }
            if (discriminator() == 22) {
                this.next = new PlayerOr0x19Loop(this._io, this, _root, (count() + 1));
            }
            if ( ((discriminator() != 22) && (discriminator() != 25)) ) {
                this.playerMetaDataChunk = new PlayerMetaDataChunk(this._io, this, _root);
            }
        }
        private int discriminator;
        private Player player;
        private Long padding;
        private PlayerOr0x19Loop next;
        private PlayerMetaDataChunk playerMetaDataChunk;
        private int count;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public int discriminator() { return discriminator; }
        public Player player() { return player; }
        public Long padding() { return padding; }
        public PlayerOr0x19Loop next() { return next; }
        public PlayerMetaDataChunk playerMetaDataChunk() { return playerMetaDataChunk; }
        public int count() { return count; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class CommandData extends KaitaiStruct {
        public static CommandData fromFile(String fileName) throws IOException {
            return new CommandData(new ByteBufferKaitaiStream(fileName));
        }

        public CommandData(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CommandData(KaitaiStream _io, W3W3g.TimeSlot _parent) {
            this(_io, _parent, null);
        }

        public CommandData(KaitaiStream _io, W3W3g.TimeSlot _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.playerId = this._io.readU1();
            this.lenActionBlock = this._io.readU2le();
            this._raw_actionBlock = this._io.readBytes(lenActionBlock());
            KaitaiStream _io__raw_actionBlock = new ByteBufferKaitaiStream(_raw_actionBlock);
            this.actionBlock = new ActionBlock(_io__raw_actionBlock, this, _root);
        }
        private int playerId;
        private int lenActionBlock;
        private ActionBlock actionBlock;
        private W3W3g _root;
        private W3W3g.TimeSlot _parent;
        private byte[] _raw_actionBlock;
        public int playerId() { return playerId; }
        public int lenActionBlock() { return lenActionBlock; }
        public ActionBlock actionBlock() { return actionBlock; }
        public W3W3g _root() { return _root; }
        public W3W3g.TimeSlot _parent() { return _parent; }
        public byte[] _raw_actionBlock() { return _raw_actionBlock; }
    }
    public static class ActionCheatStrengthAndHonorPayload extends KaitaiStruct {
        public static ActionCheatStrengthAndHonorPayload fromFile(String fileName) throws IOException {
            return new ActionCheatStrengthAndHonorPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatStrengthAndHonorPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatStrengthAndHonorPayload(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatStrengthAndHonorPayload(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Chat extends KaitaiStruct {
        public static Chat fromFile(String fileName) throws IOException {
            return new Chat(new ByteBufferKaitaiStream(fileName));
        }

        public Chat(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Chat(KaitaiStream _io, W3W3g.Block _parent) {
            this(_io, _parent, null);
        }

        public Chat(KaitaiStream _io, W3W3g.Block _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.playerSenderId = this._io.readU1();
            this.size = this._io.readU2le();
            this.flags = this._io.readU1();
            if (flags() != 16) {
                this.chatRecipientIndex = this._io.readU4le();
            }
            this.message = new String(this._io.readBytesTerm((byte) 0, false, true, true), Charset.forName("UTF-8"));
        }
        private int playerSenderId;
        private int size;
        private int flags;
        private Long chatRecipientIndex;
        private String message;
        private W3W3g _root;
        private W3W3g.Block _parent;
        public int playerSenderId() { return playerSenderId; }
        public int size() { return size; }
        public int flags() { return flags; }
        public Long chatRecipientIndex() { return chatRecipientIndex; }
        public String message() { return message; }
        public W3W3g _root() { return _root; }
        public W3W3g.Block _parent() { return _parent; }
    }
    public static class ActionCheatWhoIsJohnGaltPayload extends KaitaiStruct {
        public static ActionCheatWhoIsJohnGaltPayload fromFile(String fileName) throws IOException {
            return new ActionCheatWhoIsJohnGaltPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatWhoIsJohnGaltPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatWhoIsJohnGaltPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatWhoIsJohnGaltPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionEnterChooseBuildingSubmenuPayload extends KaitaiStruct {
        public static ActionEnterChooseBuildingSubmenuPayload fromFile(String fileName) throws IOException {
            return new ActionEnterChooseBuildingSubmenuPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionEnterChooseBuildingSubmenuPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionEnterChooseBuildingSubmenuPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionEnterChooseBuildingSubmenuPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatSynergyPayload extends KaitaiStruct {
        public static ActionCheatSynergyPayload fromFile(String fileName) throws IOException {
            return new ActionCheatSynergyPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatSynergyPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatSynergyPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatSynergyPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionContinueGameAfterWinOrDefeat2Payload extends KaitaiStruct {
        public static ActionContinueGameAfterWinOrDefeat2Payload fromFile(String fileName) throws IOException {
            return new ActionContinueGameAfterWinOrDefeat2Payload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionContinueGameAfterWinOrDefeat2Payload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionContinueGameAfterWinOrDefeat2Payload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionContinueGameAfterWinOrDefeat2Payload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.a = this._io.readU4le();
            this.b = this._io.readU4le();
            this.c = this._io.readU4le();
            this.d = this._io.readU4le();
        }
        private long a;
        private long b;
        private long c;
        private long d;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public long a() { return a; }
        public long b() { return b; }
        public long c() { return c; }
        public long d() { return d; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionSelectSubgroupPayload extends KaitaiStruct {
        public static ActionSelectSubgroupPayload fromFile(String fileName) throws IOException {
            return new ActionSelectSubgroupPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionSelectSubgroupPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionSelectSubgroupPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionSelectSubgroupPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.itemId = new String(this._io.readBytes(4), Charset.forName("ASCII"));
            this.objectId1 = this._io.readU4le();
            this.objectId2 = this._io.readU4le();
        }
        private String itemId;
        private long objectId1;
        private long objectId2;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public String itemId() { return itemId; }
        public long objectId1() { return objectId1; }
        public long objectId2() { return objectId2; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class Block extends KaitaiStruct {
        public static Block fromFile(String fileName) throws IOException {
            return new Block(new ByteBufferKaitaiStream(fileName));
        }

        public Block(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Block(KaitaiStream _io, W3W3g _parent) {
            this(_io, _parent, null);
        }

        public Block(KaitaiStream _io, W3W3g _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.blockId = this._io.readU1();
            if (blockId() == 23) {
                this.leaveGame = new LeaveGame(this._io, this, _root);
            }
            if ( ((blockId() == 26) || (blockId() == 27) || (blockId() == 28)) ) {
                this.block0x1a0x1b0x1cSkip = new ArrayList<Integer>();
                for (int i = 0; i < 4; i++) {
                    this.block0x1a0x1b0x1cSkip.add(this._io.readU1());
                }
            }
            if ( ((blockId() == 30) || (blockId() == 31)) ) {
                this.timeSlot = new TimeSlot(this._io, this, _root);
            }
            if (blockId() == 32) {
                this.chat = new Chat(this._io, this, _root);
            }
            if (blockId() == 34) {
                this.block0x22Skip = new ArrayList<Integer>();
                for (int i = 0; i < 5; i++) {
                    this.block0x22Skip.add(this._io.readU1());
                }
            }
            if (blockId() == 35) {
                this.block0x23Skip = new ArrayList<Integer>();
                for (int i = 0; i < 11; i++) {
                    this.block0x23Skip.add(this._io.readU1());
                }
            }
            if (blockId() == 47) {
                this.countdown = new Countdown(this._io, this, _root);
            }
        }
        private int blockId;
        private LeaveGame leaveGame;
        private ArrayList<Integer> block0x1a0x1b0x1cSkip;
        private TimeSlot timeSlot;
        private Chat chat;
        private ArrayList<Integer> block0x22Skip;
        private ArrayList<Integer> block0x23Skip;
        private Countdown countdown;
        private W3W3g _root;
        private W3W3g _parent;
        public int blockId() { return blockId; }
        public LeaveGame leaveGame() { return leaveGame; }
        public ArrayList<Integer> block0x1a0x1b0x1cSkip() { return block0x1a0x1b0x1cSkip; }
        public TimeSlot timeSlot() { return timeSlot; }
        public Chat chat() { return chat; }
        public ArrayList<Integer> block0x22Skip() { return block0x22Skip; }
        public ArrayList<Integer> block0x23Skip() { return block0x23Skip; }
        public Countdown countdown() { return countdown; }
        public W3W3g _root() { return _root; }
        public W3W3g _parent() { return _parent; }
    }
    public static class CompressedArea extends KaitaiStruct {
        public static CompressedArea fromFile(String fileName) throws IOException {
            return new CompressedArea(new ByteBufferKaitaiStream(fileName));
        }

        public CompressedArea(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CompressedArea(KaitaiStream _io, W3W3g _parent) {
            this(_io, _parent, null);
        }

        public CompressedArea(KaitaiStream _io, W3W3g _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this._raw_content = this._io.readBytesTerm((byte) 0, false, true, true);
            BlizzardDecompress _process__raw_content = new BlizzardDecompress();
            this.content = _process__raw_content.decode(_raw_content);
        }
        private byte[] content;
        private W3W3g _root;
        private W3W3g _parent;
        private byte[] _raw_content;
        public byte[] content() { return content; }
        public W3W3g _root() { return _root; }
        public W3W3g _parent() { return _parent; }
        public byte[] _raw_content() { return _raw_content; }
    }
    public static class PlayerMetaDataChunk extends KaitaiStruct {
        public static PlayerMetaDataChunk fromFile(String fileName) throws IOException {
            return new PlayerMetaDataChunk(new ByteBufferKaitaiStream(fileName));
        }

        public PlayerMetaDataChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlayerMetaDataChunk(KaitaiStream _io, W3W3g.PlayerOr0x19Loop _parent) {
            this(_io, _parent, null);
        }

        public PlayerMetaDataChunk(KaitaiStream _io, W3W3g.PlayerOr0x19Loop _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.skipToMeta = new ArrayList<Integer>();
            for (int i = 0; i < 11; i++) {
                this.skipToMeta.add(this._io.readU1());
            }
            this.playerMetaDataLoop = new PlayerMetaDataLoop(this._io, this, _root, 0);
        }
        private ArrayList<Integer> skipToMeta;
        private PlayerMetaDataLoop playerMetaDataLoop;
        private W3W3g _root;
        private W3W3g.PlayerOr0x19Loop _parent;
        public ArrayList<Integer> skipToMeta() { return skipToMeta; }
        public PlayerMetaDataLoop playerMetaDataLoop() { return playerMetaDataLoop; }
        public W3W3g _root() { return _root; }
        public W3W3g.PlayerOr0x19Loop _parent() { return _parent; }
    }
    public static class Player extends KaitaiStruct {

        public Player(KaitaiStream _io, int useHost) {
            this(_io, null, null, useHost);
        }

        public Player(KaitaiStream _io, KaitaiStruct _parent, int useHost) {
            this(_io, _parent, null, useHost);
        }

        public Player(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root, int useHost) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.useHost = useHost;
            _read();
        }
        private void _read() {
            if (useHost() != 0) {
                this.nonHost = this._io.readU1();
            }
            this.playerId = this._io.readU1();
            this.name = new String(this._io.readBytesTerm((byte) 0, false, true, true), Charset.forName("UTF-8"));
            this.customOrLadderIndex = this._io.readU1();
            this.customOrLadderSkip = this._io.readBytes(customOrLadderIndex());
            if (customOrLadderIndex() == 8) {
                this.runtime = this._io.readU4le();
            }
            if (customOrLadderIndex() == 8) {
                this.raceIndex = this._io.readU4le();
            }
        }
        private CustomOrLadder customOrLadderEnum;
        public CustomOrLadder customOrLadderEnum() {
            if (this.customOrLadderEnum != null)
                return this.customOrLadderEnum;
            this.customOrLadderEnum = W3W3g.CustomOrLadder.byId(customOrLadderIndex());
            return this.customOrLadderEnum;
        }
        private Race race;
        public Race race() {
            if (this.race != null)
                return this.race;
            this.race = W3W3g.Race.byId(raceIndex());
            return this.race;
        }
        private Integer nonHost;
        private int playerId;
        private String name;
        private int customOrLadderIndex;
        private byte[] customOrLadderSkip;
        private Long runtime;
        private Long raceIndex;
        private int useHost;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public Integer nonHost() { return nonHost; }
        public int playerId() { return playerId; }
        public String name() { return name; }
        public int customOrLadderIndex() { return customOrLadderIndex; }
        public byte[] customOrLadderSkip() { return customOrLadderSkip; }
        public Long runtime() { return runtime; }
        public Long raceIndex() { return raceIndex; }
        public int useHost() { return useHost; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ActionCheatThereIsNoSpoonPayload extends KaitaiStruct {
        public static ActionCheatThereIsNoSpoonPayload fromFile(String fileName) throws IOException {
            return new ActionCheatThereIsNoSpoonPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatThereIsNoSpoonPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatThereIsNoSpoonPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatThereIsNoSpoonPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionGiveOrDropItemPayload extends KaitaiStruct {
        public static ActionGiveOrDropItemPayload fromFile(String fileName) throws IOException {
            return new ActionGiveOrDropItemPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionGiveOrDropItemPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionGiveOrDropItemPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionGiveOrDropItemPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.abilityFlags = this._io.readU2le();
            this.orderId = new OrderId(this._io, this, _root);
            this.unknownA = this._io.readU4le();
            this.unknownB = this._io.readU4le();
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
            this.targetObjectId1 = this._io.readU4le();
            this.targetObjectId2 = this._io.readU4le();
            this.itemObjectId1 = this._io.readU4le();
            this.itemObjectId2 = this._io.readU4le();
        }
        private int abilityFlags;
        private OrderId orderId;
        private long unknownA;
        private long unknownB;
        private float x;
        private float y;
        private long targetObjectId1;
        private long targetObjectId2;
        private long itemObjectId1;
        private long itemObjectId2;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int abilityFlags() { return abilityFlags; }
        public OrderId orderId() { return orderId; }
        public long unknownA() { return unknownA; }
        public long unknownB() { return unknownB; }
        public float x() { return x; }
        public float y() { return y; }
        public long targetObjectId1() { return targetObjectId1; }
        public long targetObjectId2() { return targetObjectId2; }
        public long itemObjectId1() { return itemObjectId1; }
        public long itemObjectId2() { return itemObjectId2; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionDecreaseGameSpeedPayload extends KaitaiStruct {
        public static ActionDecreaseGameSpeedPayload fromFile(String fileName) throws IOException {
            return new ActionDecreaseGameSpeedPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionDecreaseGameSpeedPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionDecreaseGameSpeedPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionDecreaseGameSpeedPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionTransferResourcesPayload extends KaitaiStruct {
        public static ActionTransferResourcesPayload fromFile(String fileName) throws IOException {
            return new ActionTransferResourcesPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionTransferResourcesPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionTransferResourcesPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionTransferResourcesPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.playerSlotIndex = this._io.readU1();
            this.goldAmount = this._io.readU4le();
            this.lumberAmount = this._io.readU4le();
        }
        private int playerSlotIndex;
        private long goldAmount;
        private long lumberAmount;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int playerSlotIndex() { return playerSlotIndex; }
        public long goldAmount() { return goldAmount; }
        public long lumberAmount() { return lumberAmount; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionSelectGroupHotkeyPayload extends KaitaiStruct {
        public static ActionSelectGroupHotkeyPayload fromFile(String fileName) throws IOException {
            return new ActionSelectGroupHotkeyPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionSelectGroupHotkeyPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionSelectGroupHotkeyPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionSelectGroupHotkeyPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.groupIndex = this._io.readU1();
            this.unknown = this._io.readU1();
        }
        private int groupIndex;
        private int unknown;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int groupIndex() { return groupIndex; }
        public int unknown() { return unknown; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionBlock extends KaitaiStruct {
        public static ActionBlock fromFile(String fileName) throws IOException {
            return new ActionBlock(new ByteBufferKaitaiStream(fileName));
        }

        public ActionBlock(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionBlock(KaitaiStream _io, W3W3g.CommandData _parent) {
            this(_io, _parent, null);
        }

        public ActionBlock(KaitaiStream _io, W3W3g.CommandData _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.action = new ArrayList<Action>();
            {
                int i = 0;
                while (!this._io.isEof()) {
                    this.action.add(new Action(this._io, this, _root));
                    i++;
                }
            }
        }
        private ArrayList<Action> action;
        private W3W3g _root;
        private W3W3g.CommandData _parent;
        public ArrayList<Action> action() { return action; }
        public W3W3g _root() { return _root; }
        public W3W3g.CommandData _parent() { return _parent; }
    }
    public static class ActionNothingTakeRest extends KaitaiStruct {
        public static ActionNothingTakeRest fromFile(String fileName) throws IOException {
            return new ActionNothingTakeRest(new ByteBufferKaitaiStream(fileName));
        }

        public ActionNothingTakeRest(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionNothingTakeRest(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionNothingTakeRest(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytesFull();
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionResumeGamePayload extends KaitaiStruct {
        public static ActionResumeGamePayload fromFile(String fileName) throws IOException {
            return new ActionResumeGamePayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionResumeGamePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionResumeGamePayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionResumeGamePayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionEnterChooseHeroSkillSubmenuPayload extends KaitaiStruct {
        public static ActionEnterChooseHeroSkillSubmenuPayload fromFile(String fileName) throws IOException {
            return new ActionEnterChooseHeroSkillSubmenuPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionEnterChooseHeroSkillSubmenuPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionEnterChooseHeroSkillSubmenuPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionEnterChooseHeroSkillSubmenuPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionContinueGameAfterWinOrDefeatPayload extends KaitaiStruct {
        public static ActionContinueGameAfterWinOrDefeatPayload fromFile(String fileName) throws IOException {
            return new ActionContinueGameAfterWinOrDefeatPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionContinueGameAfterWinOrDefeatPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionContinueGameAfterWinOrDefeatPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionContinueGameAfterWinOrDefeatPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.a = this._io.readU4le();
            this.b = this._io.readU4le();
            this.c = this._io.readU4le();
            this.d = this._io.readU4le();
        }
        private long a;
        private long b;
        private long c;
        private long d;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public long a() { return a; }
        public long b() { return b; }
        public long c() { return c; }
        public long d() { return d; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionIncreaseGameSpeedPayload extends KaitaiStruct {
        public static ActionIncreaseGameSpeedPayload fromFile(String fileName) throws IOException {
            return new ActionIncreaseGameSpeedPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionIncreaseGameSpeedPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionIncreaseGameSpeedPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionIncreaseGameSpeedPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ChangeAllyOptionsFlags extends KaitaiStruct {
        public static ChangeAllyOptionsFlags fromFile(String fileName) throws IOException {
            return new ChangeAllyOptionsFlags(new ByteBufferKaitaiStream(fileName));
        }

        public ChangeAllyOptionsFlags(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChangeAllyOptionsFlags(KaitaiStream _io, W3W3g.ActionChangeAllyOptionsPayload _parent) {
            this(_io, _parent, null);
        }

        public ChangeAllyOptionsFlags(KaitaiStream _io, W3W3g.ActionChangeAllyOptionsPayload _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.alliedWithPlayer = new ArrayList<Boolean>();
            for (int i = 0; i < 5; i++) {
                this.alliedWithPlayer.add(this._io.readBitsIntBe(1) != 0);
            }
            this.visionShared = this._io.readBitsIntBe(1) != 0;
            this.sharedControl = this._io.readBitsIntBe(1) != 0;
            this.unknown = new ArrayList<Boolean>();
            for (int i = 0; i < 3; i++) {
                this.unknown.add(this._io.readBitsIntBe(1) != 0);
            }
            this.alliedVictory = this._io.readBitsIntBe(1) != 0;
        }
        private ArrayList<Boolean> alliedWithPlayer;
        private boolean visionShared;
        private boolean sharedControl;
        private ArrayList<Boolean> unknown;
        private boolean alliedVictory;
        private W3W3g _root;
        private W3W3g.ActionChangeAllyOptionsPayload _parent;
        public ArrayList<Boolean> alliedWithPlayer() { return alliedWithPlayer; }
        public boolean visionShared() { return visionShared; }
        public boolean sharedControl() { return sharedControl; }
        public ArrayList<Boolean> unknown() { return unknown; }
        public boolean alliedVictory() { return alliedVictory; }
        public W3W3g _root() { return _root; }
        public W3W3g.ActionChangeAllyOptionsPayload _parent() { return _parent; }
    }
    public static class ActionCheatLeafitToMePayload extends KaitaiStruct {
        public static ActionCheatLeafitToMePayload fromFile(String fileName) throws IOException {
            return new ActionCheatLeafitToMePayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatLeafitToMePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatLeafitToMePayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatLeafitToMePayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknown = this._io.readU1();
            this.amount = this._io.readU4le();
        }
        private int unknown;
        private long amount;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int unknown() { return unknown; }
        public long amount() { return amount; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionRemoveUnitFromBuildingQueuePayload extends KaitaiStruct {
        public static ActionRemoveUnitFromBuildingQueuePayload fromFile(String fileName) throws IOException {
            return new ActionRemoveUnitFromBuildingQueuePayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionRemoveUnitFromBuildingQueuePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionRemoveUnitFromBuildingQueuePayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionRemoveUnitFromBuildingQueuePayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.slotIndex = this._io.readU1();
            this.itemId = this._io.readU4le();
        }
        private int slotIndex;
        private long itemId;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int slotIndex() { return slotIndex; }
        public long itemId() { return itemId; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatItVexesMePayload extends KaitaiStruct {
        public static ActionCheatItVexesMePayload fromFile(String fileName) throws IOException {
            return new ActionCheatItVexesMePayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatItVexesMePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatItVexesMePayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatItVexesMePayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload extends KaitaiStruct {
        public static ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload fromFile(String fileName) throws IOException {
            return new ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.abilityFlags = this._io.readU2le();
            this.orderIdA = new OrderId(this._io, this, _root);
            this.unknownA = this._io.readU4le();
            this.unknownB = this._io.readU4le();
            this.xA = this._io.readF4le();
            this.yA = this._io.readF4le();
            this.orderIdB = new OrderId(this._io, this, _root);
            this.unknown = new ArrayList<Integer>();
            for (int i = 0; i < 9; i++) {
                this.unknown.add(this._io.readU1());
            }
            this.xB = this._io.readF4le();
            this.yB = this._io.readF4le();
        }
        private int abilityFlags;
        private OrderId orderIdA;
        private long unknownA;
        private long unknownB;
        private float xA;
        private float yA;
        private OrderId orderIdB;
        private ArrayList<Integer> unknown;
        private float xB;
        private float yB;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int abilityFlags() { return abilityFlags; }
        public OrderId orderIdA() { return orderIdA; }
        public long unknownA() { return unknownA; }
        public long unknownB() { return unknownB; }
        public float xA() { return xA; }
        public float yA() { return yA; }
        public OrderId orderIdB() { return orderIdB; }
        public ArrayList<Integer> unknown() { return unknown; }
        public float xB() { return xB; }
        public float yB() { return yB; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionChangeAllyOptionsPayload extends KaitaiStruct {
        public static ActionChangeAllyOptionsPayload fromFile(String fileName) throws IOException {
            return new ActionChangeAllyOptionsPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionChangeAllyOptionsPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionChangeAllyOptionsPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionChangeAllyOptionsPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.playerSlotIndex = this._io.readU1();
            this._raw_flags = this._io.readBytes(4);
            KaitaiStream _io__raw_flags = new ByteBufferKaitaiStream(_raw_flags);
            this.flags = new ChangeAllyOptionsFlags(_io__raw_flags, this, _root);
        }
        private int playerSlotIndex;
        private ChangeAllyOptionsFlags flags;
        private W3W3g _root;
        private W3W3g.Action _parent;
        private byte[] _raw_flags;
        public int playerSlotIndex() { return playerSlotIndex; }
        public ChangeAllyOptionsFlags flags() { return flags; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
        public byte[] _raw_flags() { return _raw_flags; }
    }
    public static class PlayerMetaDataLoop extends KaitaiStruct {

        public PlayerMetaDataLoop(KaitaiStream _io, int count) {
            this(_io, null, null, count);
        }

        public PlayerMetaDataLoop(KaitaiStream _io, KaitaiStruct _parent, int count) {
            this(_io, _parent, null, count);
        }

        public PlayerMetaDataLoop(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root, int count) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.count = count;
            _read();
        }
        private void _read() {
            this.discriminator = this._io.readU1();
            if (discriminator() != 25) {
                this.playerMetaData = new PlayerMetaData(this._io, this, _root);
            }
            if (discriminator() != 25) {
                this.next = new PlayerMetaDataLoop(this._io, this, _root, (count() + 1));
            }
        }
        private int discriminator;
        private PlayerMetaData playerMetaData;
        private PlayerMetaDataLoop next;
        private int count;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public int discriminator() { return discriminator; }
        public PlayerMetaData playerMetaData() { return playerMetaData; }
        public PlayerMetaDataLoop next() { return next; }
        public int count() { return count; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ActionCheatPointBreakPayload extends KaitaiStruct {
        public static ActionCheatPointBreakPayload fromFile(String fileName) throws IOException {
            return new ActionCheatPointBreakPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatPointBreakPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatPointBreakPayload(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatPointBreakPayload(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class SlotRecord extends KaitaiStruct {

        public SlotRecord(KaitaiStream _io, int slotRecordSize) {
            this(_io, null, null, slotRecordSize);
        }

        public SlotRecord(KaitaiStream _io, W3W3g.SlotRecordChunk _parent, int slotRecordSize) {
            this(_io, _parent, null, slotRecordSize);
        }

        public SlotRecord(KaitaiStream _io, W3W3g.SlotRecordChunk _parent, W3W3g _root, int slotRecordSize) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.slotRecordSize = slotRecordSize;
            _read();
        }
        private void _read() {
            this.playerId = this._io.readU1();
            this.mapDownloadPercent = this._io.readU1();
            this.status = W3W3g.SlotStatus.byId(this._io.readU1());
            this.controller = W3W3g.SlotController.byId(this._io.readU1());
            this.team = this._io.readU1();
            this.color = this._io.readU1();
            this.race = this._io.readU1();
            if (8 <= slotRecordSize()) {
                this.aiStrength = W3W3g.SlotAiStrength.byId(this._io.readU1());
            }
            if (9 <= slotRecordSize()) {
                this.handicap = this._io.readU1();
            }
        }
        private int playerId;
        private int mapDownloadPercent;
        private SlotStatus status;
        private SlotController controller;
        private int team;
        private int color;
        private int race;
        private SlotAiStrength aiStrength;
        private Integer handicap;
        private int slotRecordSize;
        private W3W3g _root;
        private W3W3g.SlotRecordChunk _parent;
        public int playerId() { return playerId; }
        public int mapDownloadPercent() { return mapDownloadPercent; }
        public SlotStatus status() { return status; }
        public SlotController controller() { return controller; }
        public int team() { return team; }
        public int color() { return color; }
        public int race() { return race; }
        public SlotAiStrength aiStrength() { return aiStrength; }
        public Integer handicap() { return handicap; }
        public int slotRecordSize() { return slotRecordSize; }
        public W3W3g _root() { return _root; }
        public W3W3g.SlotRecordChunk _parent() { return _parent; }
    }
    public static class ActionUnknown0x75Payload extends KaitaiStruct {
        public static ActionUnknown0x75Payload fromFile(String fileName) throws IOException {
            return new ActionUnknown0x75Payload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionUnknown0x75Payload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionUnknown0x75Payload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionUnknown0x75Payload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknown = this._io.readU1();
        }
        private int unknown;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int unknown() { return unknown; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class PlayerOr0x19 extends KaitaiStruct {
        public static PlayerOr0x19 fromFile(String fileName) throws IOException {
            return new PlayerOr0x19(new ByteBufferKaitaiStream(fileName));
        }

        public PlayerOr0x19(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlayerOr0x19(KaitaiStream _io, W3W3g _parent) {
            this(_io, _parent, null);
        }

        public PlayerOr0x19(KaitaiStream _io, W3W3g _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.playerOr0x19Loop = new PlayerOr0x19Loop(this._io, this, _root, 0);
        }
        private PlayerOr0x19Loop playerOr0x19Loop;
        private W3W3g _root;
        private W3W3g _parent;
        public PlayerOr0x19Loop playerOr0x19Loop() { return playerOr0x19Loop; }
        public W3W3g _root() { return _root; }
        public W3W3g _parent() { return _parent; }
    }
    public static class ActionPreSubselectionPayload extends KaitaiStruct {
        public static ActionPreSubselectionPayload fromFile(String fileName) throws IOException {
            return new ActionPreSubselectionPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionPreSubselectionPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionPreSubselectionPayload(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public ActionPreSubselectionPayload(KaitaiStream _io, KaitaiStruct _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private KaitaiStruct _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class PlayerMetaDataContent extends KaitaiStruct {
        public static PlayerMetaDataContent fromFile(String fileName) throws IOException {
            return new PlayerMetaDataContent(new ByteBufferKaitaiStream(fileName));
        }

        public PlayerMetaDataContent(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlayerMetaDataContent(KaitaiStream _io, W3W3g.PlayerMetaData _parent) {
            this(_io, _parent, null);
        }

        public PlayerMetaDataContent(KaitaiStream _io, W3W3g.PlayerMetaData _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.size = this._io.readU1();
            this.id = this._io.readU1();
            this.unknown = this._io.readU1();
            this.lenIntName = this._io.readU1();
            this.name = new String(this._io.readBytes(lenIntName()), Charset.forName("UTF-8"));
            this.terminator = this._io.readU1();
            this.lenIntClan = this._io.readU1();
            this.clan = new String(this._io.readBytes(lenIntClan()), Charset.forName("UTF-8"));
            this.clanTerminator = this._io.readU1();
            this.lenIntExtra = this._io.readU1();
        }
        private int size;
        private int id;
        private int unknown;
        private int lenIntName;
        private String name;
        private int terminator;
        private int lenIntClan;
        private String clan;
        private int clanTerminator;
        private int lenIntExtra;
        private W3W3g _root;
        private W3W3g.PlayerMetaData _parent;
        public int size() { return size; }
        public int id() { return id; }
        public int unknown() { return unknown; }
        public int lenIntName() { return lenIntName; }
        public String name() { return name; }
        public int terminator() { return terminator; }
        public int lenIntClan() { return lenIntClan; }
        public String clan() { return clan; }
        public int clanTerminator() { return clanTerminator; }
        public int lenIntExtra() { return lenIntExtra; }
        public W3W3g _root() { return _root; }
        public W3W3g.PlayerMetaData _parent() { return _parent; }
    }
    public static class Countdown extends KaitaiStruct {
        public static Countdown fromFile(String fileName) throws IOException {
            return new Countdown(new ByteBufferKaitaiStream(fileName));
        }

        public Countdown(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Countdown(KaitaiStream _io, W3W3g.Block _parent) {
            this(_io, _parent, null);
        }

        public Countdown(KaitaiStream _io, W3W3g.Block _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.pre = this._io.readU1();
            this.mode = this._io.readU4le();
            this.secs = this._io.readU4le();
        }
        private int pre;
        private long mode;
        private long secs;
        private W3W3g _root;
        private W3W3g.Block _parent;
        public int pre() { return pre; }
        public long mode() { return mode; }
        public long secs() { return secs; }
        public W3W3g _root() { return _root; }
        public W3W3g.Block _parent() { return _parent; }
    }
    public static class ActionCheatSharpAndShinyPayload extends KaitaiStruct {
        public static ActionCheatSharpAndShinyPayload fromFile(String fileName) throws IOException {
            return new ActionCheatSharpAndShinyPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatSharpAndShinyPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatSharpAndShinyPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatSharpAndShinyPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class Action extends KaitaiStruct {
        public static Action fromFile(String fileName) throws IOException {
            return new Action(new ByteBufferKaitaiStream(fileName));
        }

        public Action(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Action(KaitaiStream _io, W3W3g.ActionBlock _parent) {
            this(_io, _parent, null);
        }

        public Action(KaitaiStream _io, W3W3g.ActionBlock _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.actionId = W3W3g.ActionId.byId(this._io.readU1());
            {
                ActionId on = actionId();
                if (on != null) {
                    switch (actionId()) {
                    case ENTER_CHOOSE_BUILDING_SUBMENU: {
                        this.actionPayload = new ActionEnterChooseBuildingSubmenuPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_GREED_IS_GOOD: {
                        this.actionPayload = new ActionCheatGreedIsGoodPayload(this._io, this, _root);
                        break;
                    }
                    case MINIMAP_SIGNAL: {
                        this.actionPayload = new ActionMinimapSignalPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_LEAFIT_TO_ME: {
                        this.actionPayload = new ActionCheatLeafitToMePayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_ALL_YOUR_BASE_ARE_BELONG_TO_US: {
                        this.actionPayload = new ActionCheatAllYourBaseAreBelongToUsPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_SHARP_AND_SHINY: {
                        this.actionPayload = new ActionCheatSharpAndShinyPayload(this._io, this, _root);
                        break;
                    }
                    case SAVE_GAME_FINISHED: {
                        this.actionPayload = new ActionSaveGameFinishedPayload(this._io, this, _root);
                        break;
                    }
                    case DECREASE_GAME_SPEED: {
                        this.actionPayload = new ActionDecreaseGameSpeedPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_IOCAINE_POWDER: {
                        this.actionPayload = new ActionCheatIocainePowderPayload(this._io, this, _root);
                        break;
                    }
                    case UNKNOWN_0X1B: {
                        this.actionPayload = new ActionUnknown0x1bPayload(this._io, this, _root);
                        break;
                    }
                    case ASSIGN_GROUP_HOTKEY: {
                        this.actionPayload = new ActionAssignGroupHotkeyPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_WARP_TEN: {
                        this.actionPayload = new ActionCheatWarpTenPayload(this._io, this, _root);
                        break;
                    }
                    case CHANGE_SELECTION: {
                        this.actionPayload = new ActionChangeSelectionPayload(this._io, this, _root);
                        break;
                    }
                    case TRANSFER_RESOURCES: {
                        this.actionPayload = new ActionTransferResourcesPayload(this._io, this, _root);
                        break;
                    }
                    case RESUME_GAME: {
                        this.actionPayload = new ActionResumeGamePayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_THERE_IS_NO_SPOON: {
                        this.actionPayload = new ActionCheatThereIsNoSpoonPayload(this._io, this, _root);
                        break;
                    }
                    case UNIT_BUILDING_ABILITY_WITH_TARGET_POSITION_AND_OBJECT: {
                        this.actionPayload = new ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_KEYSER_SOZE: {
                        this.actionPayload = new ActionCheatKeyserSozePayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_SOMEBODY_SET_UP_US_THE_BOMB: {
                        this.actionPayload = new ActionCheatSomebodySetUpUsTheBombPayload(this._io, this, _root);
                        break;
                    }
                    case CONTINUE_GAME_AFTER_WIN_OR_DEFEAT2: {
                        this.actionPayload = new ActionContinueGameAfterWinOrDefeat2Payload(this._io, this, _root);
                        break;
                    }
                    case UNIT_BUILDING_ABILITY_WITH_TWO_TARGET_POSITIONS_AND_TWO_ITEM_IDS: {
                        this.actionPayload = new ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload(this._io, this, _root);
                        break;
                    }
                    case ESC_PRESSED: {
                        this.actionPayload = new ActionEscPressedPayload(this._io, this, _root);
                        break;
                    }
                    case SELECT_SUBGROUP: {
                        this.actionPayload = new ActionSelectSubgroupPayload(this._io, this, _root);
                        break;
                    }
                    case CHANGE_ALLY_OPTIONS: {
                        this.actionPayload = new ActionChangeAllyOptionsPayload(this._io, this, _root);
                        break;
                    }
                    case GIVE_OR_DROP_ITEM: {
                        this.actionPayload = new ActionGiveOrDropItemPayload(this._io, this, _root);
                        break;
                    }
                    case CANCEL_HERO_REVIVAL: {
                        this.actionPayload = new ActionCancelHeroRevivalPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_THE_DUDE_ABIDES: {
                        this.actionPayload = new ActionCheatTheDudeAbidesPayload(this._io, this, _root);
                        break;
                    }
                    case PAUSE_GAME: {
                        this.actionPayload = new ActionPauseGamePayload(this._io, this, _root);
                        break;
                    }
                    case REMOVE_UNIT_FROM_BUILDING_QUEUE: {
                        this.actionPayload = new ActionRemoveUnitFromBuildingQueuePayload(this._io, this, _root);
                        break;
                    }
                    case ENTER_CHOOSE_HERO_SKILL_SUBMENU: {
                        this.actionPayload = new ActionEnterChooseHeroSkillSubmenuPayload(this._io, this, _root);
                        break;
                    }
                    case INCREASE_GAME_SPEED: {
                        this.actionPayload = new ActionIncreaseGameSpeedPayload(this._io, this, _root);
                        break;
                    }
                    case SET_GAME_SPEED: {
                        this.actionPayload = new ActionSetGameSpeedPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_SYNERGY: {
                        this.actionPayload = new ActionCheatSynergyPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_WHOS_YOUR_DADDY: {
                        this.actionPayload = new ActionCheatWhosYourDaddyPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_WHO_IS_JOHN_GALT: {
                        this.actionPayload = new ActionCheatWhoIsJohnGaltPayload(this._io, this, _root);
                        break;
                    }
                    case UNKNOWN_0X7B: {
                        this.actionPayload = new ActionUnknown0x7bPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_I_SEE_DEAD_PEOPLE: {
                        this.actionPayload = new ActionCheatISeeDeadPeoplePayload(this._io, this, _root);
                        break;
                    }
                    case SELECT_GROUP_HOTKEY: {
                        this.actionPayload = new ActionSelectGroupHotkeyPayload(this._io, this, _root);
                        break;
                    }
                    case UNIT_BUILDING_ABILITY_WITH_TARGET_POSITION: {
                        this.actionPayload = new ActionUnitBuildingAbilityWithTargetPosition(this._io, this, _root);
                        break;
                    }
                    case SELECT_GROUND_ITEM: {
                        this.actionPayload = new ActionSelectGroundItemPayload(this._io, this, _root);
                        break;
                    }
                    case CONTINUE_GAME_AFTER_WIN_OR_DEFEAT: {
                        this.actionPayload = new ActionContinueGameAfterWinOrDefeatPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_DAY_LIGHT_SAVINGS: {
                        this.actionPayload = new ActionCheatDayLightSavingsPayload(this._io, this, _root);
                        break;
                    }
                    case CHEAT_IT_VEXES_ME: {
                        this.actionPayload = new ActionCheatItVexesMePayload(this._io, this, _root);
                        break;
                    }
                    case UNKNOWN_0X75: {
                        this.actionPayload = new ActionUnknown0x75Payload(this._io, this, _root);
                        break;
                    }
                    case UNIT_BUILDING_ABILITY: {
                        this.actionPayload = new ActionUnitBuildingAbilityPayload(this._io, this, _root);
                        break;
                    }
                    case UNKNOWN_0X21: {
                        this.actionPayload = new ActionUnknown0x21Payload(this._io, this, _root);
                        break;
                    }
                    case SCENARIO_TRIGGER: {
                        this.actionPayload = new ActionScenarioTriggerPayload(this._io, this, _root);
                        break;
                    }
                    case SAVE_GAME: {
                        this.actionPayload = new ActionSaveGamePayload(this._io, this, _root);
                        break;
                    }
                    default: {
                        this.actionPayload = new ActionNothingTakeRest(this._io, this, _root);
                        break;
                    }
                    }
                } else {
                    this.actionPayload = new ActionNothingTakeRest(this._io, this, _root);
                }
            }
        }
        private ActionId actionId;
        private KaitaiStruct actionPayload;
        private W3W3g _root;
        private W3W3g.ActionBlock _parent;
        public ActionId actionId() { return actionId; }
        public KaitaiStruct actionPayload() { return actionPayload; }
        public W3W3g _root() { return _root; }
        public W3W3g.ActionBlock _parent() { return _parent; }
    }
    public static class ActionUnitBuildingAbilityWithTargetPosition extends KaitaiStruct {
        public static ActionUnitBuildingAbilityWithTargetPosition fromFile(String fileName) throws IOException {
            return new ActionUnitBuildingAbilityWithTargetPosition(new ByteBufferKaitaiStream(fileName));
        }

        public ActionUnitBuildingAbilityWithTargetPosition(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionUnitBuildingAbilityWithTargetPosition(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionUnitBuildingAbilityWithTargetPosition(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.abilityFlags = this._io.readU2le();
            this.orderId = new OrderId(this._io, this, _root);
            this.unknownA = this._io.readU4le();
            this.unknownB = this._io.readU4le();
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
        }
        private int abilityFlags;
        private OrderId orderId;
        private long unknownA;
        private long unknownB;
        private float x;
        private float y;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int abilityFlags() { return abilityFlags; }
        public OrderId orderId() { return orderId; }
        public long unknownA() { return unknownA; }
        public long unknownB() { return unknownB; }
        public float x() { return x; }
        public float y() { return y; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatKeyserSozePayload extends KaitaiStruct {
        public static ActionCheatKeyserSozePayload fromFile(String fileName) throws IOException {
            return new ActionCheatKeyserSozePayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatKeyserSozePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatKeyserSozePayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatKeyserSozePayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknown = this._io.readU1();
            this.amount = this._io.readU4le();
        }
        private int unknown;
        private long amount;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int unknown() { return unknown; }
        public long amount() { return amount; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatGreedIsGoodPayload extends KaitaiStruct {
        public static ActionCheatGreedIsGoodPayload fromFile(String fileName) throws IOException {
            return new ActionCheatGreedIsGoodPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatGreedIsGoodPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatGreedIsGoodPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatGreedIsGoodPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknown = this._io.readU1();
            this.amount = this._io.readU4le();
        }
        private int unknown;
        private long amount;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int unknown() { return unknown; }
        public long amount() { return amount; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionCheatDayLightSavingsPayload extends KaitaiStruct {
        public static ActionCheatDayLightSavingsPayload fromFile(String fileName) throws IOException {
            return new ActionCheatDayLightSavingsPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionCheatDayLightSavingsPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionCheatDayLightSavingsPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionCheatDayLightSavingsPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.time = this._io.readF4le();
        }
        private float time;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public float time() { return time; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionAssignGroupHotkeyPayload extends KaitaiStruct {
        public static ActionAssignGroupHotkeyPayload fromFile(String fileName) throws IOException {
            return new ActionAssignGroupHotkeyPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionAssignGroupHotkeyPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionAssignGroupHotkeyPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionAssignGroupHotkeyPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.groupIndex = this._io.readU1();
            this.numItem = this._io.readU2le();
            this.item = new ArrayList<ActionAssignGroupHotkeyPayloadItem>();
            for (int i = 0; i < numItem(); i++) {
                this.item.add(new ActionAssignGroupHotkeyPayloadItem(this._io, this, _root));
            }
        }
        private int groupIndex;
        private int numItem;
        private ArrayList<ActionAssignGroupHotkeyPayloadItem> item;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int groupIndex() { return groupIndex; }
        public int numItem() { return numItem; }
        public ArrayList<ActionAssignGroupHotkeyPayloadItem> item() { return item; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionPauseGamePayload extends KaitaiStruct {
        public static ActionPauseGamePayload fromFile(String fileName) throws IOException {
            return new ActionPauseGamePayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionPauseGamePayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionPauseGamePayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionPauseGamePayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothing = this._io.readBytes(0);
        }
        private byte[] nothing;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public byte[] nothing() { return nothing; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    public static class ActionUnknown0x1bPayload extends KaitaiStruct {
        public static ActionUnknown0x1bPayload fromFile(String fileName) throws IOException {
            return new ActionUnknown0x1bPayload(new ByteBufferKaitaiStream(fileName));
        }

        public ActionUnknown0x1bPayload(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActionUnknown0x1bPayload(KaitaiStream _io, W3W3g.Action _parent) {
            this(_io, _parent, null);
        }

        public ActionUnknown0x1bPayload(KaitaiStream _io, W3W3g.Action _parent, W3W3g _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.a = this._io.readU1();
            this.b = this._io.readU4le();
            this.c = this._io.readU4le();
        }
        private int a;
        private long b;
        private long c;
        private W3W3g _root;
        private W3W3g.Action _parent;
        public int a() { return a; }
        public long b() { return b; }
        public long c() { return c; }
        public W3W3g _root() { return _root; }
        public W3W3g.Action _parent() { return _parent; }
    }
    private PrivatePublicEnum privPublic;
    public PrivatePublicEnum privPublic() {
        if (this.privPublic != null)
            return this.privPublic;
        this.privPublic = PrivatePublicEnum.byId(priv());
        return this.privPublic;
    }
    private long versionOrSmth;
    private Player player;
    private String gameName;
    private int nullByte;
    private CompressedArea compressedArea;
    private long playerCount;
    private int gameType;
    private int priv;
    private int unknown;
    private long languageId;
    private PlayerOr0x19 playerOr0x19;
    private SlotRecordsHeader slotRecordsHeader;
    private SlotRecordChunk slotRecord;
    private long randomSeed;
    private int selectMode;
    private int numStartPosition;
    private ArrayList<Block> block;
    private W3W3g _root;
    private KaitaiStruct _parent;
    private byte[] _raw_slotRecord;
    public long versionOrSmth() { return versionOrSmth; }
    public Player player() { return player; }
    public String gameName() { return gameName; }
    public int nullByte() { return nullByte; }
    public CompressedArea compressedArea() { return compressedArea; }
    public long playerCount() { return playerCount; }
    public int gameType() { return gameType; }
    public int priv() { return priv; }
    public int unknown() { return unknown; }
    public long languageId() { return languageId; }
    public PlayerOr0x19 playerOr0x19() { return playerOr0x19; }
    public SlotRecordsHeader slotRecordsHeader() { return slotRecordsHeader; }
    public SlotRecordChunk slotRecord() { return slotRecord; }
    public long randomSeed() { return randomSeed; }
    public int selectMode() { return selectMode; }
    public int numStartPosition() { return numStartPosition; }
    public ArrayList<Block> block() { return block; }
    public W3W3g _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
    public byte[] _raw_slotRecord() { return _raw_slotRecord; }
}
