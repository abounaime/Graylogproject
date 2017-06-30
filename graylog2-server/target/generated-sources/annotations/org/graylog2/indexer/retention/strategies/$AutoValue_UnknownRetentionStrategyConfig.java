
package org.graylog2.indexer.retention.strategies;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_UnknownRetentionStrategyConfig extends UnknownRetentionStrategyConfig {

  private final String type;

  $AutoValue_UnknownRetentionStrategyConfig(
      String type) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @Override
  public String toString() {
    return "UnknownRetentionStrategyConfig{"
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UnknownRetentionStrategyConfig) {
      UnknownRetentionStrategyConfig that = (UnknownRetentionStrategyConfig) o;
      return (this.type.equals(that.type()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    return h;
  }

}
