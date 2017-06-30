
package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_WidgetPositionsRequest extends WidgetPositionsRequest {

  private final List<WidgetPositionsRequest.WidgetPosition> positions;

  $AutoValue_WidgetPositionsRequest(
      List<WidgetPositionsRequest.WidgetPosition> positions) {
    if (positions == null) {
      throw new NullPointerException("Null positions");
    }
    this.positions = positions;
  }

  @JsonProperty
  @Override
  public List<WidgetPositionsRequest.WidgetPosition> positions() {
    return positions;
  }

  @Override
  public String toString() {
    return "WidgetPositionsRequest{"
        + "positions=" + positions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof WidgetPositionsRequest) {
      WidgetPositionsRequest that = (WidgetPositionsRequest) o;
      return (this.positions.equals(that.positions()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.positions.hashCode();
    return h;
  }

}
