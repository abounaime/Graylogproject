package org.graylog2.rest.models.dashboards.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

final class AutoValue_DashboardList extends $AutoValue_DashboardList {
  AutoValue_DashboardList(int total, List<Map<String, Object>> dashboards) {
    super(total, dashboards);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<Map<String, Object>> getDashboards() {
    return dashboards();
  }
}
