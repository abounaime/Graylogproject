package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import java.util.Map;

final class AutoValue_TermsResult extends $AutoValue_TermsResult {
  AutoValue_TermsResult(long time, Map<String, Long> terms, long missing, long other, long total,
      String builtQuery) {
    super(time, terms, missing, other, total, builtQuery);
  }

  @JsonIgnore
  public final long getTime() {
    return time();
  }

  @JsonIgnore
  public final Map<String, Long> getTerms() {
    return terms();
  }

  @JsonIgnore
  public final long getMissing() {
    return missing();
  }

  @JsonIgnore
  public final long getOther() {
    return other();
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }

  @JsonIgnore
  public final String getBuiltQuery() {
    return builtQuery();
  }
}
