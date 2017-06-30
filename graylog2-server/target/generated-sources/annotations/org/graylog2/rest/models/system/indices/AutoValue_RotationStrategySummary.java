package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.graylog2.plugin.indexer.rotation.RotationStrategyConfig;

final class AutoValue_RotationStrategySummary extends $AutoValue_RotationStrategySummary {
  AutoValue_RotationStrategySummary(String strategy, RotationStrategyConfig config) {
    super(strategy, config);
  }

  @JsonIgnore
  public final String getStrategy() {
    return strategy();
  }

  @JsonIgnore
  public final RotationStrategyConfig getConfig() {
    return config();
  }
}
