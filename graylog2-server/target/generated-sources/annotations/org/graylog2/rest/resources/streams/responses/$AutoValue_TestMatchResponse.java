
package org.graylog2.rest.resources.streams.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_TestMatchResponse extends TestMatchResponse {

  private final boolean matches;
  private final Map<String, Boolean> rules;

  $AutoValue_TestMatchResponse(
      boolean matches,
      Map<String, Boolean> rules) {
    this.matches = matches;
    if (rules == null) {
      throw new NullPointerException("Null rules");
    }
    this.rules = rules;
  }

  @JsonProperty
  @Override
  public boolean matches() {
    return matches;
  }

  @JsonProperty
  @Override
  public Map<String, Boolean> rules() {
    return rules;
  }

  @Override
  public String toString() {
    return "TestMatchResponse{"
        + "matches=" + matches + ", "
        + "rules=" + rules
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TestMatchResponse) {
      TestMatchResponse that = (TestMatchResponse) o;
      return (this.matches == that.matches())
           && (this.rules.equals(that.rules()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.matches ? 1231 : 1237;
    h *= 1000003;
    h ^= this.rules.hashCode();
    return h;
  }

}
