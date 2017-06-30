
package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.joda.time.Period;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_TimeBasedRotationStrategyResponse extends TimeBasedRotationStrategyResponse {

  private final String type;
  private final int maxNumberOfIndices;
  private final Period maxTimePerIndex;

  $AutoValue_TimeBasedRotationStrategyResponse(
      String type,
      int maxNumberOfIndices,
      Period maxTimePerIndex) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.maxNumberOfIndices = maxNumberOfIndices;
    if (maxTimePerIndex == null) {
      throw new NullPointerException("Null maxTimePerIndex");
    }
    this.maxTimePerIndex = maxTimePerIndex;
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

  @JsonProperty(value = "max_time_per_index")
  @Override
  public Period maxTimePerIndex() {
    return maxTimePerIndex;
  }

  @Override
  public String toString() {
    return "TimeBasedRotationStrategyResponse{"
        + "type=" + type + ", "
        + "maxNumberOfIndices=" + maxNumberOfIndices + ", "
        + "maxTimePerIndex=" + maxTimePerIndex
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TimeBasedRotationStrategyResponse) {
      TimeBasedRotationStrategyResponse that = (TimeBasedRotationStrategyResponse) o;
      return (this.type.equals(that.type()))
           && (this.maxNumberOfIndices == that.maxNumberOfIndices())
           && (this.maxTimePerIndex.equals(that.maxTimePerIndex()));
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
    h ^= this.maxTimePerIndex.hashCode();
    return h;
  }

}
