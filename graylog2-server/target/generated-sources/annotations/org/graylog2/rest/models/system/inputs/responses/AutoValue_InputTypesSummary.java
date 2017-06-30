package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;

final class AutoValue_InputTypesSummary extends $AutoValue_InputTypesSummary {
  AutoValue_InputTypesSummary(Map<String, String> types) {
    super(types);
  }

  @JsonIgnore
  public final Map<String, String> getTypes() {
    return types();
  }
}
