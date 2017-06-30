
package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_V20161122174500_AssignIndexSetsToStreamsMigration_MigrationCompleted extends V20161122174500_AssignIndexSetsToStreamsMigration.MigrationCompleted {

  private final String indexSetId;
  private final Set<String> completedStreamIds;
  private final Set<String> failedStreamIds;

  $AutoValue_V20161122174500_AssignIndexSetsToStreamsMigration_MigrationCompleted(
      String indexSetId,
      Set<String> completedStreamIds,
      Set<String> failedStreamIds) {
    if (indexSetId == null) {
      throw new NullPointerException("Null indexSetId");
    }
    this.indexSetId = indexSetId;
    if (completedStreamIds == null) {
      throw new NullPointerException("Null completedStreamIds");
    }
    this.completedStreamIds = completedStreamIds;
    if (failedStreamIds == null) {
      throw new NullPointerException("Null failedStreamIds");
    }
    this.failedStreamIds = failedStreamIds;
  }

  @JsonProperty(value = "index_set_id")
  @Override
  public String indexSetId() {
    return indexSetId;
  }

  @JsonProperty(value = "completed_stream_ids")
  @Override
  public Set<String> completedStreamIds() {
    return completedStreamIds;
  }

  @JsonProperty(value = "failed_stream_ids")
  @Override
  public Set<String> failedStreamIds() {
    return failedStreamIds;
  }

  @Override
  public String toString() {
    return "MigrationCompleted{"
        + "indexSetId=" + indexSetId + ", "
        + "completedStreamIds=" + completedStreamIds + ", "
        + "failedStreamIds=" + failedStreamIds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof V20161122174500_AssignIndexSetsToStreamsMigration.MigrationCompleted) {
      V20161122174500_AssignIndexSetsToStreamsMigration.MigrationCompleted that = (V20161122174500_AssignIndexSetsToStreamsMigration.MigrationCompleted) o;
      return (this.indexSetId.equals(that.indexSetId()))
           && (this.completedStreamIds.equals(that.completedStreamIds()))
           && (this.failedStreamIds.equals(that.failedStreamIds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.indexSetId.hashCode();
    h *= 1000003;
    h ^= this.completedStreamIds.hashCode();
    h *= 1000003;
    h ^= this.failedStreamIds.hashCode();
    return h;
  }

}
