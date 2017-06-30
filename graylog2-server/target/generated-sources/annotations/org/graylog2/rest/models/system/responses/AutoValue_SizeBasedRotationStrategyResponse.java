package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SizeBasedRotationStrategyResponse extends $AutoValue_SizeBasedRotationStrategyResponse {
  AutoValue_SizeBasedRotationStrategyResponse(String type, int maxNumberOfIndices,
      long maxSizePerIndex) {
    super(type, maxNumberOfIndices, maxSizePerIndex);
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
  public final long getMaxSizePerIndex() {
    return maxSizePerIndex();
  }
}
