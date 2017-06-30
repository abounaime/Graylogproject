package org.graylog2.rest.models.streams.alerts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_AlertListSummary extends $AutoValue_AlertListSummary {
  AutoValue_AlertListSummary(long total, List<AlertSummary> alerts) {
    super(total, alerts);
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<AlertSummary> getAlerts() {
    return alerts();
  }
}
