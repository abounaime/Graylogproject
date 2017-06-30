package org.graylog2.rest.models.system.inputs.extractors.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_ExtractorSummaryList extends $AutoValue_ExtractorSummaryList {
  AutoValue_ExtractorSummaryList(int total, List<ExtractorSummary> extractors) {
    super(total, extractors);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<ExtractorSummary> getExtractors() {
    return extractors();
  }
}
