package org.graylog2.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Set;
import javax.annotation.Nullable;
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_ClusterEvent extends $AutoValue_ClusterEvent {
  AutoValue_ClusterEvent(String id, long timestamp, String producer, Set<String> consumers,
      String eventClass, Object payload) {
    super(id, timestamp, producer, consumers, eventClass, payload);
  }

  @JsonIgnore
  @Id
  @ObjectId
  @Nullable
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final long getTimestamp() {
    return timestamp();
  }

  @JsonIgnore
  @Nullable
  public final String getProducer() {
    return producer();
  }

  @JsonIgnore
  @Nullable
  public final Set<String> getConsumers() {
    return consumers();
  }

  @JsonIgnore
  @Nullable
  public final String getEventClass() {
    return eventClass();
  }

  @JsonIgnore
  @Nullable
  public final Object getPayload() {
    return payload();
  }
}
