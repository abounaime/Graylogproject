package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_IndexRangeSummary extends $AutoValue_IndexRangeSummary {
  AutoValue_IndexRangeSummary(String indexName, DateTime begin, DateTime end, DateTime calculatedAt,
      int calculationTookMs) {
    super(indexName, begin, end, calculatedAt, calculationTookMs);
  }

  @JsonIgnore
  public final String getIndexName() {
    return indexName();
  }

  @JsonIgnore
  public final DateTime getBegin() {
    return begin();
  }

  @JsonIgnore
  public final DateTime getEnd() {
    return end();
  }

  @JsonIgnore
  @Nullable
  public final DateTime getCalculatedAt() {
    return calculatedAt();
  }

  @JsonIgnore
  public final int getCalculationTookMs() {
    return calculationTookMs();
  }
}
