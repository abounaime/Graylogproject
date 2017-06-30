
package org.graylog2.indexer.searches;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.graylog2.plugin.indexer.searches.timeranges.TimeRange;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SearchesConfig extends SearchesConfig {

  private final String query;
  private final String filter;
  private final List<String> fields;
  private final TimeRange range;
  private final int limit;
  private final int offset;
  private final Sorting sorting;

  $AutoValue_SearchesConfig(
      String query,
      @Nullable String filter,
      @Nullable List<String> fields,
      TimeRange range,
      int limit,
      int offset,
      @Nullable Sorting sorting) {
    if (query == null) {
      throw new NullPointerException("Null query");
    }
    this.query = query;
    this.filter = filter;
    this.fields = fields;
    if (range == null) {
      throw new NullPointerException("Null range");
    }
    this.range = range;
    this.limit = limit;
    this.offset = offset;
    this.sorting = sorting;
  }

  @JsonProperty
  @Override
  public String query() {
    return query;
  }

  @JsonProperty
  @Nullable
  @Override
  public String filter() {
    return filter;
  }

  @JsonProperty
  @Nullable
  @Override
  public List<String> fields() {
    return fields;
  }

  @JsonProperty
  @Override
  public TimeRange range() {
    return range;
  }

  @JsonProperty
  @Override
  public int limit() {
    return limit;
  }

  @JsonProperty
  @Override
  public int offset() {
    return offset;
  }

  @JsonProperty
  @Nullable
  @Override
  public Sorting sorting() {
    return sorting;
  }

  @Override
  public String toString() {
    return "SearchesConfig{"
        + "query=" + query + ", "
        + "filter=" + filter + ", "
        + "fields=" + fields + ", "
        + "range=" + range + ", "
        + "limit=" + limit + ", "
        + "offset=" + offset + ", "
        + "sorting=" + sorting
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SearchesConfig) {
      SearchesConfig that = (SearchesConfig) o;
      return (this.query.equals(that.query()))
           && ((this.filter == null) ? (that.filter() == null) : this.filter.equals(that.filter()))
           && ((this.fields == null) ? (that.fields() == null) : this.fields.equals(that.fields()))
           && (this.range.equals(that.range()))
           && (this.limit == that.limit())
           && (this.offset == that.offset())
           && ((this.sorting == null) ? (that.sorting() == null) : this.sorting.equals(that.sorting()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.query.hashCode();
    h *= 1000003;
    h ^= (filter == null) ? 0 : this.filter.hashCode();
    h *= 1000003;
    h ^= (fields == null) ? 0 : this.fields.hashCode();
    h *= 1000003;
    h ^= this.range.hashCode();
    h *= 1000003;
    h ^= this.limit;
    h *= 1000003;
    h ^= this.offset;
    h *= 1000003;
    h ^= (sorting == null) ? 0 : this.sorting.hashCode();
    return h;
  }

  static final class Builder extends SearchesConfig.Builder {
    private String query;
    private String filter;
    private List<String> fields;
    private TimeRange range;
    private Integer limit;
    private Integer offset;
    private Sorting sorting;
    Builder() {
    }
    @Override
    public SearchesConfig.Builder query(String query) {
      if (query == null) {
        throw new NullPointerException("Null query");
      }
      this.query = query;
      return this;
    }
    @Override
    public SearchesConfig.Builder filter(@Nullable String filter) {
      this.filter = filter;
      return this;
    }
    @Override
    public SearchesConfig.Builder fields(@Nullable List<String> fields) {
      this.fields = fields;
      return this;
    }
    @Override
    public SearchesConfig.Builder range(TimeRange range) {
      if (range == null) {
        throw new NullPointerException("Null range");
      }
      this.range = range;
      return this;
    }
    @Override
    public SearchesConfig.Builder limit(int limit) {
      this.limit = limit;
      return this;
    }
    @Override
    public int limit() {
      if (limit == null) {
        throw new IllegalStateException("Property \"limit\" has not been set");
      }
      return limit;
    }
    @Override
    public SearchesConfig.Builder offset(int offset) {
      this.offset = offset;
      return this;
    }
    @Override
    public SearchesConfig.Builder sorting(@Nullable Sorting sorting) {
      this.sorting = sorting;
      return this;
    }
    @Override
    SearchesConfig autoBuild() {
      String missing = "";
      if (this.query == null) {
        missing += " query";
      }
      if (this.range == null) {
        missing += " range";
      }
      if (this.limit == null) {
        missing += " limit";
      }
      if (this.offset == null) {
        missing += " offset";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SearchesConfig(
          this.query,
          this.filter,
          this.fields,
          this.range,
          this.limit,
          this.offset,
          this.sorting);
    }
  }

}
