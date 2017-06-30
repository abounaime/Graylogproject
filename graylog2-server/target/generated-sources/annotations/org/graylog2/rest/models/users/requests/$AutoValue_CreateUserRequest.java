
package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CreateUserRequest extends CreateUserRequest {

  private final String username;
  private final String password;
  private final String email;
  private final String fullName;
  private final List<String> permissions;
  private final String timezone;
  private final Long sessionTimeoutMs;
  private final Startpage startpage;
  private final List<String> roles;

  $AutoValue_CreateUserRequest(
      String username,
      String password,
      String email,
      String fullName,
      List<String> permissions,
      @Nullable String timezone,
      @Nullable Long sessionTimeoutMs,
      @Nullable Startpage startpage,
      @Nullable List<String> roles) {
    if (username == null) {
      throw new NullPointerException("Null username");
    }
    this.username = username;
    if (password == null) {
      throw new NullPointerException("Null password");
    }
    this.password = password;
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
    this.timezone = timezone;
    this.sessionTimeoutMs = sessionTimeoutMs;
    this.startpage = startpage;
    this.roles = roles;
  }

  @JsonProperty
  @Override
  public String username() {
    return username;
  }

  @JsonProperty
  @Override
  public String password() {
    return password;
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
  public String timezone() {
    return timezone;
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
  public Startpage startpage() {
    return startpage;
  }

  @JsonProperty
  @Nullable
  @Override
  public List<String> roles() {
    return roles;
  }

  @Override
  public String toString() {
    return "CreateUserRequest{"
        + "username=" + username + ", "
        + "password=" + password + ", "
        + "email=" + email + ", "
        + "fullName=" + fullName + ", "
        + "permissions=" + permissions + ", "
        + "timezone=" + timezone + ", "
        + "sessionTimeoutMs=" + sessionTimeoutMs + ", "
        + "startpage=" + startpage + ", "
        + "roles=" + roles
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateUserRequest) {
      CreateUserRequest that = (CreateUserRequest) o;
      return (this.username.equals(that.username()))
           && (this.password.equals(that.password()))
           && (this.email.equals(that.email()))
           && (this.fullName.equals(that.fullName()))
           && (this.permissions.equals(that.permissions()))
           && ((this.timezone == null) ? (that.timezone() == null) : this.timezone.equals(that.timezone()))
           && ((this.sessionTimeoutMs == null) ? (that.sessionTimeoutMs() == null) : this.sessionTimeoutMs.equals(that.sessionTimeoutMs()))
           && ((this.startpage == null) ? (that.startpage() == null) : this.startpage.equals(that.startpage()))
           && ((this.roles == null) ? (that.roles() == null) : this.roles.equals(that.roles()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.username.hashCode();
    h *= 1000003;
    h ^= this.password.hashCode();
    h *= 1000003;
    h ^= this.email.hashCode();
    h *= 1000003;
    h ^= this.fullName.hashCode();
    h *= 1000003;
    h ^= this.permissions.hashCode();
    h *= 1000003;
    h ^= (timezone == null) ? 0 : this.timezone.hashCode();
    h *= 1000003;
    h ^= (sessionTimeoutMs == null) ? 0 : this.sessionTimeoutMs.hashCode();
    h *= 1000003;
    h ^= (startpage == null) ? 0 : this.startpage.hashCode();
    h *= 1000003;
    h ^= (roles == null) ? 0 : this.roles.hashCode();
    return h;
  }

}
