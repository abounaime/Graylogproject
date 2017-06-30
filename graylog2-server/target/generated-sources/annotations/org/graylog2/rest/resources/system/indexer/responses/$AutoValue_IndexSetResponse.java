
package org.graylog2.rest.resources.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexSetResponse extends IndexSetResponse {

  private final int total;
  private final List<IndexSetSummary> indexSets;
  private final Map<String, IndexSetStats> stats;

  $AutoValue_IndexSetResponse(
      int total,
      List<IndexSetSummary> indexSets,
      Map<String, IndexSetStats> stats) {
    this.total = total;
    if (indexSets == null) {
      throw new NullPointerException("Null indexSets");
    }
    this.indexSets = indexSets;
    if (stats == null) {
      throw new NullPointerException("Null stats");
    }
    this.stats = stats;
  }

  @JsonProperty(value = "total")
  @Override
  public int total() {
    return total;
  }

  @JsonProperty(value = "index_sets")
  @Override
  public List<IndexSetSummary> indexSets() {
    return indexSets;
  }

  @JsonProperty(value = "stats")
  @Override
  public Map<String, IndexSetStats> stats() {
    return stats;
  }

  @Override
  public String toString() {
    return "IndexSetResponse{"
        + "total=" + total + ", "
        + "indexSets=" + indexSets + ", "
        + "stats=" + stats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSetResponse) {
      IndexSetResponse that = (IndexSetResponse) o;
      return (this.total == that.total())
           && (this.indexSets.equals(that.indexSets()))
           && (this.stats.equals(that.stats()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.indexSets.hashCode();
    h *= 1000003;
    h ^= this.stats.hashCode();
    return h;
  }

}
