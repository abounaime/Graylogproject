package org.graylog2.filters.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_FilterDescriptionUpdateEvent extends $AutoValue_FilterDescriptionUpdateEvent {
  AutoValue_FilterDescriptionUpdateEvent(String id) {
    super(id);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }
}
