
package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputTypesSummary extends InputTypesSummary {

  private final Map<String, String> types;

  $AutoValue_InputTypesSummary(
      Map<String, String> types) {
    if (types == null) {
      throw new NullPointerException("Null types");
    }
    this.types = types;
  }

  @JsonProperty
  @Override
  public Map<String, String> types() {
    return types;
  }

  @Override
  public String toString() {
    return "InputTypesSummary{"
        + "types=" + types
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputTypesSummary) {
      InputTypesSummary that = (InputTypesSummary) o;
      return (this.types.equals(that.types()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.types.hashCode();
    return h;
  }

}
