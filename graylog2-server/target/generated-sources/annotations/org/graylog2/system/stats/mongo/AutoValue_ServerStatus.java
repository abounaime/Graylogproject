package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.joda.time.DateTime;

final class AutoValue_ServerStatus extends $AutoValue_ServerStatus {
  AutoValue_ServerStatus(String host, String version, String process, long pid, int uptime,
      long uptimeMillis, int uptimeEstimate, DateTime localTime,
      ServerStatus.Connections connections, ServerStatus.Network network,
      ServerStatus.Memory memory, ServerStatus.StorageEngine storageEngine) {
    super(host, version, process, pid, uptime, uptimeMillis, uptimeEstimate, localTime, connections, network, memory, storageEngine);
  }

  @JsonIgnore
  public final String getHost() {
    return host();
  }

  @JsonIgnore
  public final String getVersion() {
    return version();
  }

  @JsonIgnore
  public final String getProcess() {
    return process();
  }

  @JsonIgnore
  public final long getPid() {
    return pid();
  }

  @JsonIgnore
  public final int getUptime() {
    return uptime();
  }

  @JsonIgnore
  public final long getUptimeMillis() {
    return uptimeMillis();
  }

  @JsonIgnore
  public final int getUptimeEstimate() {
    return uptimeEstimate();
  }

  @JsonIgnore
  public final DateTime getLocalTime() {
    return localTime();
  }

  @JsonIgnore
  public final ServerStatus.Connections getConnections() {
    return connections();
  }

  @JsonIgnore
  public final ServerStatus.Network getNetwork() {
    return network();
  }

  @JsonIgnore
  public final ServerStatus.Memory getMemory() {
    return memory();
  }

  @JsonIgnore
  public final ServerStatus.StorageEngine getStorageEngine() {
    return storageEngine();
  }
}
