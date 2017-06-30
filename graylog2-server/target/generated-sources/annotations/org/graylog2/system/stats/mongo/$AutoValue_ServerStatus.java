
package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ServerStatus extends ServerStatus {

  private final String host;
  private final String version;
  private final String process;
  private final long pid;
  private final int uptime;
  private final long uptimeMillis;
  private final int uptimeEstimate;
  private final DateTime localTime;
  private final ServerStatus.Connections connections;
  private final ServerStatus.Network network;
  private final ServerStatus.Memory memory;
  private final ServerStatus.StorageEngine storageEngine;

  $AutoValue_ServerStatus(
      String host,
      String version,
      String process,
      long pid,
      int uptime,
      long uptimeMillis,
      int uptimeEstimate,
      DateTime localTime,
      ServerStatus.Connections connections,
      ServerStatus.Network network,
      ServerStatus.Memory memory,
      ServerStatus.StorageEngine storageEngine) {
    if (host == null) {
      throw new NullPointerException("Null host");
    }
    this.host = host;
    if (version == null) {
      throw new NullPointerException("Null version");
    }
    this.version = version;
    if (process == null) {
      throw new NullPointerException("Null process");
    }
    this.process = process;
    this.pid = pid;
    this.uptime = uptime;
    this.uptimeMillis = uptimeMillis;
    this.uptimeEstimate = uptimeEstimate;
    if (localTime == null) {
      throw new NullPointerException("Null localTime");
    }
    this.localTime = localTime;
    if (connections == null) {
      throw new NullPointerException("Null connections");
    }
    this.connections = connections;
    if (network == null) {
      throw new NullPointerException("Null network");
    }
    this.network = network;
    if (memory == null) {
      throw new NullPointerException("Null memory");
    }
    this.memory = memory;
    if (storageEngine == null) {
      throw new NullPointerException("Null storageEngine");
    }
    this.storageEngine = storageEngine;
  }

  @JsonProperty
  @Override
  public String host() {
    return host;
  }

  @JsonProperty
  @Override
  public String version() {
    return version;
  }

  @JsonProperty
  @Override
  public String process() {
    return process;
  }

  @JsonProperty
  @Override
  public long pid() {
    return pid;
  }

  @JsonProperty
  @Override
  public int uptime() {
    return uptime;
  }

  @JsonProperty
  @Override
  public long uptimeMillis() {
    return uptimeMillis;
  }

  @JsonProperty
  @Override
  public int uptimeEstimate() {
    return uptimeEstimate;
  }

  @JsonProperty
  @Override
  public DateTime localTime() {
    return localTime;
  }

  @JsonProperty
  @Override
  public ServerStatus.Connections connections() {
    return connections;
  }

  @JsonProperty
  @Override
  public ServerStatus.Network network() {
    return network;
  }

  @JsonProperty
  @Override
  public ServerStatus.Memory memory() {
    return memory;
  }

  @JsonProperty
  @Override
  public ServerStatus.StorageEngine storageEngine() {
    return storageEngine;
  }

  @Override
  public String toString() {
    return "ServerStatus{"
        + "host=" + host + ", "
        + "version=" + version + ", "
        + "process=" + process + ", "
        + "pid=" + pid + ", "
        + "uptime=" + uptime + ", "
        + "uptimeMillis=" + uptimeMillis + ", "
        + "uptimeEstimate=" + uptimeEstimate + ", "
        + "localTime=" + localTime + ", "
        + "connections=" + connections + ", "
        + "network=" + network + ", "
        + "memory=" + memory + ", "
        + "storageEngine=" + storageEngine
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ServerStatus) {
      ServerStatus that = (ServerStatus) o;
      return (this.host.equals(that.host()))
           && (this.version.equals(that.version()))
           && (this.process.equals(that.process()))
           && (this.pid == that.pid())
           && (this.uptime == that.uptime())
           && (this.uptimeMillis == that.uptimeMillis())
           && (this.uptimeEstimate == that.uptimeEstimate())
           && (this.localTime.equals(that.localTime()))
           && (this.connections.equals(that.connections()))
           && (this.network.equals(that.network()))
           && (this.memory.equals(that.memory()))
           && (this.storageEngine.equals(that.storageEngine()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.host.hashCode();
    h *= 1000003;
    h ^= this.version.hashCode();
    h *= 1000003;
    h ^= this.process.hashCode();
    h *= 1000003;
    h ^= (this.pid >>> 32) ^ this.pid;
    h *= 1000003;
    h ^= this.uptime;
    h *= 1000003;
    h ^= (this.uptimeMillis >>> 32) ^ this.uptimeMillis;
    h *= 1000003;
    h ^= this.uptimeEstimate;
    h *= 1000003;
    h ^= this.localTime.hashCode();
    h *= 1000003;
    h ^= this.connections.hashCode();
    h *= 1000003;
    h ^= this.network.hashCode();
    h *= 1000003;
    h ^= this.memory.hashCode();
    h *= 1000003;
    h ^= this.storageEngine.hashCode();
    return h;
  }

}
