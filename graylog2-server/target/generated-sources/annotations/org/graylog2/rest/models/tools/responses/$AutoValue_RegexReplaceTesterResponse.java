
package org.graylog2.rest.models.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RegexReplaceTesterResponse extends RegexReplaceTesterResponse {

  private final boolean matched;
  private final RegexReplaceTesterResponse.Match match;
  private final String regex;
  private final String replacement;
  private final boolean replaceAll;
  private final String string;

  $AutoValue_RegexReplaceTesterResponse(
      boolean matched,
      @Nullable RegexReplaceTesterResponse.Match match,
      String regex,
      String replacement,
      boolean replaceAll,
      String string) {
    this.matched = matched;
    this.match = match;
    if (regex == null) {
      throw new NullPointerException("Null regex");
    }
    this.regex = regex;
    if (replacement == null) {
      throw new NullPointerException("Null replacement");
    }
    this.replacement = replacement;
    this.replaceAll = replaceAll;
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
  public RegexReplaceTesterResponse.Match match() {
    return match;
  }

  @JsonProperty
  @Override
  public String regex() {
    return regex;
  }

  @JsonProperty
  @Override
  public String replacement() {
    return replacement;
  }

  @JsonProperty(value = "replace_all")
  @Override
  public boolean replaceAll() {
    return replaceAll;
  }

  @JsonProperty
  @Override
  public String string() {
    return string;
  }

  @Override
  public String toString() {
    return "RegexReplaceTesterResponse{"
        + "matched=" + matched + ", "
        + "match=" + match + ", "
        + "regex=" + regex + ", "
        + "replacement=" + replacement + ", "
        + "replaceAll=" + replaceAll + ", "
        + "string=" + string
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegexReplaceTesterResponse) {
      RegexReplaceTesterResponse that = (RegexReplaceTesterResponse) o;
      return (this.matched == that.matched())
           && ((this.match == null) ? (that.match() == null) : this.match.equals(that.match()))
           && (this.regex.equals(that.regex()))
           && (this.replacement.equals(that.replacement()))
           && (this.replaceAll == that.replaceAll())
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
    h ^= this.replacement.hashCode();
    h *= 1000003;
    h ^= this.replaceAll ? 1231 : 1237;
    h *= 1000003;
    h ^= this.string.hashCode();
    return h;
  }

}
