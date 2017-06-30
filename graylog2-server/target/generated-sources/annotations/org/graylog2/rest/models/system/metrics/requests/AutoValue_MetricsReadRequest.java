package org.graylog2.rest.models.system.metrics.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;

final class AutoValue_MetricsReadRequest extends $AutoValue_MetricsReadRequest {
  AutoValue_MetricsReadRequest(List<String> metrics) {
    super(metrics);
  }

  @JsonIgnore
  public final List<String> getMetrics() {
    return metrics();
  }
}
