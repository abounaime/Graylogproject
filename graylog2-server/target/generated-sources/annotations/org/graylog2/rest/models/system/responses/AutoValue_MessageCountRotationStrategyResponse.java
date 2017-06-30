package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_MessageCountRotationStrategyResponse extends $AutoValue_MessageCountRotationStrategyResponse {
  AutoValue_MessageCountRotationStrategyResponse(String type, int maxNumberOfIndices,
      int maxDocsPerIndex) {
    super(type, maxNumberOfIndices, maxDocsPerIndex);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final int getMaxNumberOfIndices() {
    return maxNumberOfIndices();
  }

  @JsonIgnore
  public final int getMaxDocsPerIndex() {
    return maxDocsPerIndex();
  }
}
