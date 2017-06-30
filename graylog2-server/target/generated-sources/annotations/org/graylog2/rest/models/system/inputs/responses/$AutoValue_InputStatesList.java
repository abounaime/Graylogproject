
package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputStatesList extends InputStatesList {

  private final Set<InputStateSummary> states;

  $AutoValue_InputStatesList(
      Set<InputStateSummary> states) {
    if (states == null) {
      throw new NullPointerException("Null states");
    }
    this.states = states;
  }

  @JsonProperty(value = "states")
  @Override
  public Set<InputStateSummary> states() {
    return states;
  }

  @Override
  public String toString() {
    return "InputStatesList{"
        + "states=" + states
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputStatesList) {
      InputStatesList that = (InputStatesList) o;
      return (this.states.equals(that.states()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.states.hashCode();
    return h;
  }

}
