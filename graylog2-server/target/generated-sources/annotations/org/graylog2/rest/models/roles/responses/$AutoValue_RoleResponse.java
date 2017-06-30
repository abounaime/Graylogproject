
package org.graylog2.rest.models.roles.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import java.util.Set;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RoleResponse extends RoleResponse {

  private final String name;
  private final Optional<String> description;
  private final Set<String> permissions;
  private final boolean readOnly;

  $AutoValue_RoleResponse(
      String name,
      Optional<String> description,
      Set<String> permissions,
      boolean readOnly) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (permissions == null) {
      throw new NullPointerException("Null permissions");
    }
    this.permissions = permissions;
    this.readOnly = readOnly;
  }

  @JsonProperty
  @NotBlank
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public Optional<String> description() {
    return description;
  }

  @JsonProperty
  @NotNull
  @Override
  public Set<String> permissions() {
    return permissions;
  }

  @JsonProperty
  @Override
  public boolean readOnly() {
    return readOnly;
  }

  @Override
  public String toString() {
    return "RoleResponse{"
        + "name=" + name + ", "
        + "description=" + description + ", "
        + "permissions=" + permissions + ", "
        + "readOnly=" + readOnly
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RoleResponse) {
      RoleResponse that = (RoleResponse) o;
      return (this.name.equals(that.name()))
           && (this.description.equals(that.description()))
           && (this.permissions.equals(that.permissions()))
           && (this.readOnly == that.readOnly());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.permissions.hashCode();
    h *= 1000003;
    h ^= this.readOnly ? 1231 : 1237;
    return h;
  }

}
