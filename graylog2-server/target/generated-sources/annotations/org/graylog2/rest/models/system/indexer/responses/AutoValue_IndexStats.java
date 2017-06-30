package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_IndexStats extends $AutoValue_IndexStats {
  AutoValue_IndexStats(IndexStats.TimeAndTotalStats flush, IndexStats.TimeAndTotalStats get,
      IndexStats.TimeAndTotalStats index, IndexStats.TimeAndTotalStats merge,
      IndexStats.TimeAndTotalStats refresh, IndexStats.TimeAndTotalStats searchQuery,
      IndexStats.TimeAndTotalStats searchFetch, long openSearchContexts, long storeSizeBytes,
      long segments, IndexStats.DocsStats documents) {
    super(flush, get, index, merge, refresh, searchQuery, searchFetch, openSearchContexts, storeSizeBytes, segments, documents);
  }

  @JsonIgnore
  public final IndexStats.TimeAndTotalStats getFlush() {
    return flush();
  }

  @JsonIgnore
  public final IndexStats.TimeAndTotalStats getGet() {
    return get();
  }

  @JsonIgnore
  public final IndexStats.TimeAndTotalStats getIndex() {
    return index();
  }

  @JsonIgnore
  public final IndexStats.TimeAndTotalStats getMerge() {
    return merge();
  }

  @JsonIgnore
  public final IndexStats.TimeAndTotalStats getRefresh() {
    return refresh();
  }

  @JsonIgnore
  public final IndexStats.TimeAndTotalStats getSearchQuery() {
    return searchQuery();
  }

  @JsonIgnore
  public final IndexStats.TimeAndTotalStats getSearchFetch() {
    return searchFetch();
  }

  @JsonIgnore
  public final long getOpenSearchContexts() {
    return openSearchContexts();
  }

  @JsonIgnore
  public final long getStoreSizeBytes() {
    return storeSizeBytes();
  }

  @JsonIgnore
  public final long getSegments() {
    return segments();
  }

  @JsonIgnore
  public final IndexStats.DocsStats getDocuments() {
    return documents();
  }
}
