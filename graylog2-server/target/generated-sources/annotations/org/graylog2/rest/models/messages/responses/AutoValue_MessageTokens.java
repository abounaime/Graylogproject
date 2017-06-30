package org.graylog2.rest.models.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;

final class AutoValue_MessageTokens extends $AutoValue_MessageTokens {
  AutoValue_MessageTokens(List<String> tokens) {
    super(tokens);
  }

  @JsonIgnore
  public final List<String> getTokens() {
    return tokens();
  }
}
