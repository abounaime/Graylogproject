package org.graylog2.indexer.esplugin;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_IndicesDeletedEvent extends $AutoValue_IndicesDeletedEvent {
  AutoValue_IndicesDeletedEvent(Set<String> indices) {
    super(indices);
  }

  @JsonIgnore
  public final Set<String> getIndices() {
    return indices();
  }
}
