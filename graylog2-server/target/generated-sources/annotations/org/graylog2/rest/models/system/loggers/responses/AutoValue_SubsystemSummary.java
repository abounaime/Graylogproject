package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;

final class AutoValue_SubsystemSummary extends $AutoValue_SubsystemSummary {
  AutoValue_SubsystemSummary(Map<String, SingleSubsystemSummary> subsystems) {
    super(subsystems);
  }

  @JsonIgnore
  public final Map<String, SingleSubsystemSummary> getSubsystems() {
    return subsystems();
  }
}
