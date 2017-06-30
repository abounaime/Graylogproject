package org.graylog2.cluster;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_UserPermissionMigrationState extends $AutoValue_UserPermissionMigrationState {
  AutoValue_UserPermissionMigrationState(boolean migrationDone) {
    super(migrationDone);
  }

  @JsonIgnore
  public final boolean isMigrationDone() {
    return migrationDone();
  }
}
