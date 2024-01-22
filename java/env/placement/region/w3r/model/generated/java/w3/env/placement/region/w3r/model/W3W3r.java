package w3.env.placement.region.w3r.model;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class W3W3r {
  private long version;

  private List<Region> region;

  public long getVersion() {
    return version;
  }

  public List<Region> getRegion() {
    return region;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setRegion(List<Region> value) {
    this.region = value;
  }

  public static class Region {
    private float left;

    private float bottom;

    private float right;

    private float top;

    private W3str name;

    private long id;

    private W3id weatherId;

    private W3str ambientSound;

    private int colorBlue;

    private int colorGreen;

    private int colorRed;

    private int endToken;

    @Override
    public int hashCode() {
      return Objects.hash(getLeft(), getBottom(), getRight(), getTop(), getName(), getId(), getWeatherId(), getAmbientSound(), getColorBlue(), getColorGreen(), getColorRed(), getEndToken());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Region)) {
        return false;
      }
      final Region thatTyped = (Region) that;
      if (!Objects.equals(getLeft(), thatTyped.getLeft())) {
        return false;
      }
      if (!Objects.equals(getBottom(), thatTyped.getBottom())) {
        return false;
      }
      if (!Objects.equals(getRight(), thatTyped.getRight())) {
        return false;
      }
      if (!Objects.equals(getTop(), thatTyped.getTop())) {
        return false;
      }
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getWeatherId(), thatTyped.getWeatherId())) {
        return false;
      }
      if (!Objects.equals(getAmbientSound(), thatTyped.getAmbientSound())) {
        return false;
      }
      if (!Objects.equals(getColorBlue(), thatTyped.getColorBlue())) {
        return false;
      }
      if (!Objects.equals(getColorGreen(), thatTyped.getColorGreen())) {
        return false;
      }
      if (!Objects.equals(getColorRed(), thatTyped.getColorRed())) {
        return false;
      }
      if (!Objects.equals(getEndToken(), thatTyped.getEndToken())) {
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
      stringBuilder.append("getBottom:");
      stringBuilder.append(getBottom());
      stringBuilder.append(", \n");
      stringBuilder.append("getRight:");
      stringBuilder.append(getRight());
      stringBuilder.append(", \n");
      stringBuilder.append("getTop:");
      stringBuilder.append(getTop());
      stringBuilder.append(", \n");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append(", \n");
      stringBuilder.append("getWeatherId:");
      stringBuilder.append(getWeatherId());
      stringBuilder.append(", \n");
      stringBuilder.append("getAmbientSound:");
      stringBuilder.append(getAmbientSound());
      stringBuilder.append(", \n");
      stringBuilder.append("getColorBlue:");
      stringBuilder.append(getColorBlue());
      stringBuilder.append(", \n");
      stringBuilder.append("getColorGreen:");
      stringBuilder.append(getColorGreen());
      stringBuilder.append(", \n");
      stringBuilder.append("getColorRed:");
      stringBuilder.append(getColorRed());
      stringBuilder.append(", \n");
      stringBuilder.append("getEndToken:");
      stringBuilder.append(getEndToken());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getLeft() {
      return left;
    }

    public float getBottom() {
      return bottom;
    }

    public float getRight() {
      return right;
    }

    public float getTop() {
      return top;
    }

    public W3str getName() {
      return name;
    }

    public long getId() {
      return id;
    }

    public W3id getWeatherId() {
      return weatherId;
    }

    public W3str getAmbientSound() {
      return ambientSound;
    }

    public int getColorBlue() {
      return colorBlue;
    }

    public int getColorGreen() {
      return colorGreen;
    }

    public int getColorRed() {
      return colorRed;
    }

    public int getEndToken() {
      return endToken;
    }

    public void setLeft(float value) {
      this.left = value;
    }

    public void setBottom(float value) {
      this.bottom = value;
    }

    public void setRight(float value) {
      this.right = value;
    }

    public void setTop(float value) {
      this.top = value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setId(long value) {
      this.id = value;
    }

    public void setWeatherId(W3id value) {
      this.weatherId = value;
    }

    public void setAmbientSound(W3str value) {
      this.ambientSound = value;
    }

    public void setColorBlue(int value) {
      this.colorBlue = value;
    }

    public void setColorGreen(int value) {
      this.colorGreen = value;
    }

    public void setColorRed(int value) {
      this.colorRed = value;
    }

    public void setEndToken(int value) {
      this.endToken = value;
    }
  }
}
