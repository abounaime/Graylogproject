
package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ContainsStringTesterResponse_Match extends ContainsStringTesterResponse.Match {

  private final int start;
  private final int end;

  AutoValue_ContainsStringTesterResponse_Match(
      int start,
      int end) {
    this.start = start;
    this.end = end;
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
        + "start=" + start + ", "
        + "end=" + end
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ContainsStringTesterResponse.Match) {
      ContainsStringTesterResponse.Match that = (ContainsStringTesterResponse.Match) o;
      return (this.start == that.start())
           && (this.end == that.end());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.start;
    h *= 1000003;
    h ^= this.end;
    return h;
  }

}
