package w3.env.placement.sound.w3s.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3sMapper {
  public static W3W3s map(w3.env.placement.sound.w3s.model.kaitai.W3W3s data) {
    if (data == null) {
      return null;
    }
    final W3W3s newData = new W3W3s();
    newData.setVersion(data.version());
    newData.setSound(data.sound().stream().map(kaitaiToSoundMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToFlagsMapper {
    public static W3W3s.Flags map(w3.env.placement.sound.w3s.model.kaitai.W3W3s.Flags data) {
      if (data == null) {
        return null;
      }
      final W3W3s.Flags newData = new W3W3s.Flags();
      newData.setRest(data.rest());
      newData.setIsImported(data.isImported());
      newData.setIsMusic(data.isMusic());
      newData.setStopWhenOutOfRange(data.stopWhenOutOfRange());
      newData.setIs3d(data.is3d());
      newData.setIsLooping(data.isLooping());
      return newData;
    }
  }

  public static class kaitaiToSoundMapper {
    public static W3W3s.Sound map(w3.env.placement.sound.w3s.model.kaitai.W3W3s.Sound data) {
      if (data == null) {
        return null;
      }
      final W3W3s.Sound newData = new W3W3s.Sound();
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setPath(kaitaiToW3strMapper.map(data.path()));
      newData.setEax(kaitaiToW3strMapper.map(data.eax()));
      newData.setFlags(kaitaiToFlagsMapper.map(data.flags()));
      newData.setFadeInRate(data.fadeInRate());
      newData.setFadeOutRate(data.fadeOutRate());
      newData.setVolume(data.volume());
      newData.setPitch(data.pitch());
      newData.setPitchVariance(data.pitchVariance());
      newData.setPriority(data.priority());
      newData.setChannel(kaitaiToChannelMapper.map(data.channel()));
      newData.setMinDistance(data.minDistance());
      newData.setMaxDistance(data.maxDistance());
      newData.setCutoffDistance(data.cutoffDistance());
      newData.setConeInside(data.coneInside());
      newData.setConeOutside(data.coneOutside());
      newData.setConeOutsideVolume(data.coneOutsideVolume());
      newData.setConeOrientationX(data.coneOrientationX());
      newData.setConeOrientationY(data.coneOrientationY());
      newData.setConeOrientationZ(data.coneOrientationZ());
      newData.setVarName(kaitaiToW3strMapper.map(data.varName()));
      newData.setInternalSoundName(kaitaiToW3strMapper.map(data.internalSoundName()));
      newData.setSoundPath(kaitaiToW3strMapper.map(data.soundPath()));
      newData.setUnknown9(data.unknown9());
      newData.setUnknown10(kaitaiToW3strMapper.map(data.unknown10()));
      newData.setUnknown11(data.unknown11());
      newData.setUnknown12(kaitaiToW3strMapper.map(data.unknown12()));
      newData.setUnknown13(data.unknown13());
      newData.setUnknown14(kaitaiToW3strMapper.map(data.unknown14()));
      newData.setUnknown15(kaitaiToW3strMapper.map(data.unknown15()));
      newData.setUnknown16(kaitaiToW3strMapper.map(data.unknown16()));
      newData.setUnknown17(kaitaiToW3strMapper.map(data.unknown17()));
      newData.setUnknown18(data.unknown18());
      return newData;
    }
  }

  public static class kaitaiToChannelMapper {
    public static W3W3s.Channel map(w3.env.placement.sound.w3s.model.kaitai.W3W3s.Channel data) {
      if (data == null) {
        return null;
      }
      return W3W3s.Channel.valueOf(data.name());
    }
  }
}
