package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_ClosedIndices extends $AutoValue_ClosedIndices {
  AutoValue_ClosedIndices(Set<String> indices, int total) {
    super(indices, total);
  }

  @JsonIgnore
  public final Set<String> getIndices() {
    return indices();
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }
}
