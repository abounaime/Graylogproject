
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexSizeSummary extends IndexSizeSummary {

  private final long events;
  private final long deleted;
  private final long bytes;

  $AutoValue_IndexSizeSummary(
      long events,
      long deleted,
      long bytes) {
    this.events = events;
    this.deleted = deleted;
    this.bytes = bytes;
  }

  @JsonProperty(value = "events")
  @Override
  public long events() {
    return events;
  }

  @JsonProperty(value = "deleted")
  @Override
  public long deleted() {
    return deleted;
  }

  @JsonProperty(value = "bytes")
  @Override
  public long bytes() {
    return bytes;
  }

  @Override
  public String toString() {
    return "IndexSizeSummary{"
        + "events=" + events + ", "
        + "deleted=" + deleted + ", "
        + "bytes=" + bytes
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSizeSummary) {
      IndexSizeSummary that = (IndexSizeSummary) o;
      return (this.events == that.events())
           && (this.deleted == that.deleted())
           && (this.bytes == that.bytes());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.events >>> 32) ^ this.events;
    h *= 1000003;
    h ^= (this.deleted >>> 32) ^ this.deleted;
    h *= 1000003;
    h ^= (this.bytes >>> 32) ^ this.bytes;
    return h;
  }

}
