package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_UpdateDashboardRequest extends $AutoValue_UpdateDashboardRequest {
  AutoValue_UpdateDashboardRequest(String title, String description) {
    super(title, description);
  }

  @JsonIgnore
  @Nullable
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  @Nullable
  public final String getDescription() {
    return description();
  }
}
