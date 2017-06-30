
package org.graylog2.rest.resources.search.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.graylog2.rest.models.messages.responses.ResultMessageSummary;
import org.graylog2.rest.models.system.indexer.responses.IndexRangeSummary;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SearchResponse extends SearchResponse {

  private final String query;
  private final String builtQuery;
  private final Set<IndexRangeSummary> usedIndices;
  private final List<ResultMessageSummary> messages;
  private final Set<String> fields;
  private final long time;
  private final long totalResults;
  private final DateTime from;
  private final DateTime to;
  private final SearchDecorationStats decorationStats;

  $AutoValue_SearchResponse(
      String query,
      String builtQuery,
      Set<IndexRangeSummary> usedIndices,
      List<ResultMessageSummary> messages,
      Set<String> fields,
      long time,
      long totalResults,
      DateTime from,
      DateTime to,
      @Nullable SearchDecorationStats decorationStats) {
    if (query == null) {
      throw new NullPointerException("Null query");
    }
    this.query = query;
    if (builtQuery == null) {
      throw new NullPointerException("Null builtQuery");
    }
    this.builtQuery = builtQuery;
    if (usedIndices == null) {
      throw new NullPointerException("Null usedIndices");
    }
    this.usedIndices = usedIndices;
    if (messages == null) {
      throw new NullPointerException("Null messages");
    }
    this.messages = messages;
    if (fields == null) {
      throw new NullPointerException("Null fields");
    }
    this.fields = fields;
    this.time = time;
    this.totalResults = totalResults;
    if (from == null) {
      throw new NullPointerException("Null from");
    }
    this.from = from;
    if (to == null) {
      throw new NullPointerException("Null to");
    }
    this.to = to;
    this.decorationStats = decorationStats;
  }

  @JsonProperty
  @Override
  public String query() {
    return query;
  }

  @JsonProperty
  @Override
  public String builtQuery() {
    return builtQuery;
  }

  @JsonProperty
  @Override
  public Set<IndexRangeSummary> usedIndices() {
    return usedIndices;
  }

  @JsonProperty
  @Override
  public List<ResultMessageSummary> messages() {
    return messages;
  }

  @JsonProperty
  @Override
  public Set<String> fields() {
    return fields;
  }

  @JsonProperty
  @Override
  public long time() {
    return time;
  }

  @JsonProperty
  @Override
  public long totalResults() {
    return totalResults;
  }

  @JsonProperty
  @Override
  public DateTime from() {
    return from;
  }

  @JsonProperty
  @Override
  public DateTime to() {
    return to;
  }

  @JsonProperty
  @Nullable
  @Override
  public SearchDecorationStats decorationStats() {
    return decorationStats;
  }

  @Override
  public String toString() {
    return "SearchResponse{"
        + "query=" + query + ", "
        + "builtQuery=" + builtQuery + ", "
        + "usedIndices=" + usedIndices + ", "
        + "messages=" + messages + ", "
        + "fields=" + fields + ", "
        + "time=" + time + ", "
        + "totalResults=" + totalResults + ", "
        + "from=" + from + ", "
        + "to=" + to + ", "
        + "decorationStats=" + decorationStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SearchResponse) {
      SearchResponse that = (SearchResponse) o;
      return (this.query.equals(that.query()))
           && (this.builtQuery.equals(that.builtQuery()))
           && (this.usedIndices.equals(that.usedIndices()))
           && (this.messages.equals(that.messages()))
           && (this.fields.equals(that.fields()))
           && (this.time == that.time())
           && (this.totalResults == that.totalResults())
           && (this.from.equals(that.from()))
           && (this.to.equals(that.to()))
           && ((this.decorationStats == null) ? (that.decorationStats() == null) : this.decorationStats.equals(that.decorationStats()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.query.hashCode();
    h *= 1000003;
    h ^= this.builtQuery.hashCode();
    h *= 1000003;
    h ^= this.usedIndices.hashCode();
    h *= 1000003;
    h ^= this.messages.hashCode();
    h *= 1000003;
    h ^= this.fields.hashCode();
    h *= 1000003;
    h ^= (this.time >>> 32) ^ this.time;
    h *= 1000003;
    h ^= (this.totalResults >>> 32) ^ this.totalResults;
    h *= 1000003;
    h ^= this.from.hashCode();
    h *= 1000003;
    h ^= this.to.hashCode();
    h *= 1000003;
    h ^= (decorationStats == null) ? 0 : this.decorationStats.hashCode();
    return h;
  }

  @Override
  public SearchResponse.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends SearchResponse.Builder {
    private String query;
    private String builtQuery;
    private Set<IndexRangeSummary> usedIndices;
    private List<ResultMessageSummary> messages;
    private Set<String> fields;
    private Long time;
    private Long totalResults;
    private DateTime from;
    private DateTime to;
    private SearchDecorationStats decorationStats;
    Builder() {
    }
    private Builder(SearchResponse source) {
      this.query = source.query();
      this.builtQuery = source.builtQuery();
      this.usedIndices = source.usedIndices();
      this.messages = source.messages();
      this.fields = source.fields();
      this.time = source.time();
      this.totalResults = source.totalResults();
      this.from = source.from();
      this.to = source.to();
      this.decorationStats = source.decorationStats();
    }
    @Override
    public SearchResponse.Builder query(String query) {
      if (query == null) {
        throw new NullPointerException("Null query");
      }
      this.query = query;
      return this;
    }
    @Override
    public SearchResponse.Builder builtQuery(String builtQuery) {
      if (builtQuery == null) {
        throw new NullPointerException("Null builtQuery");
      }
      this.builtQuery = builtQuery;
      return this;
    }
    @Override
    public SearchResponse.Builder usedIndices(Set<IndexRangeSummary> usedIndices) {
      if (usedIndices == null) {
        throw new NullPointerException("Null usedIndices");
      }
      this.usedIndices = usedIndices;
      return this;
    }
    @Override
    public SearchResponse.Builder messages(List<ResultMessageSummary> messages) {
      if (messages == null) {
        throw new NullPointerException("Null messages");
      }
      this.messages = messages;
      return this;
    }
    @Override
    public SearchResponse.Builder fields(Set<String> fields) {
      if (fields == null) {
        throw new NullPointerException("Null fields");
      }
      this.fields = fields;
      return this;
    }
    @Override
    public SearchResponse.Builder time(long time) {
      this.time = time;
      return this;
    }
    @Override
    public SearchResponse.Builder totalResults(long totalResults) {
      this.totalResults = totalResults;
      return this;
    }
    @Override
    public SearchResponse.Builder from(DateTime from) {
      if (from == null) {
        throw new NullPointerException("Null from");
      }
      this.from = from;
      return this;
    }
    @Override
    public SearchResponse.Builder to(DateTime to) {
      if (to == null) {
        throw new NullPointerException("Null to");
      }
      this.to = to;
      return this;
    }
    @Override
    public SearchResponse.Builder decorationStats(@Nullable SearchDecorationStats decorationStats) {
      this.decorationStats = decorationStats;
      return this;
    }
    @Override
    public SearchResponse build() {
      String missing = "";
      if (this.query == null) {
        missing += " query";
      }
      if (this.builtQuery == null) {
        missing += " builtQuery";
      }
      if (this.usedIndices == null) {
        missing += " usedIndices";
      }
      if (this.messages == null) {
        missing += " messages";
      }
      if (this.fields == null) {
        missing += " fields";
      }
      if (this.time == null) {
        missing += " time";
      }
      if (this.totalResults == null) {
        missing += " totalResults";
      }
      if (this.from == null) {
        missing += " from";
      }
      if (this.to == null) {
        missing += " to";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SearchResponse(
          this.query,
          this.builtQuery,
          this.usedIndices,
          this.messages,
          this.fields,
          this.time,
          this.totalResults,
          this.from,
          this.to,
          this.decorationStats);
    }
  }

}
