package org.graylog2.rest.models.system.sessions.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Date;

final class AutoValue_SessionResponse extends $AutoValue_SessionResponse {
  AutoValue_SessionResponse(Date validUntil, String sessionId) {
    super(validUntil, sessionId);
  }

  @JsonIgnore
  public final Date getValidUntil() {
    return validUntil();
  }

  @JsonIgnore
  public final String getSessionId() {
    return sessionId();
  }
}
