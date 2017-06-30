package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.String;
import java.util.Map;

final class AutoValue_SystemJVMResponse extends $AutoValue_SystemJVMResponse {
  AutoValue_SystemJVMResponse(Map<String, Long> freeMemory, Map<String, Long> maxMemory,
      Map<String, Long> totalMemory, Map<String, Long> usedMemory, String nodeId, String pid,
      String info) {
    super(freeMemory, maxMemory, totalMemory, usedMemory, nodeId, pid, info);
  }

  @JsonIgnore
  public final Map<String, Long> getFreeMemory() {
    return freeMemory();
  }

  @JsonIgnore
  public final Map<String, Long> getMaxMemory() {
    return maxMemory();
  }

  @JsonIgnore
  public final Map<String, Long> getTotalMemory() {
    return totalMemory();
  }

  @JsonIgnore
  public final Map<String, Long> getUsedMemory() {
    return usedMemory();
  }

  @JsonIgnore
  public final String getNodeId() {
    return nodeId();
  }

  @JsonIgnore
  public final String getPid() {
    return pid();
  }

  @JsonIgnore
  public final String getInfo() {
    return info();
  }
}
