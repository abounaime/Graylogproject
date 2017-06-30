package org.graylog2.streams.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_StreamDeletedEvent extends $AutoValue_StreamDeletedEvent {
  AutoValue_StreamDeletedEvent(String streamId) {
    super(streamId);
  }

  @JsonIgnore
  public final String getStreamId() {
    return streamId();
  }
}
