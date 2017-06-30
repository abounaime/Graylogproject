
package org.graylog2.rest.models.sources.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SourcesList extends SourcesList {

  private final int total;
  private final Map<String, Long> sources;
  private final long tookMs;
  private final int range;

  $AutoValue_SourcesList(
      int total,
      Map<String, Long> sources,
      long tookMs,
      int range) {
    this.total = total;
    if (sources == null) {
      throw new NullPointerException("Null sources");
    }
    this.sources = sources;
    this.tookMs = tookMs;
    this.range = range;
  }

  @JsonProperty
  @Override
  public int total() {
    return total;
  }

  @JsonProperty
  @Override
  public Map<String, Long> sources() {
    return sources;
  }

  @JsonProperty
  @Override
  public long tookMs() {
    return tookMs;
  }

  @JsonProperty
  @Override
  public int range() {
    return range;
  }

  @Override
  public String toString() {
    return "SourcesList{"
        + "total=" + total + ", "
        + "sources=" + sources + ", "
        + "tookMs=" + tookMs + ", "
        + "range=" + range
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SourcesList) {
      SourcesList that = (SourcesList) o;
      return (this.total == that.total())
           && (this.sources.equals(that.sources()))
           && (this.tookMs == that.tookMs())
           && (this.range == that.range());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.total;
    h *= 1000003;
    h ^= this.sources.hashCode();
    h *= 1000003;
    h ^= (this.tookMs >>> 32) ^ this.tookMs;
    h *= 1000003;
    h ^= this.range;
    return h;
  }

}
