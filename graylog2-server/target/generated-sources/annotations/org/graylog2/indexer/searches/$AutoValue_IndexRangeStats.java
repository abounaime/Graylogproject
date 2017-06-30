
package org.graylog2.indexer.searches;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexRangeStats extends IndexRangeStats {

  private final DateTime min;
  private final DateTime max;
  private final List<String> streamIds;

  $AutoValue_IndexRangeStats(
      DateTime min,
      DateTime max,
      @Nullable List<String> streamIds) {
    if (min == null) {
      throw new NullPointerException("Null min");
    }
    this.min = min;
    if (max == null) {
      throw new NullPointerException("Null max");
    }
    this.max = max;
    this.streamIds = streamIds;
  }

  @Override
  public DateTime min() {
    return min;
  }

  @Override
  public DateTime max() {
    return max;
  }

  @Nullable
  @Override
  public List<String> streamIds() {
    return streamIds;
  }

  @Override
  public String toString() {
    return "IndexRangeStats{"
        + "min=" + min + ", "
        + "max=" + max + ", "
        + "streamIds=" + streamIds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexRangeStats) {
      IndexRangeStats that = (IndexRangeStats) o;
      return (this.min.equals(that.min()))
           && (this.max.equals(that.max()))
           && ((this.streamIds == null) ? (that.streamIds() == null) : this.streamIds.equals(that.streamIds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.min.hashCode();
    h *= 1000003;
    h ^= this.max.hashCode();
    h *= 1000003;
    h ^= (streamIds == null) ? 0 : this.streamIds.hashCode();
    return h;
  }

}
