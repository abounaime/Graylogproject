
package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlarmCallbackSummary extends AlarmCallbackSummary {

  private final String id;
  private final String streamId;
  private final String type;
  private final String title;
  private final Map<String, Object> configuration;
  private final Date createdAt;
  private final String creatorUserId;

  $AutoValue_AlarmCallbackSummary(
      String id,
      String streamId,
      String type,
      @Nullable String title,
      Map<String, Object> configuration,
      Date createdAt,
      String creatorUserId) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (streamId == null) {
      throw new NullPointerException("Null streamId");
    }
    this.streamId = streamId;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.title = title;
    if (configuration == null) {
      throw new NullPointerException("Null configuration");
    }
    this.configuration = configuration;
    if (createdAt == null) {
      throw new NullPointerException("Null createdAt");
    }
    this.createdAt = createdAt;
    if (creatorUserId == null) {
      throw new NullPointerException("Null creatorUserId");
    }
    this.creatorUserId = creatorUserId;
  }

  @JsonProperty
  @Override
  public String id() {
    return id;
  }

  @JsonProperty(value = "stream_id")
  @Override
  public String streamId() {
    return streamId;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "title")
  @Nullable
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Override
  public Map<String, Object> configuration() {
    return configuration;
  }

  @JsonProperty(value = "created_at")
  @Override
  public Date createdAt() {
    return createdAt;
  }

  @JsonProperty(value = "creator_user_id")
  @Override
  public String creatorUserId() {
    return creatorUserId;
  }

  @Override
  public String toString() {
    return "AlarmCallbackSummary{"
        + "id=" + id + ", "
        + "streamId=" + streamId + ", "
        + "type=" + type + ", "
        + "title=" + title + ", "
        + "configuration=" + configuration + ", "
        + "createdAt=" + createdAt + ", "
        + "creatorUserId=" + creatorUserId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlarmCallbackSummary) {
      AlarmCallbackSummary that = (AlarmCallbackSummary) o;
      return (this.id.equals(that.id()))
           && (this.streamId.equals(that.streamId()))
           && (this.type.equals(that.type()))
           && ((this.title == null) ? (that.title() == null) : this.title.equals(that.title()))
           && (this.configuration.equals(that.configuration()))
           && (this.createdAt.equals(that.createdAt()))
           && (this.creatorUserId.equals(that.creatorUserId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.streamId.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= (title == null) ? 0 : this.title.hashCode();
    h *= 1000003;
    h ^= this.configuration.hashCode();
    h *= 1000003;
    h ^= this.createdAt.hashCode();
    h *= 1000003;
    h ^= this.creatorUserId.hashCode();
    return h;
  }

}
