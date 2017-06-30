package org.graylog2.shared.system.stats.process;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_ProcessStats_Memory extends $AutoValue_ProcessStats_Memory {
  AutoValue_ProcessStats_Memory(long totalVirtual, long resident, long share) {
    super(totalVirtual, resident, share);
  }

  @JsonIgnore
  public final long getTotalVirtual() {
    return totalVirtual();
  }

  @JsonIgnore
  public final long getResident() {
    return resident();
  }

  @JsonIgnore
  public final long getShare() {
    return share();
  }
}
