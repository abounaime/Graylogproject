
package org.graylog2.rest.models.system.inputs.extractors.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.graylog2.rest.models.metrics.responses.TimerRateMetricsResponse;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ExtractorMetrics extends ExtractorMetrics {

  private final TimerRateMetricsResponse total;
  private final TimerRateMetricsResponse condition;
  private final TimerRateMetricsResponse execution;
  private final TimerRateMetricsResponse converters;
  private final long conditionHits;
  private final long conditionMisses;

  $AutoValue_ExtractorMetrics(
      TimerRateMetricsResponse total,
      TimerRateMetricsResponse condition,
      TimerRateMetricsResponse execution,
      TimerRateMetricsResponse converters,
      long conditionHits,
      long conditionMisses) {
    if (total == null) {
      throw new NullPointerException("Null total");
    }
    this.total = total;
    if (condition == null) {
      throw new NullPointerException("Null condition");
    }
    this.condition = condition;
    if (execution == null) {
      throw new NullPointerException("Null execution");
    }
    this.execution = execution;
    if (converters == null) {
      throw new NullPointerException("Null converters");
    }
    this.converters = converters;
    this.conditionHits = conditionHits;
    this.conditionMisses = conditionMisses;
  }

  @JsonProperty
  @Override
  public TimerRateMetricsResponse total() {
    return total;
  }

  @JsonProperty
  @Override
  public TimerRateMetricsResponse condition() {
    return condition;
  }

  @JsonProperty
  @Override
  public TimerRateMetricsResponse execution() {
    return execution;
  }

  @JsonProperty
  @Override
  public TimerRateMetricsResponse converters() {
    return converters;
  }

  @JsonProperty
  @Override
  public long conditionHits() {
    return conditionHits;
  }

  @JsonProperty
  @Override
  public long conditionMisses() {
    return conditionMisses;
  }

  @Override
  public String toString() {
    return "ExtractorMetrics{"
        + "total=" + total + ", "
        + "condition=" + condition + ", "
        + "execution=" + execution + ", "
        + "converters=" + converters + ", "
        + "conditionHits=" + conditionHits + ", "
        + "conditionMisses=" + conditionMisses
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExtractorMetrics) {
      ExtractorMetrics that = (ExtractorMetrics) o;
      return (this.total.equals(that.total()))
           && (this.condition.equals(that.condition()))
           && (this.execution.equals(that.execution()))
           && (this.converters.equals(that.converters()))
           && (this.conditionHits == that.conditionHits())
           && (this.conditionMisses == that.conditionMisses());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total.hashCode();
    h *= 1000003;
    h ^= this.condition.hashCode();
    h *= 1000003;
    h ^= this.execution.hashCode();
    h *= 1000003;
    h ^= this.converters.hashCode();
    h *= 1000003;
    h ^= (this.conditionHits >>> 32) ^ this.conditionHits;
    h *= 1000003;
    h ^= (this.conditionMisses >>> 32) ^ this.conditionMisses;
    return h;
  }

}
