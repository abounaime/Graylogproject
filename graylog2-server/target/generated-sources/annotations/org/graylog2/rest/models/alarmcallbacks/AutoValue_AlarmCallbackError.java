package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_AlarmCallbackError extends $AutoValue_AlarmCallbackError {
  AutoValue_AlarmCallbackError(String error) {
    super(error);
  }

  @JsonIgnore
  public final String getError() {
    return error();
  }
}
