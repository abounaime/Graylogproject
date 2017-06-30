package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;

final class AutoValue_ReaderPermissionResponse extends $AutoValue_ReaderPermissionResponse {
  AutoValue_ReaderPermissionResponse(List<String> permissions) {
    super(permissions);
  }

  @JsonIgnore
  public final List<String> getPermissions() {
    return permissions();
  }
}
