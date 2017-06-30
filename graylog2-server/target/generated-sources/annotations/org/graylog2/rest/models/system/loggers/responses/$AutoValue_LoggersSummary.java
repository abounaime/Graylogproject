
package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LoggersSummary extends LoggersSummary {

  private final int total;
  private final Map<String, SingleLoggerSummary> loggers;

  $AutoValue_LoggersSummary(
      int total,
      Map<String, SingleLoggerSummary> loggers) {
    this.total = total;
    if (loggers == null) {
      throw new NullPointerException("Null loggers");
    }
    this.loggers = loggers;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public Map<String, SingleLoggerSummary> loggers() {
    return loggers;
  }

  @Override
  public String toString() {
    return "LoggersSummary{"
        + "total=" + total + ", "
        + "loggers=" + loggers
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LoggersSummary) {
      LoggersSummary that = (LoggersSummary) o;
      return (this.total == that.total())
           && (this.loggers.equals(that.loggers()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.loggers.hashCode();
    return h;
  }

}
