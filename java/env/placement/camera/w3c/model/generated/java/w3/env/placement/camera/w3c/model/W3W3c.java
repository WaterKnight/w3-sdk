package w3.env.placement.camera.w3c.model;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class W3W3c {
  private long version;

  private List<Camera> camera;

  public long getVersion() {
    return version;
  }

  public List<Camera> getCamera() {
    return camera;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setCamera(List<Camera> value) {
    this.camera = value;
  }

  public static class Camera {
    private float targetX;

    private float targetY;

    private float targetZ;

    private float angle;

    private float angleOfAttack;

    private float distance;

    private float roll;

    private float fieldOfView;

    private float farClipping;

    private float unknown;

    private W3str name;

    @Override
    public int hashCode() {
      return Objects.hash(getTargetX(), getTargetY(), getTargetZ(), getAngle(), getAngleOfAttack(), getDistance(), getRoll(), getFieldOfView(), getFarClipping(), getUnknown(), getName());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Camera)) {
        return false;
      }
      final Camera thatTyped = (Camera) that;
      if (!Objects.equals(getTargetX(), thatTyped.getTargetX())) {
        return false;
      }
      if (!Objects.equals(getTargetY(), thatTyped.getTargetY())) {
        return false;
      }
      if (!Objects.equals(getTargetZ(), thatTyped.getTargetZ())) {
        return false;
      }
      if (!Objects.equals(getAngle(), thatTyped.getAngle())) {
        return false;
      }
      if (!Objects.equals(getAngleOfAttack(), thatTyped.getAngleOfAttack())) {
        return false;
      }
      if (!Objects.equals(getDistance(), thatTyped.getDistance())) {
        return false;
      }
      if (!Objects.equals(getRoll(), thatTyped.getRoll())) {
        return false;
      }
      if (!Objects.equals(getFieldOfView(), thatTyped.getFieldOfView())) {
        return false;
      }
      if (!Objects.equals(getFarClipping(), thatTyped.getFarClipping())) {
        return false;
      }
      if (!Objects.equals(getUnknown(), thatTyped.getUnknown())) {
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
      stringBuilder.append("getTargetX:");
      stringBuilder.append(getTargetX());
      stringBuilder.append(", \n");
      stringBuilder.append("getTargetY:");
      stringBuilder.append(getTargetY());
      stringBuilder.append(", \n");
      stringBuilder.append("getTargetZ:");
      stringBuilder.append(getTargetZ());
      stringBuilder.append(", \n");
      stringBuilder.append("getAngle:");
      stringBuilder.append(getAngle());
      stringBuilder.append(", \n");
      stringBuilder.append("getAngleOfAttack:");
      stringBuilder.append(getAngleOfAttack());
      stringBuilder.append(", \n");
      stringBuilder.append("getDistance:");
      stringBuilder.append(getDistance());
      stringBuilder.append(", \n");
      stringBuilder.append("getRoll:");
      stringBuilder.append(getRoll());
      stringBuilder.append(", \n");
      stringBuilder.append("getFieldOfView:");
      stringBuilder.append(getFieldOfView());
      stringBuilder.append(", \n");
      stringBuilder.append("getFarClipping:");
      stringBuilder.append(getFarClipping());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown:");
      stringBuilder.append(getUnknown());
      stringBuilder.append(", \n");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public float getTargetX() {
      return targetX;
    }

    public float getTargetY() {
      return targetY;
    }

    public float getTargetZ() {
      return targetZ;
    }

    public float getAngle() {
      return angle;
    }

    public float getAngleOfAttack() {
      return angleOfAttack;
    }

    public float getDistance() {
      return distance;
    }

    public float getRoll() {
      return roll;
    }

    public float getFieldOfView() {
      return fieldOfView;
    }

    public float getFarClipping() {
      return farClipping;
    }

    public float getUnknown() {
      return unknown;
    }

    public W3str getName() {
      return name;
    }

    public void setTargetX(float value) {
      this.targetX = value;
    }

    public void setTargetY(float value) {
      this.targetY = value;
    }

    public void setTargetZ(float value) {
      this.targetZ = value;
    }

    public void setAngle(float value) {
      this.angle = value;
    }

    public void setAngleOfAttack(float value) {
      this.angleOfAttack = value;
    }

    public void setDistance(float value) {
      this.distance = value;
    }

    public void setRoll(float value) {
      this.roll = value;
    }

    public void setFieldOfView(float value) {
      this.fieldOfView = value;
    }

    public void setFarClipping(float value) {
      this.farClipping = value;
    }

    public void setUnknown(float value) {
      this.unknown = value;
    }

    public void setName(W3str value) {
      this.name = value;
    }
  }
}
