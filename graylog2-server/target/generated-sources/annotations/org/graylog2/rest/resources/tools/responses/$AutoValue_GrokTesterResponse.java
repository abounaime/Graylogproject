
package org.graylog2.rest.resources.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GrokTesterResponse extends GrokTesterResponse {

  private final boolean matched;
  private final List<GrokTesterResponse.Match> matches;
  private final String pattern;
  private final String string;

  $AutoValue_GrokTesterResponse(
      boolean matched,
      @Nullable List<GrokTesterResponse.Match> matches,
      String pattern,
      String string) {
    this.matched = matched;
    this.matches = matches;
    if (pattern == null) {
      throw new NullPointerException("Null pattern");
    }
    this.pattern = pattern;
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
  public List<GrokTesterResponse.Match> matches() {
    return matches;
  }

  @JsonProperty
  @Override
  public String pattern() {
    return pattern;
  }

  @JsonProperty
  @Override
  public String string() {
    return string;
  }

  @Override
  public String toString() {
    return "GrokTesterResponse{"
        + "matched=" + matched + ", "
        + "matches=" + matches + ", "
        + "pattern=" + pattern + ", "
        + "string=" + string
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GrokTesterResponse) {
      GrokTesterResponse that = (GrokTesterResponse) o;
      return (this.matched == that.matched())
           && ((this.matches == null) ? (that.matches() == null) : this.matches.equals(that.matches()))
           && (this.pattern.equals(that.pattern()))
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
    h ^= (matches == null) ? 0 : this.matches.hashCode();
    h *= 1000003;
    h ^= this.pattern.hashCode();
    h *= 1000003;
    h ^= this.string.hashCode();
    return h;
  }

}
