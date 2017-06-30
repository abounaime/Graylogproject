
package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RetentionStrategies extends RetentionStrategies {

  private final int total;
  private final Set<RetentionStrategyDescription> strategies;

  $AutoValue_RetentionStrategies(
      int total,
      Set<RetentionStrategyDescription> strategies) {
    this.total = total;
    if (strategies == null) {
      throw new NullPointerException("Null strategies");
    }
    this.strategies = strategies;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public Set<RetentionStrategyDescription> strategies() {
    return strategies;
  }

  @Override
  public String toString() {
    return "RetentionStrategies{"
        + "total=" + total + ", "
        + "strategies=" + strategies
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RetentionStrategies) {
      RetentionStrategies that = (RetentionStrategies) o;
      return (this.total == that.total())
           && (this.strategies.equals(that.strategies()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.strategies.hashCode();
    return h;
  }

}
