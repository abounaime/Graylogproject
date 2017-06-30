
package org.graylog2.rest.models.system.indices;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.graylog2.plugin.indexer.retention.RetentionStrategyConfig;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RetentionStrategySummary extends RetentionStrategySummary {

  private final String strategy;
  private final RetentionStrategyConfig config;

  $AutoValue_RetentionStrategySummary(
      String strategy,
      RetentionStrategyConfig config) {
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
  public RetentionStrategyConfig config() {
    return config;
  }

  @Override
  public String toString() {
    return "RetentionStrategySummary{"
        + "strategy=" + strategy + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RetentionStrategySummary) {
      RetentionStrategySummary that = (RetentionStrategySummary) o;
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
