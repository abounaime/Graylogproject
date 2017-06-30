
package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RegexTesterResponse_Match extends RegexTesterResponse.Match {

  private final String match;
  private final int start;
  private final int end;

  $AutoValue_RegexTesterResponse_Match(
      @Nullable String match,
      int start,
      int end) {
    this.match = match;
    this.start = start;
    this.end = end;
  }

  @JsonProperty
  @Nullable
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
    if (o instanceof RegexTesterResponse.Match) {
      RegexTesterResponse.Match that = (RegexTesterResponse.Match) o;
      return ((this.match == null) ? (that.match() == null) : this.match.equals(that.match()))
           && (this.start == that.start())
           && (this.end == that.end());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (match == null) ? 0 : this.match.hashCode();
    h *= 1000003;
    h ^= this.start;
    h *= 1000003;
    h ^= this.end;
    return h;
  }

}
