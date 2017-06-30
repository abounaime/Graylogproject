package org.graylog2.rest.models.system;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_DisplayGettingStarted extends $AutoValue_DisplayGettingStarted {
  AutoValue_DisplayGettingStarted(boolean show) {
    super(show);
  }

  @JsonIgnore
  public final boolean isShow() {
    return show();
  }
}
