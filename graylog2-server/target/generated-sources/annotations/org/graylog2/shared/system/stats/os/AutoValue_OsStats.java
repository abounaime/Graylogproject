package org.graylog2.shared.system.stats.os;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.SuppressWarnings;

final class AutoValue_OsStats extends $AutoValue_OsStats {
  AutoValue_OsStats(double[] loadAverage, long uptime, Processor processor, Memory memory,
      Swap swap) {
    super(loadAverage, uptime, processor, memory, swap);
  }

  @JsonIgnore
  @SuppressWarnings("mutable")
  public final double[] getLoadAverage() {
    return loadAverage();
  }

  @JsonIgnore
  public final long getUptime() {
    return uptime();
  }

  @JsonIgnore
  public final Processor getProcessor() {
    return processor();
  }

  @JsonIgnore
  public final Memory getMemory() {
    return memory();
  }

  @JsonIgnore
  public final Swap getSwap() {
    return swap();
  }
}
