
package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_V20161125142400_EmailAlarmCallbackMigration_MigrationCompleted extends V20161125142400_EmailAlarmCallbackMigration.MigrationCompleted {

  private final Map<String, Optional<String>> callbackIds;

  $AutoValue_V20161125142400_EmailAlarmCallbackMigration_MigrationCompleted(
      Map<String, Optional<String>> callbackIds) {
    if (callbackIds == null) {
      throw new NullPointerException("Null callbackIds");
    }
    this.callbackIds = callbackIds;
  }

  @JsonProperty(value = "callback_ids")
  @Override
  public Map<String, Optional<String>> callbackIds() {
    return callbackIds;
  }

  @Override
  public String toString() {
    return "MigrationCompleted{"
        + "callbackIds=" + callbackIds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof V20161125142400_EmailAlarmCallbackMigration.MigrationCompleted) {
      V20161125142400_EmailAlarmCallbackMigration.MigrationCompleted that = (V20161125142400_EmailAlarmCallbackMigration.MigrationCompleted) o;
      return (this.callbackIds.equals(that.callbackIds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.callbackIds.hashCode();
    return h;
  }

}
