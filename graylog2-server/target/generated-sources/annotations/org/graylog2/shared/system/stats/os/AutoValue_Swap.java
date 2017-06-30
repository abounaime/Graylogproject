package org.graylog2.shared.system.stats.os;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_Swap extends $AutoValue_Swap {
  AutoValue_Swap(long total, long free, long used) {
    super(total, free, used);
  }

  @JsonIgnore
  public final long getTotal() {
    return total();
  }

  @JsonIgnore
  public final long getFree() {
    return free();
  }

  @JsonIgnore
  public final long getUsed() {
    return used();
  }
}
