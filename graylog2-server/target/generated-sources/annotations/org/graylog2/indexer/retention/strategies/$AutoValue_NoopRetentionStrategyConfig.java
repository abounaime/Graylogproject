
package org.graylog2.indexer.retention.strategies;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NoopRetentionStrategyConfig extends NoopRetentionStrategyConfig {

  private final String type;
  private final int maxNumberOfIndices;

  $AutoValue_NoopRetentionStrategyConfig(
      String type,
      int maxNumberOfIndices) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.maxNumberOfIndices = maxNumberOfIndices;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "max_number_of_indices")
  @Override
  public int maxNumberOfIndices() {
    return maxNumberOfIndices;
  }

  @Override
  public String toString() {
    return "NoopRetentionStrategyConfig{"
        + "type=" + type + ", "
        + "maxNumberOfIndices=" + maxNumberOfIndices
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NoopRetentionStrategyConfig) {
      NoopRetentionStrategyConfig that = (NoopRetentionStrategyConfig) o;
      return (this.type.equals(that.type()))
           && (this.maxNumberOfIndices == that.maxNumberOfIndices());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.maxNumberOfIndices;
    return h;
  }

}
