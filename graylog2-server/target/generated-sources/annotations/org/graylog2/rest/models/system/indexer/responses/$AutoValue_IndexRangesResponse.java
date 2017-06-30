
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexRangesResponse extends IndexRangesResponse {

  private final int total;
  private final List<IndexRangeSummary> ranges;

  $AutoValue_IndexRangesResponse(
      int total,
      List<IndexRangeSummary> ranges) {
    this.total = total;
    if (ranges == null) {
      throw new NullPointerException("Null ranges");
    }
    this.ranges = ranges;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public List<IndexRangeSummary> ranges() {
    return ranges;
  }

  @Override
  public String toString() {
    return "IndexRangesResponse{"
        + "total=" + total + ", "
        + "ranges=" + ranges
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexRangesResponse) {
      IndexRangesResponse that = (IndexRangesResponse) o;
      return (this.total == that.total())
           && (this.ranges.equals(that.ranges()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.ranges.hashCode();
    return h;
  }

}
