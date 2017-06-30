package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_AddWidgetRequest extends $AutoValue_AddWidgetRequest {
  AutoValue_AddWidgetRequest(String description, String type, int cacheTime,
      Map<String, Object> config) {
    super(description, type, cacheTime, config);
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final int getCacheTime() {
    return cacheTime();
  }

  @JsonIgnore
  public final Map<String, Object> getConfig() {
    return config();
  }
}
