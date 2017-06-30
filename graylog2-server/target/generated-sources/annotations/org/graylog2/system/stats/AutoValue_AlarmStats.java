package org.graylog2.system.stats;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import java.util.Map;

final class AutoValue_AlarmStats extends $AutoValue_AlarmStats {
  AutoValue_AlarmStats(long alertCount, Map<String, Long> alarmcallbackCountByType) {
    super(alertCount, alarmcallbackCountByType);
  }

  @JsonIgnore
  public final long getAlertCount() {
    return alertCount();
  }

  @JsonIgnore
  public final Map<String, Long> getAlarmcallbackCountByType() {
    return alarmcallbackCountByType();
  }
}
