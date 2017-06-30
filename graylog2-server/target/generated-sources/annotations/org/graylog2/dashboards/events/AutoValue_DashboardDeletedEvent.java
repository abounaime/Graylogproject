package org.graylog2.dashboards.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_DashboardDeletedEvent extends $AutoValue_DashboardDeletedEvent {
  AutoValue_DashboardDeletedEvent(String dashboardId) {
    super(dashboardId);
  }

  @JsonIgnore
  public final String getDashboardId() {
    return dashboardId();
  }
}
