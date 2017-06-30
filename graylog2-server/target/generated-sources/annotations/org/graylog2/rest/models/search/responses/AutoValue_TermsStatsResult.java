package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

final class AutoValue_TermsStatsResult extends $AutoValue_TermsStatsResult {
  AutoValue_TermsStatsResult(long time, List<Map<String, Object>> terms, String builtQuery) {
    super(time, terms, builtQuery);
  }

  @JsonIgnore
  public final long getTime() {
    return time();
  }

  @JsonIgnore
  public final List<Map<String, Object>> getTerms() {
    return terms();
  }

  @JsonIgnore
  public final String getBuiltQuery() {
    return builtQuery();
  }
}
