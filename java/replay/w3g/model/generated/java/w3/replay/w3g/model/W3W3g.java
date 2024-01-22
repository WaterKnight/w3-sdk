package w3.replay.w3g.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.kaitai.struct.KaitaiStruct;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class W3W3g {
  private PrivatePublicEnum privPublic;

  private long versionOrSmth;

  private Player player;

  private String gameName;

  private int nullByte;

  private CompressedArea compressedArea;

  private long playerCount;

  private int gameType;

  private int priv;

  private int fill;

  private long languageId;

  private PlayerOr0x19 playerOr0x19;

  private RecordsHeader recordsHeader;

  private RecordChunk record;

  private long randomSeed;

  private int selectMode;

  private Block block;

  public PrivatePublicEnum getPrivPublic() {
    return privPublic;
  }

  public long getVersionOrSmth() {
    return versionOrSmth;
  }

  public Player getPlayer() {
    return player;
  }

  public String getGameName() {
    return gameName;
  }

  public int getNullByte() {
    return nullByte;
  }

  public CompressedArea getCompressedArea() {
    return compressedArea;
  }

  public long getPlayerCount() {
    return playerCount;
  }

  public int getGameType() {
    return gameType;
  }

  public int getPriv() {
    return priv;
  }

  public int getFill() {
    return fill;
  }

  public long getLanguageId() {
    return languageId;
  }

  public PlayerOr0x19 getPlayerOr0x19() {
    return playerOr0x19;
  }

  public RecordsHeader getRecordsHeader() {
    return recordsHeader;
  }

  public RecordChunk getRecord() {
    return record;
  }

  public long getRandomSeed() {
    return randomSeed;
  }

  public int getSelectMode() {
    return selectMode;
  }

  public Block getBlock() {
    return block;
  }

  public void setPrivPublic(PrivatePublicEnum value) {
    this.privPublic = value;
  }

  public void setVersionOrSmth(long value) {
    this.versionOrSmth = value;
  }

  public void setPlayer(Player value) {
    this.player = value;
  }

  public void setGameName(String value) {
    this.gameName = value;
  }

  public void setNullByte(int value) {
    this.nullByte = value;
  }

  public void setCompressedArea(CompressedArea value) {
    this.compressedArea = value;
  }

  public void setPlayerCount(long value) {
    this.playerCount = value;
  }

  public void setGameType(int value) {
    this.gameType = value;
  }

  public void setPriv(int value) {
    this.priv = value;
  }

  public void setFill(int value) {
    this.fill = value;
  }

  public void setLanguageId(long value) {
    this.languageId = value;
  }

  public void setPlayerOr0x19(PlayerOr0x19 value) {
    this.playerOr0x19 = value;
  }

  public void setRecordsHeader(RecordsHeader value) {
    this.recordsHeader = value;
  }

  public void setRecord(RecordChunk value) {
    this.record = value;
  }

  public void setRandomSeed(long value) {
    this.randomSeed = value;
  }

  public void setSelectMode(int value) {
    this.selectMode = value;
  }

  public void setBlock(Block value) {
    this.block = value;
  }

  public static class RecordChunk {
    private List<Record> record;

    private int recordSize;

    public List<Record> getRecord() {
      return record;
    }

    public int getRecordSize() {
      return recordSize;
    }

    public void setRecord(List<Record> value) {
      this.record = value;
    }

    public void setRecordSize(int value) {
      this.recordSize = value;
    }
  }

  public static class ActionCheatIocainePowderPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public enum ChangeSelectionMode {
    ADD(0),

    REMOVE(1);

    private static final Map<Long, ChangeSelectionMode> byId = new HashMap<>();

    static {
      for (ChangeSelectionMode e : ChangeSelectionMode.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    ChangeSelectionMode(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public ChangeSelectionMode byId(long id) {
      return byId.get(id);
    }
  }

  public static class ActionMinimapSignalPayload {
    private float x;

    private float y;

    private long unknown;

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public long getUnknown() {
      return unknown;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }

    public void setUnknown(long value) {
      this.unknown = value;
    }
  }

  public static class ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload {
    private int abilityFlags;

    private OrderId orderId;

    private long unknownA;

    private long unknownB;

    private float x;

    private float y;

    private long objectId1;

    private long objectId2;

    public int getAbilityFlags() {
      return abilityFlags;
    }

    public OrderId getOrderId() {
      return orderId;
    }

    public long getUnknownA() {
      return unknownA;
    }

    public long getUnknownB() {
      return unknownB;
    }

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public long getObjectId1() {
      return objectId1;
    }

    public long getObjectId2() {
      return objectId2;
    }

    public void setAbilityFlags(int value) {
      this.abilityFlags = value;
    }

    public void setOrderId(OrderId value) {
      this.orderId = value;
    }

    public void setUnknownA(long value) {
      this.unknownA = value;
    }

    public void setUnknownB(long value) {
      this.unknownB = value;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }

    public void setObjectId1(long value) {
      this.objectId1 = value;
    }

    public void setObjectId2(long value) {
      this.objectId2 = value;
    }
  }

  public static class ActionUnknown0x7bPayload {
    private long x;

    private long y;

    private OrderId orderId1;

    private OrderId orderId2;

    public long getx() {
      return x;
    }

    public long gety() {
      return y;
    }

    public OrderId getOrderId1() {
      return orderId1;
    }

    public OrderId getOrderId2() {
      return orderId2;
    }

    public void setx(long value) {
      this.x = value;
    }

    public void sety(long value) {
      this.y = value;
    }

    public void setOrderId1(OrderId value) {
      this.orderId1 = value;
    }

    public void setOrderId2(OrderId value) {
      this.orderId2 = value;
    }
  }

  public static class ActionPauseGamePayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionCheatGreedIsGoodPayload {
    private int unknown;

    private long amount;

    public int getUnknown() {
      return unknown;
    }

    public long getAmount() {
      return amount;
    }

    public void setUnknown(int value) {
      this.unknown = value;
    }

    public void setAmount(long value) {
      this.amount = value;
    }
  }

  public static class ActionSelectGroundItemPayload {
    private int unknown;

    private long objectId1;

    private long objectId2;

    public int getUnknown() {
      return unknown;
    }

    public long getObjectId1() {
      return objectId1;
    }

    public long getObjectId2() {
      return objectId2;
    }

    public void setUnknown(int value) {
      this.unknown = value;
    }

    public void setObjectId1(long value) {
      this.objectId1 = value;
    }

    public void setObjectId2(long value) {
      this.objectId2 = value;
    }
  }

  public static class ActionUnknown0x21Payload {
    private long unknownA;

    private long unknownB;

    public long getUnknownA() {
      return unknownA;
    }

    public long getUnknownB() {
      return unknownB;
    }

    public void setUnknownA(long value) {
      this.unknownA = value;
    }

    public void setUnknownB(long value) {
      this.unknownB = value;
    }
  }

  public static class ActionGiveOrDropItemPayload {
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

    public int getAbilityFlags() {
      return abilityFlags;
    }

    public OrderId getOrderId() {
      return orderId;
    }

    public long getUnknownA() {
      return unknownA;
    }

    public long getUnknownB() {
      return unknownB;
    }

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public long getTargetObjectId1() {
      return targetObjectId1;
    }

    public long getTargetObjectId2() {
      return targetObjectId2;
    }

    public long getItemObjectId1() {
      return itemObjectId1;
    }

    public long getItemObjectId2() {
      return itemObjectId2;
    }

    public void setAbilityFlags(int value) {
      this.abilityFlags = value;
    }

    public void setOrderId(OrderId value) {
      this.orderId = value;
    }

    public void setUnknownA(long value) {
      this.unknownA = value;
    }

    public void setUnknownB(long value) {
      this.unknownB = value;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }

    public void setTargetObjectId1(long value) {
      this.targetObjectId1 = value;
    }

    public void setTargetObjectId2(long value) {
      this.targetObjectId2 = value;
    }

    public void setItemObjectId1(long value) {
      this.itemObjectId1 = value;
    }

    public void setItemObjectId2(long value) {
      this.itemObjectId2 = value;
    }
  }

  public static class ActionEscPressedPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionTransferResourcesPayload {
    private int playerSlotIndex;

    private long goldAmount;

    private long lumberAmount;

    public int getPlayerSlotIndex() {
      return playerSlotIndex;
    }

    public long getGoldAmount() {
      return goldAmount;
    }

    public long getLumberAmount() {
      return lumberAmount;
    }

    public void setPlayerSlotIndex(int value) {
      this.playerSlotIndex = value;
    }

    public void setGoldAmount(long value) {
      this.goldAmount = value;
    }

    public void setLumberAmount(long value) {
      this.lumberAmount = value;
    }
  }

  public static class ActionBlock {
    private List<Action> action;

    public List<Action> getAction() {
      return action;
    }

    public void setAction(List<Action> value) {
      this.action = value;
    }
  }

  public static class ActionCheatStrengthAndHonorPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionPreSubselectionPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class PlayerMetaData {
    private int size;

    private int fill;

    private int id;

    private int fill2;

    private int lenIntName;

    private String name;

    private int terminator;

    private int lenIntClan;

    private String clan;

    private int clanTerminator;

    private int lenIntExtra;

    private List<Integer> end;

    public int getSize() {
      return size;
    }

    public int getFill() {
      return fill;
    }

    public int getId() {
      return id;
    }

    public int getFill2() {
      return fill2;
    }

    public int getLenIntName() {
      return lenIntName;
    }

    public String getName() {
      return name;
    }

    public int getTerminator() {
      return terminator;
    }

    public int getLenIntClan() {
      return lenIntClan;
    }

    public String getClan() {
      return clan;
    }

    public int getClanTerminator() {
      return clanTerminator;
    }

    public int getLenIntExtra() {
      return lenIntExtra;
    }

    public List<Integer> getEnd() {
      return end;
    }

    public void setSize(int value) {
      this.size = value;
    }

    public void setFill(int value) {
      this.fill = value;
    }

    public void setId(int value) {
      this.id = value;
    }

    public void setFill2(int value) {
      this.fill2 = value;
    }

    public void setLenIntName(int value) {
      this.lenIntName = value;
    }

    public void setName(String value) {
      this.name = value;
    }

    public void setTerminator(int value) {
      this.terminator = value;
    }

    public void setLenIntClan(int value) {
      this.lenIntClan = value;
    }

    public void setClan(String value) {
      this.clan = value;
    }

    public void setClanTerminator(int value) {
      this.clanTerminator = value;
    }

    public void setLenIntExtra(int value) {
      this.lenIntExtra = value;
    }

    public void setEnd(List<Integer> value) {
      this.end = value;
    }
  }

  public static class ActionIncreaseGameSpeedPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionPayload {
    private final Object value;

    public Object getValue() {
      return value;
    }

    @JsonCreator
    public ActionPayload(@JsonProperty("value") Object value) {
      this.value = value;
    }
  }

  public static class Action {
    private ActionId actionId;

    private ActionPayload actionPayload;

    public ActionId getActionId() {
      return actionId;
    }

    public ActionPayload getActionPayload() {
      return actionPayload;
    }

    public void setActionId(ActionId value) {
      this.actionId = value;
    }

    public void setActionPayload(ActionPayload value) {
      this.actionPayload = value;
    }
  }

  public static class PlayerMetaDataLoop {
    private int discriminator;

    private PlayerMetaData playerMetaData;

    private PlayerMetaDataLoop next;

    public int getDiscriminator() {
      return discriminator;
    }

    public PlayerMetaData getPlayerMetaData() {
      return playerMetaData;
    }

    public PlayerMetaDataLoop getNext() {
      return next;
    }

    public void setDiscriminator(int value) {
      this.discriminator = value;
    }

    public void setPlayerMetaData(PlayerMetaData value) {
      this.playerMetaData = value;
    }

    public void setNext(PlayerMetaDataLoop value) {
      this.next = value;
    }
  }

  public static class ActionResumeGamePayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class PlayerList {
    private PlayerListPlayer member;

    private long fill;

    public PlayerListPlayer getMember() {
      return member;
    }

    public long getFill() {
      return fill;
    }

    public void setMember(PlayerListPlayer value) {
      this.member = value;
    }

    public void setFill(long value) {
      this.fill = value;
    }
  }

  public static class ActionEnterChooseHeroSkillSubmenuPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class PlayerOr0x19Loop {
    private int discriminator;

    private Player player;

    private PlayerOr0x19Loop next;

    private PlayerMetaDataChunk playerMetaDataChunk;

    private int previousDiscriminator;

    public int getDiscriminator() {
      return discriminator;
    }

    public Player getPlayer() {
      return player;
    }

    public PlayerOr0x19Loop getNext() {
      return next;
    }

    public PlayerMetaDataChunk getPlayerMetaDataChunk() {
      return playerMetaDataChunk;
    }

    public int getPreviousDiscriminator() {
      return previousDiscriminator;
    }

    public void setDiscriminator(int value) {
      this.discriminator = value;
    }

    public void setPlayer(Player value) {
      this.player = value;
    }

    public void setNext(PlayerOr0x19Loop value) {
      this.next = value;
    }

    public void setPlayerMetaDataChunk(PlayerMetaDataChunk value) {
      this.playerMetaDataChunk = value;
    }

    public void setPreviousDiscriminator(int value) {
      this.previousDiscriminator = value;
    }
  }

  public enum PrivatePublicEnum {
    PUBLIC(0),

    PRIVATE(1);

    private static final Map<Long, PrivatePublicEnum> byId = new HashMap<>();

    static {
      for (PrivatePublicEnum e : PrivatePublicEnum.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    PrivatePublicEnum(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public PrivatePublicEnum byId(long id) {
      return byId.get(id);
    }
  }

  public static class ActionAssignGroupHotkeyPayloadItem {
    private long objectId1;

    private long objectId2;

    public long getObjectId1() {
      return objectId1;
    }

    public long getObjectId2() {
      return objectId2;
    }

    public void setObjectId1(long value) {
      this.objectId1 = value;
    }

    public void setObjectId2(long value) {
      this.objectId2 = value;
    }
  }

  public static class ActionContinueGameAfterWinOrDefeat2Payload {
    private long a;

    private long b;

    private long c;

    private long d;

    public long geta() {
      return a;
    }

    public long getb() {
      return b;
    }

    public long getc() {
      return c;
    }

    public long getd() {
      return d;
    }

    public void seta(long value) {
      this.a = value;
    }

    public void setb(long value) {
      this.b = value;
    }

    public void setc(long value) {
      this.c = value;
    }

    public void setd(long value) {
      this.d = value;
    }
  }

  public static class ActionScenarioTriggerPayload {
    private long unknownA;

    private long unknownB;

    private long unknownCounter;

    public long getUnknownA() {
      return unknownA;
    }

    public long getUnknownB() {
      return unknownB;
    }

    public long getUnknownCounter() {
      return unknownCounter;
    }

    public void setUnknownA(long value) {
      this.unknownA = value;
    }

    public void setUnknownB(long value) {
      this.unknownB = value;
    }

    public void setUnknownCounter(long value) {
      this.unknownCounter = value;
    }
  }

  public static class RecordsHeader {
    private Integer recordSize;

    public Integer getRecordSize() {
      return recordSize;
    }

    public void setRecordSize(Integer value) {
      this.recordSize = value;
    }
  }

  public static class AbilityFlags {
    private int queueCommand;

    private int applyToAllUnitsInSubgroup;

    private int areaEffect;

    private int applyToAllUnitsInSelection;

    private int moveGroupWithoutFormation;

    private int unknown;

    private int subgroupCommand;

    private int unknown2;

    private int autocast;

    public int getQueueCommand() {
      return queueCommand;
    }

    public int getApplyToAllUnitsInSubgroup() {
      return applyToAllUnitsInSubgroup;
    }

    public int getAreaEffect() {
      return areaEffect;
    }

    public int getApplyToAllUnitsInSelection() {
      return applyToAllUnitsInSelection;
    }

    public int getMoveGroupWithoutFormation() {
      return moveGroupWithoutFormation;
    }

    public int getUnknown() {
      return unknown;
    }

    public int getSubgroupCommand() {
      return subgroupCommand;
    }

    public int getUnknown2() {
      return unknown2;
    }

    public int getAutocast() {
      return autocast;
    }

    public void setQueueCommand(int value) {
      this.queueCommand = value;
    }

    public void setApplyToAllUnitsInSubgroup(int value) {
      this.applyToAllUnitsInSubgroup = value;
    }

    public void setAreaEffect(int value) {
      this.areaEffect = value;
    }

    public void setApplyToAllUnitsInSelection(int value) {
      this.applyToAllUnitsInSelection = value;
    }

    public void setMoveGroupWithoutFormation(int value) {
      this.moveGroupWithoutFormation = value;
    }

    public void setUnknown(int value) {
      this.unknown = value;
    }

    public void setSubgroupCommand(int value) {
      this.subgroupCommand = value;
    }

    public void setUnknown2(int value) {
      this.unknown2 = value;
    }

    public void setAutocast(int value) {
      this.autocast = value;
    }
  }

  public static class TimeSlot {
    private int n;

    private int timeIncrementMs;

    private CommandData commandData;

    public int getn() {
      return n;
    }

    public int getTimeIncrementMs() {
      return timeIncrementMs;
    }

    public CommandData getCommandData() {
      return commandData;
    }

    public void setn(int value) {
      this.n = value;
    }

    public void setTimeIncrementMs(int value) {
      this.timeIncrementMs = value;
    }

    public void setCommandData(CommandData value) {
      this.commandData = value;
    }
  }

  public static class ActionCheatDayLightSavingsPayload {
    private float time;

    public float getTime() {
      return time;
    }

    public void setTime(float value) {
      this.time = value;
    }
  }

  public static class OrderId {
    private Integer orderId;

    private String abilityId;

    private byte[] rawBytes;

    public Integer getOrderId() {
      return orderId;
    }

    public String getAbilityId() {
      return abilityId;
    }

    public byte[] getRawBytes() {
      return rawBytes;
    }

    public void setOrderId(Integer value) {
      this.orderId = value;
    }

    public void setAbilityId(String value) {
      this.abilityId = value;
    }

    public void setRawBytes(byte[] value) {
      this.rawBytes = value;
    }
  }

  public static class ActionCheatItVexesMePayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionCheatWhosYourDaddyPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionSelectGroupHotkeyPayload {
    private int groupIndex;

    private int unknown;

    public int getGroupIndex() {
      return groupIndex;
    }

    public int getUnknown() {
      return unknown;
    }

    public void setGroupIndex(int value) {
      this.groupIndex = value;
    }

    public void setUnknown(int value) {
      this.unknown = value;
    }
  }

  public static class ActionUnitBuildingAbilityWithTargetPosition {
    private int abilityFlags;

    private OrderId orderId;

    private long unknownA;

    private long unknownB;

    private float x;

    private float y;

    public int getAbilityFlags() {
      return abilityFlags;
    }

    public OrderId getOrderId() {
      return orderId;
    }

    public long getUnknownA() {
      return unknownA;
    }

    public long getUnknownB() {
      return unknownB;
    }

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public void setAbilityFlags(int value) {
      this.abilityFlags = value;
    }

    public void setOrderId(OrderId value) {
      this.orderId = value;
    }

    public void setUnknownA(long value) {
      this.unknownA = value;
    }

    public void setUnknownB(long value) {
      this.unknownB = value;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }
  }

  public static class ActionUnknown0x75Payload {
    private int unknown;

    public int getUnknown() {
      return unknown;
    }

    public void setUnknown(int value) {
      this.unknown = value;
    }
  }

  public static class Block {
    private int blockId;

    private LeaveGame leaveGame;

    private List<Integer> fill;

    private TimeSlot timeSlot;

    private Chat chat;

    private List<Integer> fill2;

    private List<Integer> fill3;

    private Countdown countdown;

    public int getBlockId() {
      return blockId;
    }

    public LeaveGame getLeaveGame() {
      return leaveGame;
    }

    public List<Integer> getFill() {
      return fill;
    }

    public TimeSlot getTimeSlot() {
      return timeSlot;
    }

    public Chat getChat() {
      return chat;
    }

    public List<Integer> getFill2() {
      return fill2;
    }

    public List<Integer> getFill3() {
      return fill3;
    }

    public Countdown getCountdown() {
      return countdown;
    }

    public void setBlockId(int value) {
      this.blockId = value;
    }

    public void setLeaveGame(LeaveGame value) {
      this.leaveGame = value;
    }

    public void setFill(List<Integer> value) {
      this.fill = value;
    }

    public void setTimeSlot(TimeSlot value) {
      this.timeSlot = value;
    }

    public void setChat(Chat value) {
      this.chat = value;
    }

    public void setFill2(List<Integer> value) {
      this.fill2 = value;
    }

    public void setFill3(List<Integer> value) {
      this.fill3 = value;
    }

    public void setCountdown(Countdown value) {
      this.countdown = value;
    }
  }

  public enum Reason {
    REMOTE(0),

    LOCAL(1);

    private static final Map<Long, Reason> byId = new HashMap<>();

    static {
      for (Reason e : Reason.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    Reason(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public Reason byId(long id) {
      return byId.get(id);
    }
  }

  public static class ActionEnterChooseBuildingSubmenuPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionUnknown0x1bPayload {
    private int a;

    private long b;

    private long c;

    public int geta() {
      return a;
    }

    public long getb() {
      return b;
    }

    public long getc() {
      return c;
    }

    public void seta(int value) {
      this.a = value;
    }

    public void setb(long value) {
      this.b = value;
    }

    public void setc(long value) {
      this.c = value;
    }
  }

  public enum ChatTarget {
    ALL(0),

    ALLIES(1),

    OBSERVERS_OR_REFEREES(2);

    private static final Map<Long, ChatTarget> byId = new HashMap<>();

    static {
      for (ChatTarget e : ChatTarget.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    ChatTarget(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public ChatTarget byId(long id) {
      return byId.get(id);
    }
  }

  public static class ActionNothingTakeRest {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionCheatWhoIsJohnGaltPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class CommandData {
    private int playerId;

    private int lenActionBlock;

    private ActionBlock actionBlock;

    public int getPlayerId() {
      return playerId;
    }

    public int getLenActionBlock() {
      return lenActionBlock;
    }

    public ActionBlock getActionBlock() {
      return actionBlock;
    }

    public void setPlayerId(int value) {
      this.playerId = value;
    }

    public void setLenActionBlock(int value) {
      this.lenActionBlock = value;
    }

    public void setActionBlock(ActionBlock value) {
      this.actionBlock = value;
    }
  }

  public static class LeaveGame {
    private int pre;

    private Reason reason;

    private int playerId;

    private long res;

    private long unknownFlag;

    public int getPre() {
      return pre;
    }

    public Reason getReason() {
      return reason;
    }

    public int getPlayerId() {
      return playerId;
    }

    public long getRes() {
      return res;
    }

    public long getUnknownFlag() {
      return unknownFlag;
    }

    public void setPre(int value) {
      this.pre = value;
    }

    public void setReason(Reason value) {
      this.reason = value;
    }

    public void setPlayerId(int value) {
      this.playerId = value;
    }

    public void setRes(long value) {
      this.res = value;
    }

    public void setUnknownFlag(long value) {
      this.unknownFlag = value;
    }
  }

  public static class ActionSaveGameFinishedPayload {
    private long unknown;

    public long getUnknown() {
      return unknown;
    }

    public void setUnknown(long value) {
      this.unknown = value;
    }
  }

  public static class Player {
    private CustomOrLadder customOrLadderEnum;

    private Integer nonHost;

    private int playerId;

    private String name;

    private int customOrLadder;

    private List<Integer> fill;

    private Long runtime;

    private Long idRaceFlag;

    public CustomOrLadder getCustomOrLadderEnum() {
      return customOrLadderEnum;
    }

    public Integer getNonHost() {
      return nonHost;
    }

    public int getPlayerId() {
      return playerId;
    }

    public String getName() {
      return name;
    }

    public int getCustomOrLadder() {
      return customOrLadder;
    }

    public List<Integer> getFill() {
      return fill;
    }

    public Long getRuntime() {
      return runtime;
    }

    public Long getIdRaceFlag() {
      return idRaceFlag;
    }

    public void setCustomOrLadderEnum(CustomOrLadder value) {
      this.customOrLadderEnum = value;
    }

    public void setNonHost(Integer value) {
      this.nonHost = value;
    }

    public void setPlayerId(int value) {
      this.playerId = value;
    }

    public void setName(String value) {
      this.name = value;
    }

    public void setCustomOrLadder(int value) {
      this.customOrLadder = value;
    }

    public void setFill(List<Integer> value) {
      this.fill = value;
    }

    public void setRuntime(Long value) {
      this.runtime = value;
    }

    public void setIdRaceFlag(Long value) {
      this.idRaceFlag = value;
    }
  }

  public static class ActionChangeSelectionPayload {
    private ChangeSelectionMode mode;

    private List<ActionChangeSelectionPayloadUnit> unit;

    public ChangeSelectionMode getMode() {
      return mode;
    }

    public List<ActionChangeSelectionPayloadUnit> getUnit() {
      return unit;
    }

    public void setMode(ChangeSelectionMode value) {
      this.mode = value;
    }

    public void setUnit(List<ActionChangeSelectionPayloadUnit> value) {
      this.unit = value;
    }
  }

  public static class ActionCheatSomebodySetUpUsTheBombPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionCancelHeroRevivalPayload {
    private long unitId1;

    private long unitId2;

    public long getUnitId1() {
      return unitId1;
    }

    public long getUnitId2() {
      return unitId2;
    }

    public void setUnitId1(long value) {
      this.unitId1 = value;
    }

    public void setUnitId2(long value) {
      this.unitId2 = value;
    }
  }

  public static class PlayerMetaDataChunk {
    private List<Integer> toMeta;

    private PlayerMetaDataLoop playerMetaDataLoop;

    public List<Integer> getToMeta() {
      return toMeta;
    }

    public PlayerMetaDataLoop getPlayerMetaDataLoop() {
      return playerMetaDataLoop;
    }

    public void setToMeta(List<Integer> value) {
      this.toMeta = value;
    }

    public void setPlayerMetaDataLoop(PlayerMetaDataLoop value) {
      this.playerMetaDataLoop = value;
    }
  }

  public static class ActionContinueGameAfterWinOrDefeatPayload {
    private long a;

    private long b;

    private long c;

    private long d;

    public long geta() {
      return a;
    }

    public long getb() {
      return b;
    }

    public long getc() {
      return c;
    }

    public long getd() {
      return d;
    }

    public void seta(long value) {
      this.a = value;
    }

    public void setb(long value) {
      this.b = value;
    }

    public void setc(long value) {
      this.c = value;
    }

    public void setd(long value) {
      this.d = value;
    }
  }

  public static class ActionCheatSynergyPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionCheatTheDudeAbidesPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionDecreaseGameSpeedPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionSetGameSpeedPayload {
    private SetGameSpeedSpeed speed;

    public SetGameSpeedSpeed getSpeed() {
      return speed;
    }

    public void setSpeed(SetGameSpeedSpeed value) {
      this.speed = value;
    }
  }

  public static class ActionUnitBuildingAbilityPayload {
    private int abilityFlags;

    private OrderId orderId;

    private long unknownA;

    private long unknownB;

    public int getAbilityFlags() {
      return abilityFlags;
    }

    public OrderId getOrderId() {
      return orderId;
    }

    public long getUnknownA() {
      return unknownA;
    }

    public long getUnknownB() {
      return unknownB;
    }

    public void setAbilityFlags(int value) {
      this.abilityFlags = value;
    }

    public void setOrderId(OrderId value) {
      this.orderId = value;
    }

    public void setUnknownA(long value) {
      this.unknownA = value;
    }

    public void setUnknownB(long value) {
      this.unknownB = value;
    }
  }

  public static class ActionCheatLeafitToMePayload {
    private int unknown;

    private long amount;

    public int getUnknown() {
      return unknown;
    }

    public long getAmount() {
      return amount;
    }

    public void setUnknown(int value) {
      this.unknown = value;
    }

    public void setAmount(long value) {
      this.amount = value;
    }
  }

  public static class ActionChangeSelectionPayloadUnit {
    private long objectId1;

    private long objectId2;

    public long getObjectId1() {
      return objectId1;
    }

    public long getObjectId2() {
      return objectId2;
    }

    public void setObjectId1(long value) {
      this.objectId1 = value;
    }

    public void setObjectId2(long value) {
      this.objectId2 = value;
    }
  }

  public static class ActionCheatISeeDeadPeoplePayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
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

    private static final Map<Long, CustomOrLadder> byId = new HashMap<>();

    static {
      for (CustomOrLadder e : CustomOrLadder.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    CustomOrLadder(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public CustomOrLadder byId(long id) {
      return byId.get(id);
    }
  }

  public static class ActionCheatPointBreakPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionAssignGroupHotkeyPayload {
    private int groupIndex;

    private List<ActionAssignGroupHotkeyPayloadItem> item;

    public int getGroupIndex() {
      return groupIndex;
    }

    public List<ActionAssignGroupHotkeyPayloadItem> getItem() {
      return item;
    }

    public void setGroupIndex(int value) {
      this.groupIndex = value;
    }

    public void setItem(List<ActionAssignGroupHotkeyPayloadItem> value) {
      this.item = value;
    }
  }

  public static class ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload {
    private int abilityFlags;

    private OrderId orderIdA;

    private long unknownA;

    private long unknownB;

    private float xA;

    private float yA;

    private OrderId orderIdB;

    private List<Integer> unknown;

    private float xB;

    private float yB;

    public int getAbilityFlags() {
      return abilityFlags;
    }

    public OrderId getOrderIdA() {
      return orderIdA;
    }

    public long getUnknownA() {
      return unknownA;
    }

    public long getUnknownB() {
      return unknownB;
    }

    public float getXA() {
      return xA;
    }

    public float getYA() {
      return yA;
    }

    public OrderId getOrderIdB() {
      return orderIdB;
    }

    public List<Integer> getUnknown() {
      return unknown;
    }

    public float getXB() {
      return xB;
    }

    public float getYB() {
      return yB;
    }

    public void setAbilityFlags(int value) {
      this.abilityFlags = value;
    }

    public void setOrderIdA(OrderId value) {
      this.orderIdA = value;
    }

    public void setUnknownA(long value) {
      this.unknownA = value;
    }

    public void setUnknownB(long value) {
      this.unknownB = value;
    }

    public void setXA(float value) {
      this.xA = value;
    }

    public void setYA(float value) {
      this.yA = value;
    }

    public void setOrderIdB(OrderId value) {
      this.orderIdB = value;
    }

    public void setUnknown(List<Integer> value) {
      this.unknown = value;
    }

    public void setXB(float value) {
      this.xB = value;
    }

    public void setYB(float value) {
      this.yB = value;
    }
  }

  public static class ActionMapTriggerChatCommandPayload {
    private long unknownA;

    private long unknownB;

    private String chatCommandOrTriggerName;

    public long getUnknownA() {
      return unknownA;
    }

    public long getUnknownB() {
      return unknownB;
    }

    public String getChatCommandOrTriggerName() {
      return chatCommandOrTriggerName;
    }

    public void setUnknownA(long value) {
      this.unknownA = value;
    }

    public void setUnknownB(long value) {
      this.unknownB = value;
    }

    public void setChatCommandOrTriggerName(String value) {
      this.chatCommandOrTriggerName = value;
    }
  }

  public static class ActionCheatThereIsNoSpoonPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class PlayerOr0x19 {
    private PlayerOr0x19Loop playerOr0x19Loop;

    public PlayerOr0x19Loop getPlayerOr0x19Loop() {
      return playerOr0x19Loop;
    }

    public void setPlayerOr0x19Loop(PlayerOr0x19Loop value) {
      this.playerOr0x19Loop = value;
    }
  }

  public static class ChangeAllyOptionsFlags {
    private List<Integer> alliedWithPlayer;

    private int visionShared;

    private int sharedControl;

    private List<Integer> unknown;

    private int alliedVictory;

    public List<Integer> getAlliedWithPlayer() {
      return alliedWithPlayer;
    }

    public int getVisionShared() {
      return visionShared;
    }

    public int getSharedControl() {
      return sharedControl;
    }

    public List<Integer> getUnknown() {
      return unknown;
    }

    public int getAlliedVictory() {
      return alliedVictory;
    }

    public void setAlliedWithPlayer(List<Integer> value) {
      this.alliedWithPlayer = value;
    }

    public void setVisionShared(int value) {
      this.visionShared = value;
    }

    public void setSharedControl(int value) {
      this.sharedControl = value;
    }

    public void setUnknown(List<Integer> value) {
      this.unknown = value;
    }

    public void setAlliedVictory(int value) {
      this.alliedVictory = value;
    }
  }

  public static class ActionCheatAllYourBaseAreBelongToUsPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionCheatKeyserSozePayload {
    private int unknown;

    private long amount;

    public int getUnknown() {
      return unknown;
    }

    public long getAmount() {
      return amount;
    }

    public void setUnknown(int value) {
      this.unknown = value;
    }

    public void setAmount(long value) {
      this.amount = value;
    }
  }

  public static class ActionChangeAllyOptionsPayload {
    private int playerSlotIndex;

    private ChangeAllyOptionsFlags flags;

    public int getPlayerSlotIndex() {
      return playerSlotIndex;
    }

    public ChangeAllyOptionsFlags getFlags() {
      return flags;
    }

    public void setPlayerSlotIndex(int value) {
      this.playerSlotIndex = value;
    }

    public void setFlags(ChangeAllyOptionsFlags value) {
      this.flags = value;
    }
  }

  public static class ActionCheatSharpAndShinyPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class Chat {
    private int playerSenderId;

    private int size;

    private int flags;

    private Long chatRecipientIndex;

    private String message;

    public int getPlayerSenderId() {
      return playerSenderId;
    }

    public int getSize() {
      return size;
    }

    public int getFlags() {
      return flags;
    }

    public Long getChatRecipientIndex() {
      return chatRecipientIndex;
    }

    public String getMessage() {
      return message;
    }

    public void setPlayerSenderId(int value) {
      this.playerSenderId = value;
    }

    public void setSize(int value) {
      this.size = value;
    }

    public void setFlags(int value) {
      this.flags = value;
    }

    public void setChatRecipientIndex(Long value) {
      this.chatRecipientIndex = value;
    }

    public void setMessage(String value) {
      this.message = value;
    }
  }

  public static class ActionSaveGamePayload {
    private String name;

    public String getName() {
      return name;
    }

    public void setName(String value) {
      this.name = value;
    }
  }

  public enum ActionId {
    PAUSE_GAME(0),

    RESUME_GAME(1),

    SET_GAME_SPEED(2),

    INCREASE_GAME_SPEED(3),

    DECREASE_GAME_SPEED(4),

    SAVE_GAME(5),

    SAVE_GAME_FINISHED(6),

    UNIT_BUILDING_ABILITY(7),

    UNIT_BUILDING_ABILITY_WITH_TARGET_POSITION(8),

    UNIT_BUILDING_ABILITY_WITH_TARGET_POSITION_AND_OBJECT(9),

    GIVE_OR_DROP_ITEM(10),

    UNIT_BUILDING_ABILITY_WITH_TWO_TARGET_POSITIONS_AND_TWO_ITEM_IDS(11),

    CHANGE_SELECTION(12),

    ASSIGN_GROUP_HOTKEY(13),

    SELECT_GROUP_HOTKEY(14),

    SELECT_SUBGROUP(15),

    PRE_SUBSELECTION(16),

    UNKNOWN_0X1B(17),

    SELECT_GROUND_ITEM(18),

    CANCEL_HERO_REVIVAL(19),

    REMOVE_UNIT_FROM_BUILDING_QUEUE(20),

    CHEAT_THE_DUDE_ABIDES(21),

    UNKNOWN_0X21(22),

    CHEAT_SOMEBODY_SET_UP_US_THE_BOMB(23),

    CHEAT_WARP_TEN(24),

    CHEAT_IOCAINE_POWDER(25),

    CHEAT_POINT_BREAK(26),

    CHEAT_WHOS_YOUR_DADDY(27),

    CHEAT_KEYSER_SOZE(28),

    CHEAT_LEAFIT_TO_ME(29),

    CHEAT_THERE_IS_NO_SPOON(30),

    CHEAT_STRENGTH_AND_HONOR(31),

    CHEAT_IT_VEXES_ME(32),

    CHEAT_WHO_IS_JOHN_GALT(33),

    CHEAT_GREED_IS_GOOD(34),

    CHEAT_DAY_LIGHT_SAVINGS(35),

    CHEAT_I_SEE_DEAD_PEOPLE(36),

    CHEAT_SYNERGY(37),

    CHEAT_SHARP_AND_SHINY(38),

    CHEAT_ALL_YOUR_BASE_ARE_BELONG_TO_US(39),

    CHANGE_ALLY_OPTIONS(40),

    TRANSFER_RESOURCES(41),

    MAP_TRIGGER_CHAT_COMMAND(42),

    ESC_PRESSED(43),

    SCENARIO_TRIGGER(44),

    ENTER_CHOOSE_HERO_SKILL_SUBMENU(45),

    ENTER_CHOOSE_BUILDING_SUBMENU(46),

    MINIMAP_SIGNAL(47),

    CONTINUE_GAME_AFTER_WIN_OR_DEFEAT(48),

    CONTINUE_GAME_AFTER_WIN_OR_DEFEAT2(49),

    UNKNOWN_0X75(50),

    UNKNOWN_0X7B(51);

    private static final Map<Long, ActionId> byId = new HashMap<>();

    static {
      for (ActionId e : ActionId.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    ActionId(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public ActionId byId(long id) {
      return byId.get(id);
    }
  }

  public enum SetGameSpeedSpeed {
    SLOW(0),

    NORMAL(1),

    FAST(2);

    private static final Map<Long, SetGameSpeedSpeed> byId = new HashMap<>();

    static {
      for (SetGameSpeedSpeed e : SetGameSpeedSpeed.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    SetGameSpeedSpeed(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public SetGameSpeedSpeed byId(long id) {
      return byId.get(id);
    }
  }

  public static class Countdown {
    private int pre;

    private long mode;

    private long secs;

    public int getPre() {
      return pre;
    }

    public long getMode() {
      return mode;
    }

    public long getSecs() {
      return secs;
    }

    public void setPre(int value) {
      this.pre = value;
    }

    public void setMode(long value) {
      this.mode = value;
    }

    public void setSecs(long value) {
      this.secs = value;
    }
  }

  public static class Record {
    private int playerId;

    private int playerIdFill;

    private int status;

    private int controller;

    private int team;

    private int color;

    private int race;

    private Integer aiStrength;

    private Integer handicap;

    private int recSize;

    public int getPlayerId() {
      return playerId;
    }

    public int getPlayerIdFill() {
      return playerIdFill;
    }

    public int getStatus() {
      return status;
    }

    public int getController() {
      return controller;
    }

    public int getTeam() {
      return team;
    }

    public int getColor() {
      return color;
    }

    public int getRace() {
      return race;
    }

    public Integer getAiStrength() {
      return aiStrength;
    }

    public Integer getHandicap() {
      return handicap;
    }

    public int getRecSize() {
      return recSize;
    }

    public void setPlayerId(int value) {
      this.playerId = value;
    }

    public void setPlayerIdFill(int value) {
      this.playerIdFill = value;
    }

    public void setStatus(int value) {
      this.status = value;
    }

    public void setController(int value) {
      this.controller = value;
    }

    public void setTeam(int value) {
      this.team = value;
    }

    public void setColor(int value) {
      this.color = value;
    }

    public void setRace(int value) {
      this.race = value;
    }

    public void setAiStrength(Integer value) {
      this.aiStrength = value;
    }

    public void setHandicap(Integer value) {
      this.handicap = value;
    }

    public void setRecSize(int value) {
      this.recSize = value;
    }
  }

  public static class CompressedArea {
    private byte[] content;

    public byte[] getContent() {
      return content;
    }

    public void setContent(byte[] value) {
      this.content = value;
    }
  }

  public static class ActionRemoveUnitFromBuildingQueuePayload {
    private int slotIndex;

    private long itemId;

    public int getSlotIndex() {
      return slotIndex;
    }

    public long getItemId() {
      return itemId;
    }

    public void setSlotIndex(int value) {
      this.slotIndex = value;
    }

    public void setItemId(long value) {
      this.itemId = value;
    }
  }

  public static class PlayerListPlayer {
    private CustomOrLadder customOrLadderEnum;

    private int nonHost;

    private int playerId;

    private String name;

    private Integer customOrLadder;

    private Long runtime;

    private Long idRaceFlag;

    public CustomOrLadder getCustomOrLadderEnum() {
      return customOrLadderEnum;
    }

    public int getNonHost() {
      return nonHost;
    }

    public int getPlayerId() {
      return playerId;
    }

    public String getName() {
      return name;
    }

    public Integer getCustomOrLadder() {
      return customOrLadder;
    }

    public Long getRuntime() {
      return runtime;
    }

    public Long getIdRaceFlag() {
      return idRaceFlag;
    }

    public void setCustomOrLadderEnum(CustomOrLadder value) {
      this.customOrLadderEnum = value;
    }

    public void setNonHost(int value) {
      this.nonHost = value;
    }

    public void setPlayerId(int value) {
      this.playerId = value;
    }

    public void setName(String value) {
      this.name = value;
    }

    public void setCustomOrLadder(Integer value) {
      this.customOrLadder = value;
    }

    public void setRuntime(Long value) {
      this.runtime = value;
    }

    public void setIdRaceFlag(Long value) {
      this.idRaceFlag = value;
    }
  }

  public static class ActionCheatWarpTenPayload {
    private byte[] nothing;

    public byte[] getNothing() {
      return nothing;
    }

    public void setNothing(byte[] value) {
      this.nothing = value;
    }
  }

  public static class ActionSelectSubgroupPayload {
    private String itemId;

    private long objectId1;

    private long objectId2;

    public String getItemId() {
      return itemId;
    }

    public long getObjectId1() {
      return objectId1;
    }

    public long getObjectId2() {
      return objectId2;
    }

    public void setItemId(String value) {
      this.itemId = value;
    }

    public void setObjectId1(long value) {
      this.objectId1 = value;
    }

    public void setObjectId2(long value) {
      this.objectId2 = value;
    }
  }
}
