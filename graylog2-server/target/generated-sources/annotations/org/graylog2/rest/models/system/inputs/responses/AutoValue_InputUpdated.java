package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_InputUpdated extends $AutoValue_InputUpdated {
  AutoValue_InputUpdated(String id) {
    super(id);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }
}
