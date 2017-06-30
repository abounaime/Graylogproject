package org.graylog2.rest.models.alarmcallbacks.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_CreateAlarmCallbackResponse extends $AutoValue_CreateAlarmCallbackResponse {
  AutoValue_CreateAlarmCallbackResponse(String alarmCallbackId) {
    super(alarmCallbackId);
  }

  @JsonIgnore
  public final String getAlarmCallbackId() {
    return alarmCallbackId();
  }
}
