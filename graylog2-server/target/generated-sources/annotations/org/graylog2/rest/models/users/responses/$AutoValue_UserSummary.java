
package org.graylog2.rest.models.users.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.graylog2.rest.models.users.requests.Startpage;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_UserSummary extends UserSummary {

  private final String id;
  private final String username;
  private final String email;
  private final String fullName;
  private final List<String> permissions;
  private final Map<String, Object> preferences;
  private final String timezone;
  private final Long sessionTimeoutMs;
  private final boolean readOnly;
  private final boolean external;
  private final Startpage startpage;
  private final Set<String> roles;
  private final boolean sessionActive;
  private final Date lastActivity;
  private final String clientAddress;

  $AutoValue_UserSummary(
      @Nullable String id,
      String username,
      String email,
      String fullName,
      List<String> permissions,
      @Nullable Map<String, Object> preferences,
      @Nullable String timezone,
      @Nullable Long sessionTimeoutMs,
      boolean readOnly,
      boolean external,
      @Nullable Startpage startpage,
      @Nullable Set<String> roles,
      boolean sessionActive,
      @Nullable Date lastActivity,
      @Nullable String clientAddress) {
    this.id = id;
    if (username == null) {
      throw new NullPointerException("Null username");
    }
    this.username = username;
    if (email == null) {
      throw new NullPointerException("Null email");
    }
    this.email = email;
    if (fullName == null) {
      throw new NullPointerException("Null fullName");
    }
    this.fullName = fullName;
    if (permissions == null) {
      throw new NullPointerException("Null permissions");
    }
    this.permissions = permissions;
    this.preferences = preferences;
    this.timezone = timezone;
    this.sessionTimeoutMs = sessionTimeoutMs;
    this.readOnly = readOnly;
    this.external = external;
    this.startpage = startpage;
    this.roles = roles;
    this.sessionActive = sessionActive;
    this.lastActivity = lastActivity;
    this.clientAddress = clientAddress;
  }

  @JsonProperty
  @Nullable
  @Override
  public String id() {
    return id;
  }

  @JsonProperty
  @Override
  public String username() {
    return username;
  }

  @JsonProperty
  @Override
  public String email() {
    return email;
  }

  @JsonProperty
  @Override
  public String fullName() {
    return fullName;
  }

  @JsonProperty
  @Override
  public List<String> permissions() {
    return permissions;
  }

  @JsonProperty
  @Nullable
  @Override
  public Map<String, Object> preferences() {
    return preferences;
  }

  @JsonProperty
  @Nullable
  @Override
  public String timezone() {
    return timezone;
  }

  @JsonProperty
  @Nullable
  @Override
  public Long sessionTimeoutMs() {
    return sessionTimeoutMs;
  }

  @JsonProperty(value = "read_only")
  @Override
  public boolean readOnly() {
    return readOnly;
  }

  @JsonProperty
  @Override
  public boolean external() {
    return external;
  }

  @JsonProperty
  @Nullable
  @Override
  public Startpage startpage() {
    return startpage;
  }

  @JsonProperty
  @Nullable
  @Override
  public Set<String> roles() {
    return roles;
  }

  @JsonProperty(value = "session_active")
  @Override
  public boolean sessionActive() {
    return sessionActive;
  }

  @JsonProperty(value = "last_activity")
  @Nullable
  @Override
  public Date lastActivity() {
    return lastActivity;
  }

  @JsonProperty(value = "client_address")
  @Nullable
  @Override
  public String clientAddress() {
    return clientAddress;
  }

  @Override
  public String toString() {
    return "UserSummary{"
        + "id=" + id + ", "
        + "username=" + username + ", "
        + "email=" + email + ", "
        + "fullName=" + fullName + ", "
        + "permissions=" + permissions + ", "
        + "preferences=" + preferences + ", "
        + "timezone=" + timezone + ", "
        + "sessionTimeoutMs=" + sessionTimeoutMs + ", "
        + "readOnly=" + readOnly + ", "
        + "external=" + external + ", "
        + "startpage=" + startpage + ", "
        + "roles=" + roles + ", "
        + "sessionActive=" + sessionActive + ", "
        + "lastActivity=" + lastActivity + ", "
        + "clientAddress=" + clientAddress
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UserSummary) {
      UserSummary that = (UserSummary) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.username.equals(that.username()))
           && (this.email.equals(that.email()))
           && (this.fullName.equals(that.fullName()))
           && (this.permissions.equals(that.permissions()))
           && ((this.preferences == null) ? (that.preferences() == null) : this.preferences.equals(that.preferences()))
           && ((this.timezone == null) ? (that.timezone() == null) : this.timezone.equals(that.timezone()))
           && ((this.sessionTimeoutMs == null) ? (that.sessionTimeoutMs() == null) : this.sessionTimeoutMs.equals(that.sessionTimeoutMs()))
           && (this.readOnly == that.readOnly())
           && (this.external == that.external())
           && ((this.startpage == null) ? (that.startpage() == null) : this.startpage.equals(that.startpage()))
           && ((this.roles == null) ? (that.roles() == null) : this.roles.equals(that.roles()))
           && (this.sessionActive == that.sessionActive())
           && ((this.lastActivity == null) ? (that.lastActivity() == null) : this.lastActivity.equals(that.lastActivity()))
           && ((this.clientAddress == null) ? (that.clientAddress() == null) : this.clientAddress.equals(that.clientAddress()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    h *= 1000003;
    h ^= this.username.hashCode();
    h *= 1000003;
    h ^= this.email.hashCode();
    h *= 1000003;
    h ^= this.fullName.hashCode();
    h *= 1000003;
    h ^= this.permissions.hashCode();
    h *= 1000003;
    h ^= (preferences == null) ? 0 : this.preferences.hashCode();
    h *= 1000003;
    h ^= (timezone == null) ? 0 : this.timezone.hashCode();
    h *= 1000003;
    h ^= (sessionTimeoutMs == null) ? 0 : this.sessionTimeoutMs.hashCode();
    h *= 1000003;
    h ^= this.readOnly ? 1231 : 1237;
    h *= 1000003;
    h ^= this.external ? 1231 : 1237;
    h *= 1000003;
    h ^= (startpage == null) ? 0 : this.startpage.hashCode();
    h *= 1000003;
    h ^= (roles == null) ? 0 : this.roles.hashCode();
    h *= 1000003;
    h ^= this.sessionActive ? 1231 : 1237;
    h *= 1000003;
    h ^= (lastActivity == null) ? 0 : this.lastActivity.hashCode();
    h *= 1000003;
    h ^= (clientAddress == null) ? 0 : this.clientAddress.hashCode();
    return h;
  }

}
