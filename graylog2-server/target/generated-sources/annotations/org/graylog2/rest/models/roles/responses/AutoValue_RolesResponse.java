package org.graylog2.rest.models.roles.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.validation.constraints.NotNull;

final class AutoValue_RolesResponse extends $AutoValue_RolesResponse {
  AutoValue_RolesResponse(Set<RoleResponse> roles) {
    super(roles);
  }

  @JsonIgnore
  @NotNull
  public final Set<RoleResponse> getRoles() {
    return roles();
  }
}
