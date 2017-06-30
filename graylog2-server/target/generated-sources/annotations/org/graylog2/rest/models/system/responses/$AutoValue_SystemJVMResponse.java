
package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SystemJVMResponse extends SystemJVMResponse {

  private final Map<String, Long> freeMemory;
  private final Map<String, Long> maxMemory;
  private final Map<String, Long> totalMemory;
  private final Map<String, Long> usedMemory;
  private final String nodeId;
  private final String pid;
  private final String info;

  $AutoValue_SystemJVMResponse(
      Map<String, Long> freeMemory,
      Map<String, Long> maxMemory,
      Map<String, Long> totalMemory,
      Map<String, Long> usedMemory,
      String nodeId,
      String pid,
      String info) {
    if (freeMemory == null) {
      throw new NullPointerException("Null freeMemory");
    }
    this.freeMemory = freeMemory;
    if (maxMemory == null) {
      throw new NullPointerException("Null maxMemory");
    }
    this.maxMemory = maxMemory;
    if (totalMemory == null) {
      throw new NullPointerException("Null totalMemory");
    }
    this.totalMemory = totalMemory;
    if (usedMemory == null) {
      throw new NullPointerException("Null usedMemory");
    }
    this.usedMemory = usedMemory;
    if (nodeId == null) {
      throw new NullPointerException("Null nodeId");
    }
    this.nodeId = nodeId;
    if (pid == null) {
      throw new NullPointerException("Null pid");
    }
    this.pid = pid;
    if (info == null) {
      throw new NullPointerException("Null info");
    }
    this.info = info;
  }

  @JsonProperty
  @Override
  public Map<String, Long> freeMemory() {
    return freeMemory;
  }

  @JsonProperty
  @Override
  public Map<String, Long> maxMemory() {
    return maxMemory;
  }

  @JsonProperty
  @Override
  public Map<String, Long> totalMemory() {
    return totalMemory;
  }

  @JsonProperty
  @Override
  public Map<String, Long> usedMemory() {
    return usedMemory;
  }

  @JsonProperty
  @Override
  public String nodeId() {
    return nodeId;
  }

  @JsonProperty
  @Override
  public String pid() {
    return pid;
  }

  @JsonProperty
  @Override
  public String info() {
    return info;
  }

  @Override
  public String toString() {
    return "SystemJVMResponse{"
        + "freeMemory=" + freeMemory + ", "
        + "maxMemory=" + maxMemory + ", "
        + "totalMemory=" + totalMemory + ", "
        + "usedMemory=" + usedMemory + ", "
        + "nodeId=" + nodeId + ", "
        + "pid=" + pid + ", "
        + "info=" + info
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SystemJVMResponse) {
      SystemJVMResponse that = (SystemJVMResponse) o;
      return (this.freeMemory.equals(that.freeMemory()))
           && (this.maxMemory.equals(that.maxMemory()))
           && (this.totalMemory.equals(that.totalMemory()))
           && (this.usedMemory.equals(that.usedMemory()))
           && (this.nodeId.equals(that.nodeId()))
           && (this.pid.equals(that.pid()))
           && (this.info.equals(that.info()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.freeMemory.hashCode();
    h *= 1000003;
    h ^= this.maxMemory.hashCode();
    h *= 1000003;
    h ^= this.totalMemory.hashCode();
    h *= 1000003;
    h ^= this.usedMemory.hashCode();
    h *= 1000003;
    h ^= this.nodeId.hashCode();
    h *= 1000003;
    h ^= this.pid.hashCode();
    h *= 1000003;
    h ^= this.info.hashCode();
    return h;
  }

}
