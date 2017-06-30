
package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SplitAndIndexTestRequest extends SplitAndIndexTestRequest {

  private final String string;
  private final String splitBy;
  private final int index;

  $AutoValue_SplitAndIndexTestRequest(
      String string,
      String splitBy,
      int index) {
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
    if (splitBy == null) {
      throw new NullPointerException("Null splitBy");
    }
    this.splitBy = splitBy;
    this.index = index;
  }

  @JsonProperty
  @Override
  public String string() {
    return string;
  }

  @JsonProperty(value = "split_by")
  @Override
  public String splitBy() {
    return splitBy;
  }

  @JsonProperty
  @Override
  public int index() {
    return index;
  }

  @Override
  public String toString() {
    return "SplitAndIndexTestRequest{"
        + "string=" + string + ", "
        + "splitBy=" + splitBy + ", "
        + "index=" + index
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SplitAndIndexTestRequest) {
      SplitAndIndexTestRequest that = (SplitAndIndexTestRequest) o;
      return (this.string.equals(that.string()))
           && (this.splitBy.equals(that.splitBy()))
           && (this.index == that.index());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.string.hashCode();
    h *= 1000003;
    h ^= this.splitBy.hashCode();
    h *= 1000003;
    h ^= this.index;
    return h;
  }

}
