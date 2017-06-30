package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SystemOverviewResponse extends $AutoValue_SystemOverviewResponse {
  AutoValue_SystemOverviewResponse(String facility, String codename, String nodeId,
      String clusterId, String version, String startedAt, boolean isProcessing, String hostname,
      String lifecycle, String lbStatus, String timezone, String operatingSystem) {
    super(facility, codename, nodeId, clusterId, version, startedAt, isProcessing, hostname, lifecycle, lbStatus, timezone, operatingSystem);
  }

  @JsonIgnore
  public final String getFacility() {
    return facility();
  }

  @JsonIgnore
  public final String getCodename() {
    return codename();
  }

  @JsonIgnore
  public final String getNodeId() {
    return nodeId();
  }

  @JsonIgnore
  public final String getClusterId() {
    return clusterId();
  }

  @JsonIgnore
  public final String getVersion() {
    return version();
  }

  @JsonIgnore
  public final String getStartedAt() {
    return startedAt();
  }

  @JsonIgnore
  public final boolean isIsProcessing() {
    return isProcessing();
  }

  @JsonIgnore
  public final String getHostname() {
    return hostname();
  }

  @JsonIgnore
  public final String getLifecycle() {
    return lifecycle();
  }

  @JsonIgnore
  public final String getLbStatus() {
    return lbStatus();
  }

  @JsonIgnore
  public final String getTimezone() {
    return timezone();
  }

  @JsonIgnore
  public final String getOperatingSystem() {
    return operatingSystem();
  }
}
