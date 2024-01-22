package w3.env.terrain.water.impl;

import w3.common.core.DataType;
import w3.common.core.FieldState;
import w3.common.core.Id;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3Real;
import w3.common.core.app.War3String;

public class WaterTypeState {
  public final FieldState<DataType> WATERID = new FieldState<>(Id.valueOf("xwid"), DataType.class, null);

  public final FieldState<War3Real> HEIGHT = new FieldState<>(Id.valueOf("xhei"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Int> IMPASSABLE = new FieldState<>(Id.valueOf("ximp"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3String> TEXFILE = new FieldState<>(Id.valueOf("xfil"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3Int> MMALPHA = new FieldState<>(Id.valueOf("xmma"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> MMRED = new FieldState<>(Id.valueOf("xmmr"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> MMGREEN = new FieldState<>(Id.valueOf("xmmg"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> MMBLUE = new FieldState<>(Id.valueOf("xmmb"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> NUMTEX = new FieldState<>(Id.valueOf("xtxn"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Real> TEXRATE = new FieldState<>(Id.valueOf("xtxr"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> TEXOFFSET = new FieldState<>(Id.valueOf("xtxo"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Int> ALPHAMODE = new FieldState<>(Id.valueOf("xalm"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> LIGHTING = new FieldState<>(Id.valueOf("xlig"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> CELLS = new FieldState<>(Id.valueOf("xcel"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Real> MINX = new FieldState<>(Id.valueOf("xmix"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> MINY = new FieldState<>(Id.valueOf("xmiy"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> MINZ = new FieldState<>(Id.valueOf("xmiz"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> MAXX = new FieldState<>(Id.valueOf("xmax"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> MAXY = new FieldState<>(Id.valueOf("xmay"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> MAXZ = new FieldState<>(Id.valueOf("xmaz"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> RATEX = new FieldState<>(Id.valueOf("xrax"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> RATEY = new FieldState<>(Id.valueOf("xray"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> RATEZ = new FieldState<>(Id.valueOf("xraz"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> REVX = new FieldState<>(Id.valueOf("xrex"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Real> REVY = new FieldState<>(Id.valueOf("xrey"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Int> SHOREINFOG = new FieldState<>(Id.valueOf("xsho"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3String> SHOREDIR = new FieldState<>(Id.valueOf("xshd"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3String> SHORESFILE = new FieldState<>(Id.valueOf("xssf"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3Real> SHORESVAR = new FieldState<>(Id.valueOf("xssv"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3String> SHOREOCFILE = new FieldState<>(Id.valueOf("xsof"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3Real> SHOREOCVAR = new FieldState<>(Id.valueOf("xsov"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3String> SHOREICFILE = new FieldState<>(Id.valueOf("xsif"), War3String.class, War3String.valueOf(null));

  public final FieldState<War3Real> SHOREICVAR = new FieldState<>(Id.valueOf("xsiv"), War3Real.class, War3Real.valueOf(null));

  public final FieldState<War3Int> SMIN_A = new FieldState<>(Id.valueOf("xsna"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> SMIN_R = new FieldState<>(Id.valueOf("xsnr"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> SMIN_G = new FieldState<>(Id.valueOf("xsng"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> SMIN_B = new FieldState<>(Id.valueOf("xsnb"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> SMAX_A = new FieldState<>(Id.valueOf("xsxa"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> SMAX_R = new FieldState<>(Id.valueOf("xsxr"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> SMAX_G = new FieldState<>(Id.valueOf("xsxg"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> SMAX_B = new FieldState<>(Id.valueOf("xsxb"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DMIN_A = new FieldState<>(Id.valueOf("xdna"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DMIN_R = new FieldState<>(Id.valueOf("xdnr"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DMIN_G = new FieldState<>(Id.valueOf("xdng"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DMIN_B = new FieldState<>(Id.valueOf("xdnb"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DMAX_A = new FieldState<>(Id.valueOf("xdxa"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DMAX_R = new FieldState<>(Id.valueOf("xdxr"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DMAX_G = new FieldState<>(Id.valueOf("xdxg"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> DMAX_B = new FieldState<>(Id.valueOf("xdxb"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> VERSION = new FieldState<>(Id.valueOf("xver"), War3Int.class, War3Int.valueOf(null));

  public final FieldState<War3Int> INBETA = new FieldState<>(Id.valueOf("xbet"), War3Int.class, War3Int.valueOf(null));
}
