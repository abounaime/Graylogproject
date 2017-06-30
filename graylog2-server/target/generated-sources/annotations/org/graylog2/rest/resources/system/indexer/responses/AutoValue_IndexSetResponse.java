package org.graylog2.rest.resources.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import java.util.Map;

final class AutoValue_IndexSetResponse extends $AutoValue_IndexSetResponse {
  AutoValue_IndexSetResponse(int total, List<IndexSetSummary> indexSets,
      Map<String, IndexSetStats> stats) {
    super(total, indexSets, stats);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<IndexSetSummary> getIndexSets() {
    return indexSets();
  }

  @JsonIgnore
  public final Map<String, IndexSetStats> getStats() {
    return stats();
  }
}
