package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SingleSubsystemSummary extends $AutoValue_SingleSubsystemSummary {
  AutoValue_SingleSubsystemSummary(String title, String category, String description, String level,
      int levelSyslog) {
    super(title, category, description, level, levelSyslog);
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final String getCategory() {
    return category();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
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
