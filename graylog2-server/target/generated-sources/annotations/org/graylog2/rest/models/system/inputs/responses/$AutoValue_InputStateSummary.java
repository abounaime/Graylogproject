
package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_InputStateSummary extends InputStateSummary {

  private final String id;
  private final String state;
  private final DateTime startedAt;
  private final String detailedMessage;
  private final InputSummary messageInput;

  $AutoValue_InputStateSummary(
      String id,
      String state,
      DateTime startedAt,
      @Nullable String detailedMessage,
      InputSummary messageInput) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (state == null) {
      throw new NullPointerException("Null state");
    }
    this.state = state;
    if (startedAt == null) {
      throw new NullPointerException("Null startedAt");
    }
    this.startedAt = startedAt;
    this.detailedMessage = detailedMessage;
    if (messageInput == null) {
      throw new NullPointerException("Null messageInput");
    }
    this.messageInput = messageInput;
  }

  @JsonProperty
  @Override
  public String id() {
    return id;
  }

  @JsonProperty
  @Override
  public String state() {
    return state;
  }

  @JsonProperty
  @Override
  public DateTime startedAt() {
    return startedAt;
  }

  @JsonProperty
  @Nullable
  @Override
  public String detailedMessage() {
    return detailedMessage;
  }

  @JsonProperty
  @Override
  public InputSummary messageInput() {
    return messageInput;
  }

  @Override
  public String toString() {
    return "InputStateSummary{"
        + "id=" + id + ", "
        + "state=" + state + ", "
        + "startedAt=" + startedAt + ", "
        + "detailedMessage=" + detailedMessage + ", "
        + "messageInput=" + messageInput
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InputStateSummary) {
      InputStateSummary that = (InputStateSummary) o;
      return (this.id.equals(that.id()))
           && (this.state.equals(that.state()))
           && (this.startedAt.equals(that.startedAt()))
           && ((this.detailedMessage == null) ? (that.detailedMessage() == null) : this.detailedMessage.equals(that.detailedMessage()))
           && (this.messageInput.equals(that.messageInput()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.state.hashCode();
    h *= 1000003;
    h ^= this.startedAt.hashCode();
    h *= 1000003;
    h ^= (detailedMessage == null) ? 0 : this.detailedMessage.hashCode();
    h *= 1000003;
    h ^= this.messageInput.hashCode();
    return h;
  }

}
