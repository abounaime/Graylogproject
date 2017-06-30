
package org.graylog2.rest.models.streams.alerts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlertListSummary extends AlertListSummary {

  private final long total;
  private final List<AlertSummary> alerts;

  $AutoValue_AlertListSummary(
      long total,
      List<AlertSummary> alerts) {
    this.total = total;
    if (alerts == null) {
      throw new NullPointerException("Null alerts");
    }
    this.alerts = alerts;
  }

  @JsonProperty(value = "total")
  @Override
  public long total() {
    return total;
  }

  @JsonProperty(value = "alerts")
  @Override
  public List<AlertSummary> alerts() {
    return alerts;
  }

  @Override
  public String toString() {
    return "AlertListSummary{"
        + "total=" + total + ", "
        + "alerts=" + alerts
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlertListSummary) {
      AlertListSummary that = (AlertListSummary) o;
      return (this.total == that.total())
           && (this.alerts.equals(that.alerts()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    h *= 1000003;
    h ^= this.alerts.hashCode();
    return h;
  }

}
