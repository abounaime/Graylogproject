package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;

final class AutoValue_LoggersSummary extends $AutoValue_LoggersSummary {
  AutoValue_LoggersSummary(int total, Map<String, SingleLoggerSummary> loggers) {
    super(total, loggers);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final Map<String, SingleLoggerSummary> getLoggers() {
    return loggers();
  }
}
