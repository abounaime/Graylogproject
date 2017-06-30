package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.graylog2.plugin.indexer.retention.RetentionStrategyConfig;

final class AutoValue_RetentionStrategySummary extends $AutoValue_RetentionStrategySummary {
  AutoValue_RetentionStrategySummary(String strategy, RetentionStrategyConfig config) {
    super(strategy, config);
  }

  @JsonIgnore
  public final String getStrategy() {
    return strategy();
  }

  @JsonIgnore
  public final RetentionStrategyConfig getConfig() {
    return config();
  }
}
