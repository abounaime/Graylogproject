package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import javax.annotation.Nullable;

final class AutoValue_ServerStatus_Connections extends $AutoValue_ServerStatus_Connections {
  AutoValue_ServerStatus_Connections(int current, int available, Long totalCreated) {
    super(current, available, totalCreated);
  }

  @JsonIgnore
  public final int getCurrent() {
    return current();
  }

  @JsonIgnore
  public final int getAvailable() {
    return available();
  }

  @JsonIgnore
  @Nullable
  public final Long getTotalCreated() {
    return totalCreated();
  }
}
