package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_ClusterHealth_ShardStatus extends $AutoValue_ClusterHealth_ShardStatus {
  AutoValue_ClusterHealth_ShardStatus(int active, int initializing, int relocating,
      int unassigned) {
    super(active, initializing, relocating, unassigned);
  }

  @JsonIgnore
  public final int getActive() {
    return active();
  }

  @JsonIgnore
  public final int getInitializing() {
    return initializing();
  }

  @JsonIgnore
  public final int getRelocating() {
    return relocating();
  }

  @JsonIgnore
  public final int getUnassigned() {
    return unassigned();
  }
}
