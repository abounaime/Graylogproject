
package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_RegexReplaceTestRequest extends RegexReplaceTestRequest {

  private final String string;
  private final String regex;
  private final String replacement;
  private final boolean replaceAll;

  $AutoValue_RegexReplaceTestRequest(
      String string,
      String regex,
      String replacement,
      boolean replaceAll) {
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
    if (regex == null) {
      throw new NullPointerException("Null regex");
    }
    this.regex = regex;
    if (replacement == null) {
      throw new NullPointerException("Null replacement");
    }
    this.replacement = replacement;
    this.replaceAll = replaceAll;
  }

  @JsonProperty
  @NotNull
  @Override
  public String string() {
    return string;
  }

  @JsonProperty
  @NotEmpty
  @Override
  public String regex() {
    return regex;
  }

  @JsonProperty
  @NotNull
  @Override
  public String replacement() {
    return replacement;
  }

  @JsonProperty(value = "replace_all")
  @Override
  public boolean replaceAll() {
    return replaceAll;
  }

  @Override
  public String toString() {
    return "RegexReplaceTestRequest{"
        + "string=" + string + ", "
        + "regex=" + regex + ", "
        + "replacement=" + replacement + ", "
        + "replaceAll=" + replaceAll
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegexReplaceTestRequest) {
      RegexReplaceTestRequest that = (RegexReplaceTestRequest) o;
      return (this.string.equals(that.string()))
           && (this.regex.equals(that.regex()))
           && (this.replacement.equals(that.replacement()))
           && (this.replaceAll == that.replaceAll());
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
    h *= 1000003;
    h ^= this.replacement.hashCode();
    h *= 1000003;
    h ^= this.replaceAll ? 1231 : 1237;
    return h;
  }

}
