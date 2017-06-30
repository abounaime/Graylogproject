package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_WidgetPositionsRequest_WidgetPosition extends $AutoValue_WidgetPositionsRequest_WidgetPosition {
  AutoValue_WidgetPositionsRequest_WidgetPosition(String id, int col, int row, int height,
      int width) {
    super(id, col, row, height, width);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final int getCol() {
    return col();
  }

  @JsonIgnore
  public final int getRow() {
    return row();
  }

  @JsonIgnore
  public final int getHeight() {
    return height();
  }

  @JsonIgnore
  public final int getWidth() {
    return width();
  }
}
