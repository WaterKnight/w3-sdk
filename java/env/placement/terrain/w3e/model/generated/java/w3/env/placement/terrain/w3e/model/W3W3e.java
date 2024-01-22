package w3.env.placement.terrain.w3e.model;

import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class W3W3e {
  private W3id fileId;

  private long version;

  private Tileset tileset;

  private long useCustomTileset;

  private List<W3id> tileId;

  private List<W3id> cliffTileId;

  private long mapWidth;

  private long mapHeight;

  private float centerOffsetX;

  private float centerOffsetY;

  private List<TileNode> tileNode;

  public W3id getFileId() {
    return fileId;
  }

  public long getVersion() {
    return version;
  }

  public Tileset getTileset() {
    return tileset;
  }

  public long getUseCustomTileset() {
    return useCustomTileset;
  }

  public List<W3id> getTileId() {
    return tileId;
  }

  public List<W3id> getCliffTileId() {
    return cliffTileId;
  }

  public long getMapWidth() {
    return mapWidth;
  }

  public long getMapHeight() {
    return mapHeight;
  }

  public float getCenterOffsetX() {
    return centerOffsetX;
  }

  public float getCenterOffsetY() {
    return centerOffsetY;
  }

  public List<TileNode> getTileNode() {
    return tileNode;
  }

  public void setFileId(W3id value) {
    this.fileId = value;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setTileset(Tileset value) {
    this.tileset = value;
  }

  public void setUseCustomTileset(long value) {
    this.useCustomTileset = value;
  }

  public void setTileId(List<W3id> value) {
    this.tileId = value;
  }

  public void setCliffTileId(List<W3id> value) {
    this.cliffTileId = value;
  }

  public void setMapWidth(long value) {
    this.mapWidth = value;
  }

  public void setMapHeight(long value) {
    this.mapHeight = value;
  }

  public void setCenterOffsetX(float value) {
    this.centerOffsetX = value;
  }

  public void setCenterOffsetY(float value) {
    this.centerOffsetY = value;
  }

  public void setTileNode(List<TileNode> value) {
    this.tileNode = value;
  }

  public enum Tileset {
    ASHENVALE(65),

    BARRENS(66),

    FELWOOD(67),

    DUNGEON(68),

    LORDAERON_FALL(70),

    UNDERGROUND(71),

    ICECROWN(73),

    DALARAN_RUINS(74),

    BLACK_CITADEL(75),

    LORDAERON_SUMMER(76),

    NORTHREND(78),

    OUTLAND(79),

    VILLAGE_FALL(81),

    VILLAGE(86),

    LORDAERON_WINTER(87),

    DALARAN(88),

    CITYSCAPE(89),

    SUNKEN_RUINS(90);

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

  public static class TileNode {
    private int groundHeight;

    private WaterHeightAndBoundary waterHeightAndBoundary;

    private FlagsAndGroundTexture flagsAndGroundTexture;

    private int groundAndCliffVariation;

    private CliffTextureAndLayerHeight cliffTextureAndLayerHeight;

    @Override
    public int hashCode() {
      return Objects.hash(getGroundHeight(), getWaterHeightAndBoundary(), getFlagsAndGroundTexture(), getGroundAndCliffVariation(), getCliffTextureAndLayerHeight());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof TileNode)) {
        return false;
      }
      final TileNode thatTyped = (TileNode) that;
      if (!Objects.equals(getGroundHeight(), thatTyped.getGroundHeight())) {
        return false;
      }
      if (!Objects.equals(getWaterHeightAndBoundary(), thatTyped.getWaterHeightAndBoundary())) {
        return false;
      }
      if (!Objects.equals(getFlagsAndGroundTexture(), thatTyped.getFlagsAndGroundTexture())) {
        return false;
      }
      if (!Objects.equals(getGroundAndCliffVariation(), thatTyped.getGroundAndCliffVariation())) {
        return false;
      }
      if (!Objects.equals(getCliffTextureAndLayerHeight(), thatTyped.getCliffTextureAndLayerHeight())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getGroundHeight:");
      stringBuilder.append(getGroundHeight());
      stringBuilder.append(", \n");
      stringBuilder.append("getWaterHeightAndBoundary:");
      stringBuilder.append(getWaterHeightAndBoundary());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlagsAndGroundTexture:");
      stringBuilder.append(getFlagsAndGroundTexture());
      stringBuilder.append(", \n");
      stringBuilder.append("getGroundAndCliffVariation:");
      stringBuilder.append(getGroundAndCliffVariation());
      stringBuilder.append(", \n");
      stringBuilder.append("getCliffTextureAndLayerHeight:");
      stringBuilder.append(getCliffTextureAndLayerHeight());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public int getGroundHeight() {
      return groundHeight;
    }

    public WaterHeightAndBoundary getWaterHeightAndBoundary() {
      return waterHeightAndBoundary;
    }

    public FlagsAndGroundTexture getFlagsAndGroundTexture() {
      return flagsAndGroundTexture;
    }

    public int getGroundAndCliffVariation() {
      return groundAndCliffVariation;
    }

    public CliffTextureAndLayerHeight getCliffTextureAndLayerHeight() {
      return cliffTextureAndLayerHeight;
    }

    public void setGroundHeight(int value) {
      this.groundHeight = value;
    }

    public void setWaterHeightAndBoundary(WaterHeightAndBoundary value) {
      this.waterHeightAndBoundary = value;
    }

    public void setFlagsAndGroundTexture(FlagsAndGroundTexture value) {
      this.flagsAndGroundTexture = value;
    }

    public void setGroundAndCliffVariation(int value) {
      this.groundAndCliffVariation = value;
    }

    public void setCliffTextureAndLayerHeight(CliffTextureAndLayerHeight value) {
      this.cliffTextureAndLayerHeight = value;
    }
  }

  public static class WaterHeightAndBoundary {
    private long waterHeight;

    private boolean flag;

    @Override
    public int hashCode() {
      return Objects.hash(getWaterHeight(), getFlag());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof WaterHeightAndBoundary)) {
        return false;
      }
      final WaterHeightAndBoundary thatTyped = (WaterHeightAndBoundary) that;
      if (!Objects.equals(getWaterHeight(), thatTyped.getWaterHeight())) {
        return false;
      }
      if (!Objects.equals(getFlag(), thatTyped.getFlag())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getWaterHeight:");
      stringBuilder.append(getWaterHeight());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag:");
      stringBuilder.append(getFlag());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getWaterHeight() {
      return waterHeight;
    }

    public boolean getFlag() {
      return flag;
    }

    public void setWaterHeight(long value) {
      this.waterHeight = value;
    }

    public void setFlag(boolean value) {
      this.flag = value;
    }
  }

  public static class FlagsAndGroundTexture {
    private boolean boundary2;

    private boolean water;

    private boolean blight;

    private boolean ramp;

    private long texture;

    @Override
    public int hashCode() {
      return Objects.hash(getBoundary2(), getWater(), getBlight(), getRamp(), getTexture());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof FlagsAndGroundTexture)) {
        return false;
      }
      final FlagsAndGroundTexture thatTyped = (FlagsAndGroundTexture) that;
      if (!Objects.equals(getBoundary2(), thatTyped.getBoundary2())) {
        return false;
      }
      if (!Objects.equals(getWater(), thatTyped.getWater())) {
        return false;
      }
      if (!Objects.equals(getBlight(), thatTyped.getBlight())) {
        return false;
      }
      if (!Objects.equals(getRamp(), thatTyped.getRamp())) {
        return false;
      }
      if (!Objects.equals(getTexture(), thatTyped.getTexture())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getBoundary2:");
      stringBuilder.append(getBoundary2());
      stringBuilder.append(", \n");
      stringBuilder.append("getWater:");
      stringBuilder.append(getWater());
      stringBuilder.append(", \n");
      stringBuilder.append("getBlight:");
      stringBuilder.append(getBlight());
      stringBuilder.append(", \n");
      stringBuilder.append("getRamp:");
      stringBuilder.append(getRamp());
      stringBuilder.append(", \n");
      stringBuilder.append("getTexture:");
      stringBuilder.append(getTexture());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public boolean getBoundary2() {
      return boundary2;
    }

    public boolean getWater() {
      return water;
    }

    public boolean getBlight() {
      return blight;
    }

    public boolean getRamp() {
      return ramp;
    }

    public long getTexture() {
      return texture;
    }

    public void setBoundary2(boolean value) {
      this.boundary2 = value;
    }

    public void setWater(boolean value) {
      this.water = value;
    }

    public void setBlight(boolean value) {
      this.blight = value;
    }

    public void setRamp(boolean value) {
      this.ramp = value;
    }

    public void setTexture(long value) {
      this.texture = value;
    }
  }

  public static class CliffTextureAndLayerHeight {
    private long texture;

    private long layer;

    @Override
    public int hashCode() {
      return Objects.hash(getTexture(), getLayer());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof CliffTextureAndLayerHeight)) {
        return false;
      }
      final CliffTextureAndLayerHeight thatTyped = (CliffTextureAndLayerHeight) that;
      if (!Objects.equals(getTexture(), thatTyped.getTexture())) {
        return false;
      }
      if (!Objects.equals(getLayer(), thatTyped.getLayer())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getTexture:");
      stringBuilder.append(getTexture());
      stringBuilder.append(", \n");
      stringBuilder.append("getLayer:");
      stringBuilder.append(getLayer());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getTexture() {
      return texture;
    }

    public long getLayer() {
      return layer;
    }

    public void setTexture(long value) {
      this.texture = value;
    }

    public void setLayer(long value) {
      this.layer = value;
    }
  }
}
