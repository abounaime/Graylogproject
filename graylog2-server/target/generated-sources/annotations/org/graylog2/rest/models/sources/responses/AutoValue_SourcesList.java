package org.graylog2.rest.models.sources.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import java.util.Map;

final class AutoValue_SourcesList extends $AutoValue_SourcesList {
  AutoValue_SourcesList(int total, Map<String, Long> sources, long tookMs, int range) {
    super(total, sources, tookMs, range);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final Map<String, Long> getSources() {
    return sources();
  }

  @JsonIgnore
  public final long getTookMs() {
    return tookMs();
  }

  @JsonIgnore
  public final int getRange() {
    return range();
  }
}
