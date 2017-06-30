
package org.graylog2.rest.models.search.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_TimeRange extends TimeRange {

  private final DateTime from;
  private final DateTime to;

  $AutoValue_TimeRange(
      DateTime from,
      DateTime to) {
    if (from == null) {
      throw new NullPointerException("Null from");
    }
    this.from = from;
    if (to == null) {
      throw new NullPointerException("Null to");
    }
    this.to = to;
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

  @Override
  public String toString() {
    return "TimeRange{"
        + "from=" + from + ", "
        + "to=" + to
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TimeRange) {
      TimeRange that = (TimeRange) o;
      return (this.from.equals(that.from()))
           && (this.to.equals(that.to()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.from.hashCode();
    h *= 1000003;
    h ^= this.to.hashCode();
    return h;
  }

}
