package org.graylog2.rest.models.system.metrics.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_MetricNamesResponse extends $AutoValue_MetricNamesResponse {
  AutoValue_MetricNamesResponse(Set<String> names) {
    super(names);
  }

  @JsonIgnore
  public final Set<String> getNames() {
    return names();
  }
}
