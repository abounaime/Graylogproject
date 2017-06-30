package org.graylog2.gettingstarted;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.util.Set;

final class AutoValue_GettingStartedState extends $AutoValue_GettingStartedState {
  AutoValue_GettingStartedState(Set<String> dismissedInVersions) {
    super(dismissedInVersions);
  }

  @JsonIgnore
  public final Set<String> getDismissedInVersions() {
    return dismissedInVersions();
  }
}
