package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

final class AutoValue_UpdateUserPreferences extends $AutoValue_UpdateUserPreferences {
  AutoValue_UpdateUserPreferences(Map<String, Object> preferences) {
    super(preferences);
  }

  @JsonIgnore
  public final Map<String, Object> getPreferences() {
    return preferences();
  }
}
