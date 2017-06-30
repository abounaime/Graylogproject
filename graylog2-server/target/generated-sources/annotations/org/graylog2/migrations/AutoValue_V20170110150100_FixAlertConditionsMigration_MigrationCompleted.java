
package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_V20170110150100_FixAlertConditionsMigration_MigrationCompleted extends V20170110150100_FixAlertConditionsMigration.MigrationCompleted {

  private final Set<String> streamIds;
  private final Set<String> alertConditionIds;

  AutoValue_V20170110150100_FixAlertConditionsMigration_MigrationCompleted(
      Set<String> streamIds,
      Set<String> alertConditionIds) {
    if (streamIds == null) {
      throw new NullPointerException("Null streamIds");
    }
    this.streamIds = streamIds;
    if (alertConditionIds == null) {
      throw new NullPointerException("Null alertConditionIds");
    }
    this.alertConditionIds = alertConditionIds;
  }

  @JsonProperty(value = "stream_ids")
  @Override
  public Set<String> streamIds() {
    return streamIds;
  }

  @JsonProperty(value = "alert_condition_ids")
  @Override
  public Set<String> alertConditionIds() {
    return alertConditionIds;
  }

  @Override
  public String toString() {
    return "MigrationCompleted{"
        + "streamIds=" + streamIds + ", "
        + "alertConditionIds=" + alertConditionIds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof V20170110150100_FixAlertConditionsMigration.MigrationCompleted) {
      V20170110150100_FixAlertConditionsMigration.MigrationCompleted that = (V20170110150100_FixAlertConditionsMigration.MigrationCompleted) o;
      return (this.streamIds.equals(that.streamIds()))
           && (this.alertConditionIds.equals(that.alertConditionIds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.streamIds.hashCode();
    h *= 1000003;
    h ^= this.alertConditionIds.hashCode();
    return h;
  }

}
