
package org.graylog2.rest.models.system.indexer.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ShardRouting extends ShardRouting {

  private final int id;
  private final String state;
  private final boolean active;
  private final boolean primary;
  private final String nodeId;
  private final String nodeName;
  private final String nodeHostname;
  private final String relocatingTo;

  $AutoValue_ShardRouting(
      int id,
      String state,
      boolean active,
      boolean primary,
      String nodeId,
      String nodeName,
      String nodeHostname,
      @Nullable String relocatingTo) {
    this.id = id;
    if (state == null) {
      throw new NullPointerException("Null state");
    }
    this.state = state;
    this.active = active;
    this.primary = primary;
    if (nodeId == null) {
      throw new NullPointerException("Null nodeId");
    }
    this.nodeId = nodeId;
    if (nodeName == null) {
      throw new NullPointerException("Null nodeName");
    }
    this.nodeName = nodeName;
    if (nodeHostname == null) {
      throw new NullPointerException("Null nodeHostname");
    }
    this.nodeHostname = nodeHostname;
    this.relocatingTo = relocatingTo;
  }

  @JsonProperty(value = "id")
  @Override
  public int id() {
    return id;
  }

  @JsonProperty(value = "state")
  @Override
  public String state() {
    return state;
  }

  @JsonProperty(value = "active")
  @Override
  public boolean active() {
    return active;
  }

  @JsonProperty(value = "primary")
  @Override
  public boolean primary() {
    return primary;
  }

  @JsonProperty(value = "node_id")
  @Override
  public String nodeId() {
    return nodeId;
  }

  @JsonProperty(value = "node_name")
  @Override
  public String nodeName() {
    return nodeName;
  }

  @JsonProperty(value = "node_hostname")
  @Override
  public String nodeHostname() {
    return nodeHostname;
  }

  @JsonProperty(value = "relocating_to")
  @Nullable
  @Override
  public String relocatingTo() {
    return relocatingTo;
  }

  @Override
  public String toString() {
    return "ShardRouting{"
        + "id=" + id + ", "
        + "state=" + state + ", "
        + "active=" + active + ", "
        + "primary=" + primary + ", "
        + "nodeId=" + nodeId + ", "
        + "nodeName=" + nodeName + ", "
        + "nodeHostname=" + nodeHostname + ", "
        + "relocatingTo=" + relocatingTo
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ShardRouting) {
      ShardRouting that = (ShardRouting) o;
      return (this.id == that.id())
           && (this.state.equals(that.state()))
           && (this.active == that.active())
           && (this.primary == that.primary())
           && (this.nodeId.equals(that.nodeId()))
           && (this.nodeName.equals(that.nodeName()))
           && (this.nodeHostname.equals(that.nodeHostname()))
           && ((this.relocatingTo == null) ? (that.relocatingTo() == null) : this.relocatingTo.equals(that.relocatingTo()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id;
    h *= 1000003;
    h ^= this.state.hashCode();
    h *= 1000003;
    h ^= this.active ? 1231 : 1237;
    h *= 1000003;
    h ^= this.primary ? 1231 : 1237;
    h *= 1000003;
    h ^= this.nodeId.hashCode();
    h *= 1000003;
    h ^= this.nodeName.hashCode();
    h *= 1000003;
    h ^= this.nodeHostname.hashCode();
    h *= 1000003;
    h ^= (relocatingTo == null) ? 0 : this.relocatingTo.hashCode();
    return h;
  }

}
