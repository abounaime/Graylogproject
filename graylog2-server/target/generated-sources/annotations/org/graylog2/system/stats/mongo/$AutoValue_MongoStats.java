
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.net.HostAndPort;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MongoStats extends MongoStats {

  private final List<HostAndPort> servers;
  private final BuildInfo buildInfo;
  private final HostInfo hostInfo;
  private final ServerStatus serverStatus;
  private final DatabaseStats databaseStats;

  $AutoValue_MongoStats(
      List<HostAndPort> servers,
      BuildInfo buildInfo,
      @Nullable HostInfo hostInfo,
      @Nullable ServerStatus serverStatus,
      @Nullable DatabaseStats databaseStats) {
    if (servers == null) {
      throw new NullPointerException("Null servers");
    }
    this.servers = servers;
    if (buildInfo == null) {
      throw new NullPointerException("Null buildInfo");
    }
    this.buildInfo = buildInfo;
    this.hostInfo = hostInfo;
    this.serverStatus = serverStatus;
    this.databaseStats = databaseStats;
  }

  @JsonProperty
  @Override
  public List<HostAndPort> servers() {
    return servers;
  }

  @JsonProperty
  @Override
  public BuildInfo buildInfo() {
    return buildInfo;
  }

  @JsonProperty
  @Nullable
  @Override
  public HostInfo hostInfo() {
    return hostInfo;
  }

  @JsonProperty
  @Nullable
  @Override
  public ServerStatus serverStatus() {
    return serverStatus;
  }

  @JsonProperty
  @Nullable
  @Override
  public DatabaseStats databaseStats() {
    return databaseStats;
  }

  @Override
  public String toString() {
    return "MongoStats{"
        + "servers=" + servers + ", "
        + "buildInfo=" + buildInfo + ", "
        + "hostInfo=" + hostInfo + ", "
        + "serverStatus=" + serverStatus + ", "
        + "databaseStats=" + databaseStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MongoStats) {
      MongoStats that = (MongoStats) o;
      return (this.servers.equals(that.servers()))
           && (this.buildInfo.equals(that.buildInfo()))
           && ((this.hostInfo == null) ? (that.hostInfo() == null) : this.hostInfo.equals(that.hostInfo()))
           && ((this.serverStatus == null) ? (that.serverStatus() == null) : this.serverStatus.equals(that.serverStatus()))
           && ((this.databaseStats == null) ? (that.databaseStats() == null) : this.databaseStats.equals(that.databaseStats()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.servers.hashCode();
    h *= 1000003;
    h ^= this.buildInfo.hashCode();
    h *= 1000003;
    h ^= (hostInfo == null) ? 0 : this.hostInfo.hashCode();
    h *= 1000003;
    h ^= (serverStatus == null) ? 0 : this.serverStatus.hashCode();
    h *= 1000003;
    h ^= (databaseStats == null) ? 0 : this.databaseStats.hashCode();
    return h;
  }

}
