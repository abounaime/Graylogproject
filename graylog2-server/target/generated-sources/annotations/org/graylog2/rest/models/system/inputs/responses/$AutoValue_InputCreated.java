
package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputCreated extends InputCreated {

  private final String id;

  $AutoValue_InputCreated(
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
    return "InputCreated{"
        + "id=" + id
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputCreated) {
      InputCreated that = (InputCreated) o;
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
