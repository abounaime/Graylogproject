package org.graylog2.rest.models.alarmcallbacks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

final class AutoValue_AlarmCallbackHistoryListSummary extends $AutoValue_AlarmCallbackHistoryListSummary {
  AutoValue_AlarmCallbackHistoryListSummary(int total,
      List<AlarmCallbackHistorySummary> histories) {
    super(total, histories);
  }

  @JsonIgnore
  public final int getTotal() {
    return total();
  }

  @JsonIgnore
  public final List<AlarmCallbackHistorySummary> getHistories() {
    return histories();
  }
}
