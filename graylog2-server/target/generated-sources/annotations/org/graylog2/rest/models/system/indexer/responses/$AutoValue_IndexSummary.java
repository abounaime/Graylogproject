
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexSummary extends IndexSummary {

  private final IndexSizeSummary size;
  private final IndexRangeSummary range;
  private final boolean isDeflector;
  private final boolean isClosed;
  private final boolean isReopened;

  $AutoValue_IndexSummary(
      @Nullable IndexSizeSummary size,
      @Nullable IndexRangeSummary range,
      boolean isDeflector,
      boolean isClosed,
      boolean isReopened) {
    this.size = size;
    this.range = range;
    this.isDeflector = isDeflector;
    this.isClosed = isClosed;
    this.isReopened = isReopened;
  }

  @JsonProperty(value = "size")
  @Nullable
  @Override
  public IndexSizeSummary size() {
    return size;
  }

  @JsonProperty(value = "range")
  @Nullable
  @Override
  public IndexRangeSummary range() {
    return range;
  }

  @JsonProperty(value = "is_deflector")
  @Override
  public boolean isDeflector() {
    return isDeflector;
  }

  @JsonProperty(value = "is_closed")
  @Override
  public boolean isClosed() {
    return isClosed;
  }

  @JsonProperty(value = "is_reopened")
  @Override
  public boolean isReopened() {
    return isReopened;
  }

  @Override
  public String toString() {
    return "IndexSummary{"
        + "size=" + size + ", "
        + "range=" + range + ", "
        + "isDeflector=" + isDeflector + ", "
        + "isClosed=" + isClosed + ", "
        + "isReopened=" + isReopened
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexSummary) {
      IndexSummary that = (IndexSummary) o;
      return ((this.size == null) ? (that.size() == null) : this.size.equals(that.size()))
           && ((this.range == null) ? (that.range() == null) : this.range.equals(that.range()))
           && (this.isDeflector == that.isDeflector())
           && (this.isClosed == that.isClosed())
           && (this.isReopened == that.isReopened());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (size == null) ? 0 : this.size.hashCode();
    h *= 1000003;
    h ^= (range == null) ? 0 : this.range.hashCode();
    h *= 1000003;
    h ^= this.isDeflector ? 1231 : 1237;
    h *= 1000003;
    h ^= this.isClosed ? 1231 : 1237;
    h *= 1000003;
    h ^= this.isReopened ? 1231 : 1237;
    return h;
  }

}
