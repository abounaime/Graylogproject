package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_IndexerClusterOverview extends $AutoValue_IndexerClusterOverview {
  AutoValue_IndexerClusterOverview(ClusterHealth health, String name) {
    super(health, name);
  }

  @JsonIgnore
  public final ClusterHealth getHealth() {
    return health();
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }
}
