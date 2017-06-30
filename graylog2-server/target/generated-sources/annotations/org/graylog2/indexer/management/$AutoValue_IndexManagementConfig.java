
package org.graylog2.indexer.management;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexManagementConfig extends IndexManagementConfig {

  private final String rotationStrategy;
  private final String retentionStrategy;

  $AutoValue_IndexManagementConfig(
      String rotationStrategy,
      String retentionStrategy) {
    if (rotationStrategy == null) {
      throw new NullPointerException("Null rotationStrategy");
    }
    this.rotationStrategy = rotationStrategy;
    if (retentionStrategy == null) {
      throw new NullPointerException("Null retentionStrategy");
    }
    this.retentionStrategy = retentionStrategy;
  }

  @JsonProperty(value = "rotation_strategy")
  @Override
  public String rotationStrategy() {
    return rotationStrategy;
  }

  @JsonProperty(value = "retention_strategy")
  @Override
  public String retentionStrategy() {
    return retentionStrategy;
  }

  @Override
  public String toString() {
    return "IndexManagementConfig{"
        + "rotationStrategy=" + rotationStrategy + ", "
        + "retentionStrategy=" + retentionStrategy
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexManagementConfig) {
      IndexManagementConfig that = (IndexManagementConfig) o;
      return (this.rotationStrategy.equals(that.rotationStrategy()))
           && (this.retentionStrategy.equals(that.retentionStrategy()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.rotationStrategy.hashCode();
    h *= 1000003;
    h ^= this.retentionStrategy.hashCode();
    return h;
  }

}
