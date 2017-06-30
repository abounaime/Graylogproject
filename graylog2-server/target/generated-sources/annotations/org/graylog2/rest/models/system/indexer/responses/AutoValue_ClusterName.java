package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_ClusterName extends $AutoValue_ClusterName {
  AutoValue_ClusterName(String name) {
    super(name);
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }
}
