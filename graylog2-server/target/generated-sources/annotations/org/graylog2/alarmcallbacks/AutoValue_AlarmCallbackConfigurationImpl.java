
package org.graylog2.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AlarmCallbackConfigurationImpl extends AlarmCallbackConfigurationImpl {

  private final String id;
  private final String streamId;
  private final String type;
  private final String title;
  private final Map<String, Object> configuration;
  private final Date createdAt;
  private final String creatorUserId;

  private AutoValue_AlarmCallbackConfigurationImpl(
      String id,
      String streamId,
      String type,
      @Nullable String title,
      Map<String, Object> configuration,
      Date createdAt,
      String creatorUserId) {
    this.id = id;
    this.streamId = streamId;
    this.type = type;
    this.title = title;
    this.configuration = configuration;
    this.createdAt = createdAt;
    this.creatorUserId = creatorUserId;
  }

  @JsonProperty(value = "_id")
  @ObjectId
  @Override
  public String getId() {
    return id;
  }

  @JsonProperty(value = "stream_id")
  @Override
  public String getStreamId() {
    return streamId;
  }

  @JsonProperty(value = "type")
  @Override
  public String getType() {
    return type;
  }

  @JsonProperty(value = "title")
  @Nullable
  @Override
  public String getTitle() {
    return title;
  }

  @JsonProperty(value = "configuration")
  @Override
  public Map<String, Object> getConfiguration() {
    return configuration;
  }

  @JsonProperty(value = "created_at")
  @Override
  public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(value = "creator_user_id")
  @Override
  public String getCreatorUserId() {
    return creatorUserId;
  }

  @Override
  public String toString() {
    return "AlarmCallbackConfigurationImpl{"
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
    if (o instanceof AlarmCallbackConfigurationImpl) {
      AlarmCallbackConfigurationImpl that = (AlarmCallbackConfigurationImpl) o;
      return (this.id.equals(that.getId()))
           && (this.streamId.equals(that.getStreamId()))
           && (this.type.equals(that.getType()))
           && ((this.title == null) ? (that.getTitle() == null) : this.title.equals(that.getTitle()))
           && (this.configuration.equals(that.getConfiguration()))
           && (this.createdAt.equals(that.getCreatedAt()))
           && (this.creatorUserId.equals(that.getCreatorUserId()));
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

  @Override
  public AlarmCallbackConfigurationImpl.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends AlarmCallbackConfigurationImpl.Builder {
    private String id;
    private String streamId;
    private String type;
    private String title;
    private Map<String, Object> configuration;
    private Date createdAt;
    private String creatorUserId;
    Builder() {
    }
    private Builder(AlarmCallbackConfigurationImpl source) {
      this.id = source.getId();
      this.streamId = source.getStreamId();
      this.type = source.getType();
      this.title = source.getTitle();
      this.configuration = source.getConfiguration();
      this.createdAt = source.getCreatedAt();
      this.creatorUserId = source.getCreatorUserId();
    }
    @Override
    public AlarmCallbackConfigurationImpl.Builder setId(String id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public AlarmCallbackConfigurationImpl.Builder setStreamId(String streamId) {
      if (streamId == null) {
        throw new NullPointerException("Null streamId");
      }
      this.streamId = streamId;
      return this;
    }
    @Override
    public AlarmCallbackConfigurationImpl.Builder setType(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public AlarmCallbackConfigurationImpl.Builder setTitle(@Nullable String title) {
      this.title = title;
      return this;
    }
    @Override
    public AlarmCallbackConfigurationImpl.Builder setConfiguration(Map<String, Object> configuration) {
      if (configuration == null) {
        throw new NullPointerException("Null configuration");
      }
      this.configuration = configuration;
      return this;
    }
    @Override
    public AlarmCallbackConfigurationImpl.Builder setCreatedAt(Date createdAt) {
      if (createdAt == null) {
        throw new NullPointerException("Null createdAt");
      }
      this.createdAt = createdAt;
      return this;
    }
    @Override
    public AlarmCallbackConfigurationImpl.Builder setCreatorUserId(String creatorUserId) {
      if (creatorUserId == null) {
        throw new NullPointerException("Null creatorUserId");
      }
      this.creatorUserId = creatorUserId;
      return this;
    }
    @Override
    public AlarmCallbackConfigurationImpl build() {
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.streamId == null) {
        missing += " streamId";
      }
      if (this.type == null) {
        missing += " type";
      }
      if (this.configuration == null) {
        missing += " configuration";
      }
      if (this.createdAt == null) {
        missing += " createdAt";
      }
      if (this.creatorUserId == null) {
        missing += " creatorUserId";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AlarmCallbackConfigurationImpl(
          this.id,
          this.streamId,
          this.type,
          this.title,
          this.configuration,
          this.createdAt,
          this.creatorUserId);
    }
  }

}
