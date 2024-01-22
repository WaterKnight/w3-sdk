package w3.sound;

import w3.common.core.DataList;
import w3.common.core.DataTypeInfo;
import w3.common.core.FieldState;
import w3.common.core.Id;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3String;

public class AbilitySoundsState {
  public final FieldState<War3String> SoundName = new FieldState<>(Id.valueOf("snam"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> AnimationEventCode = new FieldState<>(Id.valueOf("saec"), War3String.class, War3String.valueOf(null));

  public final FieldState<DataList<War3String>> FileNames = new FieldState<>(Id.valueOf("sfil"), new DataTypeInfo(DataList.class, War3String.class), null);

  public final FieldState<War3Int> Volume = new FieldState<>(Id.valueOf("svol"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> VolumeVariance = new FieldState<>(Id.valueOf("svov"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> Pitch = new FieldState<>(Id.valueOf("spit"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> PitchVariance = new FieldState<>(Id.valueOf("spiv"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> MaximumConcurrentInstances = new FieldState<>(Id.valueOf("smci"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> Priority = new FieldState<>(Id.valueOf("spri"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> Channel = new FieldState<>(Id.valueOf("scha"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> Flags = new FieldState<>(Id.valueOf("sflg"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> MinDistance = new FieldState<>(Id.valueOf("smid"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> MaxDistance = new FieldState<>(Id.valueOf("smad"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DistanceCutoff = new FieldState<>(Id.valueOf("scut"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3String> EAXFlags = new FieldState<>(Id.valueOf("seax"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3Int> version = new FieldState<>(Id.valueOf("sver"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> RolloffPoints = new FieldState<>(Id.valueOf("srop"), War3Int.class, War3Int.valueOf(null));
}
