package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

final class AutoValue_CreateUserRequest extends $AutoValue_CreateUserRequest {
  AutoValue_CreateUserRequest(String username, String password, String email, String fullName,
      List<String> permissions, String timezone, Long sessionTimeoutMs, Startpage startpage,
      List<String> roles) {
    super(username, password, email, fullName, permissions, timezone, sessionTimeoutMs, startpage, roles);
  }

  @JsonIgnore
  public final String getUsername() {
    return username();
  }

  @JsonIgnore
  public final String getPassword() {
    return password();
  }

  @JsonIgnore
  public final String getEmail() {
    return email();
  }

  @JsonIgnore
  public final String getFullName() {
    return fullName();
  }

  @JsonIgnore
  public final List<String> getPermissions() {
    return permissions();
  }

  @JsonIgnore
  @Nullable
  public final String getTimezone() {
    return timezone();
  }

  @JsonIgnore
  @Nullable
  public final Long getSessionTimeoutMs() {
    return sessionTimeoutMs();
  }

  @JsonIgnore
  @Nullable
  public final Startpage getStartpage() {
    return startpage();
  }

  @JsonIgnore
  @Nullable
  public final List<String> getRoles() {
    return roles();
  }
}
