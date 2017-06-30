
package org.graylog2.rest.models.system.inputs.extractors.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ExtractorSummaryList extends ExtractorSummaryList {

  private final int total;
  private final List<ExtractorSummary> extractors;

  $AutoValue_ExtractorSummaryList(
      int total,
      List<ExtractorSummary> extractors) {
    this.total = total;
    if (extractors == null) {
      throw new NullPointerException("Null extractors");
    }
    this.extractors = extractors;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public List<ExtractorSummary> extractors() {
    return extractors;
  }

  @Override
  public String toString() {
    return "ExtractorSummaryList{"
        + "total=" + total + ", "
        + "extractors=" + extractors
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExtractorSummaryList) {
      ExtractorSummaryList that = (ExtractorSummaryList) o;
      return (this.total == that.total())
           && (this.extractors.equals(that.extractors()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.extractors.hashCode();
    return h;
  }

}
