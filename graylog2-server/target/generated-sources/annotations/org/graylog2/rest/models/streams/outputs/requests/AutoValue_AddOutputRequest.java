package org.graylog2.rest.models.streams.outputs.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_AddOutputRequest extends $AutoValue_AddOutputRequest {
  AutoValue_AddOutputRequest(Set<String> outputs) {
    super(outputs);
  }

  @JsonIgnore
  public final Set<String> getOutputs() {
    return outputs();
  }
}
