package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_WidgetPositionsRequest extends $AutoValue_WidgetPositionsRequest {
  AutoValue_WidgetPositionsRequest(List<WidgetPositionsRequest.WidgetPosition> positions) {
    super(positions);
  }

  @JsonIgnore
  public final List<WidgetPositionsRequest.WidgetPosition> getPositions() {
    return positions();
  }
}
