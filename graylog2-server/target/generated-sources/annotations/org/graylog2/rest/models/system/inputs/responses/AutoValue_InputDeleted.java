package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_InputDeleted extends $AutoValue_InputDeleted {
  AutoValue_InputDeleted(String id) {
    super(id);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }
}
