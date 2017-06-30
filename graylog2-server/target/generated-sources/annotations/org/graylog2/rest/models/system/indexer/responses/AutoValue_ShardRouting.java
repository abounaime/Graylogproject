package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import javax.annotation.Nullable;

final class AutoValue_ShardRouting extends $AutoValue_ShardRouting {
  AutoValue_ShardRouting(int id, String state, boolean active, boolean primary, String nodeId,
      String nodeName, String nodeHostname, String relocatingTo) {
    super(id, state, active, primary, nodeId, nodeName, nodeHostname, relocatingTo);
  }

  @JsonIgnore
  public final int getId() {
    return id();
  }

  @JsonIgnore
  public final String getState() {
    return state();
  }

  @JsonIgnore
  public final boolean isActive() {
    return active();
  }

  @JsonIgnore
  public final boolean isPrimary() {
    return primary();
  }

  @JsonIgnore
  public final String getNodeId() {
    return nodeId();
  }

  @JsonIgnore
  public final String getNodeName() {
    return nodeName();
  }

  @JsonIgnore
  public final String getNodeHostname() {
    return nodeHostname();
  }

  @JsonIgnore
  @Nullable
  public final String getRelocatingTo() {
    return relocatingTo();
  }
}
