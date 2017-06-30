
package org.graylog2.gettingstarted;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GettingStartedState extends GettingStartedState {

  private final Set<String> dismissedInVersions;

  $AutoValue_GettingStartedState(
      Set<String> dismissedInVersions) {
    if (dismissedInVersions == null) {
      throw new NullPointerException("Null dismissedInVersions");
    }
    this.dismissedInVersions = dismissedInVersions;
  }

  @JsonProperty
  @Override
  public Set<String> dismissedInVersions() {
    return dismissedInVersions;
  }

  @Override
  public String toString() {
    return "GettingStartedState{"
        + "dismissedInVersions=" + dismissedInVersions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GettingStartedState) {
      GettingStartedState that = (GettingStartedState) o;
      return (this.dismissedInVersions.equals(that.dismissedInVersions()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.dismissedInVersions.hashCode();
    return h;
  }

}
