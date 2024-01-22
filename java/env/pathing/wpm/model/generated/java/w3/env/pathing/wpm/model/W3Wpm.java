package w3.env.pathing.wpm.model;

import java.lang.Integer;
import java.util.ArrayList;

public class W3Wpm {
  private W3id fileId;

  private long version;

  private long width;

  private long height;

  private ArrayList<Integer> pathingNode;

  public W3id getFileId() {
    return fileId;
  }

  public long getVersion() {
    return version;
  }

  public long getWidth() {
    return width;
  }

  public long getHeight() {
    return height;
  }

  public ArrayList<Integer> getPathingNode() {
    return pathingNode;
  }

  public void setFileId(W3id value) {
    this.fileId = value;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setWidth(long value) {
    this.width = value;
  }

  public void setHeight(long value) {
    this.height = value;
  }

  public void setPathingNode(ArrayList<Integer> value) {
    this.pathingNode = value;
  }
}
