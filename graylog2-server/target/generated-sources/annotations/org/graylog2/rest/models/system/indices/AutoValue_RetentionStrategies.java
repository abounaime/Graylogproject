package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

final class AutoValue_RetentionStrategies extends $AutoValue_RetentionStrategies {
  AutoValue_RetentionStrategies(int total, Set<RetentionStrategyDescription> strategies) {
    super(total, strategies);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final Set<RetentionStrategyDescription> getStrategies() {
    return strategies();
  }
}
