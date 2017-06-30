
package org.graylog2.shared.system.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.graylog2.shared.system.stats.fs.FsStats;
import org.graylog2.shared.system.stats.jvm.JvmStats;
import org.graylog2.shared.system.stats.network.NetworkStats;
import org.graylog2.shared.system.stats.os.OsStats;
import org.graylog2.shared.system.stats.process.ProcessStats;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SystemStats extends SystemStats {

  private final FsStats fsStats;
  private final JvmStats jvmStats;
  private final NetworkStats networkStats;
  private final OsStats osStats;
  private final ProcessStats processStats;

  $AutoValue_SystemStats(
      FsStats fsStats,
      JvmStats jvmStats,
      NetworkStats networkStats,
      OsStats osStats,
      ProcessStats processStats) {
    if (fsStats == null) {
      throw new NullPointerException("Null fsStats");
    }
    this.fsStats = fsStats;
    if (jvmStats == null) {
      throw new NullPointerException("Null jvmStats");
    }
    this.jvmStats = jvmStats;
    if (networkStats == null) {
      throw new NullPointerException("Null networkStats");
    }
    this.networkStats = networkStats;
    if (osStats == null) {
      throw new NullPointerException("Null osStats");
    }
    this.osStats = osStats;
    if (processStats == null) {
      throw new NullPointerException("Null processStats");
    }
    this.processStats = processStats;
  }

  @JsonProperty(value = "fs")
  @Override
  public FsStats fsStats() {
    return fsStats;
  }

  @JsonProperty(value = "jvm")
  @Override
  public JvmStats jvmStats() {
    return jvmStats;
  }

  @JsonProperty(value = "network")
  @Override
  public NetworkStats networkStats() {
    return networkStats;
  }

  @JsonProperty(value = "os")
  @Override
  public OsStats osStats() {
    return osStats;
  }

  @JsonProperty(value = "process")
  @Override
  public ProcessStats processStats() {
    return processStats;
  }

  @Override
  public String toString() {
    return "SystemStats{"
        + "fsStats=" + fsStats + ", "
        + "jvmStats=" + jvmStats + ", "
        + "networkStats=" + networkStats + ", "
        + "osStats=" + osStats + ", "
        + "processStats=" + processStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SystemStats) {
      SystemStats that = (SystemStats) o;
      return (this.fsStats.equals(that.fsStats()))
           && (this.jvmStats.equals(that.jvmStats()))
           && (this.networkStats.equals(that.networkStats()))
           && (this.osStats.equals(that.osStats()))
           && (this.processStats.equals(that.processStats()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.fsStats.hashCode();
    h *= 1000003;
    h ^= this.jvmStats.hashCode();
    h *= 1000003;
    h ^= this.networkStats.hashCode();
    h *= 1000003;
    h ^= this.osStats.hashCode();
    h *= 1000003;
    h ^= this.processStats.hashCode();
    return h;
  }

}
