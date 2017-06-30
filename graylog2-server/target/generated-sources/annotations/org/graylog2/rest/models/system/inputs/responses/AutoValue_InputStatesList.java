package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

final class AutoValue_InputStatesList extends $AutoValue_InputStatesList {
  AutoValue_InputStatesList(Set<InputStateSummary> states) {
    super(states);
  }

  @JsonIgnore
  public final Set<InputStateSummary> getStates() {
    return states();
  }
}
