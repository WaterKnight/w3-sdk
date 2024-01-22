package w3.env.terrain.cliff_types.impl;

import w3.common.core.DataType;
import w3.common.core.FieldState;
import w3.common.core.Id;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3String;

public class CliffTypeState {
  public final FieldState<DataType> CLIFFID = new FieldState<>(Id.valueOf("ccid"), DataType.class, null);

  public final FieldState<War3String> CLIFFMODELDIR = new FieldState<>(Id.valueOf("cmod"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> RAMPMODELDIR = new FieldState<>(Id.valueOf("cram"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> TEXDIR = new FieldState<>(Id.valueOf("ctxd"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> TEXFILE = new FieldState<>(Id.valueOf("ctxf"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> NAME = new FieldState<>(Id.valueOf("cnam"), War3String.class, War3String.valueOf(null));

  public final FieldState<DataType> GROUNDTILE = new FieldState<>(Id.valueOf("cgrt"), DataType.class, null);

  public final FieldState<DataType> UPPERTILE = new FieldState<>(Id.valueOf("cupt"), DataType.class, null);

  public final FieldState<War3String> CLIFFCLASS = new FieldState<>(Id.valueOf("ccla"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3Int> OLDID = new FieldState<>(Id.valueOf("coid"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> VERSION = new FieldState<>(Id.valueOf("cver"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> INBETA = new FieldState<>(Id.valueOf("cbet"), War3Int.class, War3Int.valueOf(null));
}
