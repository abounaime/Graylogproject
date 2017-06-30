
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_IndexRangeSummary extends IndexRangeSummary {

  private final String indexName;
  private final DateTime begin;
  private final DateTime end;
  private final DateTime calculatedAt;
  private final int calculationTookMs;

  $AutoValue_IndexRangeSummary(
      String indexName,
      DateTime begin,
      DateTime end,
      @Nullable DateTime calculatedAt,
      int calculationTookMs) {
    if (indexName == null) {
      throw new NullPointerException("Null indexName");
    }
    this.indexName = indexName;
    if (begin == null) {
      throw new NullPointerException("Null begin");
    }
    this.begin = begin;
    if (end == null) {
      throw new NullPointerException("Null end");
    }
    this.end = end;
    this.calculatedAt = calculatedAt;
    this.calculationTookMs = calculationTookMs;
  }

  @JsonProperty(value = "index_name")
  @Override
  public String indexName() {
    return indexName;
  }

  @JsonProperty(value = "begin")
  @Override
  public DateTime begin() {
    return begin;
  }

  @JsonProperty(value = "end")
  @Override
  public DateTime end() {
    return end;
  }

  @Nullable
  @JsonProperty(value = "calculated_at")
  @Override
  public DateTime calculatedAt() {
    return calculatedAt;
  }

  @JsonProperty(value = "took_ms")
  @Override
  public int calculationTookMs() {
    return calculationTookMs;
  }

  @Override
  public String toString() {
    return "IndexRangeSummary{"
        + "indexName=" + indexName + ", "
        + "begin=" + begin + ", "
        + "end=" + end + ", "
        + "calculatedAt=" + calculatedAt + ", "
        + "calculationTookMs=" + calculationTookMs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexRangeSummary) {
      IndexRangeSummary that = (IndexRangeSummary) o;
      return (this.indexName.equals(that.indexName()))
           && (this.begin.equals(that.begin()))
           && (this.end.equals(that.end()))
           && ((this.calculatedAt == null) ? (that.calculatedAt() == null) : this.calculatedAt.equals(that.calculatedAt()))
           && (this.calculationTookMs == that.calculationTookMs());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.indexName.hashCode();
    h *= 1000003;
    h ^= this.begin.hashCode();
    h *= 1000003;
    h ^= this.end.hashCode();
    h *= 1000003;
    h ^= (calculatedAt == null) ? 0 : this.calculatedAt.hashCode();
    h *= 1000003;
    h ^= this.calculationTookMs;
    return h;
  }

}
