
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexStats_TimeAndTotalStats extends IndexStats.TimeAndTotalStats {

  private final long total;
  private final long timeSeconds;

  $AutoValue_IndexStats_TimeAndTotalStats(
      long total,
      long timeSeconds) {
    this.total = total;
    this.timeSeconds = timeSeconds;
  }

  @JsonProperty(value = "total")
  @Override
  public long total() {
    return total;
  }

  @JsonProperty(value = "time_seconds")
  @Override
  public long timeSeconds() {
    return timeSeconds;
  }

  @Override
  public String toString() {
    return "TimeAndTotalStats{"
        + "total=" + total + ", "
        + "timeSeconds=" + timeSeconds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexStats.TimeAndTotalStats) {
      IndexStats.TimeAndTotalStats that = (IndexStats.TimeAndTotalStats) o;
      return (this.total == that.total())
           && (this.timeSeconds == that.timeSeconds());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.total >>> 32) ^ this.total;
    h *= 1000003;
    h ^= (this.timeSeconds >>> 32) ^ this.timeSeconds;
    return h;
  }

}
