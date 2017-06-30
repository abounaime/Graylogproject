package org.graylog2.rest.resources.search.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.graylog2.rest.models.messages.responses.ResultMessageSummary;
import org.graylog2.rest.models.system.indexer.responses.IndexRangeSummary;
import org.joda.time.DateTime;

final class AutoValue_SearchResponse extends $AutoValue_SearchResponse {
  AutoValue_SearchResponse(String query, String builtQuery, Set<IndexRangeSummary> usedIndices,
      List<ResultMessageSummary> messages, Set<String> fields, long time, long totalResults,
      DateTime from, DateTime to, SearchDecorationStats decorationStats) {
    super(query, builtQuery, usedIndices, messages, fields, time, totalResults, from, to, decorationStats);
  }

  @JsonIgnore
  public final String getQuery() {
    return query();
  }

  @JsonIgnore
  public final String getBuiltQuery() {
    return builtQuery();
  }

  @JsonIgnore
  public final Set<IndexRangeSummary> getUsedIndices() {
    return usedIndices();
  }

  @JsonIgnore
  public final List<ResultMessageSummary> getMessages() {
    return messages();
  }

  @JsonIgnore
  public final Set<String> getFields() {
    return fields();
  }

  @JsonIgnore
  public final long getTime() {
    return time();
  }

  @JsonIgnore
  public final long getTotalResults() {
    return totalResults();
  }

  @JsonIgnore
  public final DateTime getFrom() {
    return from();
  }

  @JsonIgnore
  public final DateTime getTo() {
    return to();
  }

  @JsonIgnore
  @Nullable
  public final SearchDecorationStats getDecorationStats() {
    return decorationStats();
  }
}
