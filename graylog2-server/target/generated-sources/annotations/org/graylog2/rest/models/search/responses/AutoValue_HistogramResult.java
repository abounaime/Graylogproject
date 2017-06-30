package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;

final class AutoValue_HistogramResult extends $AutoValue_HistogramResult {
  AutoValue_HistogramResult(String interval, Map results, long time, String builtQuery,
      TimeRange queriedTimerange) {
    super(interval, results, time, builtQuery, queriedTimerange);
  }

  @JsonIgnore
  public final String getInterval() {
    return interval();
  }

  @JsonIgnore
  public final Map getResults() {
    return results();
  }

  @JsonIgnore
  public final long getTime() {
    return time();
  }

  @JsonIgnore
  public final String getBuiltQuery() {
    return builtQuery();
  }

  @JsonIgnore
  public final TimeRange getQueriedTimerange() {
    return queriedTimerange();
  }
}
