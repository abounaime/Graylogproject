package org.graylog2.rest.models.system.indexer.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;

final class AutoValue_IndicesReadRequest extends $AutoValue_IndicesReadRequest {
  AutoValue_IndicesReadRequest(List<String> indices) {
    super(indices);
  }

  @JsonIgnore
  public final List<String> getIndices() {
    return indices();
  }
}
