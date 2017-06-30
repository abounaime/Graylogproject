package org.graylog2.rest.models.alarmcallbacks.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_CreateAlarmCallbackRequest extends $AutoValue_CreateAlarmCallbackRequest {
  AutoValue_CreateAlarmCallbackRequest(String type, String title,
      Map<String, Object> configuration) {
    super(type, title, configuration);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final Map<String, Object> getConfiguration() {
    return configuration();
  }
}
