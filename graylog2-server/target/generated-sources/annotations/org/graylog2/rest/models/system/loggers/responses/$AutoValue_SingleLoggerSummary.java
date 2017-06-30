
package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SingleLoggerSummary extends SingleLoggerSummary {

  private final String level;
  private final int levelSyslog;

  $AutoValue_SingleLoggerSummary(
      String level,
      int levelSyslog) {
    if (level == null) {
      throw new NullPointerException("Null level");
    }
    this.level = level;
    this.levelSyslog = levelSyslog;
  }

  @JsonProperty
  @Override
  public String level() {
    return level;
  }

  @JsonProperty(value = "level_syslog")
  @Override
  public int levelSyslog() {
    return levelSyslog;
  }

  @Override
  public String toString() {
    return "SingleLoggerSummary{"
        + "level=" + level + ", "
        + "levelSyslog=" + levelSyslog
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SingleLoggerSummary) {
      SingleLoggerSummary that = (SingleLoggerSummary) o;
      return (this.level.equals(that.level()))
           && (this.levelSyslog == that.levelSyslog());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.level.hashCode();
    h *= 1000003;
    h ^= this.levelSyslog;
    return h;
  }

}
