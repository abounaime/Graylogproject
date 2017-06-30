
package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_V20161125161400_AlertReceiversMigration_MigrationCompleted extends V20161125161400_AlertReceiversMigration.MigrationCompleted {

  private final Map<String, Optional<String>> streamIds;

  $AutoValue_V20161125161400_AlertReceiversMigration_MigrationCompleted(
      Map<String, Optional<String>> streamIds) {
    if (streamIds == null) {
      throw new NullPointerException("Null streamIds");
    }
    this.streamIds = streamIds;
  }

  @JsonProperty(value = "stream_ids")
  @Override
  public Map<String, Optional<String>> streamIds() {
    return streamIds;
  }

  @Override
  public String toString() {
    return "MigrationCompleted{"
        + "streamIds=" + streamIds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof V20161125161400_AlertReceiversMigration.MigrationCompleted) {
      V20161125161400_AlertReceiversMigration.MigrationCompleted that = (V20161125161400_AlertReceiversMigration.MigrationCompleted) o;
      return (this.streamIds.equals(that.streamIds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.streamIds.hashCode();
    return h;
  }

}
