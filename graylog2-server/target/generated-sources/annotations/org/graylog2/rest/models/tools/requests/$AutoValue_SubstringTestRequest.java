
package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SubstringTestRequest extends SubstringTestRequest {

  private final String string;
  private final int start;
  private final int end;

  $AutoValue_SubstringTestRequest(
      String string,
      int start,
      int end) {
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
    this.start = start;
    this.end = end;
  }

  @JsonProperty
  @Override
  public String string() {
    return string;
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
    return "SubstringTestRequest{"
        + "string=" + string + ", "
        + "start=" + start + ", "
        + "end=" + end
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SubstringTestRequest) {
      SubstringTestRequest that = (SubstringTestRequest) o;
      return (this.string.equals(that.string()))
           && (this.start == that.start())
           && (this.end == that.end());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.string.hashCode();
    h *= 1000003;
    h ^= this.start;
    h *= 1000003;
    h ^= this.end;
    return h;
  }

}
