
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexerClusterOverview extends IndexerClusterOverview {

  private final ClusterHealth health;
  private final String name;

  $AutoValue_IndexerClusterOverview(
      ClusterHealth health,
      String name) {
    if (health == null) {
      throw new NullPointerException("Null health");
    }
    this.health = health;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
  }

  @JsonProperty(value = "health")
  @Override
  public ClusterHealth health() {
    return health;
  }

  @JsonProperty(value = "name")
  @Override
  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return "IndexerClusterOverview{"
        + "health=" + health + ", "
        + "name=" + name
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexerClusterOverview) {
      IndexerClusterOverview that = (IndexerClusterOverview) o;
      return (this.health.equals(that.health()))
           && (this.name.equals(that.name()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.health.hashCode();
    h *= 1000003;
    h ^= this.name.hashCode();
    return h;
  }

}
