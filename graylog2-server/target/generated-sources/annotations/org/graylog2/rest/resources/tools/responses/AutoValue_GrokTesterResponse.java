package org.graylog2.rest.resources.tools.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

final class AutoValue_GrokTesterResponse extends $AutoValue_GrokTesterResponse {
  AutoValue_GrokTesterResponse(boolean matched, List<GrokTesterResponse.Match> matches,
      String pattern, String string) {
    super(matched, matches, pattern, string);
  }

  @JsonIgnore
  public final boolean isMatched() {
    return matched();
  }

  @JsonIgnore
  @Nullable
  public final List<GrokTesterResponse.Match> getMatches() {
    return matches();
  }

  @JsonIgnore
  public final String getPattern() {
    return pattern();
  }

  @JsonIgnore
  public final String getString() {
    return string();
  }
}
