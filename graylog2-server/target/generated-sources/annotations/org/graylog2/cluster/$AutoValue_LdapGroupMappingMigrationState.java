
package org.graylog2.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LdapGroupMappingMigrationState extends LdapGroupMappingMigrationState {

  private final boolean migrationDone;

  $AutoValue_LdapGroupMappingMigrationState(
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
    return "LdapGroupMappingMigrationState{"
        + "migrationDone=" + migrationDone
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LdapGroupMappingMigrationState) {
      LdapGroupMappingMigrationState that = (LdapGroupMappingMigrationState) o;
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
