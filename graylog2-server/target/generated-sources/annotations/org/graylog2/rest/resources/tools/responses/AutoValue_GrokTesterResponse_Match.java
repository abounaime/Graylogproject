package org.graylog2.rest.resources.tools.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_GrokTesterResponse_Match extends $AutoValue_GrokTesterResponse_Match {
  AutoValue_GrokTesterResponse_Match(String name, String match) {
    super(name, match);
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getMatch() {
    return match();
  }
}
