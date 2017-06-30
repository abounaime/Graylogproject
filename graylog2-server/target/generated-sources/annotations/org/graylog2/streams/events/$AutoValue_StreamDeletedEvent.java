
package org.graylog2.streams.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_StreamDeletedEvent extends StreamDeletedEvent {

  private final String streamId;

  $AutoValue_StreamDeletedEvent(
      String streamId) {
    if (streamId == null) {
      throw new NullPointerException("Null streamId");
    }
    this.streamId = streamId;
  }

  @JsonProperty(value = "stream_id")
  @Override
  public String streamId() {
    return streamId;
  }

  @Override
  public String toString() {
    return "StreamDeletedEvent{"
        + "streamId=" + streamId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StreamDeletedEvent) {
      StreamDeletedEvent that = (StreamDeletedEvent) o;
      return (this.streamId.equals(that.streamId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.streamId.hashCode();
    return h;
  }

}
