package w3.ai.wai.model;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class W3Wai {
  private long version;

  private W3str name;

  private AiRace race;

  private Flags flags;

  private W3id goldWorker;

  private W3id lumberWorker;

  private W3id baseBuilding;

  private W3id mineBuilding;

  private long unknown;

  private List<Condition> condition;

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

  private List<BuildPriority> buildPriority;

  private List<HarvestPriority> harvestPriority;

  private List<TargetPriority> targetPriority;

  private long repeatWaves;

  private long minimumForcesAttackGroupIndex;

  private long initialDelay;

  private List<AttackGroup> attackGroup;

  private List<AttackWave> attackWave;

  private long unknown2;

  private GameOptions gameOptions;

  private long regularGameSpeed;

  private W3str mapPath;

  private List<Player> player;

  private long useImportObj;

  private ImportObj importObj;

  private W3W3o w3o;

  public long getVersion() {
    return version;
  }

  public W3str getName() {
    return name;
  }

  public AiRace getRace() {
    return race;
  }

  public Flags getFlags() {
    return flags;
  }

  public W3id getGoldWorker() {
    return goldWorker;
  }

  public W3id getLumberWorker() {
    return lumberWorker;
  }

  public W3id getBaseBuilding() {
    return baseBuilding;
  }

  public W3id getMineBuilding() {
    return mineBuilding;
  }

  public long getUnknown() {
    return unknown;
  }

  public List<Condition> getCondition() {
    return condition;
  }

  public W3id getFirstHero() {
    return firstHero;
  }

  public W3id getSecondHero() {
    return secondHero;
  }

  public W3id getThirdHero() {
    return thirdHero;
  }

  public long getTrainingChanceFirstSecondThird() {
    return trainingChanceFirstSecondThird;
  }

  public long getTrainingChanceFirstThirdSecond() {
    return trainingChanceFirstThirdSecond;
  }

  public long getTrainingChanceSecondFirstThird() {
    return trainingChanceSecondFirstThird;
  }

  public long getTrainingChanceSecondThirdFirst() {
    return trainingChanceSecondThirdFirst;
  }

  public long getTrainingChanceThirdFirstSecond() {
    return trainingChanceThirdFirstSecond;
  }

  public long getTrainingChanceThirdSecondFirst() {
    return trainingChanceThirdSecondFirst;
  }

  public SkillChunk getSkillChunk() {
    return skillChunk;
  }

  public List<BuildPriority> getBuildPriority() {
    return buildPriority;
  }

  public List<HarvestPriority> getHarvestPriority() {
    return harvestPriority;
  }

  public List<TargetPriority> getTargetPriority() {
    return targetPriority;
  }

  public long getRepeatWaves() {
    return repeatWaves;
  }

  public long getMinimumForcesAttackGroupIndex() {
    return minimumForcesAttackGroupIndex;
  }

  public long getInitialDelay() {
    return initialDelay;
  }

  public List<AttackGroup> getAttackGroup() {
    return attackGroup;
  }

  public List<AttackWave> getAttackWave() {
    return attackWave;
  }

  public long getUnknown2() {
    return unknown2;
  }

  public GameOptions getGameOptions() {
    return gameOptions;
  }

  public long getRegularGameSpeed() {
    return regularGameSpeed;
  }

  public W3str getMapPath() {
    return mapPath;
  }

  public List<Player> getPlayer() {
    return player;
  }

  public long getUseImportObj() {
    return useImportObj;
  }

  public ImportObj getImportObj() {
    return importObj;
  }

  public W3W3o getW3o() {
    return w3o;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setName(W3str value) {
    this.name = value;
  }

  public void setRace(AiRace value) {
    this.race = value;
  }

  public void setFlags(Flags value) {
    this.flags = value;
  }

  public void setGoldWorker(W3id value) {
    this.goldWorker = value;
  }

  public void setLumberWorker(W3id value) {
    this.lumberWorker = value;
  }

  public void setBaseBuilding(W3id value) {
    this.baseBuilding = value;
  }

  public void setMineBuilding(W3id value) {
    this.mineBuilding = value;
  }

  public void setUnknown(long value) {
    this.unknown = value;
  }

  public void setCondition(List<Condition> value) {
    this.condition = value;
  }

  public void setFirstHero(W3id value) {
    this.firstHero = value;
  }

  public void setSecondHero(W3id value) {
    this.secondHero = value;
  }

  public void setThirdHero(W3id value) {
    this.thirdHero = value;
  }

  public void setTrainingChanceFirstSecondThird(long value) {
    this.trainingChanceFirstSecondThird = value;
  }

  public void setTrainingChanceFirstThirdSecond(long value) {
    this.trainingChanceFirstThirdSecond = value;
  }

  public void setTrainingChanceSecondFirstThird(long value) {
    this.trainingChanceSecondFirstThird = value;
  }

  public void setTrainingChanceSecondThirdFirst(long value) {
    this.trainingChanceSecondThirdFirst = value;
  }

  public void setTrainingChanceThirdFirstSecond(long value) {
    this.trainingChanceThirdFirstSecond = value;
  }

  public void setTrainingChanceThirdSecondFirst(long value) {
    this.trainingChanceThirdSecondFirst = value;
  }

  public void setSkillChunk(SkillChunk value) {
    this.skillChunk = value;
  }

  public void setBuildPriority(List<BuildPriority> value) {
    this.buildPriority = value;
  }

  public void setHarvestPriority(List<HarvestPriority> value) {
    this.harvestPriority = value;
  }

  public void setTargetPriority(List<TargetPriority> value) {
    this.targetPriority = value;
  }

  public void setRepeatWaves(long value) {
    this.repeatWaves = value;
  }

  public void setMinimumForcesAttackGroupIndex(long value) {
    this.minimumForcesAttackGroupIndex = value;
  }

  public void setInitialDelay(long value) {
    this.initialDelay = value;
  }

  public void setAttackGroup(List<AttackGroup> value) {
    this.attackGroup = value;
  }

  public void setAttackWave(List<AttackWave> value) {
    this.attackWave = value;
  }

  public void setUnknown2(long value) {
    this.unknown2 = value;
  }

  public void setGameOptions(GameOptions value) {
    this.gameOptions = value;
  }

  public void setRegularGameSpeed(long value) {
    this.regularGameSpeed = value;
  }

  public void setMapPath(W3str value) {
    this.mapPath = value;
  }

  public void setPlayer(List<Player> value) {
    this.player = value;
  }

  public void setUseImportObj(long value) {
    this.useImportObj = value;
  }

  public void setImportObj(ImportObj value) {
    this.importObj = value;
  }

  public void setW3o(W3W3o value) {
    this.w3o = value;
  }

  public enum ParameterType {
    PRESET(0),

    OPERATOR_FUNCTION(1),

    FUNCTION(2),

    STRING(3);

    private static final Map<Long, ParameterType> byId = new HashMap<>();

    static {
      for (ParameterType e : ParameterType.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    ParameterType(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public ParameterType byId(long id) {
      return byId.get(id);
    }
  }

  public static class FunctionParameterExt {
    private long type;

    private W3str value;

    private long beginFunction;

    private ParameterList parameterList;

    private long endFunction;

    public long getType() {
      return type;
    }

    public W3str getValue() {
      return value;
    }

    public long getBeginFunction() {
      return beginFunction;
    }

    public ParameterList getParameterList() {
      return parameterList;
    }

    public long getEndFunction() {
      return endFunction;
    }

    public void setType(long value) {
      this.type = value;
    }

    public void setValue(W3str value) {
      this.value = value;
    }

    public void setBeginFunction(long value) {
      this.beginFunction = value;
    }

    public void setParameterList(ParameterList value) {
      this.parameterList = value;
    }

    public void setEndFunction(long value) {
      this.endFunction = value;
    }
  }

  public enum Ai {
    STANDARD(0),

    USER(1),

    CUSTOM(2),

    CURRENT(3);

    private static final Map<Long, Ai> byId = new HashMap<>();

    static {
      for (Ai e : Ai.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    Ai(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public Ai byId(long id) {
      return byId.get(id);
    }
  }

  public enum ConditionType {
    NONE(0),

    USED(1);

    private static final Map<Long, ConditionType> byId = new HashMap<>();

    static {
      for (ConditionType e : ConditionType.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    ConditionType(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public ConditionType byId(long id) {
      return byId.get(id);
    }
  }

  public enum AiDifficulty {
    EASY(0),

    NORMAL(1),

    INSANE(2);

    private static final Map<Long, AiDifficulty> byId = new HashMap<>();

    static {
      for (AiDifficulty e : AiDifficulty.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    AiDifficulty(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public AiDifficulty byId(long id) {
      return byId.get(id);
    }
  }

  public static class TargetPriority {
    private long priorityType;

    private Target target;

    private long creepMinStrength;

    private Long creepMaxStrength;

    private AllowFlyers allowFlyers;

    private BuildPriorityConditionIndex conditionIndex;

    private List<Integer> fill2;

    private List<Integer> fill;

    public long getPriorityType() {
      return priorityType;
    }

    public Target getTarget() {
      return target;
    }

    public long getCreepMinStrength() {
      return creepMinStrength;
    }

    public Long getCreepMaxStrength() {
      return creepMaxStrength;
    }

    public AllowFlyers getAllowFlyers() {
      return allowFlyers;
    }

    public BuildPriorityConditionIndex getConditionIndex() {
      return conditionIndex;
    }

    public List<Integer> getFill2() {
      return fill2;
    }

    public List<Integer> getFill() {
      return fill;
    }

    public void setPriorityType(long value) {
      this.priorityType = value;
    }

    public void setTarget(Target value) {
      this.target = value;
    }

    public void setCreepMinStrength(long value) {
      this.creepMinStrength = value;
    }

    public void setCreepMaxStrength(Long value) {
      this.creepMaxStrength = value;
    }

    public void setAllowFlyers(AllowFlyers value) {
      this.allowFlyers = value;
    }

    public void setConditionIndex(BuildPriorityConditionIndex value) {
      this.conditionIndex = value;
    }

    public void setFill2(List<Integer> value) {
      this.fill2 = value;
    }

    public void setFill(List<Integer> value) {
      this.fill = value;
    }
  }

  public enum Target {
    COMMON_ALLIANCE_TARGET(0),

    NEW_EXPANSION_LOCATION(1),

    ENEMY_MAJOR_ASSAULT(2),

    ENEMY_EXPANSION(3),

    ENEMY_ANY_TOWN(4),

    CREEP_CAMP(5),

    PURCHASE_GOBLIN_ZEPPELIN(6);

    private static final Map<Long, Target> byId = new HashMap<>();

    static {
      for (Target e : Target.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    Target(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public Target byId(long id) {
      return byId.get(id);
    }
  }

  public static class ImportObj {
    private W3str path;

    private W3str importTime;

    public W3str getPath() {
      return path;
    }

    public W3str getImportTime() {
      return importTime;
    }

    public void setPath(W3str value) {
      this.path = value;
    }

    public void setImportTime(W3str value) {
      this.importTime = value;
    }
  }

  public enum HarvestType {
    GOLD(0),

    LUMBER(1);

    private static final Map<Long, HarvestType> byId = new HashMap<>();

    static {
      for (HarvestType e : HarvestType.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    HarvestType(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public HarvestType byId(long id) {
      return byId.get(id);
    }
  }

  public enum PlayerRace {
    HUMAN(0),

    ORC(1),

    NIGHT_ELF(2),

    UNDEAD(3),

    RANDOM(4);

    private static final Map<Long, PlayerRace> byId = new HashMap<>();

    static {
      for (PlayerRace e : PlayerRace.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    PlayerRace(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public PlayerRace byId(long id) {
      return byId.get(id);
    }
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

    MINE_9(10),

    MINE_8(11),

    MINE_7(12),

    MINE_6(13),

    MINE_5(14),

    MINE_4(15),

    MINE_3(16),

    MINE_2(17),

    MINE_1(18),

    ANY(19);

    private static final Map<Long, BuildPriorityTarget> byId = new HashMap<>();

    static {
      for (BuildPriorityTarget e : BuildPriorityTarget.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    BuildPriorityTarget(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public BuildPriorityTarget byId(long id) {
      return byId.get(id);
    }
  }

  public enum AiRace {
    CUSTOM(0),

    HUMAN(1),

    ORC(2),

    UNDEAD(3),

    NIGHT_ELF(4);

    private static final Map<Long, AiRace> byId = new HashMap<>();

    static {
      for (AiRace e : AiRace.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    AiRace(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public AiRace byId(long id) {
      return byId.get(id);
    }
  }

  public static class ParameterList {
    private List<Parameter> parameter;

    public List<Parameter> getParameter() {
      return parameter;
    }

    public void setParameter(List<Parameter> value) {
      this.parameter = value;
    }
  }

  public enum BuildPriorityConditionIndex {
    CUSTOM(0),

    NONE(1);

    private static final Map<Long, BuildPriorityConditionIndex> byId = new HashMap<>();

    static {
      for (BuildPriorityConditionIndex e : BuildPriorityConditionIndex.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    BuildPriorityConditionIndex(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public BuildPriorityConditionIndex byId(long id) {
      return byId.get(id);
    }
  }

  public static class SkillChunk {
    private List<W3id> firstAsFirst;

    private List<W3id> firstAsSecond;

    private List<W3id> firstAsThird;

    private List<W3id> secondAsFirst;

    private List<W3id> secondAsSecond;

    private List<W3id> secondAsThird;

    private List<W3id> thirdAsFirst;

    private List<W3id> thirdAsSecond;

    private List<W3id> thirdAsThird;

    public List<W3id> getFirstAsFirst() {
      return firstAsFirst;
    }

    public List<W3id> getFirstAsSecond() {
      return firstAsSecond;
    }

    public List<W3id> getFirstAsThird() {
      return firstAsThird;
    }

    public List<W3id> getSecondAsFirst() {
      return secondAsFirst;
    }

    public List<W3id> getSecondAsSecond() {
      return secondAsSecond;
    }

    public List<W3id> getSecondAsThird() {
      return secondAsThird;
    }

    public List<W3id> getThirdAsFirst() {
      return thirdAsFirst;
    }

    public List<W3id> getThirdAsSecond() {
      return thirdAsSecond;
    }

    public List<W3id> getThirdAsThird() {
      return thirdAsThird;
    }

    public void setFirstAsFirst(List<W3id> value) {
      this.firstAsFirst = value;
    }

    public void setFirstAsSecond(List<W3id> value) {
      this.firstAsSecond = value;
    }

    public void setFirstAsThird(List<W3id> value) {
      this.firstAsThird = value;
    }

    public void setSecondAsFirst(List<W3id> value) {
      this.secondAsFirst = value;
    }

    public void setSecondAsSecond(List<W3id> value) {
      this.secondAsSecond = value;
    }

    public void setSecondAsThird(List<W3id> value) {
      this.secondAsThird = value;
    }

    public void setThirdAsFirst(List<W3id> value) {
      this.thirdAsFirst = value;
    }

    public void setThirdAsSecond(List<W3id> value) {
      this.thirdAsSecond = value;
    }

    public void setThirdAsThird(List<W3id> value) {
      this.thirdAsThird = value;
    }
  }

  public static class AttackWave {
    private long attackGroupIndex;

    private long delay;

    public long getAttackGroupIndex() {
      return attackGroupIndex;
    }

    public long getDelay() {
      return delay;
    }

    public void setAttackGroupIndex(long value) {
      this.attackGroupIndex = value;
    }

    public void setDelay(long value) {
      this.delay = value;
    }
  }

  public static class CurrentGroup {
    private W3id unit;

    private long quantity;

    private long maxQuantity;

    private BuildPriorityConditionIndex conditionIndex;

    private List<Integer> fill;

    public W3id getUnit() {
      return unit;
    }

    public long getQuantity() {
      return quantity;
    }

    public long getMaxQuantity() {
      return maxQuantity;
    }

    public BuildPriorityConditionIndex getConditionIndex() {
      return conditionIndex;
    }

    public List<Integer> getFill() {
      return fill;
    }

    public void setUnit(W3id value) {
      this.unit = value;
    }

    public void setQuantity(long value) {
      this.quantity = value;
    }

    public void setMaxQuantity(long value) {
      this.maxQuantity = value;
    }

    public void setConditionIndex(BuildPriorityConditionIndex value) {
      this.conditionIndex = value;
    }

    public void setFill(List<Integer> value) {
      this.fill = value;
    }
  }

  public static class Player {
    private long index;

    private long teamNumber;

    private PlayerRace race;

    private long color;

    private long handicap;

    private Ai ai;

    private AiDifficulty aiDifficulty;

    private W3str aiScriptPath;

    public long getIndex() {
      return index;
    }

    public long getTeamNumber() {
      return teamNumber;
    }

    public PlayerRace getRace() {
      return race;
    }

    public long getColor() {
      return color;
    }

    public long getHandicap() {
      return handicap;
    }

    public Ai getAi() {
      return ai;
    }

    public AiDifficulty getAiDifficulty() {
      return aiDifficulty;
    }

    public W3str getAiScriptPath() {
      return aiScriptPath;
    }

    public void setIndex(long value) {
      this.index = value;
    }

    public void setTeamNumber(long value) {
      this.teamNumber = value;
    }

    public void setRace(PlayerRace value) {
      this.race = value;
    }

    public void setColor(long value) {
      this.color = value;
    }

    public void setHandicap(long value) {
      this.handicap = value;
    }

    public void setAi(Ai value) {
      this.ai = value;
    }

    public void setAiDifficulty(AiDifficulty value) {
      this.aiDifficulty = value;
    }

    public void setAiScriptPath(W3str value) {
      this.aiScriptPath = value;
    }
  }

  public static class OperatorFunctionParameterExt {
    private long beginFunction;

    private ParameterList parameterList;

    private long endFunction;

    public long getBeginFunction() {
      return beginFunction;
    }

    public ParameterList getParameterList() {
      return parameterList;
    }

    public long getEndFunction() {
      return endFunction;
    }

    public void setBeginFunction(long value) {
      this.beginFunction = value;
    }

    public void setParameterList(ParameterList value) {
      this.parameterList = value;
    }

    public void setEndFunction(long value) {
      this.endFunction = value;
    }
  }

  public enum AllowFlyers {
    FALSE(0),

    TRUE(1);

    private static final Map<Long, AllowFlyers> byId = new HashMap<>();

    static {
      for (AllowFlyers e : AllowFlyers.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    AllowFlyers(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public AllowFlyers byId(long id) {
      return byId.get(id);
    }
  }

  public static class AttackGroup {
    private long index;

    private W3str name;

    private List<CurrentGroup> currentGroup;

    public long getIndex() {
      return index;
    }

    public W3str getName() {
      return name;
    }

    public List<CurrentGroup> getCurrentGroup() {
      return currentGroup;
    }

    public void setIndex(long value) {
      this.index = value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setCurrentGroup(List<CurrentGroup> value) {
      this.currentGroup = value;
    }
  }

  public static class Flags {
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

    private List<Boolean> rest;

    private boolean buyItems;

    public boolean getDefendUsers() {
      return defendUsers;
    }

    public boolean getRandomPaths() {
      return randomPaths;
    }

    public boolean getSetPlayerName() {
      return setPlayerName;
    }

    public boolean getRemoveInjuries() {
      return removeInjuries;
    }

    public boolean getSmartArtillery() {
      return smartArtillery;
    }

    public boolean getAllowHomeChanges() {
      return allowHomeChanges;
    }

    public boolean getSlowHarvesting() {
      return slowHarvesting;
    }

    public boolean getTakeItems() {
      return takeItems;
    }

    public boolean getIgnoreInjuries() {
      return ignoreInjuries;
    }

    public boolean getHaveNoMercy() {
      return haveNoMercy;
    }

    public boolean getGroupsFlee() {
      return groupsFlee;
    }

    public boolean getUnitsFlee() {
      return unitsFlee;
    }

    public boolean getHeroesFlee() {
      return heroesFlee;
    }

    public boolean getRepairStructures() {
      return repairStructures;
    }

    public boolean getTargetHeroes() {
      return targetHeroes;
    }

    public boolean getMelee() {
      return melee;
    }

    public List<Boolean> getRest() {
      return rest;
    }

    public boolean getBuyItems() {
      return buyItems;
    }

    public void setDefendUsers(boolean value) {
      this.defendUsers = value;
    }

    public void setRandomPaths(boolean value) {
      this.randomPaths = value;
    }

    public void setSetPlayerName(boolean value) {
      this.setPlayerName = value;
    }

    public void setRemoveInjuries(boolean value) {
      this.removeInjuries = value;
    }

    public void setSmartArtillery(boolean value) {
      this.smartArtillery = value;
    }

    public void setAllowHomeChanges(boolean value) {
      this.allowHomeChanges = value;
    }

    public void setSlowHarvesting(boolean value) {
      this.slowHarvesting = value;
    }

    public void setTakeItems(boolean value) {
      this.takeItems = value;
    }

    public void setIgnoreInjuries(boolean value) {
      this.ignoreInjuries = value;
    }

    public void setHaveNoMercy(boolean value) {
      this.haveNoMercy = value;
    }

    public void setGroupsFlee(boolean value) {
      this.groupsFlee = value;
    }

    public void setUnitsFlee(boolean value) {
      this.unitsFlee = value;
    }

    public void setHeroesFlee(boolean value) {
      this.heroesFlee = value;
    }

    public void setRepairStructures(boolean value) {
      this.repairStructures = value;
    }

    public void setTargetHeroes(boolean value) {
      this.targetHeroes = value;
    }

    public void setMelee(boolean value) {
      this.melee = value;
    }

    public void setRest(List<Boolean> value) {
      this.rest = value;
    }

    public void setBuyItems(boolean value) {
      this.buyItems = value;
    }
  }

  public static class Parameter {
    private ParameterType type;

    private W3str value;

    private long beginFunction;

    private ParameterList parameterList;

    private FunctionParameterExt functionParameterExt;

    private ParameterList parameterListOp;

    private long endFunction;

    public ParameterType getType() {
      return type;
    }

    public W3str getValue() {
      return value;
    }

    public long getBeginFunction() {
      return beginFunction;
    }

    public ParameterList getParameterList() {
      return parameterList;
    }

    public FunctionParameterExt getFunctionParameterExt() {
      return functionParameterExt;
    }

    public ParameterList getParameterListOp() {
      return parameterListOp;
    }

    public long getEndFunction() {
      return endFunction;
    }

    public void setType(ParameterType value) {
      this.type = value;
    }

    public void setValue(W3str value) {
      this.value = value;
    }

    public void setBeginFunction(long value) {
      this.beginFunction = value;
    }

    public void setParameterList(ParameterList value) {
      this.parameterList = value;
    }

    public void setFunctionParameterExt(FunctionParameterExt value) {
      this.functionParameterExt = value;
    }

    public void setParameterListOp(ParameterList value) {
      this.parameterListOp = value;
    }

    public void setEndFunction(long value) {
      this.endFunction = value;
    }
  }

  public enum BuildPriorityTechType {
    UNIT(0),

    UPGRADE(1),

    EXPANSION_TOWN(2);

    private static final Map<Long, BuildPriorityTechType> byId = new HashMap<>();

    static {
      for (BuildPriorityTechType e : BuildPriorityTechType.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    BuildPriorityTechType(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public BuildPriorityTechType byId(long id) {
      return byId.get(id);
    }
  }

  public static class Condition {
    private long index;

    private ConditionWithoutIndex rest;

    public long getIndex() {
      return index;
    }

    public ConditionWithoutIndex getRest() {
      return rest;
    }

    public void setIndex(long value) {
      this.index = value;
    }

    public void setRest(ConditionWithoutIndex value) {
      this.rest = value;
    }
  }

  public static class BuildPriority {
    private long priorityType;

    private BuildPriorityTechType techType;

    private W3id tech;

    private BuildPriorityTarget target;

    private BuildPriorityConditionIndex conditionIndex;

    private List<Integer> fill;

    public long getPriorityType() {
      return priorityType;
    }

    public BuildPriorityTechType getTechType() {
      return techType;
    }

    public W3id getTech() {
      return tech;
    }

    public BuildPriorityTarget getTarget() {
      return target;
    }

    public BuildPriorityConditionIndex getConditionIndex() {
      return conditionIndex;
    }

    public List<Integer> getFill() {
      return fill;
    }

    public void setPriorityType(long value) {
      this.priorityType = value;
    }

    public void setTechType(BuildPriorityTechType value) {
      this.techType = value;
    }

    public void setTech(W3id value) {
      this.tech = value;
    }

    public void setTarget(BuildPriorityTarget value) {
      this.target = value;
    }

    public void setConditionIndex(BuildPriorityConditionIndex value) {
      this.conditionIndex = value;
    }

    public void setFill(List<Integer> value) {
      this.fill = value;
    }
  }

  public static class ConditionWithoutIndex {
    private String name;

    private ConditionType type;

    private W3str operatorFunctionName;

    private long beginFunction;

    private ParameterList parameterList;

    private long endFunction;

    public String getName() {
      return name;
    }

    public ConditionType getType() {
      return type;
    }

    public W3str getOperatorFunctionName() {
      return operatorFunctionName;
    }

    public long getBeginFunction() {
      return beginFunction;
    }

    public ParameterList getParameterList() {
      return parameterList;
    }

    public long getEndFunction() {
      return endFunction;
    }

    public void setName(String value) {
      this.name = value;
    }

    public void setType(ConditionType value) {
      this.type = value;
    }

    public void setOperatorFunctionName(W3str value) {
      this.operatorFunctionName = value;
    }

    public void setBeginFunction(long value) {
      this.beginFunction = value;
    }

    public void setParameterList(ParameterList value) {
      this.parameterList = value;
    }

    public void setEndFunction(long value) {
      this.endFunction = value;
    }
  }

  public static class GameOptions {
    private List<Boolean> rest;

    private boolean disableVictoryDefeatConditions;

    private boolean disableFogOfWar;

    private List<Boolean> rest2;

    public List<Boolean> getRest() {
      return rest;
    }

    public boolean getDisableVictoryDefeatConditions() {
      return disableVictoryDefeatConditions;
    }

    public boolean getDisableFogOfWar() {
      return disableFogOfWar;
    }

    public List<Boolean> getRest2() {
      return rest2;
    }

    public void setRest(List<Boolean> value) {
      this.rest = value;
    }

    public void setDisableVictoryDefeatConditions(boolean value) {
      this.disableVictoryDefeatConditions = value;
    }

    public void setDisableFogOfWar(boolean value) {
      this.disableFogOfWar = value;
    }

    public void setRest2(List<Boolean> value) {
      this.rest2 = value;
    }
  }

  public static class HarvestPriority {
    private long harvestPriorityType;

    private HarvestType harvestType;

    private BuildPriorityTarget target;

    private long workers;

    private BuildPriorityConditionIndex conditionIndex;

    private List<Integer> fill;

    public long getHarvestPriorityType() {
      return harvestPriorityType;
    }

    public HarvestType getHarvestType() {
      return harvestType;
    }

    public BuildPriorityTarget getTarget() {
      return target;
    }

    public long getWorkers() {
      return workers;
    }

    public BuildPriorityConditionIndex getConditionIndex() {
      return conditionIndex;
    }

    public List<Integer> getFill() {
      return fill;
    }

    public void setHarvestPriorityType(long value) {
      this.harvestPriorityType = value;
    }

    public void setHarvestType(HarvestType value) {
      this.harvestType = value;
    }

    public void setTarget(BuildPriorityTarget value) {
      this.target = value;
    }

    public void setWorkers(long value) {
      this.workers = value;
    }

    public void setConditionIndex(BuildPriorityConditionIndex value) {
      this.conditionIndex = value;
    }

    public void setFill(List<Integer> value) {
      this.fill = value;
    }
  }
}
