package org.graylog2.rest.models.system.inputs.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_InputStateSummary extends $AutoValue_InputStateSummary {
  AutoValue_InputStateSummary(String id, String state, DateTime startedAt, String detailedMessage,
      InputSummary messageInput) {
    super(id, state, startedAt, detailedMessage, messageInput);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getState() {
    return state();
  }

  @JsonIgnore
  public final DateTime getStartedAt() {
    return startedAt();
  }

  @JsonIgnore
  @Nullable
  public final String getDetailedMessage() {
    return detailedMessage();
  }

  @JsonIgnore
  public final InputSummary getMessageInput() {
    return messageInput();
  }
}
