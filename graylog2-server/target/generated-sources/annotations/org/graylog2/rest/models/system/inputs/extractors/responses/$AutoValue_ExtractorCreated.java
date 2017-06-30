
package org.graylog2.rest.models.system.inputs.extractors.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ExtractorCreated extends ExtractorCreated {

  private final String extractorId;

  $AutoValue_ExtractorCreated(
      String extractorId) {
    if (extractorId == null) {
      throw new NullPointerException("Null extractorId");
    }
    this.extractorId = extractorId;
  }

  @JsonProperty(value = "extractor_id")
  @Override
  public String extractorId() {
    return extractorId;
  }

  @Override
  public String toString() {
    return "ExtractorCreated{"
        + "extractorId=" + extractorId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExtractorCreated) {
      ExtractorCreated that = (ExtractorCreated) o;
      return (this.extractorId.equals(that.extractorId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.extractorId.hashCode();
    return h;
  }

}
