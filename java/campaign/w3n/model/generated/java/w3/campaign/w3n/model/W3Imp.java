package w3.campaign.w3n.model;

import java.util.List;

public class W3Imp {
  private long version;

  private List<ImportObj> importObj;

  public long getVersion() {
    return version;
  }

  public List<ImportObj> getImportObj() {
    return importObj;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setImportObj(List<ImportObj> value) {
    this.importObj = value;
  }

  public static class ImportObj {
    private int flags;

    private W3str path;

    public int getFlags() {
      return flags;
    }

    public W3str getPath() {
      return path;
    }

    public void setFlags(int value) {
      this.flags = value;
    }

    public void setPath(W3str value) {
      this.path = value;
    }
  }
}
