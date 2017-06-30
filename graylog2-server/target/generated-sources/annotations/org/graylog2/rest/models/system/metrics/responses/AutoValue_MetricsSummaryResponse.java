package org.graylog2.rest.models.system.metrics.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;

final class AutoValue_MetricsSummaryResponse extends $AutoValue_MetricsSummaryResponse {
  AutoValue_MetricsSummaryResponse(int total, Collection metrics) {
    super(total, metrics);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final Collection getMetrics() {
    return metrics();
  }
}
