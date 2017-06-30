
package org.graylog2.migrations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration_MigrationCompleted extends V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration.MigrationCompleted {

  private final Set<String> updatedIndexSetIds;
  private final Set<String> skippedIndexSetIds;
  private final String defaultIndexSet;

  $AutoValue_V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration_MigrationCompleted(
      Set<String> updatedIndexSetIds,
      Set<String> skippedIndexSetIds,
      String defaultIndexSet) {
    if (updatedIndexSetIds == null) {
      throw new NullPointerException("Null updatedIndexSetIds");
    }
    this.updatedIndexSetIds = updatedIndexSetIds;
    if (skippedIndexSetIds == null) {
      throw new NullPointerException("Null skippedIndexSetIds");
    }
    this.skippedIndexSetIds = skippedIndexSetIds;
    if (defaultIndexSet == null) {
      throw new NullPointerException("Null defaultIndexSet");
    }
    this.defaultIndexSet = defaultIndexSet;
  }

  @JsonProperty(value = "updated_index_set_ids")
  @Override
  public Set<String> updatedIndexSetIds() {
    return updatedIndexSetIds;
  }

  @JsonProperty(value = "skipped_index_set_ids")
  @Override
  public Set<String> skippedIndexSetIds() {
    return skippedIndexSetIds;
  }

  @JsonProperty(value = "default_index_set")
  @Override
  public String defaultIndexSet() {
    return defaultIndexSet;
  }

  @Override
  public String toString() {
    return "MigrationCompleted{"
        + "updatedIndexSetIds=" + updatedIndexSetIds + ", "
        + "skippedIndexSetIds=" + skippedIndexSetIds + ", "
        + "defaultIndexSet=" + defaultIndexSet
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration.MigrationCompleted) {
      V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration.MigrationCompleted that = (V20161124104700_AddRetentionRotationAndDefaultFlagToIndexSetMigration.MigrationCompleted) o;
      return (this.updatedIndexSetIds.equals(that.updatedIndexSetIds()))
           && (this.skippedIndexSetIds.equals(that.skippedIndexSetIds()))
           && (this.defaultIndexSet.equals(that.defaultIndexSet()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.updatedIndexSetIds.hashCode();
    h *= 1000003;
    h ^= this.skippedIndexSetIds.hashCode();
    h *= 1000003;
    h ^= this.defaultIndexSet.hashCode();
    return h;
  }

}
