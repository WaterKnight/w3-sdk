package w3.replay.w3g.model;

import w3.replay.w3g.impl.kaitai.BlizzardDecompress;

public class kaitaiToDecompressMapper {
  public static Decompress map(BlizzardDecompress data) {
    if (data == null) {
      return null;
    }
    final Decompress newData = new Decompress();
    return newData;
  }
}
