package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.joda.time.DateTime;

final class AutoValue_TimeRange extends $AutoValue_TimeRange {
  AutoValue_TimeRange(DateTime from, DateTime to) {
    super(from, to);
  }

  @JsonIgnore
  public final DateTime getFrom() {
    return from();
  }

  @JsonIgnore
  public final DateTime getTo() {
    return to();
  }
}
