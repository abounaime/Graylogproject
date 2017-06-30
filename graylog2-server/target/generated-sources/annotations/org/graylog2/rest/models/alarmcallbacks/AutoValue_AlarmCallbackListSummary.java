package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_AlarmCallbackListSummary extends $AutoValue_AlarmCallbackListSummary {
  AutoValue_AlarmCallbackListSummary(int total, List<AlarmCallbackSummary> alarmCallbacks) {
    super(total, alarmCallbacks);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<AlarmCallbackSummary> getAlarmCallbacks() {
    return alarmCallbacks();
  }
}
