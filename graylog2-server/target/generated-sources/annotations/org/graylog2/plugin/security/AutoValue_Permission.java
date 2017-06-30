package org.graylog2.plugin.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_Permission extends $AutoValue_Permission {
  AutoValue_Permission(String permission, String description) {
    super(permission, description);
  }

  @JsonIgnore
  public final String getPermission() {
    return permission();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }
}
