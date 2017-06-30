package org.graylog2.system.stats.elasticsearch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.elasticsearch.cluster.health.ClusterHealthStatus;

final class AutoValue_ElasticsearchStats extends $AutoValue_ElasticsearchStats {
  AutoValue_ElasticsearchStats(String clusterName, ClusterHealthStatus status,
      ClusterHealth clusterHealth, NodesStats nodesStats, IndicesStats indicesStats) {
    super(clusterName, status, clusterHealth, nodesStats, indicesStats);
  }

  @JsonIgnore
  public final String getClusterName() {
    return clusterName();
  }

  @JsonIgnore
  public final ClusterHealthStatus getStatus() {
    return status();
  }

  @JsonIgnore
  public final ClusterHealth getClusterHealth() {
    return clusterHealth();
  }

  @JsonIgnore
  public final NodesStats getNodesStats() {
    return nodesStats();
  }

  @JsonIgnore
  public final IndicesStats getIndicesStats() {
    return indicesStats();
  }
}
