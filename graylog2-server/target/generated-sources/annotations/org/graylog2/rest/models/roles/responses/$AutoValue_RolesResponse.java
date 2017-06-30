
package org.graylog2.rest.models.roles.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RolesResponse extends RolesResponse {

  private final Set<RoleResponse> roles;

  $AutoValue_RolesResponse(
      Set<RoleResponse> roles) {
    if (roles == null) {
      throw new NullPointerException("Null roles");
    }
    this.roles = roles;
  }

  @JsonProperty
  @NotNull
  @Override
  public Set<RoleResponse> roles() {
    return roles;
  }

  @Override
  public String toString() {
    return "RolesResponse{"
        + "roles=" + roles
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RolesResponse) {
      RolesResponse that = (RolesResponse) o;
      return (this.roles.equals(that.roles()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.roles.hashCode();
    return h;
  }

}
