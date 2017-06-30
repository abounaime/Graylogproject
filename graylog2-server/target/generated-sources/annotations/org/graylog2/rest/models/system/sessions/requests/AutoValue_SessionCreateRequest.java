package org.graylog2.rest.models.system.sessions.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.hibernate.validator.constraints.NotEmpty;

final class AutoValue_SessionCreateRequest extends $AutoValue_SessionCreateRequest {
  AutoValue_SessionCreateRequest(String username, String password, String host) {
    super(username, password, host);
  }

  @JsonIgnore
  @NotEmpty
  public final String getUsername() {
    return username();
  }

  @JsonIgnore
  @NotEmpty
  public final String getPassword() {
    return password();
  }

  @JsonIgnore
  public final String getHost() {
    return host();
  }
}
