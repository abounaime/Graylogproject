package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_ClusterHealth extends $AutoValue_ClusterHealth {
  AutoValue_ClusterHealth(String status, ClusterHealth.ShardStatus shards) {
    super(status, shards);
  }

  @JsonIgnore
  public final String getStatus() {
    return status();
  }

  @JsonIgnore
  public final ClusterHealth.ShardStatus getShards() {
    return shards();
  }
}
