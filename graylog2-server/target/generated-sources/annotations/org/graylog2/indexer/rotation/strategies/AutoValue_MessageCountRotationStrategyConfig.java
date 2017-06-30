package org.graylog2.indexer.rotation.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_MessageCountRotationStrategyConfig extends $AutoValue_MessageCountRotationStrategyConfig {
  AutoValue_MessageCountRotationStrategyConfig(String type, int maxDocsPerIndex) {
    super(type, maxDocsPerIndex);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final int getMaxDocsPerIndex() {
    return maxDocsPerIndex();
  }
}
