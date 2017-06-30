
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterHealth extends ClusterHealth {

  private final String status;
  private final ClusterHealth.ShardStatus shards;

  $AutoValue_ClusterHealth(
      String status,
      ClusterHealth.ShardStatus shards) {
    if (status == null) {
      throw new NullPointerException("Null status");
    }
    this.status = status;
    if (shards == null) {
      throw new NullPointerException("Null shards");
    }
    this.shards = shards;
  }

  @JsonProperty
  @Override
  public String status() {
    return status;
  }

  @JsonProperty
  @Override
  public ClusterHealth.ShardStatus shards() {
    return shards;
  }

  @Override
  public String toString() {
    return "ClusterHealth{"
        + "status=" + status + ", "
        + "shards=" + shards
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterHealth) {
      ClusterHealth that = (ClusterHealth) o;
      return (this.status.equals(that.status()))
           && (this.shards.equals(that.shards()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.status.hashCode();
    h *= 1000003;
    h ^= this.shards.hashCode();
    return h;
  }

}
