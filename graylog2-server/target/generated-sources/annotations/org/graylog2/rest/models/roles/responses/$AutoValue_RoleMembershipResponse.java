
package org.graylog2.rest.models.roles.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import org.graylog2.rest.models.users.responses.UserSummary;
import org.hibernate.validator.constraints.NotBlank;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RoleMembershipResponse extends RoleMembershipResponse {

  private final String role;
  private final Collection<UserSummary> users;

  $AutoValue_RoleMembershipResponse(
      String role,
      Collection<UserSummary> users) {
    if (role == null) {
      throw new NullPointerException("Null role");
    }
    this.role = role;
    if (users == null) {
      throw new NullPointerException("Null users");
    }
    this.users = users;
  }

  @JsonProperty
  @NotBlank
  @Override
  public String role() {
    return role;
  }

  @JsonProperty
  @NotNull
  @Override
  public Collection<UserSummary> users() {
    return users;
  }

  @Override
  public String toString() {
    return "RoleMembershipResponse{"
        + "role=" + role + ", "
        + "users=" + users
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RoleMembershipResponse) {
      RoleMembershipResponse that = (RoleMembershipResponse) o;
      return (this.role.equals(that.role()))
           && (this.users.equals(that.users()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.role.hashCode();
    h *= 1000003;
    h ^= this.users.hashCode();
    return h;
  }

}
