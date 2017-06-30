
package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ChangeUserRequest extends ChangeUserRequest {

  private final String username;
  private final String email;
  private final String fullName;
  private final List<String> permissions;
  private final String timezone;
  private final Startpage startpage;
  private final Long sessionTimeoutMs;
  private final List<String> roles;

  $AutoValue_ChangeUserRequest(
      @Nullable String username,
      @Nullable String email,
      @Nullable String fullName,
      @Nullable List<String> permissions,
      @Nullable String timezone,
      @Nullable Startpage startpage,
      @Nullable Long sessionTimeoutMs,
      @Nullable List<String> roles) {
    this.username = username;
    this.email = email;
    this.fullName = fullName;
    this.permissions = permissions;
    this.timezone = timezone;
    this.startpage = startpage;
    this.sessionTimeoutMs = sessionTimeoutMs;
    this.roles = roles;
  }

  @JsonProperty
  @Nullable
  @Override
  public String username() {
    return username;
  }

  @JsonProperty
  @Nullable
  @Override
  public String email() {
    return email;
  }

  @JsonProperty
  @Nullable
  @Override
  public String fullName() {
    return fullName;
  }

  @JsonProperty
  @Nullable
  @Override
  public List<String> permissions() {
    return permissions;
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
  public Startpage startpage() {
    return startpage;
  }

  @JsonProperty
  @Nullable
  @Override
  public Long sessionTimeoutMs() {
    return sessionTimeoutMs;
  }

  @JsonProperty
  @Nullable
  @Override
  public List<String> roles() {
    return roles;
  }

  @Override
  public String toString() {
    return "ChangeUserRequest{"
        + "username=" + username + ", "
        + "email=" + email + ", "
        + "fullName=" + fullName + ", "
        + "permissions=" + permissions + ", "
        + "timezone=" + timezone + ", "
        + "startpage=" + startpage + ", "
        + "sessionTimeoutMs=" + sessionTimeoutMs + ", "
        + "roles=" + roles
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ChangeUserRequest) {
      ChangeUserRequest that = (ChangeUserRequest) o;
      return ((this.username == null) ? (that.username() == null) : this.username.equals(that.username()))
           && ((this.email == null) ? (that.email() == null) : this.email.equals(that.email()))
           && ((this.fullName == null) ? (that.fullName() == null) : this.fullName.equals(that.fullName()))
           && ((this.permissions == null) ? (that.permissions() == null) : this.permissions.equals(that.permissions()))
           && ((this.timezone == null) ? (that.timezone() == null) : this.timezone.equals(that.timezone()))
           && ((this.startpage == null) ? (that.startpage() == null) : this.startpage.equals(that.startpage()))
           && ((this.sessionTimeoutMs == null) ? (that.sessionTimeoutMs() == null) : this.sessionTimeoutMs.equals(that.sessionTimeoutMs()))
           && ((this.roles == null) ? (that.roles() == null) : this.roles.equals(that.roles()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (username == null) ? 0 : this.username.hashCode();
    h *= 1000003;
    h ^= (email == null) ? 0 : this.email.hashCode();
    h *= 1000003;
    h ^= (fullName == null) ? 0 : this.fullName.hashCode();
    h *= 1000003;
    h ^= (permissions == null) ? 0 : this.permissions.hashCode();
    h *= 1000003;
    h ^= (timezone == null) ? 0 : this.timezone.hashCode();
    h *= 1000003;
    h ^= (startpage == null) ? 0 : this.startpage.hashCode();
    h *= 1000003;
    h ^= (sessionTimeoutMs == null) ? 0 : this.sessionTimeoutMs.hashCode();
    h *= 1000003;
    h ^= (roles == null) ? 0 : this.roles.hashCode();
    return h;
  }

}
