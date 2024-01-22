package w3.env.terrain.terrain.gen;

import java.util.ArrayList;
import java.util.List;
import w3.common.core.Id;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3String;

public class W3Terrain {
  public final List<Object> objects = new ArrayList<>();

  public List<Object> getObjects() {
    return objects;
  }

  public static class Object {
    public Id tileID = null;

    public War3Int cliffSet = null;

    public War3String dir = null;

    public War3String file = null;

    public War3String comment = null;

    public War3String name = null;

    public War3Int buildable = null;

    public War3Int footprints = null;

    public War3Int walkable = null;

    public War3Int flyable = null;

    public War3Int blightPri = null;

    public List<Id> convertTo = java.util.Arrays.asList();

    public War3Int InBeta = null;

    public War3Int version = null;
  }
}
