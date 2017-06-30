package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_IndexStats_TimeAndTotalStats extends $AutoValue_IndexStats_TimeAndTotalStats {
  AutoValue_IndexStats_TimeAndTotalStats(long total, long timeSeconds) {
    super(total, timeSeconds);
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }

  @JsonIgnore
  public final long getTimeSeconds() {
    return timeSeconds();
  }
}
