package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

final class AutoValue_InputsList extends $AutoValue_InputsList {
  AutoValue_InputsList(Set<InputSummary> inputs, int total) {
    super(inputs, total);
  }

  @JsonIgnore
  public final Set<InputSummary> getInputs() {
    return inputs();
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }
}
