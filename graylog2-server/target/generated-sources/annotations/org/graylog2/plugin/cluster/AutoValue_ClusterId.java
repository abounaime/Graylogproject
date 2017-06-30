package org.graylog2.plugin.cluster;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_ClusterId extends $AutoValue_ClusterId {
  AutoValue_ClusterId(String clusterId) {
    super(clusterId);
  }

  @JsonIgnore
  public final String getClusterId() {
    return clusterId();
  }
}
