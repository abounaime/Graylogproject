
package org.graylog2.rest.models.users.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_PermissionEditRequest extends PermissionEditRequest {

  private final List<String> permissions;

  $AutoValue_PermissionEditRequest(
      List<String> permissions) {
    if (permissions == null) {
      throw new NullPointerException("Null permissions");
    }
    this.permissions = permissions;
  }

  @JsonProperty
  @Override
  public List<String> permissions() {
    return permissions;
  }

  @Override
  public String toString() {
    return "PermissionEditRequest{"
        + "permissions=" + permissions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PermissionEditRequest) {
      PermissionEditRequest that = (PermissionEditRequest) o;
      return (this.permissions.equals(that.permissions()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.permissions.hashCode();
    return h;
  }

}
