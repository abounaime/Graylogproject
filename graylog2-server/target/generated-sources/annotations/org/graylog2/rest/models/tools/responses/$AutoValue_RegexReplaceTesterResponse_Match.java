
package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RegexReplaceTesterResponse_Match extends RegexReplaceTesterResponse.Match {

  private final String match;
  private final int start;
  private final int end;

  $AutoValue_RegexReplaceTesterResponse_Match(
      String match,
      int start,
      int end) {
    if (match == null) {
      throw new NullPointerException("Null match");
    }
    this.match = match;
    this.start = start;
    this.end = end;
  }

  @JsonProperty
  @Override
  public String match() {
    return match;
  }

  @JsonProperty
  @Override
  public int start() {
    return start;
  }

  @JsonProperty
  @Override
  public int end() {
    return end;
  }

  @Override
  public String toString() {
    return "Match{"
        + "match=" + match + ", "
        + "start=" + start + ", "
        + "end=" + end
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegexReplaceTesterResponse.Match) {
      RegexReplaceTesterResponse.Match that = (RegexReplaceTesterResponse.Match) o;
      return (this.match.equals(that.match()))
           && (this.start == that.start())
           && (this.end == that.end());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.match.hashCode();
    h *= 1000003;
    h ^= this.start;
    h *= 1000003;
    h ^= this.end;
    return h;
  }

}
