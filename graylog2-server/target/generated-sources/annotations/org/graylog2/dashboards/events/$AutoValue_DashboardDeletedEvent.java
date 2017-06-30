
package org.graylog2.dashboards.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DashboardDeletedEvent extends DashboardDeletedEvent {

  private final String dashboardId;

  $AutoValue_DashboardDeletedEvent(
      String dashboardId) {
    if (dashboardId == null) {
      throw new NullPointerException("Null dashboardId");
    }
    this.dashboardId = dashboardId;
  }

  @JsonProperty(value = "dashboard_id")
  @Override
  public String dashboardId() {
    return dashboardId;
  }

  @Override
  public String toString() {
    return "DashboardDeletedEvent{"
        + "dashboardId=" + dashboardId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DashboardDeletedEvent) {
      DashboardDeletedEvent that = (DashboardDeletedEvent) o;
      return (this.dashboardId.equals(that.dashboardId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.dashboardId.hashCode();
    return h;
  }

}
