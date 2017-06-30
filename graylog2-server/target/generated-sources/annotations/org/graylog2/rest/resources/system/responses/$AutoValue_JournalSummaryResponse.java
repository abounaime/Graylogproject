
package org.graylog2.rest.resources.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.joschi.jadconfig.util.Size;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.graylog2.plugin.KafkaJournalConfiguration;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_JournalSummaryResponse extends JournalSummaryResponse {

  private final boolean enabled;
  private final long appendEventsPerSecond;
  private final long readEventsPerSecond;
  private final long uncommittedJournalEntries;
  private final Size journalSize;
  private final Size journalSizeLimit;
  private final int numberOfSegments;
  private final DateTime oldestSegment;
  private final KafkaJournalConfiguration journalConfig;

  $AutoValue_JournalSummaryResponse(
      boolean enabled,
      long appendEventsPerSecond,
      long readEventsPerSecond,
      long uncommittedJournalEntries,
      Size journalSize,
      Size journalSizeLimit,
      int numberOfSegments,
      @Nullable DateTime oldestSegment,
      @Nullable KafkaJournalConfiguration journalConfig) {
    this.enabled = enabled;
    this.appendEventsPerSecond = appendEventsPerSecond;
    this.readEventsPerSecond = readEventsPerSecond;
    this.uncommittedJournalEntries = uncommittedJournalEntries;
    if (journalSize == null) {
      throw new NullPointerException("Null journalSize");
    }
    this.journalSize = journalSize;
    if (journalSizeLimit == null) {
      throw new NullPointerException("Null journalSizeLimit");
    }
    this.journalSizeLimit = journalSizeLimit;
    this.numberOfSegments = numberOfSegments;
    this.oldestSegment = oldestSegment;
    this.journalConfig = journalConfig;
  }

  @JsonProperty
  @Override
  public boolean enabled() {
    return enabled;
  }

  @JsonProperty
  @Override
  public long appendEventsPerSecond() {
    return appendEventsPerSecond;
  }

  @JsonProperty
  @Override
  public long readEventsPerSecond() {
    return readEventsPerSecond;
  }

  @JsonProperty
  @Override
  public long uncommittedJournalEntries() {
    return uncommittedJournalEntries;
  }

  @JsonProperty
  @Override
  public Size journalSize() {
    return journalSize;
  }

  @JsonProperty
  @Override
  public Size journalSizeLimit() {
    return journalSizeLimit;
  }

  @JsonProperty
  @Override
  public int numberOfSegments() {
    return numberOfSegments;
  }

  @JsonProperty
  @Nullable
  @Override
  public DateTime oldestSegment() {
    return oldestSegment;
  }

  @JsonProperty
  @Nullable
  @Override
  public KafkaJournalConfiguration journalConfig() {
    return journalConfig;
  }

  @Override
  public String toString() {
    return "JournalSummaryResponse{"
        + "enabled=" + enabled + ", "
        + "appendEventsPerSecond=" + appendEventsPerSecond + ", "
        + "readEventsPerSecond=" + readEventsPerSecond + ", "
        + "uncommittedJournalEntries=" + uncommittedJournalEntries + ", "
        + "journalSize=" + journalSize + ", "
        + "journalSizeLimit=" + journalSizeLimit + ", "
        + "numberOfSegments=" + numberOfSegments + ", "
        + "oldestSegment=" + oldestSegment + ", "
        + "journalConfig=" + journalConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JournalSummaryResponse) {
      JournalSummaryResponse that = (JournalSummaryResponse) o;
      return (this.enabled == that.enabled())
           && (this.appendEventsPerSecond == that.appendEventsPerSecond())
           && (this.readEventsPerSecond == that.readEventsPerSecond())
           && (this.uncommittedJournalEntries == that.uncommittedJournalEntries())
           && (this.journalSize.equals(that.journalSize()))
           && (this.journalSizeLimit.equals(that.journalSizeLimit()))
           && (this.numberOfSegments == that.numberOfSegments())
           && ((this.oldestSegment == null) ? (that.oldestSegment() == null) : this.oldestSegment.equals(that.oldestSegment()))
           && ((this.journalConfig == null) ? (that.journalConfig() == null) : this.journalConfig.equals(that.journalConfig()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.enabled ? 1231 : 1237;
    h *= 1000003;
    h ^= (this.appendEventsPerSecond >>> 32) ^ this.appendEventsPerSecond;
    h *= 1000003;
    h ^= (this.readEventsPerSecond >>> 32) ^ this.readEventsPerSecond;
    h *= 1000003;
    h ^= (this.uncommittedJournalEntries >>> 32) ^ this.uncommittedJournalEntries;
    h *= 1000003;
    h ^= this.journalSize.hashCode();
    h *= 1000003;
    h ^= this.journalSizeLimit.hashCode();
    h *= 1000003;
    h ^= this.numberOfSegments;
    h *= 1000003;
    h ^= (oldestSegment == null) ? 0 : this.oldestSegment.hashCode();
    h *= 1000003;
    h ^= (journalConfig == null) ? 0 : this.journalConfig.hashCode();
    return h;
  }

}
