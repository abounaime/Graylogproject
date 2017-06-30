package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.joda.time.DateTime;

final class AutoValue_AlarmCallbackHistorySummary extends $AutoValue_AlarmCallbackHistorySummary {
  AutoValue_AlarmCallbackHistorySummary(String id, AlarmCallbackSummary alarmcallbackConfiguration,
      String alertId, String alertConditionId, AlarmCallbackResult result, DateTime createdAt) {
    super(id, alarmcallbackConfiguration, alertId, alertConditionId, result, createdAt);
  }

  @JsonIgnore
  public final String getId() {
    return id();
  }

  @JsonIgnore
  public final AlarmCallbackSummary getAlarmcallbackConfiguration() {
    return alarmcallbackConfiguration();
  }

  @JsonIgnore
  public final String getAlertId() {
    return alertId();
  }

  @JsonIgnore
  public final String getAlertConditionId() {
    return alertConditionId();
  }

  @JsonIgnore
  public final AlarmCallbackResult getResult() {
    return result();
  }

  @JsonIgnore
  public final DateTime getCreatedAt() {
    return createdAt();
  }
}
