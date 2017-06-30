
package org.graylog2.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.graylog2.rest.models.alarmcallbacks.AlarmCallbackResult;
import org.graylog2.rest.models.alarmcallbacks.AlarmCallbackSummary;
import org.joda.time.DateTime;
import org.mongojack.Id;
import org.mongojack.ObjectId;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_AlarmCallbackHistoryImpl extends AlarmCallbackHistoryImpl {

  private final String id;
  private final AlarmCallbackSummary alarmcallbackConfiguration;
  private final String alertId;
  private final String alertConditionId;
  private final AlarmCallbackResult result;
  private final DateTime createdAt;

  $AutoValue_AlarmCallbackHistoryImpl(
      String id,
      AlarmCallbackSummary alarmcallbackConfiguration,
      String alertId,
      String alertConditionId,
      AlarmCallbackResult result,
      DateTime createdAt) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (alarmcallbackConfiguration == null) {
      throw new NullPointerException("Null alarmcallbackConfiguration");
    }
    this.alarmcallbackConfiguration = alarmcallbackConfiguration;
    if (alertId == null) {
      throw new NullPointerException("Null alertId");
    }
    this.alertId = alertId;
    if (alertConditionId == null) {
      throw new NullPointerException("Null alertConditionId");
    }
    this.alertConditionId = alertConditionId;
    if (result == null) {
      throw new NullPointerException("Null result");
    }
    this.result = result;
    if (createdAt == null) {
      throw new NullPointerException("Null createdAt");
    }
    this.createdAt = createdAt;
  }

  @JsonProperty(value = "id")
  @Id
  @ObjectId
  @Override
  public String id() {
    return id;
  }

  @JsonProperty(value = "alarmcallbackconfiguration")
  @Override
  public AlarmCallbackSummary alarmcallbackConfiguration() {
    return alarmcallbackConfiguration;
  }

  @JsonProperty(value = "alert_id")
  @Override
  public String alertId() {
    return alertId;
  }

  @JsonProperty(value = "alertcondition_id")
  @Override
  public String alertConditionId() {
    return alertConditionId;
  }

  @JsonProperty(value = "result")
  @Override
  public AlarmCallbackResult result() {
    return result;
  }

  @JsonProperty(value = "created_at")
  @Override
  public DateTime createdAt() {
    return createdAt;
  }

  @Override
  public String toString() {
    return "AlarmCallbackHistoryImpl{"
        + "id=" + id + ", "
        + "alarmcallbackConfiguration=" + alarmcallbackConfiguration + ", "
        + "alertId=" + alertId + ", "
        + "alertConditionId=" + alertConditionId + ", "
        + "result=" + result + ", "
        + "createdAt=" + createdAt
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AlarmCallbackHistoryImpl) {
      AlarmCallbackHistoryImpl that = (AlarmCallbackHistoryImpl) o;
      return (this.id.equals(that.id()))
           && (this.alarmcallbackConfiguration.equals(that.alarmcallbackConfiguration()))
           && (this.alertId.equals(that.alertId()))
           && (this.alertConditionId.equals(that.alertConditionId()))
           && (this.result.equals(that.result()))
           && (this.createdAt.equals(that.createdAt()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.alarmcallbackConfiguration.hashCode();
    h *= 1000003;
    h ^= this.alertId.hashCode();
    h *= 1000003;
    h ^= this.alertConditionId.hashCode();
    h *= 1000003;
    h ^= this.result.hashCode();
    h *= 1000003;
    h ^= this.createdAt.hashCode();
    return h;
  }

}
