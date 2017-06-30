
package org.graylog2.rest.models.system.metrics.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MetricNamesResponse extends MetricNamesResponse {

  private final Set<String> names;

  $AutoValue_MetricNamesResponse(
      Set<String> names) {
    if (names == null) {
      throw new NullPointerException("Null names");
    }
    this.names = names;
  }

  @JsonProperty
  @Override
  public Set<String> names() {
    return names;
  }

  @Override
  public String toString() {
    return "MetricNamesResponse{"
        + "names=" + names
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MetricNamesResponse) {
      MetricNamesResponse that = (MetricNamesResponse) o;
      return (this.names.equals(that.names()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.names.hashCode();
    return h;
  }

}
