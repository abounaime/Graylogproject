package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_UpdateWidgetRequest extends $AutoValue_UpdateWidgetRequest {
  AutoValue_UpdateWidgetRequest(String description, int cacheTime) {
    super(description, cacheTime);
  }

  @JsonIgnore
  @Nullable
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final int getCacheTime() {
    return cacheTime();
  }
}
