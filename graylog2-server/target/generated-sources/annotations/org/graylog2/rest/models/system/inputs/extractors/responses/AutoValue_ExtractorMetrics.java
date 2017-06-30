package org.graylog2.rest.models.system.inputs.extractors.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.graylog2.rest.models.metrics.responses.TimerRateMetricsResponse;

final class AutoValue_ExtractorMetrics extends $AutoValue_ExtractorMetrics {
  AutoValue_ExtractorMetrics(TimerRateMetricsResponse total, TimerRateMetricsResponse condition,
      TimerRateMetricsResponse execution, TimerRateMetricsResponse converters, long conditionHits,
      long conditionMisses) {
    super(total, condition, execution, converters, conditionHits, conditionMisses);
  }

  @JsonIgnore
  public final TimerRateMetricsResponse getTotal() {
    return total();
  }

  @JsonIgnore
  public final TimerRateMetricsResponse getCondition() {
    return condition();
  }

  @JsonIgnore
  public final TimerRateMetricsResponse getExecution() {
    return execution();
  }

  @JsonIgnore
  public final TimerRateMetricsResponse getConverters() {
    return converters();
  }

  @JsonIgnore
  public final long getConditionHits() {
    return conditionHits();
  }

  @JsonIgnore
  public final long getConditionMisses() {
    return conditionMisses();
  }
}
