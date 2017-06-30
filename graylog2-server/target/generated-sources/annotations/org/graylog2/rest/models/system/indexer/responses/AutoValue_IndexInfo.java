package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_IndexInfo extends $AutoValue_IndexInfo {
  AutoValue_IndexInfo(IndexStats primaryShards, IndexStats allShards, List<ShardRouting> routing,
      boolean isReopened) {
    super(primaryShards, allShards, routing, isReopened);
  }

  @JsonIgnore
  public final IndexStats getPrimaryShards() {
    return primaryShards();
  }

  @JsonIgnore
  public final IndexStats getAllShards() {
    return allShards();
  }

  @JsonIgnore
  public final List<ShardRouting> getRouting() {
    return routing();
  }

  @JsonIgnore
  public final boolean isIsReopened() {
    return isReopened();
  }
}
