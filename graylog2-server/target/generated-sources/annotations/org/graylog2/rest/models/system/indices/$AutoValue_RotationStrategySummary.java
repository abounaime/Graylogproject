
package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.graylog2.plugin.indexer.rotation.RotationStrategyConfig;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RotationStrategySummary extends RotationStrategySummary {

  private final String strategy;
  private final RotationStrategyConfig config;

  $AutoValue_RotationStrategySummary(
      String strategy,
      RotationStrategyConfig config) {
    if (strategy == null) {
      throw new NullPointerException("Null strategy");
    }
    this.strategy = strategy;
    if (config == null) {
      throw new NullPointerException("Null config");
    }
    this.config = config;
  }

  @JsonProperty
  @Override
  public String strategy() {
    return strategy;
  }

  @JsonProperty
  @Override
  public RotationStrategyConfig config() {
    return config;
  }

  @Override
  public String toString() {
    return "RotationStrategySummary{"
        + "strategy=" + strategy + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RotationStrategySummary) {
      RotationStrategySummary that = (RotationStrategySummary) o;
      return (this.strategy.equals(that.strategy()))
           && (this.config.equals(that.config()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.strategy.hashCode();
    h *= 1000003;
    h ^= this.config.hashCode();
    return h;
  }

}
