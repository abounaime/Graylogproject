
package org.graylog2.indexer.rotation.strategies;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.joda.time.Period;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_TimeBasedRotationStrategyConfig extends TimeBasedRotationStrategyConfig {

  private final String type;
  private final Period rotationPeriod;

  $AutoValue_TimeBasedRotationStrategyConfig(
      String type,
      Period rotationPeriod) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (rotationPeriod == null) {
      throw new NullPointerException("Null rotationPeriod");
    }
    this.rotationPeriod = rotationPeriod;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "rotation_period")
  @Override
  public Period rotationPeriod() {
    return rotationPeriod;
  }

  @Override
  public String toString() {
    return "TimeBasedRotationStrategyConfig{"
        + "type=" + type + ", "
        + "rotationPeriod=" + rotationPeriod
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TimeBasedRotationStrategyConfig) {
      TimeBasedRotationStrategyConfig that = (TimeBasedRotationStrategyConfig) o;
      return (this.type.equals(that.type()))
           && (this.rotationPeriod.equals(that.rotationPeriod()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.rotationPeriod.hashCode();
    return h;
  }

}
