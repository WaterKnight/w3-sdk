package w3.script.gui.wct.model;

import java.lang.Long;
import java.lang.String;
import java.util.List;

public class W3Wct {
  private Version version;

  private String headComment;

  private Trigger headTrigger;

  private List<Trigger> trigger;

  public Version getVersion() {
    return version;
  }

  public String getHeadComment() {
    return headComment;
  }

  public Trigger getHeadTrigger() {
    return headTrigger;
  }

  public List<Trigger> getTrigger() {
    return trigger;
  }

  public void setVersion(Version value) {
    this.version = value;
  }

  public void setHeadComment(String value) {
    this.headComment = value;
  }

  public void setHeadTrigger(Trigger value) {
    this.headTrigger = value;
  }

  public void setTrigger(List<Trigger> value) {
    this.trigger = value;
  }

  public static class Version {
    private Long val;

    private long firstVersion;

    private Long secondVersion;

    public Long getVal() {
      return val;
    }

    public long getFirstVersion() {
      return firstVersion;
    }

    public Long getSecondVersion() {
      return secondVersion;
    }

    public void setVal(Long value) {
      this.val = value;
    }

    public void setFirstVersion(long value) {
      this.firstVersion = value;
    }

    public void setSecondVersion(Long value) {
      this.secondVersion = value;
    }
  }

  public static class Trigger {
    private long length;

    private String content;

    public long getLength() {
      return length;
    }

    public String getContent() {
      return content;
    }

    public void setLength(long value) {
      this.length = value;
    }

    public void setContent(String value) {
      this.content = value;
    }
  }
}
