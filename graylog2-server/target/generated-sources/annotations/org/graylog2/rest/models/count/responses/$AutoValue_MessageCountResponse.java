
package org.graylog2.rest.models.count.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MessageCountResponse extends MessageCountResponse {

  private final long events;

  $AutoValue_MessageCountResponse(
      long events) {
    this.events = events;
  }

  @JsonProperty
  @Override
  public long events() {
    return events;
  }

  @Override
  public String toString() {
    return "MessageCountResponse{"
        + "events=" + events
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageCountResponse) {
      MessageCountResponse that = (MessageCountResponse) o;
      return (this.events == that.events());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.events >>> 32) ^ this.events;
    return h;
  }

}
