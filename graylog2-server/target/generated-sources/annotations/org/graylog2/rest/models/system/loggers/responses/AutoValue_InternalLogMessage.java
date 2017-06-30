package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

final class AutoValue_InternalLogMessage extends $AutoValue_InternalLogMessage {
  AutoValue_InternalLogMessage(String message, String className, String level, String marker,
      DateTime timestamp, String throwable, String threadName, Map<String, String> context) {
    super(message, className, level, marker, timestamp, throwable, threadName, context);
  }

  @JsonIgnore
  @NotEmpty
  public final String getMessage() {
    return message();
  }

  @JsonIgnore
  @NotEmpty
  public final String getClassName() {
    return className();
  }

  @JsonIgnore
  @NotEmpty
  public final String getLevel() {
    return level();
  }

  @JsonIgnore
  @Nullable
  public final String getMarker() {
    return marker();
  }

  @JsonIgnore
  @NotNull
  public final DateTime getTimestamp() {
    return timestamp();
  }

  @JsonIgnore
  @Nullable
  public final String getThrowable() {
    return throwable();
  }

  @JsonIgnore
  @NotEmpty
  public final String getThreadName() {
    return threadName();
  }

  @JsonIgnore
  @NotNull
  public final Map<String, String> getContext() {
    return context();
  }
}
