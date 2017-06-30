package org.graylog2.grok;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_GrokPatternsChangedEvent extends $AutoValue_GrokPatternsChangedEvent {
  AutoValue_GrokPatternsChangedEvent(Set<String> deletedPatterns, Set<String> updatedPatterns) {
    super(deletedPatterns, updatedPatterns);
  }

  @JsonIgnore
  public final Set<String> getDeletedPatterns() {
    return deletedPatterns();
  }

  @JsonIgnore
  public final Set<String> getUpdatedPatterns() {
    return updatedPatterns();
  }
}
