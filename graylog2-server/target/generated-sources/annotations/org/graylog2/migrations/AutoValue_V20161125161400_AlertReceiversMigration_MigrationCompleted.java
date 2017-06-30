package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

final class AutoValue_V20161125161400_AlertReceiversMigration_MigrationCompleted extends $AutoValue_V20161125161400_AlertReceiversMigration_MigrationCompleted {
  AutoValue_V20161125161400_AlertReceiversMigration_MigrationCompleted(Map<String, Optional<String>> streamIds) {
    super(streamIds);
  }

  @JsonIgnore
  public final Map<String, Optional<String>> getStreamIds() {
    return streamIds();
  }
}
