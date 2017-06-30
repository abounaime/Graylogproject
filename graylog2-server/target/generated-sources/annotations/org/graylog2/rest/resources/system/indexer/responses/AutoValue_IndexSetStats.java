
package org.graylog2.rest.resources.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_IndexSetStats extends IndexSetStats {

  private final long indices;
  private final long documents;
  private final long size;

  AutoValue_IndexSetStats(
      long indices,
      long documents,
      long size) {
    this.indices = indices;
    this.documents = documents;
    this.size = size;
  }

  @JsonProperty(value = "indices")
  @Override
  public long indices() {
    return indices;
  }

  @JsonProperty(value = "documents")
  @Override
  public long documents() {
    return documents;
  }

  @JsonProperty(value = "size")
  @Override
  public long size() {
    return size;
  }

  @Override
  public String toString() {
    return "IndexSetStats{"
        + "indices=" + indices + ", "
        + "documents=" + documents + ", "
        + "size=" + size
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSetStats) {
      IndexSetStats that = (IndexSetStats) o;
      return (this.indices == that.indices())
           && (this.documents == that.documents())
           && (this.size == that.size());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.indices >>> 32) ^ this.indices;
    h *= 1000003;
    h ^= (this.documents >>> 32) ^ this.documents;
    h *= 1000003;
    h ^= (this.size >>> 32) ^ this.size;
    return h;
  }

}
