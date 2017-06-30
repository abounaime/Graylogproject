package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_AllIndices extends $AutoValue_AllIndices {
  AutoValue_AllIndices(ClosedIndices closed, ClosedIndices reopened, OpenIndicesInfo all) {
    super(closed, reopened, all);
  }

  @JsonIgnore
  public final ClosedIndices getClosed() {
    return closed();
  }

  @JsonIgnore
  public final ClosedIndices getReopened() {
    return reopened();
  }

  @JsonIgnore
  public final OpenIndicesInfo getAll() {
    return all();
  }
}
