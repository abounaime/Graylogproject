
package org.graylog2.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterEvent extends ClusterEvent {

  private final String id;
  private final long timestamp;
  private final String producer;
  private final Set<String> consumers;
  private final String eventClass;
  private final Object payload;

  $AutoValue_ClusterEvent(
      @Nullable String id,
      long timestamp,
      @Nullable String producer,
      @Nullable Set<String> consumers,
      @Nullable String eventClass,
      @Nullable Object payload) {
    this.id = id;
    this.timestamp = timestamp;
    this.producer = producer;
    this.consumers = consumers;
    this.eventClass = eventClass;
    this.payload = payload;
  }

  @Id
  @ObjectId
  @Nullable
  @Override
  public String id() {
    return id;
  }

  @JsonProperty
  @Override
  public long timestamp() {
    return timestamp;
  }

  @JsonProperty
  @Nullable
  @Override
  public String producer() {
    return producer;
  }

  @JsonProperty
  @Nullable
  @Override
  public Set<String> consumers() {
    return consumers;
  }

  @JsonProperty
  @Nullable
  @Override
  public String eventClass() {
    return eventClass;
  }

  @JsonProperty
  @Nullable
  @Override
  public Object payload() {
    return payload;
  }

  @Override
  public String toString() {
    return "ClusterEvent{"
        + "id=" + id + ", "
        + "timestamp=" + timestamp + ", "
        + "producer=" + producer + ", "
        + "consumers=" + consumers + ", "
        + "eventClass=" + eventClass + ", "
        + "payload=" + payload
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterEvent) {
      ClusterEvent that = (ClusterEvent) o;
      return ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && (this.timestamp == that.timestamp())
           && ((this.producer == null) ? (that.producer() == null) : this.producer.equals(that.producer()))
           && ((this.consumers == null) ? (that.consumers() == null) : this.consumers.equals(that.consumers()))
           && ((this.eventClass == null) ? (that.eventClass() == null) : this.eventClass.equals(that.eventClass()))
           && ((this.payload == null) ? (that.payload() == null) : this.payload.equals(that.payload()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    h *= 1000003;
    h ^= (this.timestamp >>> 32) ^ this.timestamp;
    h *= 1000003;
    h ^= (producer == null) ? 0 : this.producer.hashCode();
    h *= 1000003;
    h ^= (consumers == null) ? 0 : this.consumers.hashCode();
    h *= 1000003;
    h ^= (eventClass == null) ? 0 : this.eventClass.hashCode();
    h *= 1000003;
    h ^= (payload == null) ? 0 : this.payload.hashCode();
    return h;
  }

}
