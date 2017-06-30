
package org.graylog2.indexer.indices;

import java.util.List;
import javax.annotation.Generated;
import org.elasticsearch.action.admin.indices.stats.CommonStats;
import org.elasticsearch.cluster.routing.ShardRouting;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexStatistics extends IndexStatistics {

  private final String indexName;
  private final CommonStats primaries;
  private final CommonStats total;
  private final List<ShardRouting> shardRoutings;

  $AutoValue_IndexStatistics(
      String indexName,
      CommonStats primaries,
      CommonStats total,
      List<ShardRouting> shardRoutings) {
    if (indexName == null) {
      throw new NullPointerException("Null indexName");
    }
    this.indexName = indexName;
    if (primaries == null) {
      throw new NullPointerException("Null primaries");
    }
    this.primaries = primaries;
    if (total == null) {
      throw new NullPointerException("Null total");
    }
    this.total = total;
    if (shardRoutings == null) {
      throw new NullPointerException("Null shardRoutings");
    }
    this.shardRoutings = shardRoutings;
  }

  @Override
  public String indexName() {
    return indexName;
  }

  @Override
  public CommonStats primaries() {
    return primaries;
  }

  @Override
  public CommonStats total() {
    return total;
  }

  @Override
  public List<ShardRouting> shardRoutings() {
    return shardRoutings;
  }

  @Override
  public String toString() {
    return "IndexStatistics{"
        + "indexName=" + indexName + ", "
        + "primaries=" + primaries + ", "
        + "total=" + total + ", "
        + "shardRoutings=" + shardRoutings
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexStatistics) {
      IndexStatistics that = (IndexStatistics) o;
      return (this.indexName.equals(that.indexName()))
           && (this.primaries.equals(that.primaries()))
           && (this.total.equals(that.total()))
           && (this.shardRoutings.equals(that.shardRoutings()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.indexName.hashCode();
    h *= 1000003;
    h ^= this.primaries.hashCode();
    h *= 1000003;
    h ^= this.total.hashCode();
    h *= 1000003;
    h ^= this.shardRoutings.hashCode();
    return h;
  }

}
