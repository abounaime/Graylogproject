package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_RegexTesterResponse_Match extends $AutoValue_RegexTesterResponse_Match {
  AutoValue_RegexTesterResponse_Match(String match, int start, int end) {
    super(match, start, end);
  }

  @JsonIgnore
  @Nullable
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
