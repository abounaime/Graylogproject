
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexInfo extends IndexInfo {

  private final IndexStats primaryShards;
  private final IndexStats allShards;
  private final List<ShardRouting> routing;
  private final boolean isReopened;

  $AutoValue_IndexInfo(
      IndexStats primaryShards,
      IndexStats allShards,
      List<ShardRouting> routing,
      boolean isReopened) {
    if (primaryShards == null) {
      throw new NullPointerException("Null primaryShards");
    }
    this.primaryShards = primaryShards;
    if (allShards == null) {
      throw new NullPointerException("Null allShards");
    }
    this.allShards = allShards;
    if (routing == null) {
      throw new NullPointerException("Null routing");
    }
    this.routing = routing;
    this.isReopened = isReopened;
  }

  @JsonProperty
  @Override
  public IndexStats primaryShards() {
    return primaryShards;
  }

  @JsonProperty
  @Override
  public IndexStats allShards() {
    return allShards;
  }

  @JsonProperty
  @Override
  public List<ShardRouting> routing() {
    return routing;
  }

  @JsonProperty
  @Override
  public boolean isReopened() {
    return isReopened;
  }

  @Override
  public String toString() {
    return "IndexInfo{"
        + "primaryShards=" + primaryShards + ", "
        + "allShards=" + allShards + ", "
        + "routing=" + routing + ", "
        + "isReopened=" + isReopened
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexInfo) {
      IndexInfo that = (IndexInfo) o;
      return (this.primaryShards.equals(that.primaryShards()))
           && (this.allShards.equals(that.allShards()))
           && (this.routing.equals(that.routing()))
           && (this.isReopened == that.isReopened());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.primaryShards.hashCode();
    h *= 1000003;
    h ^= this.allShards.hashCode();
    h *= 1000003;
    h ^= this.routing.hashCode();
    h *= 1000003;
    h ^= this.isReopened ? 1231 : 1237;
    return h;
  }

}
