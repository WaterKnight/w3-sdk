package w3.info.mmp.model;

import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class W3Mmp {
  private long version;

  private IconsChunk iconsChunk;

  public long getVersion() {
    return version;
  }

  public IconsChunk getIconsChunk() {
    return iconsChunk;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setIconsChunk(IconsChunk value) {
    this.iconsChunk = value;
  }

  public static class IconsChunk {
    private List<Icon> icon;

    @Override
    public int hashCode() {
      return Objects.hash(getIcon());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof IconsChunk)) {
        return false;
      }
      final IconsChunk thatTyped = (IconsChunk) that;
      if (!Objects.equals(getIcon(), thatTyped.getIcon())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getIcon:");
      stringBuilder.append(getIcon());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Icon> getIcon() {
      return icon;
    }

    public void setIcon(List<Icon> value) {
      this.icon = value;
    }
  }

  public static class Color {
    private int blue;

    private int green;

    private int red;

    private int alpha;

    @Override
    public int hashCode() {
      return Objects.hash(getBlue(), getGreen(), getRed(), getAlpha());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Color)) {
        return false;
      }
      final Color thatTyped = (Color) that;
      if (!Objects.equals(getBlue(), thatTyped.getBlue())) {
        return false;
      }
      if (!Objects.equals(getGreen(), thatTyped.getGreen())) {
        return false;
      }
      if (!Objects.equals(getRed(), thatTyped.getRed())) {
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
      stringBuilder.append("getBlue:");
      stringBuilder.append(getBlue());
      stringBuilder.append(", \n");
      stringBuilder.append("getGreen:");
      stringBuilder.append(getGreen());
      stringBuilder.append(", \n");
      stringBuilder.append("getRed:");
      stringBuilder.append(getRed());
      stringBuilder.append(", \n");
      stringBuilder.append("getAlpha:");
      stringBuilder.append(getAlpha());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public int getBlue() {
      return blue;
    }

    public int getGreen() {
      return green;
    }

    public int getRed() {
      return red;
    }

    public int getAlpha() {
      return alpha;
    }

    public void setBlue(int value) {
      this.blue = value;
    }

    public void setGreen(int value) {
      this.green = value;
    }

    public void setRed(int value) {
      this.red = value;
    }

    public void setAlpha(int value) {
      this.alpha = value;
    }
  }

  public static class Icon {
    private IconType iconType;

    private long x;

    private long y;

    private Color color;

    @Override
    public int hashCode() {
      return Objects.hash(getIconType(), getx(), gety(), getColor());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Icon)) {
        return false;
      }
      final Icon thatTyped = (Icon) that;
      if (!Objects.equals(getIconType(), thatTyped.getIconType())) {
        return false;
      }
      if (!Objects.equals(getx(), thatTyped.getx())) {
        return false;
      }
      if (!Objects.equals(gety(), thatTyped.gety())) {
        return false;
      }
      if (!Objects.equals(getColor(), thatTyped.getColor())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getIconType:");
      stringBuilder.append(getIconType());
      stringBuilder.append(", \n");
      stringBuilder.append("getx:");
      stringBuilder.append(getx());
      stringBuilder.append(", \n");
      stringBuilder.append("gety:");
      stringBuilder.append(gety());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor:");
      stringBuilder.append(getColor());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public IconType getIconType() {
      return iconType;
    }

    public long getx() {
      return x;
    }

    public long gety() {
      return y;
    }

    public Color getColor() {
      return color;
    }

    public void setIconType(IconType value) {
      this.iconType = value;
    }

    public void setx(long value) {
      this.x = value;
    }

    public void sety(long value) {
      this.y = value;
    }

    public void setColor(Color value) {
      this.color = value;
    }
  }

  public enum IconType {
    GOLD_MINE(0),

    HOUSE(1),

    PLAYER_START(2),

    NEUTRAL(3),

    NEUTRAL_SMALL(4);

    private static final Map<Long, IconType> byId = new HashMap<>();

    static {
      for (IconType e : IconType.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    IconType(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public IconType byId(long id) {
      return byId.get(id);
    }
  }
}
