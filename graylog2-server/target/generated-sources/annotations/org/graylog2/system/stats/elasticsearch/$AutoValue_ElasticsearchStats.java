
package org.graylog2.system.stats.elasticsearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.elasticsearch.cluster.health.ClusterHealthStatus;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ElasticsearchStats extends ElasticsearchStats {

  private final String clusterName;
  private final ClusterHealthStatus status;
  private final ClusterHealth clusterHealth;
  private final NodesStats nodesStats;
  private final IndicesStats indicesStats;

  $AutoValue_ElasticsearchStats(
      String clusterName,
      ClusterHealthStatus status,
      ClusterHealth clusterHealth,
      NodesStats nodesStats,
      IndicesStats indicesStats) {
    if (clusterName == null) {
      throw new NullPointerException("Null clusterName");
    }
    this.clusterName = clusterName;
    if (status == null) {
      throw new NullPointerException("Null status");
    }
    this.status = status;
    if (clusterHealth == null) {
      throw new NullPointerException("Null clusterHealth");
    }
    this.clusterHealth = clusterHealth;
    if (nodesStats == null) {
      throw new NullPointerException("Null nodesStats");
    }
    this.nodesStats = nodesStats;
    if (indicesStats == null) {
      throw new NullPointerException("Null indicesStats");
    }
    this.indicesStats = indicesStats;
  }

  @JsonProperty
  @Override
  public String clusterName() {
    return clusterName;
  }

  @JsonProperty
  @Override
  public ClusterHealthStatus status() {
    return status;
  }

  @JsonProperty
  @Override
  public ClusterHealth clusterHealth() {
    return clusterHealth;
  }

  @JsonProperty
  @Override
  public NodesStats nodesStats() {
    return nodesStats;
  }

  @JsonProperty
  @Override
  public IndicesStats indicesStats() {
    return indicesStats;
  }

  @Override
  public String toString() {
    return "ElasticsearchStats{"
        + "clusterName=" + clusterName + ", "
        + "status=" + status + ", "
        + "clusterHealth=" + clusterHealth + ", "
        + "nodesStats=" + nodesStats + ", "
        + "indicesStats=" + indicesStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ElasticsearchStats) {
      ElasticsearchStats that = (ElasticsearchStats) o;
      return (this.clusterName.equals(that.clusterName()))
           && (this.status.equals(that.status()))
           && (this.clusterHealth.equals(that.clusterHealth()))
           && (this.nodesStats.equals(that.nodesStats()))
           && (this.indicesStats.equals(that.indicesStats()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.clusterName.hashCode();
    h *= 1000003;
    h ^= this.status.hashCode();
    h *= 1000003;
    h ^= this.clusterHealth.hashCode();
    h *= 1000003;
    h ^= this.nodesStats.hashCode();
    h *= 1000003;
    h ^= this.indicesStats.hashCode();
    return h;
  }

}
