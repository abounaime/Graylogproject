
package org.graylog2.plugin.security;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Permission extends Permission {

  private final String permission;
  private final String description;

  $AutoValue_Permission(
      String permission,
      String description) {
    if (permission == null) {
      throw new NullPointerException("Null permission");
    }
    this.permission = permission;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
  }

  @JsonProperty(value = "permission")
  @Override
  public String permission() {
    return permission;
  }

  @JsonProperty(value = "description")
  @Override
  public String description() {
    return description;
  }

  @Override
  public String toString() {
    return "Permission{"
        + "permission=" + permission + ", "
        + "description=" + description
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Permission) {
      Permission that = (Permission) o;
      return (this.permission.equals(that.permission()))
           && (this.description.equals(that.description()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.permission.hashCode();
    h *= 1000003;
    h ^= this.description.hashCode();
    return h;
  }

}
