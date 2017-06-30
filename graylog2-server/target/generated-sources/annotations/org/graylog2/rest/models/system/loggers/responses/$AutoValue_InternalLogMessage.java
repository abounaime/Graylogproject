
package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InternalLogMessage extends InternalLogMessage {

  private final String message;
  private final String className;
  private final String level;
  private final String marker;
  private final DateTime timestamp;
  private final String throwable;
  private final String threadName;
  private final Map<String, String> context;

  $AutoValue_InternalLogMessage(
      String message,
      String className,
      String level,
      @Nullable String marker,
      DateTime timestamp,
      @Nullable String throwable,
      String threadName,
      Map<String, String> context) {
    if (message == null) {
      throw new NullPointerException("Null message");
    }
    this.message = message;
    if (className == null) {
      throw new NullPointerException("Null className");
    }
    this.className = className;
    if (level == null) {
      throw new NullPointerException("Null level");
    }
    this.level = level;
    this.marker = marker;
    if (timestamp == null) {
      throw new NullPointerException("Null timestamp");
    }
    this.timestamp = timestamp;
    this.throwable = throwable;
    if (threadName == null) {
      throw new NullPointerException("Null threadName");
    }
    this.threadName = threadName;
    if (context == null) {
      throw new NullPointerException("Null context");
    }
    this.context = context;
  }

  @JsonProperty
  @NotEmpty
  @Override
  public String message() {
    return message;
  }

  @JsonProperty(value = "class_name")
  @NotEmpty
  @Override
  public String className() {
    return className;
  }

  @JsonProperty
  @NotEmpty
  @Override
  public String level() {
    return level;
  }

  @JsonProperty
  @Nullable
  @Override
  public String marker() {
    return marker;
  }

  @JsonProperty
  @NotNull
  @Override
  public DateTime timestamp() {
    return timestamp;
  }

  @JsonProperty
  @Nullable
  @Override
  public String throwable() {
    return throwable;
  }

  @JsonProperty(value = "thread_name")
  @NotEmpty
  @Override
  public String threadName() {
    return threadName;
  }

  @JsonProperty
  @NotNull
  @Override
  public Map<String, String> context() {
    return context;
  }

  @Override
  public String toString() {
    return "InternalLogMessage{"
        + "message=" + message + ", "
        + "className=" + className + ", "
        + "level=" + level + ", "
        + "marker=" + marker + ", "
        + "timestamp=" + timestamp + ", "
        + "throwable=" + throwable + ", "
        + "threadName=" + threadName + ", "
        + "context=" + context
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InternalLogMessage) {
      InternalLogMessage that = (InternalLogMessage) o;
      return (this.message.equals(that.message()))
           && (this.className.equals(that.className()))
           && (this.level.equals(that.level()))
           && ((this.marker == null) ? (that.marker() == null) : this.marker.equals(that.marker()))
           && (this.timestamp.equals(that.timestamp()))
           && ((this.throwable == null) ? (that.throwable() == null) : this.throwable.equals(that.throwable()))
           && (this.threadName.equals(that.threadName()))
           && (this.context.equals(that.context()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.message.hashCode();
    h *= 1000003;
    h ^= this.className.hashCode();
    h *= 1000003;
    h ^= this.level.hashCode();
    h *= 1000003;
    h ^= (marker == null) ? 0 : this.marker.hashCode();
    h *= 1000003;
    h ^= this.timestamp.hashCode();
    h *= 1000003;
    h ^= (throwable == null) ? 0 : this.throwable.hashCode();
    h *= 1000003;
    h ^= this.threadName.hashCode();
    h *= 1000003;
    h ^= this.context.hashCode();
    return h;
  }

}
