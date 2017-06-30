package org.graylog2.lookup.caches;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_NullCache_Config extends $AutoValue_NullCache_Config {
  AutoValue_NullCache_Config(String type) {
    super(type);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }
}
