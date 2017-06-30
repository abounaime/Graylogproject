package org.graylog2.rest.models.system.inputs.extractors.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_ExtractorCreated extends $AutoValue_ExtractorCreated {
  AutoValue_ExtractorCreated(String extractorId) {
    super(extractorId);
  }

  @JsonIgnore
  public final String getExtractorId() {
    return extractorId();
  }
}
