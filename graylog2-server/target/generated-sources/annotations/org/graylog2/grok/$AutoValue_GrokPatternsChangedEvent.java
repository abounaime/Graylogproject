
package org.graylog2.grok;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GrokPatternsChangedEvent extends GrokPatternsChangedEvent {

  private final Set<String> deletedPatterns;
  private final Set<String> updatedPatterns;

  $AutoValue_GrokPatternsChangedEvent(
      Set<String> deletedPatterns,
      Set<String> updatedPatterns) {
    if (deletedPatterns == null) {
      throw new NullPointerException("Null deletedPatterns");
    }
    this.deletedPatterns = deletedPatterns;
    if (updatedPatterns == null) {
      throw new NullPointerException("Null updatedPatterns");
    }
    this.updatedPatterns = updatedPatterns;
  }

  @JsonProperty
  @Override
  public Set<String> deletedPatterns() {
    return deletedPatterns;
  }

  @JsonProperty
  @Override
  public Set<String> updatedPatterns() {
    return updatedPatterns;
  }

  @Override
  public String toString() {
    return "GrokPatternsChangedEvent{"
        + "deletedPatterns=" + deletedPatterns + ", "
        + "updatedPatterns=" + updatedPatterns
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GrokPatternsChangedEvent) {
      GrokPatternsChangedEvent that = (GrokPatternsChangedEvent) o;
      return (this.deletedPatterns.equals(that.deletedPatterns()))
           && (this.updatedPatterns.equals(that.updatedPatterns()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.deletedPatterns.hashCode();
    h *= 1000003;
    h ^= this.updatedPatterns.hashCode();
    return h;
  }

}
