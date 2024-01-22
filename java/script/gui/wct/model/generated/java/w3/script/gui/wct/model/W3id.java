package w3.script.gui.wct.model;

import java.lang.String;
import w3.common.core.Id;

public class W3id extends Id {
  private String value;

  public W3id() {
    super();
  }

  public W3id(String val) {
    super(val);
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
