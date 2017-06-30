package org.graylog2.rest.models.users.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.graylog2.rest.models.users.requests.Startpage;

final class AutoValue_UserSummary extends $AutoValue_UserSummary {
  AutoValue_UserSummary(String id, String username, String email, String fullName,
      List<String> permissions, Map<String, Object> preferences, String timezone,
      Long sessionTimeoutMs, boolean readOnly, boolean external, Startpage startpage,
      Set<String> roles, boolean sessionActive, Date lastActivity, String clientAddress) {
    super(id, username, email, fullName, permissions, preferences, timezone, sessionTimeoutMs, readOnly, external, startpage, roles, sessionActive, lastActivity, clientAddress);
  }

  @JsonIgnore
  @Nullable
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getUsername() {
    return username();
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
  public final Map<String, Object> getPreferences() {
    return preferences();
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
  public final boolean isReadOnly() {
    return readOnly();
  }

  @JsonIgnore
  public final boolean isExternal() {
    return external();
  }

  @JsonIgnore
  @Nullable
  public final Startpage getStartpage() {
    return startpage();
  }

  @JsonIgnore
  @Nullable
  public final Set<String> getRoles() {
    return roles();
  }

  @JsonIgnore
  public final boolean isSessionActive() {
    return sessionActive();
  }

  @JsonIgnore
  @Nullable
  public final Date getLastActivity() {
    return lastActivity();
  }

  @JsonIgnore
  @Nullable
  public final String getClientAddress() {
    return clientAddress();
  }
}
