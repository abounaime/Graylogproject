package org.graylog2.rest.models.system.deflector.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_DeflectorSummary extends $AutoValue_DeflectorSummary {
  AutoValue_DeflectorSummary(boolean isUp, String currentTarget) {
    super(isUp, currentTarget);
  }

  @JsonIgnore
  public final boolean isIsUp() {
    return isUp();
  }

  @JsonIgnore
  @Nullable
  public final String getCurrentTarget() {
    return currentTarget();
  }
}
