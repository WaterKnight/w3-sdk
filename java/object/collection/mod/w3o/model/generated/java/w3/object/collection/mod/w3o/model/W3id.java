package w3.object.collection.mod.w3o.model;

import java.lang.String;
import w3.common.core.Id;

public class W3id extends Id {
  private String value;

  public W3id() {
    super();
  }

  public W3id(String value) {
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
