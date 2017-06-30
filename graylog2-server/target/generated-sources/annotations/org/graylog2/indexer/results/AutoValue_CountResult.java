package org.graylog2.indexer.results;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_CountResult extends $AutoValue_CountResult {
  AutoValue_CountResult(long count, long tookMs) {
    super(count, tookMs);
  }

  @JsonIgnore
  public final long getCount() {
    return count();
  }

  @JsonIgnore
  public final long getTookMs() {
    return tookMs();
  }
}
