
package org.graylog2.bundles;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GrokPattern extends GrokPattern {

  private final String name;
  private final String pattern;

  $AutoValue_GrokPattern(
      String name,
      String pattern) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (pattern == null) {
      throw new NullPointerException("Null pattern");
    }
    this.pattern = pattern;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public String pattern() {
    return pattern;
  }

  @Override
  public String toString() {
    return "GrokPattern{"
        + "name=" + name + ", "
        + "pattern=" + pattern
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GrokPattern) {
      GrokPattern that = (GrokPattern) o;
      return (this.name.equals(that.name()))
           && (this.pattern.equals(that.pattern()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.pattern.hashCode();
    return h;
  }

}
