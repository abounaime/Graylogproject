
package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ContainsStringTestRequest extends ContainsStringTestRequest {

  private final String searchString;
  private final String string;

  AutoValue_ContainsStringTestRequest(
      String searchString,
      String string) {
    if (searchString == null) {
      throw new NullPointerException("Null searchString");
    }
    this.searchString = searchString;
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
  }

  @JsonProperty(value = "search_string")
  @Override
  public String searchString() {
    return searchString;
  }

  @JsonProperty(value = "string")
  @Override
  public String string() {
    return string;
  }

  @Override
  public String toString() {
    return "ContainsStringTestRequest{"
        + "searchString=" + searchString + ", "
        + "string=" + string
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ContainsStringTestRequest) {
      ContainsStringTestRequest that = (ContainsStringTestRequest) o;
      return (this.searchString.equals(that.searchString()))
           && (this.string.equals(that.string()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.searchString.hashCode();
    h *= 1000003;
    h ^= this.string.hashCode();
    return h;
  }

}
