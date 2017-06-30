package org.graylog2.indexer.indexset.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.graylog2.indexer.indexset.IndexSetConfig;

final class AutoValue_IndexSetCreatedEvent extends $AutoValue_IndexSetCreatedEvent {
  AutoValue_IndexSetCreatedEvent(IndexSetConfig indexSet) {
    super(indexSet);
  }

  @JsonIgnore
  public final IndexSetConfig getIndexSet() {
    return indexSet();
  }
}
