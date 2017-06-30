
package org.graylog2.system.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlarmStats extends AlarmStats {

  private final long alertCount;
  private final Map<String, Long> alarmcallbackCountByType;

  $AutoValue_AlarmStats(
      long alertCount,
      Map<String, Long> alarmcallbackCountByType) {
    this.alertCount = alertCount;
    if (alarmcallbackCountByType == null) {
      throw new NullPointerException("Null alarmcallbackCountByType");
    }
    this.alarmcallbackCountByType = alarmcallbackCountByType;
  }

  @JsonProperty
  @Override
  public long alertCount() {
    return alertCount;
  }

  @JsonProperty
  @Override
  public Map<String, Long> alarmcallbackCountByType() {
    return alarmcallbackCountByType;
  }

  @Override
  public String toString() {
    return "AlarmStats{"
        + "alertCount=" + alertCount + ", "
        + "alarmcallbackCountByType=" + alarmcallbackCountByType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlarmStats) {
      AlarmStats that = (AlarmStats) o;
      return (this.alertCount == that.alertCount())
           && (this.alarmcallbackCountByType.equals(that.alarmcallbackCountByType()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.alertCount >>> 32) ^ this.alertCount;
    h *= 1000003;
    h ^= this.alarmcallbackCountByType.hashCode();
    return h;
  }

}
