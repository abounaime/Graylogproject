package org.graylog2.rest.models.dashboards.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_WidgetSummary extends $AutoValue_WidgetSummary {
  AutoValue_WidgetSummary(String id, String description, String type, int cacheTime,
      String creatorUserId, Map<String, Object> config) {
    super(id, description, type, cacheTime, creatorUserId, config);
  }

  @JsonIgnore
  public final String getId() {
    return id();
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
  public final String getCreatorUserId() {
    return creatorUserId();
  }

  @JsonIgnore
  public final Map<String, Object> getConfig() {
    return config();
  }
}
