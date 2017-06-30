package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_V20161122174500_AssignIndexSetsToStreamsMigration_MigrationCompleted extends $AutoValue_V20161122174500_AssignIndexSetsToStreamsMigration_MigrationCompleted {
  AutoValue_V20161122174500_AssignIndexSetsToStreamsMigration_MigrationCompleted(String indexSetId,
      Set<String> completedStreamIds, Set<String> failedStreamIds) {
    super(indexSetId, completedStreamIds, failedStreamIds);
  }

  @JsonIgnore
  public final String getIndexSetId() {
    return indexSetId();
  }

  @JsonIgnore
  public final Set<String> getCompletedStreamIds() {
    return completedStreamIds();
  }

  @JsonIgnore
  public final Set<String> getFailedStreamIds() {
    return failedStreamIds();
  }
}
