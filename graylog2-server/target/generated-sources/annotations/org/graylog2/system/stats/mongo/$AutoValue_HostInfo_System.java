
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_HostInfo_System extends HostInfo.System {

  private final DateTime currentTime;
  private final String hostname;
  private final int cpuAddrSize;
  private final long memSizeMB;
  private final int numCores;
  private final String cpuArch;
  private final boolean numaEnabled;

  $AutoValue_HostInfo_System(
      DateTime currentTime,
      String hostname,
      int cpuAddrSize,
      long memSizeMB,
      int numCores,
      String cpuArch,
      boolean numaEnabled) {
    if (currentTime == null) {
      throw new NullPointerException("Null currentTime");
    }
    this.currentTime = currentTime;
    if (hostname == null) {
      throw new NullPointerException("Null hostname");
    }
    this.hostname = hostname;
    this.cpuAddrSize = cpuAddrSize;
    this.memSizeMB = memSizeMB;
    this.numCores = numCores;
    if (cpuArch == null) {
      throw new NullPointerException("Null cpuArch");
    }
    this.cpuArch = cpuArch;
    this.numaEnabled = numaEnabled;
  }

  @JsonProperty
  @Override
  public DateTime currentTime() {
    return currentTime;
  }

  @JsonProperty
  @Override
  public String hostname() {
    return hostname;
  }

  @JsonProperty
  @Override
  public int cpuAddrSize() {
    return cpuAddrSize;
  }

  @JsonProperty
  @Override
  public long memSizeMB() {
    return memSizeMB;
  }

  @JsonProperty
  @Override
  public int numCores() {
    return numCores;
  }

  @JsonProperty
  @Override
  public String cpuArch() {
    return cpuArch;
  }

  @JsonProperty
  @Override
  public boolean numaEnabled() {
    return numaEnabled;
  }

  @Override
  public String toString() {
    return "System{"
        + "currentTime=" + currentTime + ", "
        + "hostname=" + hostname + ", "
        + "cpuAddrSize=" + cpuAddrSize + ", "
        + "memSizeMB=" + memSizeMB + ", "
        + "numCores=" + numCores + ", "
        + "cpuArch=" + cpuArch + ", "
        + "numaEnabled=" + numaEnabled
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HostInfo.System) {
      HostInfo.System that = (HostInfo.System) o;
      return (this.currentTime.equals(that.currentTime()))
           && (this.hostname.equals(that.hostname()))
           && (this.cpuAddrSize == that.cpuAddrSize())
           && (this.memSizeMB == that.memSizeMB())
           && (this.numCores == that.numCores())
           && (this.cpuArch.equals(that.cpuArch()))
           && (this.numaEnabled == that.numaEnabled());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.currentTime.hashCode();
    h *= 1000003;
    h ^= this.hostname.hashCode();
    h *= 1000003;
    h ^= this.cpuAddrSize;
    h *= 1000003;
    h ^= (this.memSizeMB >>> 32) ^ this.memSizeMB;
    h *= 1000003;
    h ^= this.numCores;
    h *= 1000003;
    h ^= this.cpuArch.hashCode();
    h *= 1000003;
    h ^= this.numaEnabled ? 1231 : 1237;
    return h;
  }

}
