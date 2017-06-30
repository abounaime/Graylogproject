package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_FailureCount extends $AutoValue_FailureCount {
  AutoValue_FailureCount(long count) {
    super(count);
  }

  @JsonIgnore
  public final long getCount() {
    return count();
  }
}
