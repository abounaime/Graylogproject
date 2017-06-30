package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

final class AutoValue_V20161125142400_EmailAlarmCallbackMigration_MigrationCompleted extends $AutoValue_V20161125142400_EmailAlarmCallbackMigration_MigrationCompleted {
  AutoValue_V20161125142400_EmailAlarmCallbackMigration_MigrationCompleted(Map<String, Optional<String>> callbackIds) {
    super(callbackIds);
  }

  @JsonIgnore
  public final Map<String, Optional<String>> getCallbackIds() {
    return callbackIds();
  }
}
