
package org.graylog2.rest.models.dashboards.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateDashboardResponse extends CreateDashboardResponse {

  private final String dashboardId;

  $AutoValue_CreateDashboardResponse(
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
    return "CreateDashboardResponse{"
        + "dashboardId=" + dashboardId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateDashboardResponse) {
      CreateDashboardResponse that = (CreateDashboardResponse) o;
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
