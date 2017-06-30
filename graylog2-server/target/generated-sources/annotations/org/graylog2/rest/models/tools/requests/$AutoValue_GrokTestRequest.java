
package org.graylog2.rest.models.tools.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GrokTestRequest extends GrokTestRequest {

  private final String string;
  private final String pattern;
  private final boolean namedCapturesOnly;

  $AutoValue_GrokTestRequest(
      String string,
      String pattern,
      boolean namedCapturesOnly) {
    if (string == null) {
      throw new NullPointerException("Null string");
    }
    this.string = string;
    if (pattern == null) {
      throw new NullPointerException("Null pattern");
    }
    this.pattern = pattern;
    this.namedCapturesOnly = namedCapturesOnly;
  }

  @JsonProperty
  @Override
  public String string() {
    return string;
  }

  @JsonProperty
  @Override
  public String pattern() {
    return pattern;
  }

  @JsonProperty(value = "named_captures_only")
  @Override
  public boolean namedCapturesOnly() {
    return namedCapturesOnly;
  }

  @Override
  public String toString() {
    return "GrokTestRequest{"
        + "string=" + string + ", "
        + "pattern=" + pattern + ", "
        + "namedCapturesOnly=" + namedCapturesOnly
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GrokTestRequest) {
      GrokTestRequest that = (GrokTestRequest) o;
      return (this.string.equals(that.string()))
           && (this.pattern.equals(that.pattern()))
           && (this.namedCapturesOnly == that.namedCapturesOnly());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.string.hashCode();
    h *= 1000003;
    h ^= this.pattern.hashCode();
    h *= 1000003;
    h ^= this.namedCapturesOnly ? 1231 : 1237;
    return h;
  }

}
