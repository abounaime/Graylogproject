package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_ServerStatus_StorageEngine extends $AutoValue_ServerStatus_StorageEngine {
  AutoValue_ServerStatus_StorageEngine(String name) {
    super(name);
  }

  @JsonIgnore
  public final String getName() {
    return name();
  }
}
