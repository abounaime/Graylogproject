package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.net.HostAndPort;
import java.util.List;
import javax.annotation.Nullable;

final class AutoValue_MongoStats extends $AutoValue_MongoStats {
  AutoValue_MongoStats(List<HostAndPort> servers, BuildInfo buildInfo, HostInfo hostInfo,
      ServerStatus serverStatus, DatabaseStats databaseStats) {
    super(servers, buildInfo, hostInfo, serverStatus, databaseStats);
  }

  @JsonIgnore
  public final List<HostAndPort> getServers() {
    return servers();
  }

  @JsonIgnore
  public final BuildInfo getBuildInfo() {
    return buildInfo();
  }

  @JsonIgnore
  @Nullable
  public final HostInfo getHostInfo() {
    return hostInfo();
  }

  @JsonIgnore
  @Nullable
  public final ServerStatus getServerStatus() {
    return serverStatus();
  }

  @JsonIgnore
  @Nullable
  public final DatabaseStats getDatabaseStats() {
    return databaseStats();
  }
}
