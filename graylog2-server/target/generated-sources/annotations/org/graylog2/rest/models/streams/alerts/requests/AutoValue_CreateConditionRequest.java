package org.graylog2.rest.models.streams.alerts.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

final class AutoValue_CreateConditionRequest extends $AutoValue_CreateConditionRequest {
  AutoValue_CreateConditionRequest(String type, String title, Map<String, Object> parameters) {
    super(type, title, parameters);
  }

  @JsonIgnore
  @Nullable
  public final String getType() {
    return type();
  }

  @JsonIgnore
  @Nullable
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final Map<String, Object> getParameters() {
    return parameters();
  }
}
