package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_IndexRangesResponse extends $AutoValue_IndexRangesResponse {
  AutoValue_IndexRangesResponse(int total, List<IndexRangeSummary> ranges) {
    super(total, ranges);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<IndexRangeSummary> getRanges() {
    return ranges();
  }
}
