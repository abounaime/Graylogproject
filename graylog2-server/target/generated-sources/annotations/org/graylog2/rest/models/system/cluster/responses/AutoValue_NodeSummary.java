package org.graylog2.rest.models.system.cluster.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_NodeSummary extends $AutoValue_NodeSummary {
  AutoValue_NodeSummary(String clusterId, String nodeId, String type, boolean isMaster,
      String transportAddress, String lastSeen, String shortNodeId, String hostname) {
    super(clusterId, nodeId, type, isMaster, transportAddress, lastSeen, shortNodeId, hostname);
  }

  @JsonIgnore
  public final String getClusterId() {
    return clusterId();
  }

  @JsonIgnore
  public final String getNodeId() {
    return nodeId();
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final boolean isIsMaster() {
    return isMaster();
  }

  @JsonIgnore
  public final String getTransportAddress() {
    return transportAddress();
  }

  @JsonIgnore
  public final String getLastSeen() {
    return lastSeen();
  }

  @JsonIgnore
  public final String getShortNodeId() {
    return shortNodeId();
  }

  @JsonIgnore
  public final String getHostname() {
    return hostname();
  }
}
