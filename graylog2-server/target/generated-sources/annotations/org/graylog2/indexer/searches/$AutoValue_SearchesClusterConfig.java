
package org.graylog2.indexer.searches;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.joda.time.Period;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SearchesClusterConfig extends SearchesClusterConfig {

  private final Period queryTimeRangeLimit;
  private final Map<Period, String> relativeTimerangeOptions;
  private final Map<Period, String> surroundingTimerangeOptions;
  private final Set<String> surroundingFilterFields;

  $AutoValue_SearchesClusterConfig(
      Period queryTimeRangeLimit,
      Map<Period, String> relativeTimerangeOptions,
      Map<Period, String> surroundingTimerangeOptions,
      Set<String> surroundingFilterFields) {
    if (queryTimeRangeLimit == null) {
      throw new NullPointerException("Null queryTimeRangeLimit");
    }
    this.queryTimeRangeLimit = queryTimeRangeLimit;
    if (relativeTimerangeOptions == null) {
      throw new NullPointerException("Null relativeTimerangeOptions");
    }
    this.relativeTimerangeOptions = relativeTimerangeOptions;
    if (surroundingTimerangeOptions == null) {
      throw new NullPointerException("Null surroundingTimerangeOptions");
    }
    this.surroundingTimerangeOptions = surroundingTimerangeOptions;
    if (surroundingFilterFields == null) {
      throw new NullPointerException("Null surroundingFilterFields");
    }
    this.surroundingFilterFields = surroundingFilterFields;
  }

  @JsonProperty(value = "query_time_range_limit")
  @Override
  public Period queryTimeRangeLimit() {
    return queryTimeRangeLimit;
  }

  @JsonProperty(value = "relative_timerange_options")
  @Override
  public Map<Period, String> relativeTimerangeOptions() {
    return relativeTimerangeOptions;
  }

  @JsonProperty(value = "surrounding_timerange_options")
  @Override
  public Map<Period, String> surroundingTimerangeOptions() {
    return surroundingTimerangeOptions;
  }

  @JsonProperty(value = "surrounding_filter_fields")
  @Override
  public Set<String> surroundingFilterFields() {
    return surroundingFilterFields;
  }

  @Override
  public String toString() {
    return "SearchesClusterConfig{"
        + "queryTimeRangeLimit=" + queryTimeRangeLimit + ", "
        + "relativeTimerangeOptions=" + relativeTimerangeOptions + ", "
        + "surroundingTimerangeOptions=" + surroundingTimerangeOptions + ", "
        + "surroundingFilterFields=" + surroundingFilterFields
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SearchesClusterConfig) {
      SearchesClusterConfig that = (SearchesClusterConfig) o;
      return (this.queryTimeRangeLimit.equals(that.queryTimeRangeLimit()))
           && (this.relativeTimerangeOptions.equals(that.relativeTimerangeOptions()))
           && (this.surroundingTimerangeOptions.equals(that.surroundingTimerangeOptions()))
           && (this.surroundingFilterFields.equals(that.surroundingFilterFields()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.queryTimeRangeLimit.hashCode();
    h *= 1000003;
    h ^= this.relativeTimerangeOptions.hashCode();
    h *= 1000003;
    h ^= this.surroundingTimerangeOptions.hashCode();
    h *= 1000003;
    h ^= this.surroundingFilterFields.hashCode();
    return h;
  }

  @Override
  public SearchesClusterConfig.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends SearchesClusterConfig.Builder {
    private Period queryTimeRangeLimit;
    private Map<Period, String> relativeTimerangeOptions;
    private Map<Period, String> surroundingTimerangeOptions;
    private Set<String> surroundingFilterFields;
    Builder() {
    }
    private Builder(SearchesClusterConfig source) {
      this.queryTimeRangeLimit = source.queryTimeRangeLimit();
      this.relativeTimerangeOptions = source.relativeTimerangeOptions();
      this.surroundingTimerangeOptions = source.surroundingTimerangeOptions();
      this.surroundingFilterFields = source.surroundingFilterFields();
    }
    @Override
    public SearchesClusterConfig.Builder queryTimeRangeLimit(Period queryTimeRangeLimit) {
      if (queryTimeRangeLimit == null) {
        throw new NullPointerException("Null queryTimeRangeLimit");
      }
      this.queryTimeRangeLimit = queryTimeRangeLimit;
      return this;
    }
    @Override
    public SearchesClusterConfig.Builder relativeTimerangeOptions(Map<Period, String> relativeTimerangeOptions) {
      if (relativeTimerangeOptions == null) {
        throw new NullPointerException("Null relativeTimerangeOptions");
      }
      this.relativeTimerangeOptions = relativeTimerangeOptions;
      return this;
    }
    @Override
    public SearchesClusterConfig.Builder surroundingTimerangeOptions(Map<Period, String> surroundingTimerangeOptions) {
      if (surroundingTimerangeOptions == null) {
        throw new NullPointerException("Null surroundingTimerangeOptions");
      }
      this.surroundingTimerangeOptions = surroundingTimerangeOptions;
      return this;
    }
    @Override
    public SearchesClusterConfig.Builder surroundingFilterFields(Set<String> surroundingFilterFields) {
      if (surroundingFilterFields == null) {
        throw new NullPointerException("Null surroundingFilterFields");
      }
      this.surroundingFilterFields = surroundingFilterFields;
      return this;
    }
    @Override
    public SearchesClusterConfig build() {
      String missing = "";
      if (this.queryTimeRangeLimit == null) {
        missing += " queryTimeRangeLimit";
      }
      if (this.relativeTimerangeOptions == null) {
        missing += " relativeTimerangeOptions";
      }
      if (this.surroundingTimerangeOptions == null) {
        missing += " surroundingTimerangeOptions";
      }
      if (this.surroundingFilterFields == null) {
        missing += " surroundingFilterFields";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SearchesClusterConfig(
          this.queryTimeRangeLimit,
          this.relativeTimerangeOptions,
          this.surroundingTimerangeOptions,
          this.surroundingFilterFields);
    }
  }

}
