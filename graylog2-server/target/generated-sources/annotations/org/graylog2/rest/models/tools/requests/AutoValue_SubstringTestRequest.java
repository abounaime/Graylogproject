package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SubstringTestRequest extends $AutoValue_SubstringTestRequest {
  AutoValue_SubstringTestRequest(String string, int start, int end) {
    super(string, start, end);
  }

  @JsonIgnore
  public final String getString() {
    return string();
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
