package w3.save.w3v.model;

import java.lang.String;
import w3.common.core.app.War3String;

public class W3str extends War3String {
  private String value;

  public W3str() {
    super();
  }

  public W3str(String value) {
    super(value);
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
