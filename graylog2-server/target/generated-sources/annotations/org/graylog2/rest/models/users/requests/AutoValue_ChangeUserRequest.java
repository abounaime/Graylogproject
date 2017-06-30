package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

final class AutoValue_ChangeUserRequest extends $AutoValue_ChangeUserRequest {
  AutoValue_ChangeUserRequest(String username, String email, String fullName,
      List<String> permissions, String timezone, Startpage startpage, Long sessionTimeoutMs,
      List<String> roles) {
    super(username, email, fullName, permissions, timezone, startpage, sessionTimeoutMs, roles);
  }

  @JsonIgnore
  @Nullable
  public final String getUsername() {
    return username();
  }

  @JsonIgnore
  @Nullable
  public final String getEmail() {
    return email();
  }

  @JsonIgnore
  @Nullable
  public final String getFullName() {
    return fullName();
  }

  @JsonIgnore
  @Nullable
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
  public final Startpage getStartpage() {
    return startpage();
  }

  @JsonIgnore
  @Nullable
  public final Long getSessionTimeoutMs() {
    return sessionTimeoutMs();
  }

  @JsonIgnore
  @Nullable
  public final List<String> getRoles() {
    return roles();
  }
}
