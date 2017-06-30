package org.graylog2.indexer.searches;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import org.joda.time.Period;

final class AutoValue_SearchesClusterConfig extends $AutoValue_SearchesClusterConfig {
  AutoValue_SearchesClusterConfig(Period queryTimeRangeLimit,
      Map<Period, String> relativeTimerangeOptions, Map<Period, String> surroundingTimerangeOptions,
      Set<String> surroundingFilterFields) {
    super(queryTimeRangeLimit, relativeTimerangeOptions, surroundingTimerangeOptions, surroundingFilterFields);
  }

  @JsonIgnore
  public final Period getQueryTimeRangeLimit() {
    return queryTimeRangeLimit();
  }

  @JsonIgnore
  public final Map<Period, String> getRelativeTimerangeOptions() {
    return relativeTimerangeOptions();
  }

  @JsonIgnore
  public final Map<Period, String> getSurroundingTimerangeOptions() {
    return surroundingTimerangeOptions();
  }

  @JsonIgnore
  public final Set<String> getSurroundingFilterFields() {
    return surroundingFilterFields();
  }
}
