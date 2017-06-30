package org.graylog2.rest.models.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Multimap;
import com.google.common.collect.Range;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

final class AutoValue_ResultMessageSummary extends $AutoValue_ResultMessageSummary {
  AutoValue_ResultMessageSummary(Multimap<String, Range<Integer>> highlightRanges,
      Map<String, Object> message, String index, DecorationStats decorationStats) {
    super(highlightRanges, message, index, decorationStats);
  }

  @JsonIgnore
  @Nullable
  public final Multimap<String, Range<Integer>> getHighlightRanges() {
    return highlightRanges();
  }

  @JsonIgnore
  public final Map<String, Object> getMessage() {
    return message();
  }

  @JsonIgnore
  public final String getIndex() {
    return index();
  }

  @JsonIgnore
  @Nullable
  public final DecorationStats getDecorationStats() {
    return decorationStats();
  }
}
