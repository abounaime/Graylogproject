package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SingleLoggerSummary extends $AutoValue_SingleLoggerSummary {
  AutoValue_SingleLoggerSummary(String level, int levelSyslog) {
    super(level, levelSyslog);
  }

  @JsonIgnore
  public final String getLevel() {
    return level();
  }

  @JsonIgnore
  public final int getLevelSyslog() {
    return levelSyslog();
  }
}
