
package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlarmCallbackListSummary extends AlarmCallbackListSummary {

  private final int total;
  private final List<AlarmCallbackSummary> alarmCallbacks;

  $AutoValue_AlarmCallbackListSummary(
      int total,
      List<AlarmCallbackSummary> alarmCallbacks) {
    this.total = total;
    if (alarmCallbacks == null) {
      throw new NullPointerException("Null alarmCallbacks");
    }
    this.alarmCallbacks = alarmCallbacks;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty(value = "alarmcallbacks")
  @Override
  public List<AlarmCallbackSummary> alarmCallbacks() {
    return alarmCallbacks;
  }

  @Override
  public String toString() {
    return "AlarmCallbackListSummary{"
        + "total=" + total + ", "
        + "alarmCallbacks=" + alarmCallbacks
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlarmCallbackListSummary) {
      AlarmCallbackListSummary that = (AlarmCallbackListSummary) o;
      return (this.total == that.total())
           && (this.alarmCallbacks.equals(that.alarmCallbacks()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.alarmCallbacks.hashCode();
    return h;
  }

}
