package w3.env.placement.sound.w3s.model;

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

public class W3W3s {
  private long version;

  private List<Sound> sound;

  public long getVersion() {
    return version;
  }

  public List<Sound> getSound() {
    return sound;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setSound(List<Sound> value) {
    this.sound = value;
  }

  public static class Flags {
    private List<Boolean> rest;

    private boolean isImported;

    private boolean isMusic;

    private boolean stopWhenOutOfRange;

    private boolean is3d;

    private boolean isLooping;

    @Override
    public int hashCode() {
      return Objects.hash(getRest(), getIsImported(), getIsMusic(), getStopWhenOutOfRange(), getIs3d(), getIsLooping());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Flags)) {
        return false;
      }
      final Flags thatTyped = (Flags) that;
      if (!Objects.equals(getRest(), thatTyped.getRest())) {
        return false;
      }
      if (!Objects.equals(getIsImported(), thatTyped.getIsImported())) {
        return false;
      }
      if (!Objects.equals(getIsMusic(), thatTyped.getIsMusic())) {
        return false;
      }
      if (!Objects.equals(getStopWhenOutOfRange(), thatTyped.getStopWhenOutOfRange())) {
        return false;
      }
      if (!Objects.equals(getIs3d(), thatTyped.getIs3d())) {
        return false;
      }
      if (!Objects.equals(getIsLooping(), thatTyped.getIsLooping())) {
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
      stringBuilder.append("getIsImported:");
      stringBuilder.append(getIsImported());
      stringBuilder.append(", \n");
      stringBuilder.append("getIsMusic:");
      stringBuilder.append(getIsMusic());
      stringBuilder.append(", \n");
      stringBuilder.append("getStopWhenOutOfRange:");
      stringBuilder.append(getStopWhenOutOfRange());
      stringBuilder.append(", \n");
      stringBuilder.append("getIs3d:");
      stringBuilder.append(getIs3d());
      stringBuilder.append(", \n");
      stringBuilder.append("getIsLooping:");
      stringBuilder.append(getIsLooping());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Boolean> getRest() {
      return rest;
    }

    public boolean getIsImported() {
      return isImported;
    }

    public boolean getIsMusic() {
      return isMusic;
    }

    public boolean getStopWhenOutOfRange() {
      return stopWhenOutOfRange;
    }

    public boolean getIs3d() {
      return is3d;
    }

    public boolean getIsLooping() {
      return isLooping;
    }

    public void setRest(List<Boolean> value) {
      this.rest = value;
    }

    public void setIsImported(boolean value) {
      this.isImported = value;
    }

    public void setIsMusic(boolean value) {
      this.isMusic = value;
    }

    public void setStopWhenOutOfRange(boolean value) {
      this.stopWhenOutOfRange = value;
    }

    public void setIs3d(boolean value) {
      this.is3d = value;
    }

    public void setIsLooping(boolean value) {
      this.isLooping = value;
    }
  }

  public static class Sound {
    private W3str name;

    private W3str path;

    private W3str eax;

    private Flags flags;

    private long fadeInRate;

    private long fadeOutRate;

    private int volume;

    private float pitch;

    private float pitchVariance;

    private int priority;

    private Channel channel;

    private float minDistance;

    private float maxDistance;

    private float cutoffDistance;

    private float coneInside;

    private float coneOutside;

    private int coneOutsideVolume;

    private float coneOrientationX;

    private float coneOrientationY;

    private float coneOrientationZ;

    private W3str varName;

    private W3str internalSoundName;

    private W3str soundPath;

    private Integer unknown9;

    private W3str unknown10;

    private Integer unknown11;

    private W3str unknown12;

    private Integer unknown13;

    private W3str unknown14;

    private W3str unknown15;

    private W3str unknown16;

    private W3str unknown17;

    private Integer unknown18;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getPath(), getEax(), getFlags(), getFadeInRate(), getFadeOutRate(), getVolume(), getPitch(), getPitchVariance(), getPriority(), getChannel(), getMinDistance(), getMaxDistance(), getCutoffDistance(), getConeInside(), getConeOutside(), getConeOutsideVolume(), getConeOrientationX(), getConeOrientationY(), getConeOrientationZ(), getVarName(), getInternalSoundName(), getSoundPath(), getUnknown9(), getUnknown10(), getUnknown11(), getUnknown12(), getUnknown13(), getUnknown14(), getUnknown15(), getUnknown16(), getUnknown17(), getUnknown18());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Sound)) {
        return false;
      }
      final Sound thatTyped = (Sound) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getPath(), thatTyped.getPath())) {
        return false;
      }
      if (!Objects.equals(getEax(), thatTyped.getEax())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getFadeInRate(), thatTyped.getFadeInRate())) {
        return false;
      }
      if (!Objects.equals(getFadeOutRate(), thatTyped.getFadeOutRate())) {
        return false;
      }
      if (!Objects.equals(getVolume(), thatTyped.getVolume())) {
        return false;
      }
      if (!Objects.equals(getPitch(), thatTyped.getPitch())) {
        return false;
      }
      if (!Objects.equals(getPitchVariance(), thatTyped.getPitchVariance())) {
        return false;
      }
      if (!Objects.equals(getPriority(), thatTyped.getPriority())) {
        return false;
      }
      if (!Objects.equals(getChannel(), thatTyped.getChannel())) {
        return false;
      }
      if (!Objects.equals(getMinDistance(), thatTyped.getMinDistance())) {
        return false;
      }
      if (!Objects.equals(getMaxDistance(), thatTyped.getMaxDistance())) {
        return false;
      }
      if (!Objects.equals(getCutoffDistance(), thatTyped.getCutoffDistance())) {
        return false;
      }
      if (!Objects.equals(getConeInside(), thatTyped.getConeInside())) {
        return false;
      }
      if (!Objects.equals(getConeOutside(), thatTyped.getConeOutside())) {
        return false;
      }
      if (!Objects.equals(getConeOutsideVolume(), thatTyped.getConeOutsideVolume())) {
        return false;
      }
      if (!Objects.equals(getConeOrientationX(), thatTyped.getConeOrientationX())) {
        return false;
      }
      if (!Objects.equals(getConeOrientationY(), thatTyped.getConeOrientationY())) {
        return false;
      }
      if (!Objects.equals(getConeOrientationZ(), thatTyped.getConeOrientationZ())) {
        return false;
      }
      if (!Objects.equals(getVarName(), thatTyped.getVarName())) {
        return false;
      }
      if (!Objects.equals(getInternalSoundName(), thatTyped.getInternalSoundName())) {
        return false;
      }
      if (!Objects.equals(getSoundPath(), thatTyped.getSoundPath())) {
        return false;
      }
      if (!Objects.equals(getUnknown9(), thatTyped.getUnknown9())) {
        return false;
      }
      if (!Objects.equals(getUnknown10(), thatTyped.getUnknown10())) {
        return false;
      }
      if (!Objects.equals(getUnknown11(), thatTyped.getUnknown11())) {
        return false;
      }
      if (!Objects.equals(getUnknown12(), thatTyped.getUnknown12())) {
        return false;
      }
      if (!Objects.equals(getUnknown13(), thatTyped.getUnknown13())) {
        return false;
      }
      if (!Objects.equals(getUnknown14(), thatTyped.getUnknown14())) {
        return false;
      }
      if (!Objects.equals(getUnknown15(), thatTyped.getUnknown15())) {
        return false;
      }
      if (!Objects.equals(getUnknown16(), thatTyped.getUnknown16())) {
        return false;
      }
      if (!Objects.equals(getUnknown17(), thatTyped.getUnknown17())) {
        return false;
      }
      if (!Objects.equals(getUnknown18(), thatTyped.getUnknown18())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getPath:");
      stringBuilder.append(getPath());
      stringBuilder.append(", \n");
      stringBuilder.append("getEax:");
      stringBuilder.append(getEax());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getFadeInRate:");
      stringBuilder.append(getFadeInRate());
      stringBuilder.append(", \n");
      stringBuilder.append("getFadeOutRate:");
      stringBuilder.append(getFadeOutRate());
      stringBuilder.append(", \n");
      stringBuilder.append("getVolume:");
      stringBuilder.append(getVolume());
      stringBuilder.append(", \n");
      stringBuilder.append("getPitch:");
      stringBuilder.append(getPitch());
      stringBuilder.append(", \n");
      stringBuilder.append("getPitchVariance:");
      stringBuilder.append(getPitchVariance());
      stringBuilder.append(", \n");
      stringBuilder.append("getPriority:");
      stringBuilder.append(getPriority());
      stringBuilder.append(", \n");
      stringBuilder.append("getChannel:");
      stringBuilder.append(getChannel());
      stringBuilder.append(", \n");
      stringBuilder.append("getMinDistance:");
      stringBuilder.append(getMinDistance());
      stringBuilder.append(", \n");
      stringBuilder.append("getMaxDistance:");
      stringBuilder.append(getMaxDistance());
      stringBuilder.append(", \n");
      stringBuilder.append("getCutoffDistance:");
      stringBuilder.append(getCutoffDistance());
      stringBuilder.append(", \n");
      stringBuilder.append("getConeInside:");
      stringBuilder.append(getConeInside());
      stringBuilder.append(", \n");
      stringBuilder.append("getConeOutside:");
      stringBuilder.append(getConeOutside());
      stringBuilder.append(", \n");
      stringBuilder.append("getConeOutsideVolume:");
      stringBuilder.append(getConeOutsideVolume());
      stringBuilder.append(", \n");
      stringBuilder.append("getConeOrientationX:");
      stringBuilder.append(getConeOrientationX());
      stringBuilder.append(", \n");
      stringBuilder.append("getConeOrientationY:");
      stringBuilder.append(getConeOrientationY());
      stringBuilder.append(", \n");
      stringBuilder.append("getConeOrientationZ:");
      stringBuilder.append(getConeOrientationZ());
      stringBuilder.append(", \n");
      stringBuilder.append("getVarName:");
      stringBuilder.append(getVarName());
      stringBuilder.append(", \n");
      stringBuilder.append("getInternalSoundName:");
      stringBuilder.append(getInternalSoundName());
      stringBuilder.append(", \n");
      stringBuilder.append("getSoundPath:");
      stringBuilder.append(getSoundPath());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown9:");
      stringBuilder.append(getUnknown9());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown10:");
      stringBuilder.append(getUnknown10());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown11:");
      stringBuilder.append(getUnknown11());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown12:");
      stringBuilder.append(getUnknown12());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown13:");
      stringBuilder.append(getUnknown13());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown14:");
      stringBuilder.append(getUnknown14());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown15:");
      stringBuilder.append(getUnknown15());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown16:");
      stringBuilder.append(getUnknown16());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown17:");
      stringBuilder.append(getUnknown17());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown18:");
      stringBuilder.append(getUnknown18());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getName() {
      return name;
    }

    public W3str getPath() {
      return path;
    }

    public W3str getEax() {
      return eax;
    }

    public Flags getFlags() {
      return flags;
    }

    public long getFadeInRate() {
      return fadeInRate;
    }

    public long getFadeOutRate() {
      return fadeOutRate;
    }

    public int getVolume() {
      return volume;
    }

    public float getPitch() {
      return pitch;
    }

    public float getPitchVariance() {
      return pitchVariance;
    }

    public int getPriority() {
      return priority;
    }

    public Channel getChannel() {
      return channel;
    }

    public float getMinDistance() {
      return minDistance;
    }

    public float getMaxDistance() {
      return maxDistance;
    }

    public float getCutoffDistance() {
      return cutoffDistance;
    }

    public float getConeInside() {
      return coneInside;
    }

    public float getConeOutside() {
      return coneOutside;
    }

    public int getConeOutsideVolume() {
      return coneOutsideVolume;
    }

    public float getConeOrientationX() {
      return coneOrientationX;
    }

    public float getConeOrientationY() {
      return coneOrientationY;
    }

    public float getConeOrientationZ() {
      return coneOrientationZ;
    }

    public W3str getVarName() {
      return varName;
    }

    public W3str getInternalSoundName() {
      return internalSoundName;
    }

    public W3str getSoundPath() {
      return soundPath;
    }

    public Integer getUnknown9() {
      return unknown9;
    }

    public W3str getUnknown10() {
      return unknown10;
    }

    public Integer getUnknown11() {
      return unknown11;
    }

    public W3str getUnknown12() {
      return unknown12;
    }

    public Integer getUnknown13() {
      return unknown13;
    }

    public W3str getUnknown14() {
      return unknown14;
    }

    public W3str getUnknown15() {
      return unknown15;
    }

    public W3str getUnknown16() {
      return unknown16;
    }

    public W3str getUnknown17() {
      return unknown17;
    }

    public Integer getUnknown18() {
      return unknown18;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setPath(W3str value) {
      this.path = value;
    }

    public void setEax(W3str value) {
      this.eax = value;
    }

    public void setFlags(Flags value) {
      this.flags = value;
    }

    public void setFadeInRate(long value) {
      this.fadeInRate = value;
    }

    public void setFadeOutRate(long value) {
      this.fadeOutRate = value;
    }

    public void setVolume(int value) {
      this.volume = value;
    }

    public void setPitch(float value) {
      this.pitch = value;
    }

    public void setPitchVariance(float value) {
      this.pitchVariance = value;
    }

    public void setPriority(int value) {
      this.priority = value;
    }

    public void setChannel(Channel value) {
      this.channel = value;
    }

    public void setMinDistance(float value) {
      this.minDistance = value;
    }

    public void setMaxDistance(float value) {
      this.maxDistance = value;
    }

    public void setCutoffDistance(float value) {
      this.cutoffDistance = value;
    }

    public void setConeInside(float value) {
      this.coneInside = value;
    }

    public void setConeOutside(float value) {
      this.coneOutside = value;
    }

    public void setConeOutsideVolume(int value) {
      this.coneOutsideVolume = value;
    }

    public void setConeOrientationX(float value) {
      this.coneOrientationX = value;
    }

    public void setConeOrientationY(float value) {
      this.coneOrientationY = value;
    }

    public void setConeOrientationZ(float value) {
      this.coneOrientationZ = value;
    }

    public void setVarName(W3str value) {
      this.varName = value;
    }

    public void setInternalSoundName(W3str value) {
      this.internalSoundName = value;
    }

    public void setSoundPath(W3str value) {
      this.soundPath = value;
    }

    public void setUnknown9(Integer value) {
      this.unknown9 = value;
    }

    public void setUnknown10(W3str value) {
      this.unknown10 = value;
    }

    public void setUnknown11(Integer value) {
      this.unknown11 = value;
    }

    public void setUnknown12(W3str value) {
      this.unknown12 = value;
    }

    public void setUnknown13(Integer value) {
      this.unknown13 = value;
    }

    public void setUnknown14(W3str value) {
      this.unknown14 = value;
    }

    public void setUnknown15(W3str value) {
      this.unknown15 = value;
    }

    public void setUnknown16(W3str value) {
      this.unknown16 = value;
    }

    public void setUnknown17(W3str value) {
      this.unknown17 = value;
    }

    public void setUnknown18(Integer value) {
      this.unknown18 = value;
    }
  }

  public enum Channel {
    DEFAULT(-1),

    GENERAL(0),

    UNIT_SELECTION(1),

    UNIT_ACKNOWLEDGEMENT(2),

    UNIT_MOVEMENT(3),

    UNIT_READY(4),

    COMBAT(5),

    ERROR(6),

    MUSIC(7),

    USER_INTERFACE(8),

    MOVEMENT_LOOPING(9),

    AMBIENT(10),

    ANIMATION(11),

    BUILDING(12),

    BIRTH(13),

    FIRE(14);

    private static final Map<Long, Channel> byId = new HashMap<>();

    static {
      for (Channel e : Channel.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    Channel(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public Channel byId(long id) {
      return byId.get(id);
    }
  }
}
