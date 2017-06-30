
package org.graylog2.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_UserPermissionMigrationState extends UserPermissionMigrationState {

  private final boolean migrationDone;

  $AutoValue_UserPermissionMigrationState(
      boolean migrationDone) {
    this.migrationDone = migrationDone;
  }

  @JsonProperty
  @Override
  public boolean migrationDone() {
    return migrationDone;
  }

  @Override
  public String toString() {
    return "UserPermissionMigrationState{"
        + "migrationDone=" + migrationDone
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UserPermissionMigrationState) {
      UserPermissionMigrationState that = (UserPermissionMigrationState) o;
      return (this.migrationDone == that.migrationDone());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.migrationDone ? 1231 : 1237;
    return h;
  }

}
