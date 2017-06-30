
package org.graylog2.rest.models.system.metrics.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MetricsSummaryResponse extends MetricsSummaryResponse {

  private final int total;
  private final Collection metrics;

  $AutoValue_MetricsSummaryResponse(
      int total,
      Collection metrics) {
    this.total = total;
    if (metrics == null) {
      throw new NullPointerException("Null metrics");
    }
    this.metrics = metrics;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public Collection metrics() {
    return metrics;
  }

  @Override
  public String toString() {
    return "MetricsSummaryResponse{"
        + "total=" + total + ", "
        + "metrics=" + metrics
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MetricsSummaryResponse) {
      MetricsSummaryResponse that = (MetricsSummaryResponse) o;
      return (this.total == that.total())
           && (this.metrics.equals(that.metrics()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.metrics.hashCode();
    return h;
  }

}
