
package org.graylog2.rest.models.system.sessions.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SessionResponse extends SessionResponse {

  private final Date validUntil;
  private final String sessionId;

  $AutoValue_SessionResponse(
      Date validUntil,
      String sessionId) {
    if (validUntil == null) {
      throw new NullPointerException("Null validUntil");
    }
    this.validUntil = validUntil;
    if (sessionId == null) {
      throw new NullPointerException("Null sessionId");
    }
    this.sessionId = sessionId;
  }

  @JsonProperty(value = "valid_until")
  @Override
  public Date validUntil() {
    return validUntil;
  }

  @JsonProperty(value = "session_id")
  @Override
  public String sessionId() {
    return sessionId;
  }

  @Override
  public String toString() {
    return "SessionResponse{"
        + "validUntil=" + validUntil + ", "
        + "sessionId=" + sessionId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SessionResponse) {
      SessionResponse that = (SessionResponse) o;
      return (this.validUntil.equals(that.validUntil()))
           && (this.sessionId.equals(that.sessionId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.validUntil.hashCode();
    h *= 1000003;
    h ^= this.sessionId.hashCode();
    return h;
  }

}
