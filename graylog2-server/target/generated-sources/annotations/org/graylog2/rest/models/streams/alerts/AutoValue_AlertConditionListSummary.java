package org.graylog2.rest.models.streams.alerts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_AlertConditionListSummary extends $AutoValue_AlertConditionListSummary {
  AutoValue_AlertConditionListSummary(long total, List<AlertConditionSummary> conditions) {
    super(total, conditions);
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<AlertConditionSummary> getConditions() {
    return conditions();
  }
}
