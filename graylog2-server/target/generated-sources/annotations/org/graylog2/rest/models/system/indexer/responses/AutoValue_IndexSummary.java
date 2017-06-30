package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.annotation.Nullable;

final class AutoValue_IndexSummary extends $AutoValue_IndexSummary {
  AutoValue_IndexSummary(IndexSizeSummary size, IndexRangeSummary range, boolean isDeflector,
      boolean isClosed, boolean isReopened) {
    super(size, range, isDeflector, isClosed, isReopened);
  }

  @JsonIgnore
  @Nullable
  public final IndexSizeSummary getSize() {
    return size();
  }

  @JsonIgnore
  @Nullable
  public final IndexRangeSummary getRange() {
    return range();
  }

  @JsonIgnore
  public final boolean isIsDeflector() {
    return isDeflector();
  }

  @JsonIgnore
  public final boolean isIsClosed() {
    return isClosed();
  }

  @JsonIgnore
  public final boolean isIsReopened() {
    return isReopened();
  }
}
