package org.graylog2.indexer.searches;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.graylog2.plugin.indexer.searches.timeranges.TimeRange;

final class AutoValue_SearchesConfig extends $AutoValue_SearchesConfig {
  AutoValue_SearchesConfig(String query, String filter, List<String> fields, TimeRange range,
      int limit, int offset, Sorting sorting) {
    super(query, filter, fields, range, limit, offset, sorting);
  }

  @JsonIgnore
  public final String getQuery() {
    return query();
  }

  @JsonIgnore
  @Nullable
  public final String getFilter() {
    return filter();
  }

  @JsonIgnore
  @Nullable
  public final List<String> getFields() {
    return fields();
  }

  @JsonIgnore
  public final TimeRange getRange() {
    return range();
  }

  @JsonIgnore
  public final int getLimit() {
    return limit();
  }

  @JsonIgnore
  public final int getOffset() {
    return offset();
  }

  @JsonIgnore
  @Nullable
  public final Sorting getSorting() {
    return sorting();
  }
}
