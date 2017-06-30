package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_RegexReplaceTesterResponse_Match extends $AutoValue_RegexReplaceTesterResponse_Match {
  AutoValue_RegexReplaceTesterResponse_Match(String match, int start, int end) {
    super(match, start, end);
  }

  @JsonIgnore
  public final String getMatch() {
    return match();
  }

  @JsonIgnore
  public final int getStart() {
    return start();
  }

  @JsonIgnore
  public final int getEnd() {
    return end();
  }
}
