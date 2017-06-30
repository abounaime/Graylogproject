package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_RegexTestRequest extends $AutoValue_RegexTestRequest {
  AutoValue_RegexTestRequest(String string, String regex) {
    super(string, regex);
  }

  @JsonIgnore
  public final String getString() {
    return string();
  }

  @JsonIgnore
  public final String getRegex() {
    return regex();
  }
}
