
package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_UpdateUserPreferences extends UpdateUserPreferences {

  private final Map<String, Object> preferences;

  $AutoValue_UpdateUserPreferences(
      Map<String, Object> preferences) {
    if (preferences == null) {
      throw new NullPointerException("Null preferences");
    }
    this.preferences = preferences;
  }

  @JsonProperty
  @Override
  public Map<String, Object> preferences() {
    return preferences;
  }

  @Override
  public String toString() {
    return "UpdateUserPreferences{"
        + "preferences=" + preferences
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateUserPreferences) {
      UpdateUserPreferences that = (UpdateUserPreferences) o;
      return (this.preferences.equals(that.preferences()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.preferences.hashCode();
    return h;
  }

}
