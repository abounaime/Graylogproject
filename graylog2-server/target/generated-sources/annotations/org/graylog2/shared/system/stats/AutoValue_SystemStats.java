package org.graylog2.shared.system.stats;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.graylog2.shared.system.stats.fs.FsStats;
import org.graylog2.shared.system.stats.jvm.JvmStats;
import org.graylog2.shared.system.stats.network.NetworkStats;
import org.graylog2.shared.system.stats.os.OsStats;
import org.graylog2.shared.system.stats.process.ProcessStats;

final class AutoValue_SystemStats extends $AutoValue_SystemStats {
  AutoValue_SystemStats(FsStats fsStats, JvmStats jvmStats, NetworkStats networkStats,
      OsStats osStats, ProcessStats processStats) {
    super(fsStats, jvmStats, networkStats, osStats, processStats);
  }

  @JsonIgnore
  public final FsStats getFsStats() {
    return fsStats();
  }

  @JsonIgnore
  public final JvmStats getJvmStats() {
    return jvmStats();
  }

  @JsonIgnore
  public final NetworkStats getNetworkStats() {
    return networkStats();
  }

  @JsonIgnore
  public final OsStats getOsStats() {
    return osStats();
  }

  @JsonIgnore
  public final ProcessStats getProcessStats() {
    return processStats();
  }
}
