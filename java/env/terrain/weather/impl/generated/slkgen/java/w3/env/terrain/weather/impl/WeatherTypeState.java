package w3.env.terrain.weather.impl;

import w3.common.core.DataType;
import w3.common.core.FieldState;
import w3.common.core.Id;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3Real;
import w3.common.core.app.War3String;

public class WeatherTypeState {
  public final FieldState<War3String> NAME = new FieldState<>(Id.valueOf("wnam"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> TEXDIR = new FieldState<>(Id.valueOf("wtxd"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> TEXFILE = new FieldState<>(Id.valueOf("wtdf"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3Int> ALPHAMODE = new FieldState<>(Id.valueOf("talm"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> USEFOG = new FieldState<>(Id.valueOf("wfog"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Real> HEIGHT = new FieldState<>(Id.valueOf("whei"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> ANGX = new FieldState<>(Id.valueOf("wanx"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> ANGY = new FieldState<>(Id.valueOf("wany"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> EMRATE = new FieldState<>(Id.valueOf("wemc"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> LIFESPAN = new FieldState<>(Id.valueOf("wlif"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Int> PARTICLES = new FieldState<>(Id.valueOf("wpac"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Real> VELOC = new FieldState<>(Id.valueOf("wvel"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> ACCEL = new FieldState<>(Id.valueOf("wacc"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> VAR = new FieldState<>(Id.valueOf("wvar"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Int> TEXR = new FieldState<>(Id.valueOf("wtcr"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> TEXC = new FieldState<>(Id.valueOf("wtxc"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> HEAD = new FieldState<>(Id.valueOf("whea"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> TAIL = new FieldState<>(Id.valueOf("wtai"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Real> TAILLEN = new FieldState<>(Id.valueOf("wtle"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> LATI = new FieldState<>(Id.valueOf("wlat"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> LONG = new FieldState<>(Id.valueOf("wlon"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> MIDTIME = new FieldState<>(Id.valueOf("wtim"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> REDSTART = new FieldState<>(Id.valueOf("wcrs"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> GREENSTART = new FieldState<>(Id.valueOf("wcms"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> BLUESTART = new FieldState<>(Id.valueOf("wcbs"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> REDMID = new FieldState<>(Id.valueOf("wcrm"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> GREENMID = new FieldState<>(Id.valueOf("wcgm"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> BLUEMID = new FieldState<>(Id.valueOf("wcbm"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> REDEND = new FieldState<>(Id.valueOf("wcre"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> GREENEND = new FieldState<>(Id.valueOf("wcge"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> BLUEEND = new FieldState<>(Id.valueOf("wcbe"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Int> ALPHASTART = new FieldState<>(Id.valueOf("wcas"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> ALPHAMID = new FieldState<>(Id.valueOf("wcam"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> ALPHAEND = new FieldState<>(Id.valueOf("wcae"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Real> SCALESTART = new FieldState<>(Id.valueOf("wscs"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> SCALEMID = new FieldState<>(Id.valueOf("wscm"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> SCALEEND = new FieldState<>(Id.valueOf("wsce"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> HUVSTART = new FieldState<>(Id.valueOf("whus"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> HUVMID = new FieldState<>(Id.valueOf("whum"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> HUVEND = new FieldState<>(Id.valueOf("whue"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> TUVSTART = new FieldState<>(Id.valueOf("wtus"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> TUVMID = new FieldState<>(Id.valueOf("wtum"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> TUVEND = new FieldState<>(Id.valueOf("wtue"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<DataType> AMBIENTSOUND = new FieldState<>(Id.valueOf("wams"), DataType.class, null);

  public final FieldState<War3Int> VERSION = new FieldState<>(Id.valueOf("wver"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<DataType> MODELFILE = new FieldState<>(Id.valueOf("wmod"), DataType.class, null);
}
