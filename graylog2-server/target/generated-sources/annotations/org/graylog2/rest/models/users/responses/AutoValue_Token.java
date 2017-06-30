package org.graylog2.rest.models.users.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.joda.time.DateTime;

final class AutoValue_Token extends $AutoValue_Token {
  AutoValue_Token(String name, String token, DateTime lastAccess) {
    super(name, token, lastAccess);
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getToken() {
    return token();
  }

  @JsonIgnore
  public final DateTime getLastAccess() {
    return lastAccess();
  }
}
