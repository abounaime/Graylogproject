
package org.graylog2.rest.models.streams.alerts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlertSummary extends AlertSummary {

  private final String id;
  private final String conditionId;
  private final String streamId;
  private final String description;
  private final Map<String, Object> conditionParameters;
  private final DateTime triggeredAt;
  private final DateTime resolvedAt;
  private final boolean isInterval;

  $AutoValue_AlertSummary(
      String id,
      String conditionId,
      String streamId,
      String description,
      Map<String, Object> conditionParameters,
      DateTime triggeredAt,
      @Nullable DateTime resolvedAt,
      boolean isInterval) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (conditionId == null) {
      throw new NullPointerException("Null conditionId");
    }
    this.conditionId = conditionId;
    if (streamId == null) {
      throw new NullPointerException("Null streamId");
    }
    this.streamId = streamId;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (conditionParameters == null) {
      throw new NullPointerException("Null conditionParameters");
    }
    this.conditionParameters = conditionParameters;
    if (triggeredAt == null) {
      throw new NullPointerException("Null triggeredAt");
    }
    this.triggeredAt = triggeredAt;
    this.resolvedAt = resolvedAt;
    this.isInterval = isInterval;
  }

  @JsonProperty
  @Override
  public String id() {
    return id;
  }

  @JsonProperty(value = "condition_id")
  @Override
  public String conditionId() {
    return conditionId;
  }

  @JsonProperty(value = "stream_id")
  @Override
  public String streamId() {
    return streamId;
  }

  @JsonProperty
  @Override
  public String description() {
    return description;
  }

  @JsonProperty(value = "condition_parameters")
  @Override
  public Map<String, Object> conditionParameters() {
    return conditionParameters;
  }

  @JsonProperty(value = "triggered_at")
  @Override
  public DateTime triggeredAt() {
    return triggeredAt;
  }

  @JsonProperty(value = "resolved_at")
  @Nullable
  @Override
  public DateTime resolvedAt() {
    return resolvedAt;
  }

  @JsonProperty(value = "is_interval")
  @Override
  public boolean isInterval() {
    return isInterval;
  }

  @Override
  public String toString() {
    return "AlertSummary{"
        + "id=" + id + ", "
        + "conditionId=" + conditionId + ", "
        + "streamId=" + streamId + ", "
        + "description=" + description + ", "
        + "conditionParameters=" + conditionParameters + ", "
        + "triggeredAt=" + triggeredAt + ", "
        + "resolvedAt=" + resolvedAt + ", "
        + "isInterval=" + isInterval
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlertSummary) {
      AlertSummary that = (AlertSummary) o;
      return (this.id.equals(that.id()))
           && (this.conditionId.equals(that.conditionId()))
           && (this.streamId.equals(that.streamId()))
           && (this.description.equals(that.description()))
           && (this.conditionParameters.equals(that.conditionParameters()))
           && (this.triggeredAt.equals(that.triggeredAt()))
           && ((this.resolvedAt == null) ? (that.resolvedAt() == null) : this.resolvedAt.equals(that.resolvedAt()))
           && (this.isInterval == that.isInterval());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.conditionId.hashCode();
    h *= 1000003;
    h ^= this.streamId.hashCode();
    h *= 1000003;
    h ^= this.description.hashCode();
    h *= 1000003;
    h ^= this.conditionParameters.hashCode();
    h *= 1000003;
    h ^= this.triggeredAt.hashCode();
    h *= 1000003;
    h ^= (resolvedAt == null) ? 0 : this.resolvedAt.hashCode();
    h *= 1000003;
    h ^= this.isInterval ? 1231 : 1237;
    return h;
  }

}
