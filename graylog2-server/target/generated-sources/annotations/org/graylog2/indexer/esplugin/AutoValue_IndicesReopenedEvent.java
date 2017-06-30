package org.graylog2.indexer.esplugin;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_IndicesReopenedEvent extends $AutoValue_IndicesReopenedEvent {
  AutoValue_IndicesReopenedEvent(Set<String> indices) {
    super(indices);
  }

  @JsonIgnore
  public final Set<String> getIndices() {
    return indices();
  }
}
