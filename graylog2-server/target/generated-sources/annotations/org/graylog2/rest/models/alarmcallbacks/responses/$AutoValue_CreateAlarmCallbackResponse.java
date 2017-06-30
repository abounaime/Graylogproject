
package org.graylog2.rest.models.alarmcallbacks.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateAlarmCallbackResponse extends CreateAlarmCallbackResponse {

  private final String alarmCallbackId;

  $AutoValue_CreateAlarmCallbackResponse(
      String alarmCallbackId) {
    if (alarmCallbackId == null) {
      throw new NullPointerException("Null alarmCallbackId");
    }
    this.alarmCallbackId = alarmCallbackId;
  }

  @JsonProperty(value = "alarmcallback_id")
  @Override
  public String alarmCallbackId() {
    return alarmCallbackId;
  }

  @Override
  public String toString() {
    return "CreateAlarmCallbackResponse{"
        + "alarmCallbackId=" + alarmCallbackId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateAlarmCallbackResponse) {
      CreateAlarmCallbackResponse that = (CreateAlarmCallbackResponse) o;
      return (this.alarmCallbackId.equals(that.alarmCallbackId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.alarmCallbackId.hashCode();
    return h;
  }

}
