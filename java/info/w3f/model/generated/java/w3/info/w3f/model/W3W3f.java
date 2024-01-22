package w3.info.w3f.model;

import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class W3W3f {
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

  private List<W3Map> map;

  private List<W3MapOrder> mapOrder;

  public long getVersion() {
    return version;
  }

  public long getSaves() {
    return saves;
  }

  public long getEditorVersion() {
    return editorVersion;
  }

  public W3str getName() {
    return name;
  }

  public W3str getDifficulty() {
    return difficulty;
  }

  public W3str getAuthor() {
    return author;
  }

  public W3str getDescription() {
    return description;
  }

  public VariableDifficultyLevelsFlagAndExpansionFlag getVariableDifficultyLevelsFlagAndExpansionFlag(
      ) {
    return variableDifficultyLevelsFlagAndExpansionFlag;
  }

  public long getBackgroundScreenIndex() {
    return backgroundScreenIndex;
  }

  public W3str getBackgroundScreenPath() {
    return backgroundScreenPath;
  }

  public W3str getMinimapPicturePath() {
    return minimapPicturePath;
  }

  public long getAmbientSoundIndex() {
    return ambientSoundIndex;
  }

  public W3str getCustomAmbientSoundPath() {
    return customAmbientSoundPath;
  }

  public long getUseTerrainFog() {
    return useTerrainFog;
  }

  public float getFogZHeight() {
    return fogZHeight;
  }

  public float getFogZEnd() {
    return fogZEnd;
  }

  public float getFogDensity() {
    return fogDensity;
  }

  public int getFogRed() {
    return fogRed;
  }

  public int getFogGreen() {
    return fogGreen;
  }

  public int getFogBlue() {
    return fogBlue;
  }

  public int getFogAlpha() {
    return fogAlpha;
  }

  public long getCursorRaceIndex() {
    return cursorRaceIndex;
  }

  public List<W3Map> getMap() {
    return map;
  }

  public List<W3MapOrder> getMapOrder() {
    return mapOrder;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setSaves(long value) {
    this.saves = value;
  }

  public void setEditorVersion(long value) {
    this.editorVersion = value;
  }

  public void setName(W3str value) {
    this.name = value;
  }

  public void setDifficulty(W3str value) {
    this.difficulty = value;
  }

  public void setAuthor(W3str value) {
    this.author = value;
  }

  public void setDescription(W3str value) {
    this.description = value;
  }

  public void setVariableDifficultyLevelsFlagAndExpansionFlag(
      VariableDifficultyLevelsFlagAndExpansionFlag value) {
    this.variableDifficultyLevelsFlagAndExpansionFlag = value;
  }

  public void setBackgroundScreenIndex(long value) {
    this.backgroundScreenIndex = value;
  }

  public void setBackgroundScreenPath(W3str value) {
    this.backgroundScreenPath = value;
  }

  public void setMinimapPicturePath(W3str value) {
    this.minimapPicturePath = value;
  }

  public void setAmbientSoundIndex(long value) {
    this.ambientSoundIndex = value;
  }

  public void setCustomAmbientSoundPath(W3str value) {
    this.customAmbientSoundPath = value;
  }

  public void setUseTerrainFog(long value) {
    this.useTerrainFog = value;
  }

  public void setFogZHeight(float value) {
    this.fogZHeight = value;
  }

  public void setFogZEnd(float value) {
    this.fogZEnd = value;
  }

  public void setFogDensity(float value) {
    this.fogDensity = value;
  }

  public void setFogRed(int value) {
    this.fogRed = value;
  }

  public void setFogGreen(int value) {
    this.fogGreen = value;
  }

  public void setFogBlue(int value) {
    this.fogBlue = value;
  }

  public void setFogAlpha(int value) {
    this.fogAlpha = value;
  }

  public void setCursorRaceIndex(long value) {
    this.cursorRaceIndex = value;
  }

  public void setMap(List<W3Map> value) {
    this.map = value;
  }

  public void setMapOrder(List<W3MapOrder> value) {
    this.mapOrder = value;
  }

  public enum VariableDifficultyLevelsFlagAndExpansionFlag {
    FIXED(0),

    VARIABLE(1),

    FIXED_W3X(2),

    VARIABLE_W3X(3);

    private static final Map<Long, VariableDifficultyLevelsFlagAndExpansionFlag> byId = new HashMap<>();

    static {
      for (VariableDifficultyLevelsFlagAndExpansionFlag e : VariableDifficultyLevelsFlagAndExpansionFlag.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    VariableDifficultyLevelsFlagAndExpansionFlag(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public VariableDifficultyLevelsFlagAndExpansionFlag byId(long id) {
      return byId.get(id);
    }
  }

  public static class W3Map {
    private MapVisibility visibility;

    private W3str chapterTitle;

    private W3str mapTitle;

    private W3str path;

    @Override
    public int hashCode() {
      return Objects.hash(getVisibility(), getChapterTitle(), getMapTitle(), getPath());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof W3Map)) {
        return false;
      }
      final W3Map thatTyped = (W3Map) that;
      if (!Objects.equals(getVisibility(), thatTyped.getVisibility())) {
        return false;
      }
      if (!Objects.equals(getChapterTitle(), thatTyped.getChapterTitle())) {
        return false;
      }
      if (!Objects.equals(getMapTitle(), thatTyped.getMapTitle())) {
        return false;
      }
      if (!Objects.equals(getPath(), thatTyped.getPath())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getVisibility:");
      stringBuilder.append(getVisibility());
      stringBuilder.append(", \n");
      stringBuilder.append("getChapterTitle:");
      stringBuilder.append(getChapterTitle());
      stringBuilder.append(", \n");
      stringBuilder.append("getMapTitle:");
      stringBuilder.append(getMapTitle());
      stringBuilder.append(", \n");
      stringBuilder.append("getPath:");
      stringBuilder.append(getPath());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public MapVisibility getVisibility() {
      return visibility;
    }

    public W3str getChapterTitle() {
      return chapterTitle;
    }

    public W3str getMapTitle() {
      return mapTitle;
    }

    public W3str getPath() {
      return path;
    }

    public void setVisibility(MapVisibility value) {
      this.visibility = value;
    }

    public void setChapterTitle(W3str value) {
      this.chapterTitle = value;
    }

    public void setMapTitle(W3str value) {
      this.mapTitle = value;
    }

    public void setPath(W3str value) {
      this.path = value;
    }
  }

  public enum MapVisibility {
    INVISIBLE(0),

    VISIBLE(1);

    private static final Map<Long, MapVisibility> byId = new HashMap<>();

    static {
      for (MapVisibility e : MapVisibility.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    MapVisibility(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public MapVisibility byId(long id) {
      return byId.get(id);
    }
  }

  public static class W3MapOrder {
    private W3str unknown;

    private W3str path;

    @Override
    public int hashCode() {
      return Objects.hash(getUnknown(), getPath());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof W3MapOrder)) {
        return false;
      }
      final W3MapOrder thatTyped = (W3MapOrder) that;
      if (!Objects.equals(getUnknown(), thatTyped.getUnknown())) {
        return false;
      }
      if (!Objects.equals(getPath(), thatTyped.getPath())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getUnknown:");
      stringBuilder.append(getUnknown());
      stringBuilder.append(", \n");
      stringBuilder.append("getPath:");
      stringBuilder.append(getPath());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getUnknown() {
      return unknown;
    }

    public W3str getPath() {
      return path;
    }

    public void setUnknown(W3str value) {
      this.unknown = value;
    }

    public void setPath(W3str value) {
      this.path = value;
    }
  }
}
