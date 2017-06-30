
package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import javax.annotation.Generated;
import org.graylog2.grok.GrokPattern;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GrokPatternList extends GrokPatternList {

  private final Collection<GrokPattern> patterns;

  $AutoValue_GrokPatternList(
      Collection<GrokPattern> patterns) {
    if (patterns == null) {
      throw new NullPointerException("Null patterns");
    }
    this.patterns = patterns;
  }

  @JsonProperty
  @Override
  public Collection<GrokPattern> patterns() {
    return patterns;
  }

  @Override
  public String toString() {
    return "GrokPatternList{"
        + "patterns=" + patterns
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GrokPatternList) {
      GrokPatternList that = (GrokPatternList) o;
      return (this.patterns.equals(that.patterns()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.patterns.hashCode();
    return h;
  }

}
