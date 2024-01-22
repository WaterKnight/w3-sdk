package w3.info.w3i.model;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class W3W3i {
  private String mapName;

  private long version;

  private Long saves;

  private Long editorVersion;

  private GameVersion gameVersion;

  private W3str mapNameRaw;

  private W3str author;

  private W3str description;

  private W3str recommendedPlayers;

  private UnknownV0ToV3 unknownV0ToV3;

  private UnknownV4ToV8 unknownV4ToV8;

  private CameraBounds cameraBounds;

  private Margins margins;

  private Long mapWidth;

  private Long mapHeight;

  private Long unknownV3Int1;

  private Flags flags;

  private Tileset tileset;

  private LoadingScreen loadingScreen;

  private GameDataSet gameDataSet;

  private W3str unknownPath;

  private PrologueScreen prologueScreen;

  private Fog fog;

  private W3id globalWeatherId;

  private W3str soundEnvironment;

  private W3char lightEnvironment;

  private WaterColor waterColor;

  private ScriptLanguage scriptLanguage;

  private GraphicsModes supportedGraphicsModes;

  private GameDataVersion gameDataVersion;

  private PlayersChunk playersChunk;

  private ForcesChunk forcesChunk;

  private UpgradesChunk upgradesChunk;

  private TechsChunk techsChunk;

  private RandomUnitTablesChunk randomUnitTablesChunk;

  private RandomItemTablesChunk randomItemTablesChunk;

  private Long scriptLanguage2;

  public String getMapName() {
    return mapName;
  }

  public long getVersion() {
    return version;
  }

  public Long getSaves() {
    return saves;
  }

  public Long getEditorVersion() {
    return editorVersion;
  }

  public GameVersion getGameVersion() {
    return gameVersion;
  }

  public W3str getMapNameRaw() {
    return mapNameRaw;
  }

  public W3str getAuthor() {
    return author;
  }

  public W3str getDescription() {
    return description;
  }

  public W3str getRecommendedPlayers() {
    return recommendedPlayers;
  }

  public UnknownV0ToV3 getUnknownV0ToV3() {
    return unknownV0ToV3;
  }

  public UnknownV4ToV8 getUnknownV4ToV8() {
    return unknownV4ToV8;
  }

  public CameraBounds getCameraBounds() {
    return cameraBounds;
  }

  public Margins getMargins() {
    return margins;
  }

  public Long getMapWidth() {
    return mapWidth;
  }

  public Long getMapHeight() {
    return mapHeight;
  }

  public Long getUnknownV3Int1() {
    return unknownV3Int1;
  }

  public Flags getFlags() {
    return flags;
  }

  public Tileset getTileset() {
    return tileset;
  }

  public LoadingScreen getLoadingScreen() {
    return loadingScreen;
  }

  public GameDataSet getGameDataSet() {
    return gameDataSet;
  }

  public W3str getUnknownPath() {
    return unknownPath;
  }

  public PrologueScreen getPrologueScreen() {
    return prologueScreen;
  }

  public Fog getFog() {
    return fog;
  }

  public W3id getGlobalWeatherId() {
    return globalWeatherId;
  }

  public W3str getSoundEnvironment() {
    return soundEnvironment;
  }

  public W3char getLightEnvironment() {
    return lightEnvironment;
  }

  public WaterColor getWaterColor() {
    return waterColor;
  }

  public ScriptLanguage getScriptLanguage() {
    return scriptLanguage;
  }

  public GraphicsModes getSupportedGraphicsModes() {
    return supportedGraphicsModes;
  }

  public GameDataVersion getGameDataVersion() {
    return gameDataVersion;
  }

  public PlayersChunk getPlayersChunk() {
    return playersChunk;
  }

  public ForcesChunk getForcesChunk() {
    return forcesChunk;
  }

  public UpgradesChunk getUpgradesChunk() {
    return upgradesChunk;
  }

  public TechsChunk getTechsChunk() {
    return techsChunk;
  }

  public RandomUnitTablesChunk getRandomUnitTablesChunk() {
    return randomUnitTablesChunk;
  }

  public RandomItemTablesChunk getRandomItemTablesChunk() {
    return randomItemTablesChunk;
  }

  public Long getScriptLanguage2() {
    return scriptLanguage2;
  }

  public void setMapName(String value) {
    this.mapName = value;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setSaves(Long value) {
    this.saves = value;
  }

  public void setEditorVersion(Long value) {
    this.editorVersion = value;
  }

  public void setGameVersion(GameVersion value) {
    this.gameVersion = value;
  }

  public void setMapNameRaw(W3str value) {
    this.mapNameRaw = value;
  }

  public void setAuthor(W3str value) {
    this.author = value;
  }

  public void setDescription(W3str value) {
    this.description = value;
  }

  public void setRecommendedPlayers(W3str value) {
    this.recommendedPlayers = value;
  }

  public void setUnknownV0ToV3(UnknownV0ToV3 value) {
    this.unknownV0ToV3 = value;
  }

  public void setUnknownV4ToV8(UnknownV4ToV8 value) {
    this.unknownV4ToV8 = value;
  }

  public void setCameraBounds(CameraBounds value) {
    this.cameraBounds = value;
  }

  public void setMargins(Margins value) {
    this.margins = value;
  }

  public void setMapWidth(Long value) {
    this.mapWidth = value;
  }

  public void setMapHeight(Long value) {
    this.mapHeight = value;
  }

  public void setUnknownV3Int1(Long value) {
    this.unknownV3Int1 = value;
  }

  public void setFlags(Flags value) {
    this.flags = value;
  }

  public void setTileset(Tileset value) {
    this.tileset = value;
  }

  public void setLoadingScreen(LoadingScreen value) {
    this.loadingScreen = value;
  }

  public void setGameDataSet(GameDataSet value) {
    this.gameDataSet = value;
  }

  public void setUnknownPath(W3str value) {
    this.unknownPath = value;
  }

  public void setPrologueScreen(PrologueScreen value) {
    this.prologueScreen = value;
  }

  public void setFog(Fog value) {
    this.fog = value;
  }

  public void setGlobalWeatherId(W3id value) {
    this.globalWeatherId = value;
  }

  public void setSoundEnvironment(W3str value) {
    this.soundEnvironment = value;
  }

  public void setLightEnvironment(W3char value) {
    this.lightEnvironment = value;
  }

  public void setWaterColor(WaterColor value) {
    this.waterColor = value;
  }

  public void setScriptLanguage(ScriptLanguage value) {
    this.scriptLanguage = value;
  }

  public void setSupportedGraphicsModes(GraphicsModes value) {
    this.supportedGraphicsModes = value;
  }

  public void setGameDataVersion(GameDataVersion value) {
    this.gameDataVersion = value;
  }

  public void setPlayersChunk(PlayersChunk value) {
    this.playersChunk = value;
  }

  public void setForcesChunk(ForcesChunk value) {
    this.forcesChunk = value;
  }

  public void setUpgradesChunk(UpgradesChunk value) {
    this.upgradesChunk = value;
  }

  public void setTechsChunk(TechsChunk value) {
    this.techsChunk = value;
  }

  public void setRandomUnitTablesChunk(RandomUnitTablesChunk value) {
    this.randomUnitTablesChunk = value;
  }

  public void setRandomItemTablesChunk(RandomItemTablesChunk value) {
    this.randomItemTablesChunk = value;
  }

  public void setScriptLanguage2(Long value) {
    this.scriptLanguage2 = value;
  }

  public static class RandomItemTablesChunk {
    private List<RandomItemTable> table;

    @Override
    public int hashCode() {
      return Objects.hash(getTable());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof RandomItemTablesChunk)) {
        return false;
      }
      final RandomItemTablesChunk thatTyped = (RandomItemTablesChunk) that;
      if (!Objects.equals(getTable(), thatTyped.getTable())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTable:");
      stringBuilder.append(getTable());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<RandomItemTable> getTable() {
      return table;
    }

    public void setTable(List<RandomItemTable> value) {
      this.table = value;
    }
  }

  public enum GameDataSet {
    DEFAULT(0),

    CUSTOM(1),

    MELEE(2);

    private static final Map<Long, GameDataSet> byId = new HashMap<>();

    static {
      for (GameDataSet e : GameDataSet.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    GameDataSet(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public GameDataSet byId(long id) {
      return byId.get(id);
    }
  }

  public static class ForceFlags {
    private ForceFlagsBits bits;

    @Override
    public int hashCode() {
      return Objects.hash(getBits());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ForceFlags)) {
        return false;
      }
      final ForceFlags thatTyped = (ForceFlags) that;
      if (!Objects.equals(getBits(), thatTyped.getBits())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getBits:");
      stringBuilder.append(getBits());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public ForceFlagsBits getBits() {
      return bits;
    }

    public void setBits(ForceFlagsBits value) {
      this.bits = value;
    }
  }

  public static class UnknownV0ToV3 {
    private long unknownV0Int1;

    private long unknownV0Int2;

    @Override
    public int hashCode() {
      return Objects.hash(getUnknownV0Int1(), getUnknownV0Int2());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof UnknownV0ToV3)) {
        return false;
      }
      final UnknownV0ToV3 thatTyped = (UnknownV0ToV3) that;
      if (!Objects.equals(getUnknownV0Int1(), thatTyped.getUnknownV0Int1())) {
        return false;
      }
      if (!Objects.equals(getUnknownV0Int2(), thatTyped.getUnknownV0Int2())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getUnknownV0Int1:");
      stringBuilder.append(getUnknownV0Int1());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknownV0Int2:");
      stringBuilder.append(getUnknownV0Int2());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getUnknownV0Int1() {
      return unknownV0Int1;
    }

    public long getUnknownV0Int2() {
      return unknownV0Int2;
    }

    public void setUnknownV0Int1(long value) {
      this.unknownV0Int1 = value;
    }

    public void setUnknownV0Int2(long value) {
      this.unknownV0Int2 = value;
    }
  }

  public static class Player {
    private long num;

    private PlayerController controller;

    private PlayerRace race;

    private long fixedPosition;

    private W3str name;

    private Point2d position;

    private PlayerBitmap allyLowPriority;

    private PlayerBitmap allyHighPriority;

    private PlayerBitmap enemyLowPriority;

    private PlayerBitmap enemyHighPriority;

    @Override
    public int hashCode() {
      return Objects.hash(getNum(), getController(), getRace(), getFixedPosition(), getName(), getPosition(), getAllyLowPriority(), getAllyHighPriority(), getEnemyLowPriority(), getEnemyHighPriority());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Player)) {
        return false;
      }
      final Player thatTyped = (Player) that;
      if (!Objects.equals(getNum(), thatTyped.getNum())) {
        return false;
      }
      if (!Objects.equals(getController(), thatTyped.getController())) {
        return false;
      }
      if (!Objects.equals(getRace(), thatTyped.getRace())) {
        return false;
      }
      if (!Objects.equals(getFixedPosition(), thatTyped.getFixedPosition())) {
        return false;
      }
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getPosition(), thatTyped.getPosition())) {
        return false;
      }
      if (!Objects.equals(getAllyLowPriority(), thatTyped.getAllyLowPriority())) {
        return false;
      }
      if (!Objects.equals(getAllyHighPriority(), thatTyped.getAllyHighPriority())) {
        return false;
      }
      if (!Objects.equals(getEnemyLowPriority(), thatTyped.getEnemyLowPriority())) {
        return false;
      }
      if (!Objects.equals(getEnemyHighPriority(), thatTyped.getEnemyHighPriority())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNum:");
      stringBuilder.append(getNum());
      stringBuilder.append(", \n");
      stringBuilder.append("getController:");
      stringBuilder.append(getController());
      stringBuilder.append(", \n");
      stringBuilder.append("getRace:");
      stringBuilder.append(getRace());
      stringBuilder.append(", \n");
      stringBuilder.append("getFixedPosition:");
      stringBuilder.append(getFixedPosition());
      stringBuilder.append(", \n");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getPosition:");
      stringBuilder.append(getPosition());
      stringBuilder.append(", \n");
      stringBuilder.append("getAllyLowPriority:");
      stringBuilder.append(getAllyLowPriority());
      stringBuilder.append(", \n");
      stringBuilder.append("getAllyHighPriority:");
      stringBuilder.append(getAllyHighPriority());
      stringBuilder.append(", \n");
      stringBuilder.append("getEnemyLowPriority:");
      stringBuilder.append(getEnemyLowPriority());
      stringBuilder.append(", \n");
      stringBuilder.append("getEnemyHighPriority:");
      stringBuilder.append(getEnemyHighPriority());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getNum() {
      return num;
    }

    public PlayerController getController() {
      return controller;
    }

    public PlayerRace getRace() {
      return race;
    }

    public long getFixedPosition() {
      return fixedPosition;
    }

    public W3str getName() {
      return name;
    }

    public Point2d getPosition() {
      return position;
    }

    public PlayerBitmap getAllyLowPriority() {
      return allyLowPriority;
    }

    public PlayerBitmap getAllyHighPriority() {
      return allyHighPriority;
    }

    public PlayerBitmap getEnemyLowPriority() {
      return enemyLowPriority;
    }

    public PlayerBitmap getEnemyHighPriority() {
      return enemyHighPriority;
    }

    public void setNum(long value) {
      this.num = value;
    }

    public void setController(PlayerController value) {
      this.controller = value;
    }

    public void setRace(PlayerRace value) {
      this.race = value;
    }

    public void setFixedPosition(long value) {
      this.fixedPosition = value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setPosition(Point2d value) {
      this.position = value;
    }

    public void setAllyLowPriority(PlayerBitmap value) {
      this.allyLowPriority = value;
    }

    public void setAllyHighPriority(PlayerBitmap value) {
      this.allyHighPriority = value;
    }

    public void setEnemyLowPriority(PlayerBitmap value) {
      this.enemyLowPriority = value;
    }

    public void setEnemyHighPriority(PlayerBitmap value) {
      this.enemyHighPriority = value;
    }
  }

  public static class Fog {
    private FogType fogType;

    private float fogZStart;

    private float fogZEnd;

    private float fogDensity;

    private int fogColorRed;

    private int fogColorGreen;

    private int fogColorBlue;

    private int fogColorAlpha;

    @Override
    public int hashCode() {
      return Objects.hash(getFogType(), getFogZStart(), getFogZEnd(), getFogDensity(), getFogColorRed(), getFogColorGreen(), getFogColorBlue(), getFogColorAlpha());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Fog)) {
        return false;
      }
      final Fog thatTyped = (Fog) that;
      if (!Objects.equals(getFogType(), thatTyped.getFogType())) {
        return false;
      }
      if (!Objects.equals(getFogZStart(), thatTyped.getFogZStart())) {
        return false;
      }
      if (!Objects.equals(getFogZEnd(), thatTyped.getFogZEnd())) {
        return false;
      }
      if (!Objects.equals(getFogDensity(), thatTyped.getFogDensity())) {
        return false;
      }
      if (!Objects.equals(getFogColorRed(), thatTyped.getFogColorRed())) {
        return false;
      }
      if (!Objects.equals(getFogColorGreen(), thatTyped.getFogColorGreen())) {
        return false;
      }
      if (!Objects.equals(getFogColorBlue(), thatTyped.getFogColorBlue())) {
        return false;
      }
      if (!Objects.equals(getFogColorAlpha(), thatTyped.getFogColorAlpha())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFogType:");
      stringBuilder.append(getFogType());
      stringBuilder.append(", \n");
      stringBuilder.append("getFogZStart:");
      stringBuilder.append(getFogZStart());
      stringBuilder.append(", \n");
      stringBuilder.append("getFogZEnd:");
      stringBuilder.append(getFogZEnd());
      stringBuilder.append(", \n");
      stringBuilder.append("getFogDensity:");
      stringBuilder.append(getFogDensity());
      stringBuilder.append(", \n");
      stringBuilder.append("getFogColorRed:");
      stringBuilder.append(getFogColorRed());
      stringBuilder.append(", \n");
      stringBuilder.append("getFogColorGreen:");
      stringBuilder.append(getFogColorGreen());
      stringBuilder.append(", \n");
      stringBuilder.append("getFogColorBlue:");
      stringBuilder.append(getFogColorBlue());
      stringBuilder.append(", \n");
      stringBuilder.append("getFogColorAlpha:");
      stringBuilder.append(getFogColorAlpha());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public FogType getFogType() {
      return fogType;
    }

    public float getFogZStart() {
      return fogZStart;
    }

    public float getFogZEnd() {
      return fogZEnd;
    }

    public float getFogDensity() {
      return fogDensity;
    }

    public int getFogColorRed() {
      return fogColorRed;
    }

    public int getFogColorGreen() {
      return fogColorGreen;
    }

    public int getFogColorBlue() {
      return fogColorBlue;
    }

    public int getFogColorAlpha() {
      return fogColorAlpha;
    }

    public void setFogType(FogType value) {
      this.fogType = value;
    }

    public void setFogZStart(float value) {
      this.fogZStart = value;
    }

    public void setFogZEnd(float value) {
      this.fogZEnd = value;
    }

    public void setFogDensity(float value) {
      this.fogDensity = value;
    }

    public void setFogColorRed(int value) {
      this.fogColorRed = value;
    }

    public void setFogColorGreen(int value) {
      this.fogColorGreen = value;
    }

    public void setFogColorBlue(int value) {
      this.fogColorBlue = value;
    }

    public void setFogColorAlpha(int value) {
      this.fogColorAlpha = value;
    }
  }

  public static class Force {
    private ForceFlags flags;

    private PlayerBitmap players;

    private W3str name;

    @Override
    public int hashCode() {
      return Objects.hash(getFlags(), getPlayers(), getName());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Force)) {
        return false;
      }
      final Force thatTyped = (Force) that;
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getPlayers(), thatTyped.getPlayers())) {
        return false;
      }
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getPlayers:");
      stringBuilder.append(getPlayers());
      stringBuilder.append(", \n");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public ForceFlags getFlags() {
      return flags;
    }

    public PlayerBitmap getPlayers() {
      return players;
    }

    public W3str getName() {
      return name;
    }

    public void setFlags(ForceFlags value) {
      this.flags = value;
    }

    public void setPlayers(PlayerBitmap value) {
      this.players = value;
    }

    public void setName(W3str value) {
      this.name = value;
    }
  }

  public static class LoadingScreen {
    private Integer loadingScreenIndex;

    private W3str customLoadingScreenPath;

    private W3str loadingScreenText;

    private W3str loadingScreenTitle;

    private W3str loadingScreenSubtitle;

    @Override
    public int hashCode() {
      return Objects.hash(getLoadingScreenIndex(), getCustomLoadingScreenPath(), getLoadingScreenText(), getLoadingScreenTitle(), getLoadingScreenSubtitle());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof LoadingScreen)) {
        return false;
      }
      final LoadingScreen thatTyped = (LoadingScreen) that;
      if (!Objects.equals(getLoadingScreenIndex(), thatTyped.getLoadingScreenIndex())) {
        return false;
      }
      if (!Objects.equals(getCustomLoadingScreenPath(), thatTyped.getCustomLoadingScreenPath())) {
        return false;
      }
      if (!Objects.equals(getLoadingScreenText(), thatTyped.getLoadingScreenText())) {
        return false;
      }
      if (!Objects.equals(getLoadingScreenTitle(), thatTyped.getLoadingScreenTitle())) {
        return false;
      }
      if (!Objects.equals(getLoadingScreenSubtitle(), thatTyped.getLoadingScreenSubtitle())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLoadingScreenIndex:");
      stringBuilder.append(getLoadingScreenIndex());
      stringBuilder.append(", \n");
      stringBuilder.append("getCustomLoadingScreenPath:");
      stringBuilder.append(getCustomLoadingScreenPath());
      stringBuilder.append(", \n");
      stringBuilder.append("getLoadingScreenText:");
      stringBuilder.append(getLoadingScreenText());
      stringBuilder.append(", \n");
      stringBuilder.append("getLoadingScreenTitle:");
      stringBuilder.append(getLoadingScreenTitle());
      stringBuilder.append(", \n");
      stringBuilder.append("getLoadingScreenSubtitle:");
      stringBuilder.append(getLoadingScreenSubtitle());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Integer getLoadingScreenIndex() {
      return loadingScreenIndex;
    }

    public W3str getCustomLoadingScreenPath() {
      return customLoadingScreenPath;
    }

    public W3str getLoadingScreenText() {
      return loadingScreenText;
    }

    public W3str getLoadingScreenTitle() {
      return loadingScreenTitle;
    }

    public W3str getLoadingScreenSubtitle() {
      return loadingScreenSubtitle;
    }

    public void setLoadingScreenIndex(Integer value) {
      this.loadingScreenIndex = value;
    }

    public void setCustomLoadingScreenPath(W3str value) {
      this.customLoadingScreenPath = value;
    }

    public void setLoadingScreenText(W3str value) {
      this.loadingScreenText = value;
    }

    public void setLoadingScreenTitle(W3str value) {
      this.loadingScreenTitle = value;
    }

    public void setLoadingScreenSubtitle(W3str value) {
      this.loadingScreenSubtitle = value;
    }
  }

  public static class ForcesChunk {
    private List<Force> force;

    @Override
    public int hashCode() {
      return Objects.hash(getForce());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ForcesChunk)) {
        return false;
      }
      final ForcesChunk thatTyped = (ForcesChunk) that;
      if (!Objects.equals(getForce(), thatTyped.getForce())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getForce:");
      stringBuilder.append(getForce());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Force> getForce() {
      return force;
    }

    public void setForce(List<Force> value) {
      this.force = value;
    }
  }

  public static class Point2d {
    private float x;

    private float y;

    @Override
    public int hashCode() {
      return Objects.hash(getx(), gety());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Point2d)) {
        return false;
      }
      final Point2d thatTyped = (Point2d) that;
      if (!Objects.equals(getx(), thatTyped.getx())) {
        return false;
      }
      if (!Objects.equals(gety(), thatTyped.gety())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getx:");
      stringBuilder.append(getx());
      stringBuilder.append(", \n");
      stringBuilder.append("gety:");
      stringBuilder.append(gety());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }
  }

  public enum PlayerController {
    NONE(0),

    HUMAN(1),

    CPU(2),

    NEUTRAL(3),

    RESCUABLE(4);

    private static final Map<Long, PlayerController> byId = new HashMap<>();

    static {
      for (PlayerController e : PlayerController.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    PlayerController(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public PlayerController byId(long id) {
      return byId.get(id);
    }
  }

  public static class Margins {
    private int left;

    private int right;

    private int bottom;

    private int top;

    @Override
    public int hashCode() {
      return Objects.hash(getLeft(), getRight(), getBottom(), getTop());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Margins)) {
        return false;
      }
      final Margins thatTyped = (Margins) that;
      if (!Objects.equals(getLeft(), thatTyped.getLeft())) {
        return false;
      }
      if (!Objects.equals(getRight(), thatTyped.getRight())) {
        return false;
      }
      if (!Objects.equals(getBottom(), thatTyped.getBottom())) {
        return false;
      }
      if (!Objects.equals(getTop(), thatTyped.getTop())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLeft:");
      stringBuilder.append(getLeft());
      stringBuilder.append(", \n");
      stringBuilder.append("getRight:");
      stringBuilder.append(getRight());
      stringBuilder.append(", \n");
      stringBuilder.append("getBottom:");
      stringBuilder.append(getBottom());
      stringBuilder.append(", \n");
      stringBuilder.append("getTop:");
      stringBuilder.append(getTop());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public int getLeft() {
      return left;
    }

    public int getRight() {
      return right;
    }

    public int getBottom() {
      return bottom;
    }

    public int getTop() {
      return top;
    }

    public void setLeft(int value) {
      this.left = value;
    }

    public void setRight(int value) {
      this.right = value;
    }

    public void setBottom(int value) {
      this.bottom = value;
    }

    public void setTop(int value) {
      this.top = value;
    }
  }

  public enum GameDataVersion {
    ROC(0),

    TFT(1);

    private static final Map<Long, GameDataVersion> byId = new HashMap<>();

    static {
      for (GameDataVersion e : GameDataVersion.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    GameDataVersion(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public GameDataVersion byId(long id) {
      return byId.get(id);
    }
  }

  public static class ForceFlagsBits {
    private boolean flag7;

    private boolean flag6;

    private boolean flag5;

    private boolean shareAdvancedUnitControl;

    private boolean shareUnitControl;

    private boolean shareVision;

    private boolean alliedVictory;

    private boolean allied;

    private List<Integer> rest;

    @Override
    public int hashCode() {
      return Objects.hash(getFlag7(), getFlag6(), getFlag5(), getShareAdvancedUnitControl(), getShareUnitControl(), getShareVision(), getAlliedVictory(), getAllied(), getRest());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ForceFlagsBits)) {
        return false;
      }
      final ForceFlagsBits thatTyped = (ForceFlagsBits) that;
      if (!Objects.equals(getFlag7(), thatTyped.getFlag7())) {
        return false;
      }
      if (!Objects.equals(getFlag6(), thatTyped.getFlag6())) {
        return false;
      }
      if (!Objects.equals(getFlag5(), thatTyped.getFlag5())) {
        return false;
      }
      if (!Objects.equals(getShareAdvancedUnitControl(), thatTyped.getShareAdvancedUnitControl())) {
        return false;
      }
      if (!Objects.equals(getShareUnitControl(), thatTyped.getShareUnitControl())) {
        return false;
      }
      if (!Objects.equals(getShareVision(), thatTyped.getShareVision())) {
        return false;
      }
      if (!Objects.equals(getAlliedVictory(), thatTyped.getAlliedVictory())) {
        return false;
      }
      if (!Objects.equals(getAllied(), thatTyped.getAllied())) {
        return false;
      }
      if (!Objects.equals(getRest(), thatTyped.getRest())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFlag7:");
      stringBuilder.append(getFlag7());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag6:");
      stringBuilder.append(getFlag6());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag5:");
      stringBuilder.append(getFlag5());
      stringBuilder.append(", \n");
      stringBuilder.append("getShareAdvancedUnitControl:");
      stringBuilder.append(getShareAdvancedUnitControl());
      stringBuilder.append(", \n");
      stringBuilder.append("getShareUnitControl:");
      stringBuilder.append(getShareUnitControl());
      stringBuilder.append(", \n");
      stringBuilder.append("getShareVision:");
      stringBuilder.append(getShareVision());
      stringBuilder.append(", \n");
      stringBuilder.append("getAlliedVictory:");
      stringBuilder.append(getAlliedVictory());
      stringBuilder.append(", \n");
      stringBuilder.append("getAllied:");
      stringBuilder.append(getAllied());
      stringBuilder.append(", \n");
      stringBuilder.append("getRest:");
      stringBuilder.append(getRest());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public boolean getFlag7() {
      return flag7;
    }

    public boolean getFlag6() {
      return flag6;
    }

    public boolean getFlag5() {
      return flag5;
    }

    public boolean getShareAdvancedUnitControl() {
      return shareAdvancedUnitControl;
    }

    public boolean getShareUnitControl() {
      return shareUnitControl;
    }

    public boolean getShareVision() {
      return shareVision;
    }

    public boolean getAlliedVictory() {
      return alliedVictory;
    }

    public boolean getAllied() {
      return allied;
    }

    public List<Integer> getRest() {
      return rest;
    }

    public void setFlag7(boolean value) {
      this.flag7 = value;
    }

    public void setFlag6(boolean value) {
      this.flag6 = value;
    }

    public void setFlag5(boolean value) {
      this.flag5 = value;
    }

    public void setShareAdvancedUnitControl(boolean value) {
      this.shareAdvancedUnitControl = value;
    }

    public void setShareUnitControl(boolean value) {
      this.shareUnitControl = value;
    }

    public void setShareVision(boolean value) {
      this.shareVision = value;
    }

    public void setAlliedVictory(boolean value) {
      this.alliedVictory = value;
    }

    public void setAllied(boolean value) {
      this.allied = value;
    }

    public void setRest(List<Integer> value) {
      this.rest = value;
    }
  }

  public static class RandomUnitTableRow {
    private long chance;

    private List<W3id> id;

    @Override
    public int hashCode() {
      return Objects.hash(getChance(), getId());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof RandomUnitTableRow)) {
        return false;
      }
      final RandomUnitTableRow thatTyped = (RandomUnitTableRow) that;
      if (!Objects.equals(getChance(), thatTyped.getChance())) {
        return false;
      }
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getChance:");
      stringBuilder.append(getChance());
      stringBuilder.append(", \n");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getChance() {
      return chance;
    }

    public List<W3id> getId() {
      return id;
    }

    public void setChance(long value) {
      this.chance = value;
    }

    public void setId(List<W3id> value) {
      this.id = value;
    }
  }

  public enum PlayerRace {
    SELECTABLE(0),

    HUMAN(1),

    ORC(2),

    UNDEAD(3),

    NIGHT_ELF(4);

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

  public static class PlayersChunk {
    private List<Player> player;

    @Override
    public int hashCode() {
      return Objects.hash(getPlayer());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof PlayersChunk)) {
        return false;
      }
      final PlayersChunk thatTyped = (PlayersChunk) that;
      if (!Objects.equals(getPlayer(), thatTyped.getPlayer())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getPlayer:");
      stringBuilder.append(getPlayer());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Player> getPlayer() {
      return player;
    }

    public void setPlayer(List<Player> value) {
      this.player = value;
    }
  }

  public static class UnknownV4ToV8 {
    private long unknownV4Int1;

    private long unknownV4Int2;

    private long unknownV4Int3;

    private float unknownV4Float1;

    private float unknownV4Float2;

    private float unknownV4Float3;

    @Override
    public int hashCode() {
      return Objects.hash(getUnknownV4Int1(), getUnknownV4Int2(), getUnknownV4Int3(), getUnknownV4Float1(), getUnknownV4Float2(), getUnknownV4Float3());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof UnknownV4ToV8)) {
        return false;
      }
      final UnknownV4ToV8 thatTyped = (UnknownV4ToV8) that;
      if (!Objects.equals(getUnknownV4Int1(), thatTyped.getUnknownV4Int1())) {
        return false;
      }
      if (!Objects.equals(getUnknownV4Int2(), thatTyped.getUnknownV4Int2())) {
        return false;
      }
      if (!Objects.equals(getUnknownV4Int3(), thatTyped.getUnknownV4Int3())) {
        return false;
      }
      if (!Objects.equals(getUnknownV4Float1(), thatTyped.getUnknownV4Float1())) {
        return false;
      }
      if (!Objects.equals(getUnknownV4Float2(), thatTyped.getUnknownV4Float2())) {
        return false;
      }
      if (!Objects.equals(getUnknownV4Float3(), thatTyped.getUnknownV4Float3())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getUnknownV4Int1:");
      stringBuilder.append(getUnknownV4Int1());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknownV4Int2:");
      stringBuilder.append(getUnknownV4Int2());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknownV4Int3:");
      stringBuilder.append(getUnknownV4Int3());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknownV4Float1:");
      stringBuilder.append(getUnknownV4Float1());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknownV4Float2:");
      stringBuilder.append(getUnknownV4Float2());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknownV4Float3:");
      stringBuilder.append(getUnknownV4Float3());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getUnknownV4Int1() {
      return unknownV4Int1;
    }

    public long getUnknownV4Int2() {
      return unknownV4Int2;
    }

    public long getUnknownV4Int3() {
      return unknownV4Int3;
    }

    public float getUnknownV4Float1() {
      return unknownV4Float1;
    }

    public float getUnknownV4Float2() {
      return unknownV4Float2;
    }

    public float getUnknownV4Float3() {
      return unknownV4Float3;
    }

    public void setUnknownV4Int1(long value) {
      this.unknownV4Int1 = value;
    }

    public void setUnknownV4Int2(long value) {
      this.unknownV4Int2 = value;
    }

    public void setUnknownV4Int3(long value) {
      this.unknownV4Int3 = value;
    }

    public void setUnknownV4Float1(float value) {
      this.unknownV4Float1 = value;
    }

    public void setUnknownV4Float2(float value) {
      this.unknownV4Float2 = value;
    }

    public void setUnknownV4Float3(float value) {
      this.unknownV4Float3 = value;
    }
  }

  public static class ItemSet {
    private List<Item> item;

    @Override
    public int hashCode() {
      return Objects.hash(getItem());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ItemSet)) {
        return false;
      }
      final ItemSet thatTyped = (ItemSet) that;
      if (!Objects.equals(getItem(), thatTyped.getItem())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getItem:");
      stringBuilder.append(getItem());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Item> getItem() {
      return item;
    }

    public void setItem(List<Item> value) {
      this.item = value;
    }
  }

  public static class Tech {
    private long players;

    private W3id id;

    @Override
    public int hashCode() {
      return Objects.hash(getPlayers(), getId());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Tech)) {
        return false;
      }
      final Tech thatTyped = (Tech) that;
      if (!Objects.equals(getPlayers(), thatTyped.getPlayers())) {
        return false;
      }
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getPlayers:");
      stringBuilder.append(getPlayers());
      stringBuilder.append(", \n");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getPlayers() {
      return players;
    }

    public W3id getId() {
      return id;
    }

    public void setPlayers(long value) {
      this.players = value;
    }

    public void setId(W3id value) {
      this.id = value;
    }
  }

  public static class TechsChunk {
    private List<Tech> tech;

    @Override
    public int hashCode() {
      return Objects.hash(getTech());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TechsChunk)) {
        return false;
      }
      final TechsChunk thatTyped = (TechsChunk) that;
      if (!Objects.equals(getTech(), thatTyped.getTech())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTech:");
      stringBuilder.append(getTech());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Tech> getTech() {
      return tech;
    }

    public void setTech(List<Tech> value) {
      this.tech = value;
    }
  }

  public static class UpgradesChunk {
    private List<Upgrade> upgrade;

    @Override
    public int hashCode() {
      return Objects.hash(getUpgrade());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof UpgradesChunk)) {
        return false;
      }
      final UpgradesChunk thatTyped = (UpgradesChunk) that;
      if (!Objects.equals(getUpgrade(), thatTyped.getUpgrade())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getUpgrade:");
      stringBuilder.append(getUpgrade());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Upgrade> getUpgrade() {
      return upgrade;
    }

    public void setUpgrade(List<Upgrade> value) {
      this.upgrade = value;
    }
  }

  public static class Upgrade {
    private long players;

    private W3id id;

    private long level;

    private long availability;

    @Override
    public int hashCode() {
      return Objects.hash(getPlayers(), getId(), getLevel(), getAvailability());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Upgrade)) {
        return false;
      }
      final Upgrade thatTyped = (Upgrade) that;
      if (!Objects.equals(getPlayers(), thatTyped.getPlayers())) {
        return false;
      }
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getLevel(), thatTyped.getLevel())) {
        return false;
      }
      if (!Objects.equals(getAvailability(), thatTyped.getAvailability())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getPlayers:");
      stringBuilder.append(getPlayers());
      stringBuilder.append(", \n");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append(", \n");
      stringBuilder.append("getLevel:");
      stringBuilder.append(getLevel());
      stringBuilder.append(", \n");
      stringBuilder.append("getAvailability:");
      stringBuilder.append(getAvailability());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getPlayers() {
      return players;
    }

    public W3id getId() {
      return id;
    }

    public long getLevel() {
      return level;
    }

    public long getAvailability() {
      return availability;
    }

    public void setPlayers(long value) {
      this.players = value;
    }

    public void setId(W3id value) {
      this.id = value;
    }

    public void setLevel(long value) {
      this.level = value;
    }

    public void setAvailability(long value) {
      this.availability = value;
    }
  }

  public enum ScriptLanguage {
    JASS(0),

    LUA(1);

    private static final Map<Long, ScriptLanguage> byId = new HashMap<>();

    static {
      for (ScriptLanguage e : ScriptLanguage.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    ScriptLanguage(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public ScriptLanguage byId(long id) {
      return byId.get(id);
    }
  }

  public static class Flags {
    private boolean useCustomTechs;

    private boolean useCustomTeams;

    private boolean fixedPlayerParametersForCustomTeams;

    private boolean unexploredAreasPartiallyVisible;

    private boolean nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium;

    private boolean melee;

    private boolean changeAllyPriorities;

    private boolean hideMinimapOnPreviewScreens;

    private boolean useItemClassificationSystem;

    private boolean tftRequired;

    private boolean useTerrainFog;

    private boolean showWaterWavesOnRollingShores;

    private boolean showWaterWavesOnCliffShores;

    private boolean mapPropertiesMenuOpenedAtLeastOnce;

    private boolean useCustomUpgrades;

    private boolean useCustomAbilities;

    private boolean customWaterTintColor;

    private boolean flag17;

    private boolean flag18;

    private boolean flag19;

    private boolean flag20;

    private boolean useCustomAbilitySkin;

    private boolean useAccurateProbabilitiesForCalculation;

    private List<Boolean> rest;

    @Override
    public int hashCode() {
      return Objects.hash(getUseCustomTechs(), getUseCustomTeams(), getFixedPlayerParametersForCustomTeams(), getUnexploredAreasPartiallyVisible(), getNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium(), getMelee(), getChangeAllyPriorities(), getHideMinimapOnPreviewScreens(), getUseItemClassificationSystem(), getTftRequired(), getUseTerrainFog(), getShowWaterWavesOnRollingShores(), getShowWaterWavesOnCliffShores(), getMapPropertiesMenuOpenedAtLeastOnce(), getUseCustomUpgrades(), getUseCustomAbilities(), getCustomWaterTintColor(), getFlag17(), getFlag18(), getFlag19(), getFlag20(), getUseCustomAbilitySkin(), getUseAccurateProbabilitiesForCalculation(), getRest());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Flags)) {
        return false;
      }
      final Flags thatTyped = (Flags) that;
      if (!Objects.equals(getUseCustomTechs(), thatTyped.getUseCustomTechs())) {
        return false;
      }
      if (!Objects.equals(getUseCustomTeams(), thatTyped.getUseCustomTeams())) {
        return false;
      }
      if (!Objects.equals(getFixedPlayerParametersForCustomTeams(), thatTyped.getFixedPlayerParametersForCustomTeams())) {
        return false;
      }
      if (!Objects.equals(getUnexploredAreasPartiallyVisible(), thatTyped.getUnexploredAreasPartiallyVisible())) {
        return false;
      }
      if (!Objects.equals(getNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium(), thatTyped.getNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium())) {
        return false;
      }
      if (!Objects.equals(getMelee(), thatTyped.getMelee())) {
        return false;
      }
      if (!Objects.equals(getChangeAllyPriorities(), thatTyped.getChangeAllyPriorities())) {
        return false;
      }
      if (!Objects.equals(getHideMinimapOnPreviewScreens(), thatTyped.getHideMinimapOnPreviewScreens())) {
        return false;
      }
      if (!Objects.equals(getUseItemClassificationSystem(), thatTyped.getUseItemClassificationSystem())) {
        return false;
      }
      if (!Objects.equals(getTftRequired(), thatTyped.getTftRequired())) {
        return false;
      }
      if (!Objects.equals(getUseTerrainFog(), thatTyped.getUseTerrainFog())) {
        return false;
      }
      if (!Objects.equals(getShowWaterWavesOnRollingShores(), thatTyped.getShowWaterWavesOnRollingShores())) {
        return false;
      }
      if (!Objects.equals(getShowWaterWavesOnCliffShores(), thatTyped.getShowWaterWavesOnCliffShores())) {
        return false;
      }
      if (!Objects.equals(getMapPropertiesMenuOpenedAtLeastOnce(), thatTyped.getMapPropertiesMenuOpenedAtLeastOnce())) {
        return false;
      }
      if (!Objects.equals(getUseCustomUpgrades(), thatTyped.getUseCustomUpgrades())) {
        return false;
      }
      if (!Objects.equals(getUseCustomAbilities(), thatTyped.getUseCustomAbilities())) {
        return false;
      }
      if (!Objects.equals(getCustomWaterTintColor(), thatTyped.getCustomWaterTintColor())) {
        return false;
      }
      if (!Objects.equals(getFlag17(), thatTyped.getFlag17())) {
        return false;
      }
      if (!Objects.equals(getFlag18(), thatTyped.getFlag18())) {
        return false;
      }
      if (!Objects.equals(getFlag19(), thatTyped.getFlag19())) {
        return false;
      }
      if (!Objects.equals(getFlag20(), thatTyped.getFlag20())) {
        return false;
      }
      if (!Objects.equals(getUseCustomAbilitySkin(), thatTyped.getUseCustomAbilitySkin())) {
        return false;
      }
      if (!Objects.equals(getUseAccurateProbabilitiesForCalculation(), thatTyped.getUseAccurateProbabilitiesForCalculation())) {
        return false;
      }
      if (!Objects.equals(getRest(), thatTyped.getRest())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getUseCustomTechs:");
      stringBuilder.append(getUseCustomTechs());
      stringBuilder.append(", \n");
      stringBuilder.append("getUseCustomTeams:");
      stringBuilder.append(getUseCustomTeams());
      stringBuilder.append(", \n");
      stringBuilder.append("getFixedPlayerParametersForCustomTeams:");
      stringBuilder.append(getFixedPlayerParametersForCustomTeams());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnexploredAreasPartiallyVisible:");
      stringBuilder.append(getUnexploredAreasPartiallyVisible());
      stringBuilder.append(", \n");
      stringBuilder.append("getNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium:");
      stringBuilder.append(getNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium());
      stringBuilder.append(", \n");
      stringBuilder.append("getMelee:");
      stringBuilder.append(getMelee());
      stringBuilder.append(", \n");
      stringBuilder.append("getChangeAllyPriorities:");
      stringBuilder.append(getChangeAllyPriorities());
      stringBuilder.append(", \n");
      stringBuilder.append("getHideMinimapOnPreviewScreens:");
      stringBuilder.append(getHideMinimapOnPreviewScreens());
      stringBuilder.append(", \n");
      stringBuilder.append("getUseItemClassificationSystem:");
      stringBuilder.append(getUseItemClassificationSystem());
      stringBuilder.append(", \n");
      stringBuilder.append("getTftRequired:");
      stringBuilder.append(getTftRequired());
      stringBuilder.append(", \n");
      stringBuilder.append("getUseTerrainFog:");
      stringBuilder.append(getUseTerrainFog());
      stringBuilder.append(", \n");
      stringBuilder.append("getShowWaterWavesOnRollingShores:");
      stringBuilder.append(getShowWaterWavesOnRollingShores());
      stringBuilder.append(", \n");
      stringBuilder.append("getShowWaterWavesOnCliffShores:");
      stringBuilder.append(getShowWaterWavesOnCliffShores());
      stringBuilder.append(", \n");
      stringBuilder.append("getMapPropertiesMenuOpenedAtLeastOnce:");
      stringBuilder.append(getMapPropertiesMenuOpenedAtLeastOnce());
      stringBuilder.append(", \n");
      stringBuilder.append("getUseCustomUpgrades:");
      stringBuilder.append(getUseCustomUpgrades());
      stringBuilder.append(", \n");
      stringBuilder.append("getUseCustomAbilities:");
      stringBuilder.append(getUseCustomAbilities());
      stringBuilder.append(", \n");
      stringBuilder.append("getCustomWaterTintColor:");
      stringBuilder.append(getCustomWaterTintColor());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag17:");
      stringBuilder.append(getFlag17());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag18:");
      stringBuilder.append(getFlag18());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag19:");
      stringBuilder.append(getFlag19());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag20:");
      stringBuilder.append(getFlag20());
      stringBuilder.append(", \n");
      stringBuilder.append("getUseCustomAbilitySkin:");
      stringBuilder.append(getUseCustomAbilitySkin());
      stringBuilder.append(", \n");
      stringBuilder.append("getUseAccurateProbabilitiesForCalculation:");
      stringBuilder.append(getUseAccurateProbabilitiesForCalculation());
      stringBuilder.append(", \n");
      stringBuilder.append("getRest:");
      stringBuilder.append(getRest());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public boolean getUseCustomTechs() {
      return useCustomTechs;
    }

    public boolean getUseCustomTeams() {
      return useCustomTeams;
    }

    public boolean getFixedPlayerParametersForCustomTeams() {
      return fixedPlayerParametersForCustomTeams;
    }

    public boolean getUnexploredAreasPartiallyVisible() {
      return unexploredAreasPartiallyVisible;
    }

    public boolean getNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium() {
      return nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium;
    }

    public boolean getMelee() {
      return melee;
    }

    public boolean getChangeAllyPriorities() {
      return changeAllyPriorities;
    }

    public boolean getHideMinimapOnPreviewScreens() {
      return hideMinimapOnPreviewScreens;
    }

    public boolean getUseItemClassificationSystem() {
      return useItemClassificationSystem;
    }

    public boolean getTftRequired() {
      return tftRequired;
    }

    public boolean getUseTerrainFog() {
      return useTerrainFog;
    }

    public boolean getShowWaterWavesOnRollingShores() {
      return showWaterWavesOnRollingShores;
    }

    public boolean getShowWaterWavesOnCliffShores() {
      return showWaterWavesOnCliffShores;
    }

    public boolean getMapPropertiesMenuOpenedAtLeastOnce() {
      return mapPropertiesMenuOpenedAtLeastOnce;
    }

    public boolean getUseCustomUpgrades() {
      return useCustomUpgrades;
    }

    public boolean getUseCustomAbilities() {
      return useCustomAbilities;
    }

    public boolean getCustomWaterTintColor() {
      return customWaterTintColor;
    }

    public boolean getFlag17() {
      return flag17;
    }

    public boolean getFlag18() {
      return flag18;
    }

    public boolean getFlag19() {
      return flag19;
    }

    public boolean getFlag20() {
      return flag20;
    }

    public boolean getUseCustomAbilitySkin() {
      return useCustomAbilitySkin;
    }

    public boolean getUseAccurateProbabilitiesForCalculation() {
      return useAccurateProbabilitiesForCalculation;
    }

    public List<Boolean> getRest() {
      return rest;
    }

    public void setUseCustomTechs(boolean value) {
      this.useCustomTechs = value;
    }

    public void setUseCustomTeams(boolean value) {
      this.useCustomTeams = value;
    }

    public void setFixedPlayerParametersForCustomTeams(boolean value) {
      this.fixedPlayerParametersForCustomTeams = value;
    }

    public void setUnexploredAreasPartiallyVisible(boolean value) {
      this.unexploredAreasPartiallyVisible = value;
    }

    public void setNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium(boolean value) {
      this.nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium = value;
    }

    public void setMelee(boolean value) {
      this.melee = value;
    }

    public void setChangeAllyPriorities(boolean value) {
      this.changeAllyPriorities = value;
    }

    public void setHideMinimapOnPreviewScreens(boolean value) {
      this.hideMinimapOnPreviewScreens = value;
    }

    public void setUseItemClassificationSystem(boolean value) {
      this.useItemClassificationSystem = value;
    }

    public void setTftRequired(boolean value) {
      this.tftRequired = value;
    }

    public void setUseTerrainFog(boolean value) {
      this.useTerrainFog = value;
    }

    public void setShowWaterWavesOnRollingShores(boolean value) {
      this.showWaterWavesOnRollingShores = value;
    }

    public void setShowWaterWavesOnCliffShores(boolean value) {
      this.showWaterWavesOnCliffShores = value;
    }

    public void setMapPropertiesMenuOpenedAtLeastOnce(boolean value) {
      this.mapPropertiesMenuOpenedAtLeastOnce = value;
    }

    public void setUseCustomUpgrades(boolean value) {
      this.useCustomUpgrades = value;
    }

    public void setUseCustomAbilities(boolean value) {
      this.useCustomAbilities = value;
    }

    public void setCustomWaterTintColor(boolean value) {
      this.customWaterTintColor = value;
    }

    public void setFlag17(boolean value) {
      this.flag17 = value;
    }

    public void setFlag18(boolean value) {
      this.flag18 = value;
    }

    public void setFlag19(boolean value) {
      this.flag19 = value;
    }

    public void setFlag20(boolean value) {
      this.flag20 = value;
    }

    public void setUseCustomAbilitySkin(boolean value) {
      this.useCustomAbilitySkin = value;
    }

    public void setUseAccurateProbabilitiesForCalculation(boolean value) {
      this.useAccurateProbabilitiesForCalculation = value;
    }

    public void setRest(List<Boolean> value) {
      this.rest = value;
    }
  }

  public static class WaterColor {
    private int red;

    private int green;

    private int blue;

    private int alpha;

    @Override
    public int hashCode() {
      return Objects.hash(getRed(), getGreen(), getBlue(), getAlpha());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof WaterColor)) {
        return false;
      }
      final WaterColor thatTyped = (WaterColor) that;
      if (!Objects.equals(getRed(), thatTyped.getRed())) {
        return false;
      }
      if (!Objects.equals(getGreen(), thatTyped.getGreen())) {
        return false;
      }
      if (!Objects.equals(getBlue(), thatTyped.getBlue())) {
        return false;
      }
      if (!Objects.equals(getAlpha(), thatTyped.getAlpha())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getRed:");
      stringBuilder.append(getRed());
      stringBuilder.append(", \n");
      stringBuilder.append("getGreen:");
      stringBuilder.append(getGreen());
      stringBuilder.append(", \n");
      stringBuilder.append("getBlue:");
      stringBuilder.append(getBlue());
      stringBuilder.append(", \n");
      stringBuilder.append("getAlpha:");
      stringBuilder.append(getAlpha());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public int getRed() {
      return red;
    }

    public int getGreen() {
      return green;
    }

    public int getBlue() {
      return blue;
    }

    public int getAlpha() {
      return alpha;
    }

    public void setRed(int value) {
      this.red = value;
    }

    public void setGreen(int value) {
      this.green = value;
    }

    public void setBlue(int value) {
      this.blue = value;
    }

    public void setAlpha(int value) {
      this.alpha = value;
    }
  }

  public static class CameraBounds {
    private Point2d cameraBoundBottomLeft;

    private Point2d cameraBoundTopRight;

    private Point2d cameraBoundTopLeft;

    private Point2d cameraBoundBottomRight;

    @Override
    public int hashCode() {
      return Objects.hash(getCameraBoundBottomLeft(), getCameraBoundTopRight(), getCameraBoundTopLeft(), getCameraBoundBottomRight());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof CameraBounds)) {
        return false;
      }
      final CameraBounds thatTyped = (CameraBounds) that;
      if (!Objects.equals(getCameraBoundBottomLeft(), thatTyped.getCameraBoundBottomLeft())) {
        return false;
      }
      if (!Objects.equals(getCameraBoundTopRight(), thatTyped.getCameraBoundTopRight())) {
        return false;
      }
      if (!Objects.equals(getCameraBoundTopLeft(), thatTyped.getCameraBoundTopLeft())) {
        return false;
      }
      if (!Objects.equals(getCameraBoundBottomRight(), thatTyped.getCameraBoundBottomRight())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getCameraBoundBottomLeft:");
      stringBuilder.append(getCameraBoundBottomLeft());
      stringBuilder.append(", \n");
      stringBuilder.append("getCameraBoundTopRight:");
      stringBuilder.append(getCameraBoundTopRight());
      stringBuilder.append(", \n");
      stringBuilder.append("getCameraBoundTopLeft:");
      stringBuilder.append(getCameraBoundTopLeft());
      stringBuilder.append(", \n");
      stringBuilder.append("getCameraBoundBottomRight:");
      stringBuilder.append(getCameraBoundBottomRight());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Point2d getCameraBoundBottomLeft() {
      return cameraBoundBottomLeft;
    }

    public Point2d getCameraBoundTopRight() {
      return cameraBoundTopRight;
    }

    public Point2d getCameraBoundTopLeft() {
      return cameraBoundTopLeft;
    }

    public Point2d getCameraBoundBottomRight() {
      return cameraBoundBottomRight;
    }

    public void setCameraBoundBottomLeft(Point2d value) {
      this.cameraBoundBottomLeft = value;
    }

    public void setCameraBoundTopRight(Point2d value) {
      this.cameraBoundTopRight = value;
    }

    public void setCameraBoundTopLeft(Point2d value) {
      this.cameraBoundTopLeft = value;
    }

    public void setCameraBoundBottomRight(Point2d value) {
      this.cameraBoundBottomRight = value;
    }
  }

  public static class PlayerBitmap {
    private PlayerBitmapBits bits;

    @Override
    public int hashCode() {
      return Objects.hash(getBits());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof PlayerBitmap)) {
        return false;
      }
      final PlayerBitmap thatTyped = (PlayerBitmap) that;
      if (!Objects.equals(getBits(), thatTyped.getBits())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getBits:");
      stringBuilder.append(getBits());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public PlayerBitmapBits getBits() {
      return bits;
    }

    public void setBits(PlayerBitmapBits value) {
      this.bits = value;
    }
  }

  public static class Item {
    private long chance;

    private W3id id;

    @Override
    public int hashCode() {
      return Objects.hash(getChance(), getId());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Item)) {
        return false;
      }
      final Item thatTyped = (Item) that;
      if (!Objects.equals(getChance(), thatTyped.getChance())) {
        return false;
      }
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getChance:");
      stringBuilder.append(getChance());
      stringBuilder.append(", \n");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getChance() {
      return chance;
    }

    public W3id getId() {
      return id;
    }

    public void setChance(long value) {
      this.chance = value;
    }

    public void setId(W3id value) {
      this.id = value;
    }
  }

  public static class PlayerBitmapBits {
    private List<Boolean> isMember;

    @Override
    public int hashCode() {
      return Objects.hash(getIsMember());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof PlayerBitmapBits)) {
        return false;
      }
      final PlayerBitmapBits thatTyped = (PlayerBitmapBits) that;
      if (!Objects.equals(getIsMember(), thatTyped.getIsMember())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getIsMember:");
      stringBuilder.append(getIsMember());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Boolean> getIsMember() {
      return isMember;
    }

    public void setIsMember(List<Boolean> value) {
      this.isMember = value;
    }
  }

  public static class RandomItemTable {
    private long num;

    private W3str name;

    private List<ItemSet> set;

    @Override
    public int hashCode() {
      return Objects.hash(getNum(), getName(), getSet());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof RandomItemTable)) {
        return false;
      }
      final RandomItemTable thatTyped = (RandomItemTable) that;
      if (!Objects.equals(getNum(), thatTyped.getNum())) {
        return false;
      }
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getSet(), thatTyped.getSet())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getNum:");
      stringBuilder.append(getNum());
      stringBuilder.append(", \n");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getSet:");
      stringBuilder.append(getSet());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getNum() {
      return num;
    }

    public W3str getName() {
      return name;
    }

    public List<ItemSet> getSet() {
      return set;
    }

    public void setNum(long value) {
      this.num = value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setSet(List<ItemSet> value) {
      this.set = value;
    }
  }

  public static class GameVersion {
    private long major;

    private long minor;

    private long revision;

    private long build;

    @Override
    public int hashCode() {
      return Objects.hash(getMajor(), getMinor(), getRevision(), getBuild());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof GameVersion)) {
        return false;
      }
      final GameVersion thatTyped = (GameVersion) that;
      if (!Objects.equals(getMajor(), thatTyped.getMajor())) {
        return false;
      }
      if (!Objects.equals(getMinor(), thatTyped.getMinor())) {
        return false;
      }
      if (!Objects.equals(getRevision(), thatTyped.getRevision())) {
        return false;
      }
      if (!Objects.equals(getBuild(), thatTyped.getBuild())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getMajor:");
      stringBuilder.append(getMajor());
      stringBuilder.append(", \n");
      stringBuilder.append("getMinor:");
      stringBuilder.append(getMinor());
      stringBuilder.append(", \n");
      stringBuilder.append("getRevision:");
      stringBuilder.append(getRevision());
      stringBuilder.append(", \n");
      stringBuilder.append("getBuild:");
      stringBuilder.append(getBuild());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getMajor() {
      return major;
    }

    public long getMinor() {
      return minor;
    }

    public long getRevision() {
      return revision;
    }

    public long getBuild() {
      return build;
    }

    public void setMajor(long value) {
      this.major = value;
    }

    public void setMinor(long value) {
      this.minor = value;
    }

    public void setRevision(long value) {
      this.revision = value;
    }

    public void setBuild(long value) {
      this.build = value;
    }
  }

  public static class PrologueScreen {
    private W3str prologueScreenPath;

    private W3str prologueScreenText;

    private W3str prologueScreenTitle;

    private W3str prologueScreenSubtitle;

    @Override
    public int hashCode() {
      return Objects.hash(getPrologueScreenPath(), getPrologueScreenText(), getPrologueScreenTitle(), getPrologueScreenSubtitle());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof PrologueScreen)) {
        return false;
      }
      final PrologueScreen thatTyped = (PrologueScreen) that;
      if (!Objects.equals(getPrologueScreenPath(), thatTyped.getPrologueScreenPath())) {
        return false;
      }
      if (!Objects.equals(getPrologueScreenText(), thatTyped.getPrologueScreenText())) {
        return false;
      }
      if (!Objects.equals(getPrologueScreenTitle(), thatTyped.getPrologueScreenTitle())) {
        return false;
      }
      if (!Objects.equals(getPrologueScreenSubtitle(), thatTyped.getPrologueScreenSubtitle())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getPrologueScreenPath:");
      stringBuilder.append(getPrologueScreenPath());
      stringBuilder.append(", \n");
      stringBuilder.append("getPrologueScreenText:");
      stringBuilder.append(getPrologueScreenText());
      stringBuilder.append(", \n");
      stringBuilder.append("getPrologueScreenTitle:");
      stringBuilder.append(getPrologueScreenTitle());
      stringBuilder.append(", \n");
      stringBuilder.append("getPrologueScreenSubtitle:");
      stringBuilder.append(getPrologueScreenSubtitle());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getPrologueScreenPath() {
      return prologueScreenPath;
    }

    public W3str getPrologueScreenText() {
      return prologueScreenText;
    }

    public W3str getPrologueScreenTitle() {
      return prologueScreenTitle;
    }

    public W3str getPrologueScreenSubtitle() {
      return prologueScreenSubtitle;
    }

    public void setPrologueScreenPath(W3str value) {
      this.prologueScreenPath = value;
    }

    public void setPrologueScreenText(W3str value) {
      this.prologueScreenText = value;
    }

    public void setPrologueScreenTitle(W3str value) {
      this.prologueScreenTitle = value;
    }

    public void setPrologueScreenSubtitle(W3str value) {
      this.prologueScreenSubtitle = value;
    }
  }

  public enum FogType {
    LINEAR(0),

    EXP(1),

    EXP2(2);

    private static final Map<Long, FogType> byId = new HashMap<>();

    static {
      for (FogType e : FogType.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    FogType(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public FogType byId(long id) {
      return byId.get(id);
    }
  }

  public enum RandomUnitTableColumnType {
    UNIT_TABLE(0),

    BUILDING_TABLE(1),

    ITEM_TABLE(2);

    private static final Map<Long, RandomUnitTableColumnType> byId = new HashMap<>();

    static {
      for (RandomUnitTableColumnType e : RandomUnitTableColumnType.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    RandomUnitTableColumnType(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public RandomUnitTableColumnType byId(long id) {
      return byId.get(id);
    }
  }

  public enum Tileset {
    ASHENVALE(0),

    BARRENS(1),

    FELWOOD(2),

    DUNGEON(3),

    LORDAERON_FALL(4),

    UNDERGROUND(5),

    ICECROWN(6),

    DALARAN_RUINS(7),

    BLACK_CITADEL(8),

    LORDAERON_SUMMER(9),

    NORTHREND(10),

    OUTLAND(11),

    VILLAGE_FALL(12),

    VILLAGE(13),

    LORDAERON_WINTER(14),

    DALARAN(15),

    CITYSCAPE(16),

    SUNKEN_RUINS(17);

    private static final Map<Long, Tileset> byId = new HashMap<>();

    static {
      for (Tileset e : Tileset.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    Tileset(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public Tileset byId(long id) {
      return byId.get(id);
    }
  }

  public static class GraphicsModes {
    private List<Boolean> rest;

    private boolean sd;

    private boolean hd;

    @Override
    public int hashCode() {
      return Objects.hash(getRest(), getSd(), getHd());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof GraphicsModes)) {
        return false;
      }
      final GraphicsModes thatTyped = (GraphicsModes) that;
      if (!Objects.equals(getRest(), thatTyped.getRest())) {
        return false;
      }
      if (!Objects.equals(getSd(), thatTyped.getSd())) {
        return false;
      }
      if (!Objects.equals(getHd(), thatTyped.getHd())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getRest:");
      stringBuilder.append(getRest());
      stringBuilder.append(", \n");
      stringBuilder.append("getSd:");
      stringBuilder.append(getSd());
      stringBuilder.append(", \n");
      stringBuilder.append("getHd:");
      stringBuilder.append(getHd());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Boolean> getRest() {
      return rest;
    }

    public boolean getSd() {
      return sd;
    }

    public boolean getHd() {
      return hd;
    }

    public void setRest(List<Boolean> value) {
      this.rest = value;
    }

    public void setSd(boolean value) {
      this.sd = value;
    }

    public void setHd(boolean value) {
      this.hd = value;
    }
  }

  public static class RandomUnitTablesChunk {
    private List<RandomUnitTable> table;

    @Override
    public int hashCode() {
      return Objects.hash(getTable());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof RandomUnitTablesChunk)) {
        return false;
      }
      final RandomUnitTablesChunk thatTyped = (RandomUnitTablesChunk) that;
      if (!Objects.equals(getTable(), thatTyped.getTable())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTable:");
      stringBuilder.append(getTable());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<RandomUnitTable> getTable() {
      return table;
    }

    public void setTable(List<RandomUnitTable> value) {
      this.table = value;
    }
  }

  public static class RandomUnitTable {
    private long index;

    private W3str name;

    private List<RandomUnitTableColumnType> columnType;

    private List<RandomUnitTableRow> row;

    @Override
    public int hashCode() {
      return Objects.hash(getIndex(), getName(), getColumnType(), getRow());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof RandomUnitTable)) {
        return false;
      }
      final RandomUnitTable thatTyped = (RandomUnitTable) that;
      if (!Objects.equals(getIndex(), thatTyped.getIndex())) {
        return false;
      }
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getColumnType(), thatTyped.getColumnType())) {
        return false;
      }
      if (!Objects.equals(getRow(), thatTyped.getRow())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getIndex:");
      stringBuilder.append(getIndex());
      stringBuilder.append(", \n");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getColumnType:");
      stringBuilder.append(getColumnType());
      stringBuilder.append(", \n");
      stringBuilder.append("getRow:");
      stringBuilder.append(getRow());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getIndex() {
      return index;
    }

    public W3str getName() {
      return name;
    }

    public List<RandomUnitTableColumnType> getColumnType() {
      return columnType;
    }

    public List<RandomUnitTableRow> getRow() {
      return row;
    }

    public void setIndex(long value) {
      this.index = value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setColumnType(List<RandomUnitTableColumnType> value) {
      this.columnType = value;
    }

    public void setRow(List<RandomUnitTableRow> value) {
      this.row = value;
    }
  }
}
