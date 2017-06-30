package org.graylog2.shared.system.stats.process;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_ProcessStats_Cpu extends $AutoValue_ProcessStats_Cpu {
  AutoValue_ProcessStats_Cpu(short percent, long sys, long user, long total) {
    super(percent, sys, user, total);
  }

  @JsonIgnore
  public final short getPercent() {
    return percent();
  }

  @JsonIgnore
  public final long getSys() {
    return sys();
  }

  @JsonIgnore
  public final long getUser() {
    return user();
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }
}
