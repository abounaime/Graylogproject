
package org.graylog2.rest.models.system.metrics.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MetricsReadRequest extends MetricsReadRequest {

  private final List<String> metrics;

  $AutoValue_MetricsReadRequest(
      List<String> metrics) {
    if (metrics == null) {
      throw new NullPointerException("Null metrics");
    }
    this.metrics = metrics;
  }

  @JsonProperty
  @Override
  public List<String> metrics() {
    return metrics;
  }

  @Override
  public String toString() {
    return "MetricsReadRequest{"
        + "metrics=" + metrics
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MetricsReadRequest) {
      MetricsReadRequest that = (MetricsReadRequest) o;
      return (this.metrics.equals(that.metrics()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.metrics.hashCode();
    return h;
  }

}
