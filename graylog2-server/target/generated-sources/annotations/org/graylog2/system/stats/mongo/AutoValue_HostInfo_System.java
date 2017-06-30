package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.joda.time.DateTime;

final class AutoValue_HostInfo_System extends $AutoValue_HostInfo_System {
  AutoValue_HostInfo_System(DateTime currentTime, String hostname, int cpuAddrSize, long memSizeMB,
      int numCores, String cpuArch, boolean numaEnabled) {
    super(currentTime, hostname, cpuAddrSize, memSizeMB, numCores, cpuArch, numaEnabled);
  }

  @JsonIgnore
  public final DateTime getCurrentTime() {
    return currentTime();
  }

  @JsonIgnore
  public final String getHostname() {
    return hostname();
  }

  @JsonIgnore
  public final int getCpuAddrSize() {
    return cpuAddrSize();
  }

  @JsonIgnore
  public final long getMemSizeMB() {
    return memSizeMB();
  }

  @JsonIgnore
  public final int getNumCores() {
    return numCores();
  }

  @JsonIgnore
  public final String getCpuArch() {
    return cpuArch();
  }

  @JsonIgnore
  public final boolean isNumaEnabled() {
    return numaEnabled();
  }
}
