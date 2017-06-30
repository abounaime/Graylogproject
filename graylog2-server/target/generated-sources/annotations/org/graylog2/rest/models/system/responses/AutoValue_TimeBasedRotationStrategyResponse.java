package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.joda.time.Period;

final class AutoValue_TimeBasedRotationStrategyResponse extends $AutoValue_TimeBasedRotationStrategyResponse {
  AutoValue_TimeBasedRotationStrategyResponse(String type, int maxNumberOfIndices,
      Period maxTimePerIndex) {
    super(type, maxNumberOfIndices, maxTimePerIndex);
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
  public final Period getMaxTimePerIndex() {
    return maxTimePerIndex();
  }
}
