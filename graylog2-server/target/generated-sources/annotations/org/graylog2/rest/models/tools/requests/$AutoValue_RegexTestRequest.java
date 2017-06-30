
package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RegexTestRequest extends RegexTestRequest {

  private final String string;
  private final String regex;

  $AutoValue_RegexTestRequest(
      String string,
      String regex) {
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
    if (regex == null) {
      throw new NullPointerException("Null regex");
    }
    this.regex = regex;
  }

  @JsonProperty
  @Override
  public String string() {
    return string;
  }

  @JsonProperty
  @Override
  public String regex() {
    return regex;
  }

  @Override
  public String toString() {
    return "RegexTestRequest{"
        + "string=" + string + ", "
        + "regex=" + regex
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegexTestRequest) {
      RegexTestRequest that = (RegexTestRequest) o;
      return (this.string.equals(that.string()))
           && (this.regex.equals(that.regex()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.string.hashCode();
    h *= 1000003;
    h ^= this.regex.hashCode();
    return h;
  }

}
