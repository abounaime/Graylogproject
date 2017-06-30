package org.graylog2.rest.models.count.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_MessageCountResponse extends $AutoValue_MessageCountResponse {
  AutoValue_MessageCountResponse(long events) {
    super(events);
  }

  @JsonIgnore
  public final long getEvents() {
    return events();
  }
}
