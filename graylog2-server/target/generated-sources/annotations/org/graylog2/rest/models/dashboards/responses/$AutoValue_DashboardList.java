
package org.graylog2.rest.models.dashboards.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DashboardList extends DashboardList {

  private final int total;
  private final List<Map<String, Object>> dashboards;

  $AutoValue_DashboardList(
      int total,
      List<Map<String, Object>> dashboards) {
    this.total = total;
    if (dashboards == null) {
      throw new NullPointerException("Null dashboards");
    }
    this.dashboards = dashboards;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public List<Map<String, Object>> dashboards() {
    return dashboards;
  }

  @Override
  public String toString() {
    return "DashboardList{"
        + "total=" + total + ", "
        + "dashboards=" + dashboards
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DashboardList) {
      DashboardList that = (DashboardList) o;
      return (this.total == that.total())
           && (this.dashboards.equals(that.dashboards()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.dashboards.hashCode();
    return h;
  }

}
