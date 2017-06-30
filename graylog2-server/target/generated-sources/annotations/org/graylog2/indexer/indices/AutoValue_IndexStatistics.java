package org.graylog2.indexer.indices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import org.elasticsearch.action.admin.indices.stats.CommonStats;
import org.elasticsearch.cluster.routing.ShardRouting;

final class AutoValue_IndexStatistics extends $AutoValue_IndexStatistics {
  AutoValue_IndexStatistics(String indexName, CommonStats primaries, CommonStats total,
      List<ShardRouting> shardRoutings) {
    super(indexName, primaries, total, shardRoutings);
  }

  @JsonIgnore
  public final String getIndexName() {
    return indexName();
  }

  @JsonIgnore
  public final CommonStats getPrimaries() {
    return primaries();
  }

  @JsonIgnore
  public final CommonStats getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<ShardRouting> getShardRoutings() {
    return shardRoutings();
  }
}
