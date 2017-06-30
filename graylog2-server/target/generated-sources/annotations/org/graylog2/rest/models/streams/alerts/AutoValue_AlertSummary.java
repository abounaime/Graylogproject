package org.graylog2.rest.models.streams.alerts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_AlertSummary extends $AutoValue_AlertSummary {
  AutoValue_AlertSummary(String id, String conditionId, String streamId, String description,
      Map<String, Object> conditionParameters, DateTime triggeredAt, DateTime resolvedAt,
      boolean isInterval) {
    super(id, conditionId, streamId, description, conditionParameters, triggeredAt, resolvedAt, isInterval);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final String getConditionId() {
    return conditionId();
  }

  @JsonIgnore
  public final String getStreamId() {
    return streamId();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final Map<String, Object> getConditionParameters() {
    return conditionParameters();
  }

  @JsonIgnore
  public final DateTime getTriggeredAt() {
    return triggeredAt();
  }

  @JsonIgnore
  @Nullable
  public final DateTime getResolvedAt() {
    return resolvedAt();
  }

  @JsonIgnore
  public final boolean isIsInterval() {
    return isInterval();
  }
}
