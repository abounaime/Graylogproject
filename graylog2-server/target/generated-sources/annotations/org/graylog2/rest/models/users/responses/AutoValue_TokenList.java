package org.graylog2.rest.models.users.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_TokenList extends $AutoValue_TokenList {
  AutoValue_TokenList(List<Token> tokens) {
    super(tokens);
  }

  @JsonIgnore
  public final List<Token> getTokens() {
    return tokens();
  }
}
