package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;

final class AutoValue_PermissionEditRequest extends $AutoValue_PermissionEditRequest {
  AutoValue_PermissionEditRequest(List<String> permissions) {
    super(permissions);
  }

  @JsonIgnore
  public final List<String> getPermissions() {
    return permissions();
  }
}
