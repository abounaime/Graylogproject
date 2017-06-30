
package org.graylog2.indexer.rotation.strategies;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MessageCountRotationStrategyConfig extends MessageCountRotationStrategyConfig {

  private final String type;
  private final int maxDocsPerIndex;

  $AutoValue_MessageCountRotationStrategyConfig(
      String type,
      int maxDocsPerIndex) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.maxDocsPerIndex = maxDocsPerIndex;
  }

  @JsonProperty(value = "type")
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "max_docs_per_index")
  @Override
  public int maxDocsPerIndex() {
    return maxDocsPerIndex;
  }

  @Override
  public String toString() {
    return "MessageCountRotationStrategyConfig{"
        + "type=" + type + ", "
        + "maxDocsPerIndex=" + maxDocsPerIndex
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageCountRotationStrategyConfig) {
      MessageCountRotationStrategyConfig that = (MessageCountRotationStrategyConfig) o;
      return (this.type.equals(that.type()))
           && (this.maxDocsPerIndex == that.maxDocsPerIndex());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.maxDocsPerIndex;
    return h;
  }

}
