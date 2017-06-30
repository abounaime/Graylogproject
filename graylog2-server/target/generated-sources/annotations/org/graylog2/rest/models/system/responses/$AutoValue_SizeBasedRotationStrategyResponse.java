
package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SizeBasedRotationStrategyResponse extends SizeBasedRotationStrategyResponse {

  private final String type;
  private final int maxNumberOfIndices;
  private final long maxSizePerIndex;

  $AutoValue_SizeBasedRotationStrategyResponse(
      String type,
      int maxNumberOfIndices,
      long maxSizePerIndex) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.maxNumberOfIndices = maxNumberOfIndices;
    this.maxSizePerIndex = maxSizePerIndex;
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

  @JsonProperty(value = "max_size_per_index")
  @Override
  public long maxSizePerIndex() {
    return maxSizePerIndex;
  }

  @Override
  public String toString() {
    return "SizeBasedRotationStrategyResponse{"
        + "type=" + type + ", "
        + "maxNumberOfIndices=" + maxNumberOfIndices + ", "
        + "maxSizePerIndex=" + maxSizePerIndex
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SizeBasedRotationStrategyResponse) {
      SizeBasedRotationStrategyResponse that = (SizeBasedRotationStrategyResponse) o;
      return (this.type.equals(that.type()))
           && (this.maxNumberOfIndices == that.maxNumberOfIndices())
           && (this.maxSizePerIndex == that.maxSizePerIndex());
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
    h ^= (this.maxSizePerIndex >>> 32) ^ this.maxSizePerIndex;
    return h;
  }

}
