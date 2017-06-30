
package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RegexTesterResponse extends RegexTesterResponse {

  private final boolean matched;
  private final RegexTesterResponse.Match match;
  private final String regex;
  private final String string;

  $AutoValue_RegexTesterResponse(
      boolean matched,
      @Nullable RegexTesterResponse.Match match,
      String regex,
      String string) {
    this.matched = matched;
    this.match = match;
    if (regex == null) {
      throw new NullPointerException("Null regex");
    }
    this.regex = regex;
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
  }

  @JsonProperty
  @Override
  public boolean matched() {
    return matched;
  }

  @JsonProperty
  @Nullable
  @Override
  public RegexTesterResponse.Match match() {
    return match;
  }

  @JsonProperty
  @Override
  public String regex() {
    return regex;
  }

  @JsonProperty
  @Override
  public String string() {
    return string;
  }

  @Override
  public String toString() {
    return "RegexTesterResponse{"
        + "matched=" + matched + ", "
        + "match=" + match + ", "
        + "regex=" + regex + ", "
        + "string=" + string
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegexTesterResponse) {
      RegexTesterResponse that = (RegexTesterResponse) o;
      return (this.matched == that.matched())
           && ((this.match == null) ? (that.match() == null) : this.match.equals(that.match()))
           && (this.regex.equals(that.regex()))
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
    h ^= this.regex.hashCode();
    h *= 1000003;
    h ^= this.string.hashCode();
    return h;
  }

}
