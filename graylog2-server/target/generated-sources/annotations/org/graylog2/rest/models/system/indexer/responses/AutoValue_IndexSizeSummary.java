package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_IndexSizeSummary extends $AutoValue_IndexSizeSummary {
  AutoValue_IndexSizeSummary(long events, long deleted, long bytes) {
    super(events, deleted, bytes);
  }

  @JsonIgnore
  public final long getEvents() {
    return events();
  }

  @JsonIgnore
  public final long getDeleted() {
    return deleted();
  }

  @JsonIgnore
  public final long getBytes() {
    return bytes();
  }
}
