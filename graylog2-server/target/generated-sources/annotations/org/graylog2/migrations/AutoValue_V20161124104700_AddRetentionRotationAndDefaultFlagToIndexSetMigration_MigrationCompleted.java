package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration_MigrationCompleted extends $AutoValue_V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration_MigrationCompleted {
  AutoValue_V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration_MigrationCompleted(Set<String> updatedIndexSetIds,
      Set<String> skippedIndexSetIds, String defaultIndexSet) {
    super(updatedIndexSetIds, skippedIndexSetIds, defaultIndexSet);
  }

  @JsonIgnore
  public final Set<String> getUpdatedIndexSetIds() {
    return updatedIndexSetIds();
  }

  @JsonIgnore
  public final Set<String> getSkippedIndexSetIds() {
    return skippedIndexSetIds();
  }

  @JsonIgnore
  public final String getDefaultIndexSet() {
    return defaultIndexSet();
  }
}
