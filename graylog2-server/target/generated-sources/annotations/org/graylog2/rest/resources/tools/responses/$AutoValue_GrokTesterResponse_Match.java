
package org.graylog2.rest.resources.tools.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GrokTesterResponse_Match extends GrokTesterResponse.Match {

  private final String name;
  private final String match;

  $AutoValue_GrokTesterResponse_Match(
      String name,
      String match) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (match == null) {
      throw new NullPointerException("Null match");
    }
    this.match = match;
  }

  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  @JsonProperty
  @Override
  public String match() {
    return match;
  }

  @Override
  public String toString() {
    return "Match{"
        + "name=" + name + ", "
        + "match=" + match
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GrokTesterResponse.Match) {
      GrokTesterResponse.Match that = (GrokTesterResponse.Match) o;
      return (this.name.equals(that.name()))
           && (this.match.equals(that.match()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.match.hashCode();
    return h;
  }

}
