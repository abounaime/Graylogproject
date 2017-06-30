package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_IndexStats_DocsStats extends $AutoValue_IndexStats_DocsStats {
  AutoValue_IndexStats_DocsStats(long count, long deleted) {
    super(count, deleted);
  }

  @JsonIgnore
  public final long getCount() {
    return count();
  }

  @JsonIgnore
  public final long getDeleted() {
    return deleted();
  }
}
