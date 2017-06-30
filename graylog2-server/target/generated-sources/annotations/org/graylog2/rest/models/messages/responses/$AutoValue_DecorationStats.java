
package org.graylog2.rest.models.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DecorationStats extends DecorationStats {

  private final Map<String, Object> originalMessage;
  private final Map<String, Object> decoratedMessage;

  $AutoValue_DecorationStats(
      Map<String, Object> originalMessage,
      Map<String, Object> decoratedMessage) {
    if (originalMessage == null) {
      throw new NullPointerException("Null originalMessage");
    }
    this.originalMessage = originalMessage;
    if (decoratedMessage == null) {
      throw new NullPointerException("Null decoratedMessage");
    }
    this.decoratedMessage = decoratedMessage;
  }

  @JsonIgnore
  @Override
  public Map<String, Object> originalMessage() {
    return originalMessage;
  }

  @JsonIgnore
  @Override
  public Map<String, Object> decoratedMessage() {
    return decoratedMessage;
  }

  @Override
  public String toString() {
    return "DecorationStats{"
        + "originalMessage=" + originalMessage + ", "
        + "decoratedMessage=" + decoratedMessage
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DecorationStats) {
      DecorationStats that = (DecorationStats) o;
      return (this.originalMessage.equals(that.originalMessage()))
           && (this.decoratedMessage.equals(that.decoratedMessage()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.originalMessage.hashCode();
    h *= 1000003;
    h ^= this.decoratedMessage.hashCode();
    return h;
  }

}
