package org.graylog2.shared.system.stats.os;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_Memory extends $AutoValue_Memory {
  AutoValue_Memory(long total, long free, short freePercent, long used, short usedPercent,
      long actualFree, long actualUsed) {
    super(total, free, freePercent, used, usedPercent, actualFree, actualUsed);
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
  public final short getFreePercent() {
    return freePercent();
  }

  @JsonIgnore
  public final long getUsed() {
    return used();
  }

  @JsonIgnore
  public final short getUsedPercent() {
    return usedPercent();
  }

  @JsonIgnore
  public final long getActualFree() {
    return actualFree();
  }

  @JsonIgnore
  public final long getActualUsed() {
    return actualUsed();
  }
}
