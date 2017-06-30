package org.graylog2.rest.models.system.sessions.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_SessionValidationResponse extends $AutoValue_SessionValidationResponse {
  AutoValue_SessionValidationResponse(boolean isValid, String sessionId, String username) {
    super(isValid, sessionId, username);
  }

  @JsonIgnore
  public final boolean isIsValid() {
    return isValid();
  }

  @JsonIgnore
  @Nullable
  public final String getSessionId() {
    return sessionId();
  }

  @JsonIgnore
  @Nullable
  public final String getUsername() {
    return username();
  }
}
