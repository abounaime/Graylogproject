package org.graylog2.rest.models.roles.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Optional;
import java.lang.String;
import java.util.Set;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

final class AutoValue_RoleResponse extends $AutoValue_RoleResponse {
  AutoValue_RoleResponse(String name, Optional<String> description, Set<String> permissions,
      boolean readOnly) {
    super(name, description, permissions, readOnly);
  }

  @JsonIgnore
  @NotBlank
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final Optional<String> getDescription() {
    return description();
  }

  @JsonIgnore
  @NotNull
  public final Set<String> getPermissions() {
    return permissions();
  }

  @JsonIgnore
  public final boolean isReadOnly() {
    return readOnly();
  }
}
