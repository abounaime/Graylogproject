package org.graylog2.cluster;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_LdapGroupMappingMigrationState extends $AutoValue_LdapGroupMappingMigrationState {
  AutoValue_LdapGroupMappingMigrationState(boolean migrationDone) {
    super(migrationDone);
  }

  @JsonIgnore
  public final boolean isMigrationDone() {
    return migrationDone();
  }
}
