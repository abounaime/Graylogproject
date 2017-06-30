package org.graylog2.rest.models.dashboards.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_CreateDashboardResponse extends $AutoValue_CreateDashboardResponse {
  AutoValue_CreateDashboardResponse(String dashboardId) {
    super(dashboardId);
  }

  @JsonIgnore
  public final String getDashboardId() {
    return dashboardId();
  }
}
