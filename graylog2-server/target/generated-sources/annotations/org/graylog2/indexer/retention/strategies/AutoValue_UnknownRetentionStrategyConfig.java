package org.graylog2.indexer.retention.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_UnknownRetentionStrategyConfig extends $AutoValue_UnknownRetentionStrategyConfig {
  AutoValue_UnknownRetentionStrategyConfig(String type) {
    super(type);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }
}
