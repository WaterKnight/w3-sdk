package w3.env.placement.camera.w3c.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3cMapper {
  public static W3W3c map(w3.env.placement.camera.w3c.model.kaitai.W3W3c data) {
    if (data == null) {
      return null;
    }
    final W3W3c newData = new W3W3c();
    newData.setVersion(data.version());
    newData.setCamera(data.camera().stream().map(kaitaiToCameraMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToCameraMapper {
    public static W3W3c.Camera map(w3.env.placement.camera.w3c.model.kaitai.W3W3c.Camera data) {
      if (data == null) {
        return null;
      }
      final W3W3c.Camera newData = new W3W3c.Camera();
      newData.setTargetX(data.targetX());
      newData.setTargetY(data.targetY());
      newData.setTargetZ(data.targetZ());
      newData.setAngle(data.angle());
      newData.setAngleOfAttack(data.angleOfAttack());
      newData.setDistance(data.distance());
      newData.setRoll(data.roll());
      newData.setFieldOfView(data.fieldOfView());
      newData.setFarClipping(data.farClipping());
      newData.setUnknown(data.unknown());
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      return newData;
    }
  }
}
