package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_GrokTestRequest extends $AutoValue_GrokTestRequest {
  AutoValue_GrokTestRequest(String string, String pattern, boolean namedCapturesOnly) {
    super(string, pattern, namedCapturesOnly);
  }

  @JsonIgnore
  public final String getString() {
    return string();
  }

  @JsonIgnore
  public final String getPattern() {
    return pattern();
  }

  @JsonIgnore
  public final boolean isNamedCapturesOnly() {
    return namedCapturesOnly();
  }
}
