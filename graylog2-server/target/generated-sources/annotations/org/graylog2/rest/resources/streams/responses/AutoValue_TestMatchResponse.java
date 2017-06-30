package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;

final class AutoValue_TestMatchResponse extends $AutoValue_TestMatchResponse {
  AutoValue_TestMatchResponse(boolean matches, Map<String, Boolean> rules) {
    super(matches, rules);
  }

  @JsonIgnore
  public final boolean isMatches() {
    return matches();
  }

  @JsonIgnore
  public final Map<String, Boolean> getRules() {
    return rules();
  }
}
