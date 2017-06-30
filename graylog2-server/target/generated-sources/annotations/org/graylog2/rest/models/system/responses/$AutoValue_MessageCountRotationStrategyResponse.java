
package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MessageCountRotationStrategyResponse extends MessageCountRotationStrategyResponse {

  private final String type;
  private final int maxNumberOfIndices;
  private final int maxDocsPerIndex;

  $AutoValue_MessageCountRotationStrategyResponse(
      String type,
      int maxNumberOfIndices,
      int maxDocsPerIndex) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.maxNumberOfIndices = maxNumberOfIndices;
    this.maxDocsPerIndex = maxDocsPerIndex;
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

  @JsonProperty(value = "max_docs_per_index")
  @Override
  public int maxDocsPerIndex() {
    return maxDocsPerIndex;
  }

  @Override
  public String toString() {
    return "MessageCountRotationStrategyResponse{"
        + "type=" + type + ", "
        + "maxNumberOfIndices=" + maxNumberOfIndices + ", "
        + "maxDocsPerIndex=" + maxDocsPerIndex
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageCountRotationStrategyResponse) {
      MessageCountRotationStrategyResponse that = (MessageCountRotationStrategyResponse) o;
      return (this.type.equals(that.type()))
           && (this.maxNumberOfIndices == that.maxNumberOfIndices())
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
    h ^= this.maxNumberOfIndices;
    h *= 1000003;
    h ^= this.maxDocsPerIndex;
    return h;
  }

}
