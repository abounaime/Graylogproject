
package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputsList extends InputsList {

  private final Set<InputSummary> inputs;
  private final int total;

  $AutoValue_InputsList(
      Set<InputSummary> inputs,
      int total) {
    if (inputs == null) {
      throw new NullPointerException("Null inputs");
    }
    this.inputs = inputs;
    this.total = total;
  }

  @JsonProperty
  @Override
  public Set<InputSummary> inputs() {
    return inputs;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @Override
  public String toString() {
    return "InputsList{"
        + "inputs=" + inputs + ", "
        + "total=" + total
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputsList) {
      InputsList that = (InputsList) o;
      return (this.inputs.equals(that.inputs()))
           && (this.total == that.total());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.inputs.hashCode();
    h *= 1000003;
    h ^= this.total;
    return h;
  }

}
