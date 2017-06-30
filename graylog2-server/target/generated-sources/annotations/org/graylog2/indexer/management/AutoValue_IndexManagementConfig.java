package org.graylog2.indexer.management;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_IndexManagementConfig extends $AutoValue_IndexManagementConfig {
  AutoValue_IndexManagementConfig(String rotationStrategy, String retentionStrategy) {
    super(rotationStrategy, retentionStrategy);
  }

  @JsonIgnore
  public final String getRotationStrategy() {
    return rotationStrategy();
  }

  @JsonIgnore
  public final String getRetentionStrategy() {
    return retentionStrategy();
  }
}
