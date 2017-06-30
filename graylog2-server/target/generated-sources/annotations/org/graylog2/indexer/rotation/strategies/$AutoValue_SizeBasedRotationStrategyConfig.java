
package org.graylog2.indexer.rotation.strategies;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SizeBasedRotationStrategyConfig extends SizeBasedRotationStrategyConfig {

  private final String type;
  private final long maxSize;

  $AutoValue_SizeBasedRotationStrategyConfig(
      String type,
      long maxSize) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.maxSize = maxSize;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "max_size")
  @Override
  public long maxSize() {
    return maxSize;
  }

  @Override
  public String toString() {
    return "SizeBasedRotationStrategyConfig{"
        + "type=" + type + ", "
        + "maxSize=" + maxSize
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SizeBasedRotationStrategyConfig) {
      SizeBasedRotationStrategyConfig that = (SizeBasedRotationStrategyConfig) o;
      return (this.type.equals(that.type()))
           && (this.maxSize == that.maxSize());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= (this.maxSize >>> 32) ^ this.maxSize;
    return h;
  }

}
