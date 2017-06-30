
package org.graylog2.rest.models.system.sessions.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SessionValidationResponse extends SessionValidationResponse {

  private final boolean isValid;
  private final String sessionId;
  private final String username;

  $AutoValue_SessionValidationResponse(
      boolean isValid,
      @Nullable String sessionId,
      @Nullable String username) {
    this.isValid = isValid;
    this.sessionId = sessionId;
    this.username = username;
  }

  @JsonProperty(value = "is_valid")
  @Override
  public boolean isValid() {
    return isValid;
  }

  @JsonProperty(value = "session_id")
  @Nullable
  @Override
  public String sessionId() {
    return sessionId;
  }

  @JsonProperty(value = "username")
  @Nullable
  @Override
  public String username() {
    return username;
  }

  @Override
  public String toString() {
    return "SessionValidationResponse{"
        + "isValid=" + isValid + ", "
        + "sessionId=" + sessionId + ", "
        + "username=" + username
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SessionValidationResponse) {
      SessionValidationResponse that = (SessionValidationResponse) o;
      return (this.isValid == that.isValid())
           && ((this.sessionId == null) ? (that.sessionId() == null) : this.sessionId.equals(that.sessionId()))
           && ((this.username == null) ? (that.username() == null) : this.username.equals(that.username()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.isValid ? 1231 : 1237;
    h *= 1000003;
    h ^= (sessionId == null) ? 0 : this.sessionId.hashCode();
    h *= 1000003;
    h ^= (username == null) ? 0 : this.username.hashCode();
    return h;
  }

}
