package org.graylog2.dashboards.widgets.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_WidgetUpdatedEvent extends $AutoValue_WidgetUpdatedEvent {
  AutoValue_WidgetUpdatedEvent(String widgetId) {
    super(widgetId);
  }

  @JsonIgnore
  public final String getWidgetId() {
    return widgetId();
  }
}
