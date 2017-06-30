
package org.graylog2.alerts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AlertImpl extends AlertImpl {

  private final String id;
  private final String streamId;
  private final String conditionId;
  private final DateTime triggeredAt;
  private final DateTime resolvedAt;
  private final String description;
  private final Map<String, Object> conditionParameters;
  private final boolean interval;

  private AutoValue_AlertImpl(
      String id,
      String streamId,
      String conditionId,
      DateTime triggeredAt,
      @Nullable DateTime resolvedAt,
      String description,
      Map<String, Object> conditionParameters,
      boolean interval) {
    this.id = id;
    this.streamId = streamId;
    this.conditionId = conditionId;
    this.triggeredAt = triggeredAt;
    this.resolvedAt = resolvedAt;
    this.description = description;
    this.conditionParameters = conditionParameters;
    this.interval = interval;
  }

  @JsonProperty(value = "_id")
  @ObjectId
  @Id
  @Override
  public String getId() {
    return id;
  }

  @JsonProperty(value = "stream_id")
  @Override
  public String getStreamId() {
    return streamId;
  }

  @JsonProperty(value = "condition_id")
  @Override
  public String getConditionId() {
    return conditionId;
  }

  @JsonProperty(value = "triggered_at")
  @Override
  public DateTime getTriggeredAt() {
    return triggeredAt;
  }

  @JsonProperty(value = "resolved_at")
  @Nullable
  @Override
  public DateTime getResolvedAt() {
    return resolvedAt;
  }

  @JsonProperty(value = "description")
  @Override
  public String getDescription() {
    return description;
  }

  @JsonProperty(value = "condition_parameters")
  @Override
  public Map<String, Object> getConditionParameters() {
    return conditionParameters;
  }

  @JsonProperty(value = "is_interval")
  @Override
  public boolean isInterval() {
    return interval;
  }

  @Override
  public String toString() {
    return "AlertImpl{"
        + "id=" + id + ", "
        + "streamId=" + streamId + ", "
        + "conditionId=" + conditionId + ", "
        + "triggeredAt=" + triggeredAt + ", "
        + "resolvedAt=" + resolvedAt + ", "
        + "description=" + description + ", "
        + "conditionParameters=" + conditionParameters + ", "
        + "interval=" + interval
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlertImpl) {
      AlertImpl that = (AlertImpl) o;
      return (this.id.equals(that.getId()))
           && (this.streamId.equals(that.getStreamId()))
           && (this.conditionId.equals(that.getConditionId()))
           && (this.triggeredAt.equals(that.getTriggeredAt()))
           && ((this.resolvedAt == null) ? (that.getResolvedAt() == null) : this.resolvedAt.equals(that.getResolvedAt()))
           && (this.description.equals(that.getDescription()))
           && (this.conditionParameters.equals(that.getConditionParameters()))
           && (this.interval == that.isInterval());
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
    h ^= this.conditionId.hashCode();
    h *= 1000003;
    h ^= this.triggeredAt.hashCode();
    h *= 1000003;
    h ^= (resolvedAt == null) ? 0 : this.resolvedAt.hashCode();
    h *= 1000003;
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.conditionParameters.hashCode();
    h *= 1000003;
    h ^= this.interval ? 1231 : 1237;
    return h;
  }

  @Override
  public AlertImpl.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder implements AlertImpl.Builder {
    private String id;
    private String streamId;
    private String conditionId;
    private DateTime triggeredAt;
    private DateTime resolvedAt;
    private String description;
    private Map<String, Object> conditionParameters;
    private Boolean interval;
    Builder() {
    }
    private Builder(AlertImpl source) {
      this.id = source.getId();
      this.streamId = source.getStreamId();
      this.conditionId = source.getConditionId();
      this.triggeredAt = source.getTriggeredAt();
      this.resolvedAt = source.getResolvedAt();
      this.description = source.getDescription();
      this.conditionParameters = source.getConditionParameters();
      this.interval = source.isInterval();
    }
    @Override
    public AlertImpl.Builder id(String id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public AlertImpl.Builder streamId(String streamId) {
      if (streamId == null) {
        throw new NullPointerException("Null streamId");
      }
      this.streamId = streamId;
      return this;
    }
    @Override
    public AlertImpl.Builder conditionId(String conditionId) {
      if (conditionId == null) {
        throw new NullPointerException("Null conditionId");
      }
      this.conditionId = conditionId;
      return this;
    }
    @Override
    public AlertImpl.Builder triggeredAt(DateTime triggeredAt) {
      if (triggeredAt == null) {
        throw new NullPointerException("Null triggeredAt");
      }
      this.triggeredAt = triggeredAt;
      return this;
    }
    @Override
    public AlertImpl.Builder resolvedAt(@Nullable DateTime resolvedAt) {
      this.resolvedAt = resolvedAt;
      return this;
    }
    @Override
    public AlertImpl.Builder description(String description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public AlertImpl.Builder conditionParameters(Map<String, Object> conditionParameters) {
      if (conditionParameters == null) {
        throw new NullPointerException("Null conditionParameters");
      }
      this.conditionParameters = conditionParameters;
      return this;
    }
    @Override
    public AlertImpl.Builder interval(boolean interval) {
      this.interval = interval;
      return this;
    }
    @Override
    public AlertImpl build() {
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.streamId == null) {
        missing += " streamId";
      }
      if (this.conditionId == null) {
        missing += " conditionId";
      }
      if (this.triggeredAt == null) {
        missing += " triggeredAt";
      }
      if (this.description == null) {
        missing += " description";
      }
      if (this.conditionParameters == null) {
        missing += " conditionParameters";
      }
      if (this.interval == null) {
        missing += " interval";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AlertImpl(
          this.id,
          this.streamId,
          this.conditionId,
          this.triggeredAt,
          this.resolvedAt,
          this.description,
          this.conditionParameters,
          this.interval);
    }
  }

}
