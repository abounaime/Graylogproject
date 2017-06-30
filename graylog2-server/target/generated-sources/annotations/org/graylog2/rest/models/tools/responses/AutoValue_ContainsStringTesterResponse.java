
package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ContainsStringTesterResponse extends ContainsStringTesterResponse {

  private final boolean matched;
  private final ContainsStringTesterResponse.Match match;
  private final String searchString;
  private final String string;

  AutoValue_ContainsStringTesterResponse(
      boolean matched,
      @Nullable ContainsStringTesterResponse.Match match,
      String searchString,
      String string) {
    this.matched = matched;
    this.match = match;
    if (searchString == null) {
      throw new NullPointerException("Null searchString");
    }
    this.searchString = searchString;
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
  }

  @JsonProperty(value = "matched")
  @Override
  public boolean matched() {
    return matched;
  }

  @JsonProperty(value = "match")
  @Nullable
  @Override
  public ContainsStringTesterResponse.Match match() {
    return match;
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
    return "ContainsStringTesterResponse{"
        + "matched=" + matched + ", "
        + "match=" + match + ", "
        + "searchString=" + searchString + ", "
        + "string=" + string
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ContainsStringTesterResponse) {
      ContainsStringTesterResponse that = (ContainsStringTesterResponse) o;
      return (this.matched == that.matched())
           && ((this.match == null) ? (that.match() == null) : this.match.equals(that.match()))
           && (this.searchString.equals(that.searchString()))
           && (this.string.equals(that.string()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.matched ? 1231 : 1237;
    h *= 1000003;
    h ^= (match == null) ? 0 : this.match.hashCode();
    h *= 1000003;
    h ^= this.searchString.hashCode();
    h *= 1000003;
    h ^= this.string.hashCode();
    return h;
  }

}
