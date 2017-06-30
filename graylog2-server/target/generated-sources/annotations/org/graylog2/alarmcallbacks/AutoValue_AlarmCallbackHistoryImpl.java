package org.graylog2.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.graylog2.rest.models.alarmcallbacks.AlarmCallbackResult;
import org.graylog2.rest.models.alarmcallbacks.AlarmCallbackSummary;
import org.joda.time.DateTime;
import org.mongojack.Id;
import org.mongojack.ObjectId;

final class AutoValue_AlarmCallbackHistoryImpl extends $AutoValue_AlarmCallbackHistoryImpl {
  AutoValue_AlarmCallbackHistoryImpl(String id, AlarmCallbackSummary alarmcallbackConfiguration,
      String alertId, String alertConditionId, AlarmCallbackResult result, DateTime createdAt) {
    super(id, alarmcallbackConfiguration, alertId, alertConditionId, result, createdAt);
  }

  @JsonIgnore
  @Id
  @ObjectId
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
