package w3.env.terrain.terrain.gen;

import w3.common.core.DataType;
import w3.common.core.FieldState;
import w3.common.core.Id;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3String;

public class W3TerrainState {
  public final FieldState<DataType> TILEID = new FieldState<>(Id.valueOf("ttid"), DataType.class, null);

  public final FieldState<War3Int> CLIFFSET = new FieldState<>(Id.valueOf("tcli"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3String> DIR = new FieldState<>(Id.valueOf("tdir"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> FILE = new FieldState<>(Id.valueOf("tfil"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> COMMENT = new FieldState<>(Id.valueOf("tcom"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> NAME = new FieldState<>(Id.valueOf("tnam"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3Int> BUILDABLE = new FieldState<>(Id.valueOf("tbui"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> FOOTPRINTS = new FieldState<>(Id.valueOf("tfoo"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> WALKABLE = new FieldState<>(Id.valueOf("twal"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> FLYABLE = new FieldState<>(Id.valueOf("tfly"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> BLIGHTPRI = new FieldState<>(Id.valueOf("tbli"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<DataType> CONVERTTO = new FieldState<>(Id.valueOf("tcon"), DataType.class, null);

  public final FieldState<War3Int> INBETA = new FieldState<>(Id.valueOf("tbet"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> VERSION = new FieldState<>(Id.valueOf("tver"), War3Int.class, War3Int.valueOf(null));
}
