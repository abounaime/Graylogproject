package org.graylog2.shared.system.stats.process;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.annotation.Nullable;

final class AutoValue_ProcessStats extends $AutoValue_ProcessStats {
  AutoValue_ProcessStats(long pid, long openFileDescriptors, long maxFileDescriptors,
      ProcessStats.Cpu cpu, ProcessStats.Memory memory) {
    super(pid, openFileDescriptors, maxFileDescriptors, cpu, memory);
  }

  @JsonIgnore
  public final long getPid() {
    return pid();
  }

  @JsonIgnore
  public final long getOpenFileDescriptors() {
    return openFileDescriptors();
  }

  @JsonIgnore
  public final long getMaxFileDescriptors() {
    return maxFileDescriptors();
  }

  @JsonIgnore
  @Nullable
  public final ProcessStats.Cpu getCpu() {
    return cpu();
  }

  @JsonIgnore
  @Nullable
  public final ProcessStats.Memory getMemory() {
    return memory();
  }
}
