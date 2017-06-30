package org.graylog2.indexer.esplugin;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_IndicesClosedEvent extends $AutoValue_IndicesClosedEvent {
  AutoValue_IndicesClosedEvent(Set<String> indices) {
    super(indices);
  }

  @JsonIgnore
  public final Set<String> getIndices() {
    return indices();
  }
}
