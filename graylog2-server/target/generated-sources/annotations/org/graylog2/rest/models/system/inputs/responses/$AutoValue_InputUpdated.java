
package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputUpdated extends InputUpdated {

  private final String id;

  $AutoValue_InputUpdated(
      String id) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
  }

  @JsonProperty
  @Override
  public String id() {
    return id;
  }

  @Override
  public String toString() {
    return "InputUpdated{"
        + "id=" + id
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputUpdated) {
      InputUpdated that = (InputUpdated) o;
      return (this.id.equals(that.id()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    return h;
  }

}
