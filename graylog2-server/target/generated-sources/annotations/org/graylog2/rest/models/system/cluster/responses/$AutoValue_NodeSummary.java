
package org.graylog2.rest.models.system.cluster.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NodeSummary extends NodeSummary {

  private final String clusterId;
  private final String nodeId;
  private final String type;
  private final boolean isMaster;
  private final String transportAddress;
  private final String lastSeen;
  private final String shortNodeId;
  private final String hostname;

  $AutoValue_NodeSummary(
      String clusterId,
      String nodeId,
      String type,
      boolean isMaster,
      String transportAddress,
      String lastSeen,
      String shortNodeId,
      String hostname) {
    if (clusterId == null) {
      throw new NullPointerException("Null clusterId");
    }
    this.clusterId = clusterId;
    if (nodeId == null) {
      throw new NullPointerException("Null nodeId");
    }
    this.nodeId = nodeId;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.isMaster = isMaster;
    if (transportAddress == null) {
      throw new NullPointerException("Null transportAddress");
    }
    this.transportAddress = transportAddress;
    if (lastSeen == null) {
      throw new NullPointerException("Null lastSeen");
    }
    this.lastSeen = lastSeen;
    if (shortNodeId == null) {
      throw new NullPointerException("Null shortNodeId");
    }
    this.shortNodeId = shortNodeId;
    if (hostname == null) {
      throw new NullPointerException("Null hostname");
    }
    this.hostname = hostname;
  }

  @JsonProperty
  @Override
  public String clusterId() {
    return clusterId;
  }

  @JsonProperty
  @Override
  public String nodeId() {
    return nodeId;
  }

  @JsonProperty
  @Override
  public String type() {
    return type;
  }

  @JsonProperty(value = "is_master")
  @Override
  public boolean isMaster() {
    return isMaster;
  }

  @JsonProperty
  @Override
  public String transportAddress() {
    return transportAddress;
  }

  @JsonProperty
  @Override
  public String lastSeen() {
    return lastSeen;
  }

  @JsonProperty
  @Override
  public String shortNodeId() {
    return shortNodeId;
  }

  @JsonProperty
  @Override
  public String hostname() {
    return hostname;
  }

  @Override
  public String toString() {
    return "NodeSummary{"
        + "clusterId=" + clusterId + ", "
        + "nodeId=" + nodeId + ", "
        + "type=" + type + ", "
        + "isMaster=" + isMaster + ", "
        + "transportAddress=" + transportAddress + ", "
        + "lastSeen=" + lastSeen + ", "
        + "shortNodeId=" + shortNodeId + ", "
        + "hostname=" + hostname
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NodeSummary) {
      NodeSummary that = (NodeSummary) o;
      return (this.clusterId.equals(that.clusterId()))
           && (this.nodeId.equals(that.nodeId()))
           && (this.type.equals(that.type()))
           && (this.isMaster == that.isMaster())
           && (this.transportAddress.equals(that.transportAddress()))
           && (this.lastSeen.equals(that.lastSeen()))
           && (this.shortNodeId.equals(that.shortNodeId()))
           && (this.hostname.equals(that.hostname()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.clusterId.hashCode();
    h *= 1000003;
    h ^= this.nodeId.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.isMaster ? 1231 : 1237;
    h *= 1000003;
    h ^= this.transportAddress.hashCode();
    h *= 1000003;
    h ^= this.lastSeen.hashCode();
    h *= 1000003;
    h ^= this.shortNodeId.hashCode();
    h *= 1000003;
    h ^= this.hostname.hashCode();
    return h;
  }

}
