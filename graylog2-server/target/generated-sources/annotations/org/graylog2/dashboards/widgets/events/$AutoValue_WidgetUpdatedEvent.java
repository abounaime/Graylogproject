
package org.graylog2.dashboards.widgets.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_WidgetUpdatedEvent extends WidgetUpdatedEvent {

  private final String widgetId;

  $AutoValue_WidgetUpdatedEvent(
      String widgetId) {
    if (widgetId == null) {
      throw new NullPointerException("Null widgetId");
    }
    this.widgetId = widgetId;
  }

  @JsonProperty(value = "widget_id")
  @Override
  public String widgetId() {
    return widgetId;
  }

  @Override
  public String toString() {
    return "WidgetUpdatedEvent{"
        + "widgetId=" + widgetId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof WidgetUpdatedEvent) {
      WidgetUpdatedEvent that = (WidgetUpdatedEvent) o;
      return (this.widgetId.equals(that.widgetId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.widgetId.hashCode();
    return h;
  }

}
