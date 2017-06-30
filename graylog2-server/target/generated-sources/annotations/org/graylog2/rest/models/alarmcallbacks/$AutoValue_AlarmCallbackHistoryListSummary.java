
package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlarmCallbackHistoryListSummary extends AlarmCallbackHistoryListSummary {

  private final int total;
  private final List<AlarmCallbackHistorySummary> histories;

  $AutoValue_AlarmCallbackHistoryListSummary(
      int total,
      List<AlarmCallbackHistorySummary> histories) {
    this.total = total;
    if (histories == null) {
      throw new NullPointerException("Null histories");
    }
    this.histories = histories;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty(value = "histories")
  @Override
  public List<AlarmCallbackHistorySummary> histories() {
    return histories;
  }

  @Override
  public String toString() {
    return "AlarmCallbackHistoryListSummary{"
        + "total=" + total + ", "
        + "histories=" + histories
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlarmCallbackHistoryListSummary) {
      AlarmCallbackHistoryListSummary that = (AlarmCallbackHistoryListSummary) o;
      return (this.total == that.total())
           && (this.histories.equals(that.histories()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.histories.hashCode();
    return h;
  }

}
