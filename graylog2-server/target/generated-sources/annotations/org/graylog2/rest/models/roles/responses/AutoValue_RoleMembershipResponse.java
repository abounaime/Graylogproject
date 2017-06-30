package org.graylog2.rest.models.roles.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Collection;
import javax.validation.constraints.NotNull;
import org.graylog2.rest.models.users.responses.UserSummary;
import org.hibernate.validator.constraints.NotBlank;

final class AutoValue_RoleMembershipResponse extends $AutoValue_RoleMembershipResponse {
  AutoValue_RoleMembershipResponse(String role, Collection<UserSummary> users) {
    super(role, users);
  }

  @JsonIgnore
  @NotBlank
  public final String getRole() {
    return role();
  }

  @JsonIgnore
  @NotNull
  public final Collection<UserSummary> getUsers() {
    return users();
  }
}
