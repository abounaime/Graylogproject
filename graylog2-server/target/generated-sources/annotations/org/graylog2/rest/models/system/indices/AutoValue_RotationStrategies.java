package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

final class AutoValue_RotationStrategies extends $AutoValue_RotationStrategies {
  AutoValue_RotationStrategies(int total, Set<RotationStrategyDescription> strategies) {
    super(total, strategies);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final Set<RotationStrategyDescription> getStrategies() {
    return strategies();
  }
}
