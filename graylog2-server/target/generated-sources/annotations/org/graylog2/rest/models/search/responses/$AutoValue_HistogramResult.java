
package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_HistogramResult extends HistogramResult {

  private final String interval;
  private final Map results;
  private final long time;
  private final String builtQuery;
  private final TimeRange queriedTimerange;

  $AutoValue_HistogramResult(
      String interval,
      Map results,
      long time,
      String builtQuery,
      TimeRange queriedTimerange) {
    if (interval == null) {
      throw new NullPointerException("Null interval");
    }
    this.interval = interval;
    if (results == null) {
      throw new NullPointerException("Null results");
    }
    this.results = results;
    this.time = time;
    if (builtQuery == null) {
      throw new NullPointerException("Null builtQuery");
    }
    this.builtQuery = builtQuery;
    if (queriedTimerange == null) {
      throw new NullPointerException("Null queriedTimerange");
    }
    this.queriedTimerange = queriedTimerange;
  }

  @JsonProperty
  @Override
  public String interval() {
    return interval;
  }

  @JsonProperty
  @Override
  public Map results() {
    return results;
  }

  @JsonProperty
  @Override
  public long time() {
    return time;
  }

  @JsonProperty
  @Override
  public String builtQuery() {
    return builtQuery;
  }

  @JsonProperty
  @Override
  public TimeRange queriedTimerange() {
    return queriedTimerange;
  }

  @Override
  public String toString() {
    return "HistogramResult{"
        + "interval=" + interval + ", "
        + "results=" + results + ", "
        + "time=" + time + ", "
        + "builtQuery=" + builtQuery + ", "
        + "queriedTimerange=" + queriedTimerange
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HistogramResult) {
      HistogramResult that = (HistogramResult) o;
      return (this.interval.equals(that.interval()))
           && (this.results.equals(that.results()))
           && (this.time == that.time())
           && (this.builtQuery.equals(that.builtQuery()))
           && (this.queriedTimerange.equals(that.queriedTimerange()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.interval.hashCode();
    h *= 1000003;
    h ^= this.results.hashCode();
    h *= 1000003;
    h ^= (this.time >>> 32) ^ this.time;
    h *= 1000003;
    h ^= this.builtQuery.hashCode();
    h *= 1000003;
    h ^= this.queriedTimerange.hashCode();
    return h;
  }

}
