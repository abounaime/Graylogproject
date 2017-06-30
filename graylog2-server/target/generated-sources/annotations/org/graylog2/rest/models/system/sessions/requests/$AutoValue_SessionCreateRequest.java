
package org.graylog2.rest.models.system.sessions.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.hibernate.validator.constraints.NotEmpty;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SessionCreateRequest extends SessionCreateRequest {

  private final String username;
  private final String password;
  private final String host;

  $AutoValue_SessionCreateRequest(
      String username,
      String password,
      String host) {
    if (username == null) {
      throw new NullPointerException("Null username");
    }
    this.username = username;
    if (password == null) {
      throw new NullPointerException("Null password");
    }
    this.password = password;
    if (host == null) {
      throw new NullPointerException("Null host");
    }
    this.host = host;
  }

  @JsonProperty
  @NotEmpty
  @Override
  public String username() {
    return username;
  }

  @JsonProperty
  @NotEmpty
  @Override
  public String password() {
    return password;
  }

  @JsonProperty
  @Override
  public String host() {
    return host;
  }

  @Override
  public String toString() {
    return "SessionCreateRequest{"
        + "username=" + username + ", "
        + "password=" + password + ", "
        + "host=" + host
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SessionCreateRequest) {
      SessionCreateRequest that = (SessionCreateRequest) o;
      return (this.username.equals(that.username()))
           && (this.password.equals(that.password()))
           && (this.host.equals(that.host()));
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
    h ^= this.host.hashCode();
    return h;
  }

}
