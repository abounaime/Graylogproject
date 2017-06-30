
package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_V20161215163900_MoveIndexSetDefaultConfig_MigrationCompleted extends V20161215163900_MoveIndexSetDefaultConfig.MigrationCompleted {

  private final Set<String> indexSetIds;

  AutoValue_V20161215163900_MoveIndexSetDefaultConfig_MigrationCompleted(
      Set<String> indexSetIds) {
    if (indexSetIds == null) {
      throw new NullPointerException("Null indexSetIds");
    }
    this.indexSetIds = indexSetIds;
  }

  @JsonProperty(value = "index_set_ids")
  @Override
  public Set<String> indexSetIds() {
    return indexSetIds;
  }

  @Override
  public String toString() {
    return "MigrationCompleted{"
        + "indexSetIds=" + indexSetIds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof V20161215163900_MoveIndexSetDefaultConfig.MigrationCompleted) {
      V20161215163900_MoveIndexSetDefaultConfig.MigrationCompleted that = (V20161215163900_MoveIndexSetDefaultConfig.MigrationCompleted) o;
      return (this.indexSetIds.equals(that.indexSetIds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.indexSetIds.hashCode();
    return h;
  }

}
