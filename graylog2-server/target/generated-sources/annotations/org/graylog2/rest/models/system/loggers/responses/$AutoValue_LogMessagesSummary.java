
package org.graylog2.rest.models.system.loggers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_LogMessagesSummary extends LogMessagesSummary {

  private final Collection<InternalLogMessage> messages;

  $AutoValue_LogMessagesSummary(
      Collection<InternalLogMessage> messages) {
    if (messages == null) {
      throw new NullPointerException("Null messages");
    }
    this.messages = messages;
  }

  @JsonProperty
  @Override
  public Collection<InternalLogMessage> messages() {
    return messages;
  }

  @Override
  public String toString() {
    return "LogMessagesSummary{"
        + "messages=" + messages
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LogMessagesSummary) {
      LogMessagesSummary that = (LogMessagesSummary) o;
      return (this.messages.equals(that.messages()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.messages.hashCode();
    return h;
  }

}
