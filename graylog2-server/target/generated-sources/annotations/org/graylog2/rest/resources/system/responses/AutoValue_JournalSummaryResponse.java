package org.graylog2.rest.resources.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.joschi.jadconfig.util.Size;
import javax.annotation.Nullable;
import org.graylog2.plugin.KafkaJournalConfiguration;
import org.joda.time.DateTime;

final class AutoValue_JournalSummaryResponse extends $AutoValue_JournalSummaryResponse {
  AutoValue_JournalSummaryResponse(boolean enabled, long appendEventsPerSecond,
      long readEventsPerSecond, long uncommittedJournalEntries, Size journalSize,
      Size journalSizeLimit, int numberOfSegments, DateTime oldestSegment,
      KafkaJournalConfiguration journalConfig) {
    super(enabled, appendEventsPerSecond, readEventsPerSecond, uncommittedJournalEntries, journalSize, journalSizeLimit, numberOfSegments, oldestSegment, journalConfig);
  }

  @JsonIgnore
  public final boolean isEnabled() {
    return enabled();
  }

  @JsonIgnore
  public final long getAppendEventsPerSecond() {
    return appendEventsPerSecond();
  }

  @JsonIgnore
  public final long getReadEventsPerSecond() {
    return readEventsPerSecond();
  }

  @JsonIgnore
  public final long getUncommittedJournalEntries() {
    return uncommittedJournalEntries();
  }

  @JsonIgnore
  public final Size getJournalSize() {
    return journalSize();
  }

  @JsonIgnore
  public final Size getJournalSizeLimit() {
    return journalSizeLimit();
  }

  @JsonIgnore
  public final int getNumberOfSegments() {
    return numberOfSegments();
  }

  @JsonIgnore
  @Nullable
  public final DateTime getOldestSegment() {
    return oldestSegment();
  }

  @JsonIgnore
  @Nullable
  public final KafkaJournalConfiguration getJournalConfig() {
    return journalConfig();
  }
}
