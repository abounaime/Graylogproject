
package org.graylog2.rest.models.system;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DisplayGettingStarted extends DisplayGettingStarted {

  private final boolean show;

  $AutoValue_DisplayGettingStarted(
      boolean show) {
    this.show = show;
  }

  @JsonProperty(value = "show")
  @Override
  public boolean show() {
    return show;
  }

  @Override
  public String toString() {
    return "DisplayGettingStarted{"
        + "show=" + show
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DisplayGettingStarted) {
      DisplayGettingStarted that = (DisplayGettingStarted) o;
      return (this.show == that.show());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.show ? 1231 : 1237;
    return h;
  }

}
