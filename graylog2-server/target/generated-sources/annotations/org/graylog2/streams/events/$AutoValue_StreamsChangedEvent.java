
package org.graylog2.streams.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_StreamsChangedEvent extends StreamsChangedEvent {

  private final ImmutableSet<String> streamIds;

  $AutoValue_StreamsChangedEvent(
      ImmutableSet<String> streamIds) {
    if (streamIds == null) {
      throw new NullPointerException("Null streamIds");
    }
    this.streamIds = streamIds;
  }

  @JsonProperty(value = "stream_ids")
  @Override
  public ImmutableSet<String> streamIds() {
    return streamIds;
  }

  @Override
  public String toString() {
    return "StreamsChangedEvent{"
        + "streamIds=" + streamIds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StreamsChangedEvent) {
      StreamsChangedEvent that = (StreamsChangedEvent) o;
      return (this.streamIds.equals(that.streamIds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.streamIds.hashCode();
    return h;
  }

}
