package org.graylog2.indexer.rotation.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SizeBasedRotationStrategyConfig extends $AutoValue_SizeBasedRotationStrategyConfig {
  AutoValue_SizeBasedRotationStrategyConfig(String type, long maxSize) {
    super(type, maxSize);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final long getMaxSize() {
    return maxSize();
  }
}
