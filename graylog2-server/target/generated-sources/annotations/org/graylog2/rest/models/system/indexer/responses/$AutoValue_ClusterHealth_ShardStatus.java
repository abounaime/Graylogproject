
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterHealth_ShardStatus extends ClusterHealth.ShardStatus {

  private final int active;
  private final int initializing;
  private final int relocating;
  private final int unassigned;

  $AutoValue_ClusterHealth_ShardStatus(
      int active,
      int initializing,
      int relocating,
      int unassigned) {
    this.active = active;
    this.initializing = initializing;
    this.relocating = relocating;
    this.unassigned = unassigned;
  }

  @JsonProperty
  @Override
  public int active() {
    return active;
  }

  @JsonProperty
  @Override
  public int initializing() {
    return initializing;
  }

  @JsonProperty
  @Override
  public int relocating() {
    return relocating;
  }

  @JsonProperty
  @Override
  public int unassigned() {
    return unassigned;
  }

  @Override
  public String toString() {
    return "ShardStatus{"
        + "active=" + active + ", "
        + "initializing=" + initializing + ", "
        + "relocating=" + relocating + ", "
        + "unassigned=" + unassigned
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterHealth.ShardStatus) {
      ClusterHealth.ShardStatus that = (ClusterHealth.ShardStatus) o;
      return (this.active == that.active())
           && (this.initializing == that.initializing())
           && (this.relocating == that.relocating())
           && (this.unassigned == that.unassigned());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.active;
    h *= 1000003;
    h ^= this.initializing;
    h *= 1000003;
    h ^= this.relocating;
    h *= 1000003;
    h ^= this.unassigned;
    return h;
  }

}
