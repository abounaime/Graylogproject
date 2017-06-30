package org.graylog2.streams.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.ImmutableSet;
import java.lang.String;

final class AutoValue_StreamsChangedEvent extends $AutoValue_StreamsChangedEvent {
  AutoValue_StreamsChangedEvent(ImmutableSet<String> streamIds) {
    super(streamIds);
  }

  @JsonIgnore
  public final ImmutableSet<String> getStreamIds() {
    return streamIds();
  }
}
