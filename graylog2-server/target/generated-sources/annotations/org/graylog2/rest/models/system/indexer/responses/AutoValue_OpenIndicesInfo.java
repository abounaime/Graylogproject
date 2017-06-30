package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;

final class AutoValue_OpenIndicesInfo extends $AutoValue_OpenIndicesInfo {
  AutoValue_OpenIndicesInfo(Map<String, IndexInfo> indices) {
    super(indices);
  }

  @JsonIgnore
  public final Map<String, IndexInfo> getIndices() {
    return indices();
  }
}
