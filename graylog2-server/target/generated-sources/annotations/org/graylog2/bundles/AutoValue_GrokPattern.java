package org.graylog2.bundles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_GrokPattern extends $AutoValue_GrokPattern {
  AutoValue_GrokPattern(String name, String pattern) {
    super(name, pattern);
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }

  @JsonIgnore
  public final String getPattern() {
    return pattern();
  }
}
