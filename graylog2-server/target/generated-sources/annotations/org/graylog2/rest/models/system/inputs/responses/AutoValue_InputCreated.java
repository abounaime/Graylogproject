package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_InputCreated extends $AutoValue_InputCreated {
  AutoValue_InputCreated(String id) {
    super(id);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }
}
