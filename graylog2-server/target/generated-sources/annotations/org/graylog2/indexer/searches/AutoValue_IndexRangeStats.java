package org.graylog2.indexer.searches;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_IndexRangeStats extends $AutoValue_IndexRangeStats {
  AutoValue_IndexRangeStats(DateTime min, DateTime max, List<String> streamIds) {
    super(min, max, streamIds);
  }

  @JsonIgnore
  public final DateTime getMin() {
    return min();
  }

  @JsonIgnore
  public final DateTime getMax() {
    return max();
  }

  @JsonIgnore
  @Nullable
  public final List<String> getStreamIds() {
    return streamIds();
  }
}
