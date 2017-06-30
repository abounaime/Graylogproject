package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;

final class AutoValue_LogMessagesSummary extends $AutoValue_LogMessagesSummary {
  AutoValue_LogMessagesSummary(Collection<InternalLogMessage> messages) {
    super(messages);
  }

  @JsonIgnore
  public final Collection<InternalLogMessage> getMessages() {
    return messages();
  }
}
