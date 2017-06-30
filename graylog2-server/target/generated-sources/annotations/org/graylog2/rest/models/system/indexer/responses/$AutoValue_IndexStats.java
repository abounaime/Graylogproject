
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexStats extends IndexStats {

  private final IndexStats.TimeAndTotalStats flush;
  private final IndexStats.TimeAndTotalStats get;
  private final IndexStats.TimeAndTotalStats index;
  private final IndexStats.TimeAndTotalStats merge;
  private final IndexStats.TimeAndTotalStats refresh;
  private final IndexStats.TimeAndTotalStats searchQuery;
  private final IndexStats.TimeAndTotalStats searchFetch;
  private final long openSearchContexts;
  private final long storeSizeBytes;
  private final long segments;
  private final IndexStats.DocsStats documents;

  $AutoValue_IndexStats(
      IndexStats.TimeAndTotalStats flush,
      IndexStats.TimeAndTotalStats get,
      IndexStats.TimeAndTotalStats index,
      IndexStats.TimeAndTotalStats merge,
      IndexStats.TimeAndTotalStats refresh,
      IndexStats.TimeAndTotalStats searchQuery,
      IndexStats.TimeAndTotalStats searchFetch,
      long openSearchContexts,
      long storeSizeBytes,
      long segments,
      IndexStats.DocsStats documents) {
    if (flush == null) {
      throw new NullPointerException("Null flush");
    }
    this.flush = flush;
    if (get == null) {
      throw new NullPointerException("Null get");
    }
    this.get = get;
    if (index == null) {
      throw new NullPointerException("Null index");
    }
    this.index = index;
    if (merge == null) {
      throw new NullPointerException("Null merge");
    }
    this.merge = merge;
    if (refresh == null) {
      throw new NullPointerException("Null refresh");
    }
    this.refresh = refresh;
    if (searchQuery == null) {
      throw new NullPointerException("Null searchQuery");
    }
    this.searchQuery = searchQuery;
    if (searchFetch == null) {
      throw new NullPointerException("Null searchFetch");
    }
    this.searchFetch = searchFetch;
    this.openSearchContexts = openSearchContexts;
    this.storeSizeBytes = storeSizeBytes;
    this.segments = segments;
    if (documents == null) {
      throw new NullPointerException("Null documents");
    }
    this.documents = documents;
  }

  @JsonProperty(value = "flush")
  @Override
  public IndexStats.TimeAndTotalStats flush() {
    return flush;
  }

  @JsonProperty(value = "get")
  @Override
  public IndexStats.TimeAndTotalStats get() {
    return get;
  }

  @JsonProperty(value = "index")
  @Override
  public IndexStats.TimeAndTotalStats index() {
    return index;
  }

  @JsonProperty(value = "merge")
  @Override
  public IndexStats.TimeAndTotalStats merge() {
    return merge;
  }

  @JsonProperty(value = "refresh")
  @Override
  public IndexStats.TimeAndTotalStats refresh() {
    return refresh;
  }

  @JsonProperty(value = "search_query")
  @Override
  public IndexStats.TimeAndTotalStats searchQuery() {
    return searchQuery;
  }

  @JsonProperty(value = "search_fetch")
  @Override
  public IndexStats.TimeAndTotalStats searchFetch() {
    return searchFetch;
  }

  @JsonProperty(value = "open_search_contexts")
  @Override
  public long openSearchContexts() {
    return openSearchContexts;
  }

  @JsonProperty(value = "store_size_bytes")
  @Override
  public long storeSizeBytes() {
    return storeSizeBytes;
  }

  @JsonProperty(value = "segments")
  @Override
  public long segments() {
    return segments;
  }

  @JsonProperty(value = "documents")
  @Override
  public IndexStats.DocsStats documents() {
    return documents;
  }

  @Override
  public String toString() {
    return "IndexStats{"
        + "flush=" + flush + ", "
        + "get=" + get + ", "
        + "index=" + index + ", "
        + "merge=" + merge + ", "
        + "refresh=" + refresh + ", "
        + "searchQuery=" + searchQuery + ", "
        + "searchFetch=" + searchFetch + ", "
        + "openSearchContexts=" + openSearchContexts + ", "
        + "storeSizeBytes=" + storeSizeBytes + ", "
        + "segments=" + segments + ", "
        + "documents=" + documents
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexStats) {
      IndexStats that = (IndexStats) o;
      return (this.flush.equals(that.flush()))
           && (this.get.equals(that.get()))
           && (this.index.equals(that.index()))
           && (this.merge.equals(that.merge()))
           && (this.refresh.equals(that.refresh()))
           && (this.searchQuery.equals(that.searchQuery()))
           && (this.searchFetch.equals(that.searchFetch()))
           && (this.openSearchContexts == that.openSearchContexts())
           && (this.storeSizeBytes == that.storeSizeBytes())
           && (this.segments == that.segments())
           && (this.documents.equals(that.documents()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.flush.hashCode();
    h *= 1000003;
    h ^= this.get.hashCode();
    h *= 1000003;
    h ^= this.index.hashCode();
    h *= 1000003;
    h ^= this.merge.hashCode();
    h *= 1000003;
    h ^= this.refresh.hashCode();
    h *= 1000003;
    h ^= this.searchQuery.hashCode();
    h *= 1000003;
    h ^= this.searchFetch.hashCode();
    h *= 1000003;
    h ^= (this.openSearchContexts >>> 32) ^ this.openSearchContexts;
    h *= 1000003;
    h ^= (this.storeSizeBytes >>> 32) ^ this.storeSizeBytes;
    h *= 1000003;
    h ^= (this.segments >>> 32) ^ this.segments;
    h *= 1000003;
    h ^= this.documents.hashCode();
    return h;
  }

}
