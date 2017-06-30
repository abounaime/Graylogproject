
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexStats_DocsStats extends IndexStats.DocsStats {

  private final long count;
  private final long deleted;

  $AutoValue_IndexStats_DocsStats(
      long count,
      long deleted) {
    this.count = count;
    this.deleted = deleted;
  }

  @JsonProperty(value = "count")
  @Override
  public long count() {
    return count;
  }

  @JsonProperty(value = "deleted")
  @Override
  public long deleted() {
    return deleted;
  }

  @Override
  public String toString() {
    return "DocsStats{"
        + "count=" + count + ", "
        + "deleted=" + deleted
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexStats.DocsStats) {
      IndexStats.DocsStats that = (IndexStats.DocsStats) o;
      return (this.count == that.count())
           && (this.deleted == that.deleted());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.count >>> 32) ^ this.count;
    h *= 1000003;
    h ^= (this.deleted >>> 32) ^ this.deleted;
    return h;
  }

}
