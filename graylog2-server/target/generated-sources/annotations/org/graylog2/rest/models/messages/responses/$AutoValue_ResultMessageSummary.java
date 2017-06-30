
package org.graylog2.rest.models.messages.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Multimap;
import com.google.common.collect.Range;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ResultMessageSummary extends ResultMessageSummary {

  private final Multimap<String, Range<Integer>> highlightRanges;
  private final Map<String, Object> message;
  private final String index;
  private final DecorationStats decorationStats;

  $AutoValue_ResultMessageSummary(
      @Nullable Multimap<String, Range<Integer>> highlightRanges,
      Map<String, Object> message,
      String index,
      @Nullable DecorationStats decorationStats) {
    this.highlightRanges = highlightRanges;
    if (message == null) {
      throw new NullPointerException("Null message");
    }
    this.message = message;
    if (index == null) {
      throw new NullPointerException("Null index");
    }
    this.index = index;
    this.decorationStats = decorationStats;
  }

  @JsonProperty(value = "highlight_ranges")
  @Nullable
  @Override
  public Multimap<String, Range<Integer>> highlightRanges() {
    return highlightRanges;
  }

  @JsonProperty(value = "message")
  @Override
  public Map<String, Object> message() {
    return message;
  }

  @JsonProperty(value = "index")
  @Override
  public String index() {
    return index;
  }

  @JsonProperty(value = "decoration_stats")
  @Nullable
  @Override
  public DecorationStats decorationStats() {
    return decorationStats;
  }

  @Override
  public String toString() {
    return "ResultMessageSummary{"
        + "highlightRanges=" + highlightRanges + ", "
        + "message=" + message + ", "
        + "index=" + index + ", "
        + "decorationStats=" + decorationStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ResultMessageSummary) {
      ResultMessageSummary that = (ResultMessageSummary) o;
      return ((this.highlightRanges == null) ? (that.highlightRanges() == null) : this.highlightRanges.equals(that.highlightRanges()))
           && (this.message.equals(that.message()))
           && (this.index.equals(that.index()))
           && ((this.decorationStats == null) ? (that.decorationStats() == null) : this.decorationStats.equals(that.decorationStats()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (highlightRanges == null) ? 0 : this.highlightRanges.hashCode();
    h *= 1000003;
    h ^= this.message.hashCode();
    h *= 1000003;
    h ^= this.index.hashCode();
    h *= 1000003;
    h ^= (decorationStats == null) ? 0 : this.decorationStats.hashCode();
    return h;
  }

  @Override
  public ResultMessageSummary.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends ResultMessageSummary.Builder {
    private Multimap<String, Range<Integer>> highlightRanges;
    private Map<String, Object> message;
    private String index;
    private DecorationStats decorationStats;
    Builder() {
    }
    private Builder(ResultMessageSummary source) {
      this.highlightRanges = source.highlightRanges();
      this.message = source.message();
      this.index = source.index();
      this.decorationStats = source.decorationStats();
    }
    @Override
    public ResultMessageSummary.Builder highlightRanges(@Nullable Multimap<String, Range<Integer>> highlightRanges) {
      this.highlightRanges = highlightRanges;
      return this;
    }
    @Override
    public ResultMessageSummary.Builder message(Map<String, Object> message) {
      if (message == null) {
        throw new NullPointerException("Null message");
      }
      this.message = message;
      return this;
    }
    @Override
    public ResultMessageSummary.Builder index(String index) {
      if (index == null) {
        throw new NullPointerException("Null index");
      }
      this.index = index;
      return this;
    }
    @Override
    public ResultMessageSummary.Builder decorationStats(@Nullable DecorationStats decorationStats) {
      this.decorationStats = decorationStats;
      return this;
    }
    @Override
    public ResultMessageSummary build() {
      String missing = "";
      if (this.message == null) {
        missing += " message";
      }
      if (this.index == null) {
        missing += " index";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ResultMessageSummary(
          this.highlightRanges,
          this.message,
          this.index,
          this.decorationStats);
    }
  }

}
