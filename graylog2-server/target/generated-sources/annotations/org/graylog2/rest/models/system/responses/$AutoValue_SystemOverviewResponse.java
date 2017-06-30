
package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SystemOverviewResponse extends SystemOverviewResponse {

  private final String facility;
  private final String codename;
  private final String nodeId;
  private final String clusterId;
  private final String version;
  private final String startedAt;
  private final boolean isProcessing;
  private final String hostname;
  private final String lifecycle;
  private final String lbStatus;
  private final String timezone;
  private final String operatingSystem;

  $AutoValue_SystemOverviewResponse(
      String facility,
      String codename,
      String nodeId,
      String clusterId,
      String version,
      String startedAt,
      boolean isProcessing,
      String hostname,
      String lifecycle,
      String lbStatus,
      String timezone,
      String operatingSystem) {
    if (facility == null) {
      throw new NullPointerException("Null facility");
    }
    this.facility = facility;
    if (codename == null) {
      throw new NullPointerException("Null codename");
    }
    this.codename = codename;
    if (nodeId == null) {
      throw new NullPointerException("Null nodeId");
    }
    this.nodeId = nodeId;
    if (clusterId == null) {
      throw new NullPointerException("Null clusterId");
    }
    this.clusterId = clusterId;
    if (version == null) {
      throw new NullPointerException("Null version");
    }
    this.version = version;
    if (startedAt == null) {
      throw new NullPointerException("Null startedAt");
    }
    this.startedAt = startedAt;
    this.isProcessing = isProcessing;
    if (hostname == null) {
      throw new NullPointerException("Null hostname");
    }
    this.hostname = hostname;
    if (lifecycle == null) {
      throw new NullPointerException("Null lifecycle");
    }
    this.lifecycle = lifecycle;
    if (lbStatus == null) {
      throw new NullPointerException("Null lbStatus");
    }
    this.lbStatus = lbStatus;
    if (timezone == null) {
      throw new NullPointerException("Null timezone");
    }
    this.timezone = timezone;
    if (operatingSystem == null) {
      throw new NullPointerException("Null operatingSystem");
    }
    this.operatingSystem = operatingSystem;
  }

  @JsonProperty
  @Override
  public String facility() {
    return facility;
  }

  @JsonProperty
  @Override
  public String codename() {
    return codename;
  }

  @JsonProperty
  @Override
  public String nodeId() {
    return nodeId;
  }

  @JsonProperty
  @Override
  public String clusterId() {
    return clusterId;
  }

  @JsonProperty
  @Override
  public String version() {
    return version;
  }

  @JsonProperty
  @Override
  public String startedAt() {
    return startedAt;
  }

  @JsonProperty(value = "is_processing")
  @Override
  public boolean isProcessing() {
    return isProcessing;
  }

  @JsonProperty
  @Override
  public String hostname() {
    return hostname;
  }

  @JsonProperty
  @Override
  public String lifecycle() {
    return lifecycle;
  }

  @JsonProperty
  @Override
  public String lbStatus() {
    return lbStatus;
  }

  @JsonProperty
  @Override
  public String timezone() {
    return timezone;
  }

  @JsonProperty(value = "operating_system")
  @Override
  public String operatingSystem() {
    return operatingSystem;
  }

  @Override
  public String toString() {
    return "SystemOverviewResponse{"
        + "facility=" + facility + ", "
        + "codename=" + codename + ", "
        + "nodeId=" + nodeId + ", "
        + "clusterId=" + clusterId + ", "
        + "version=" + version + ", "
        + "startedAt=" + startedAt + ", "
        + "isProcessing=" + isProcessing + ", "
        + "hostname=" + hostname + ", "
        + "lifecycle=" + lifecycle + ", "
        + "lbStatus=" + lbStatus + ", "
        + "timezone=" + timezone + ", "
        + "operatingSystem=" + operatingSystem
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SystemOverviewResponse) {
      SystemOverviewResponse that = (SystemOverviewResponse) o;
      return (this.facility.equals(that.facility()))
           && (this.codename.equals(that.codename()))
           && (this.nodeId.equals(that.nodeId()))
           && (this.clusterId.equals(that.clusterId()))
           && (this.version.equals(that.version()))
           && (this.startedAt.equals(that.startedAt()))
           && (this.isProcessing == that.isProcessing())
           && (this.hostname.equals(that.hostname()))
           && (this.lifecycle.equals(that.lifecycle()))
           && (this.lbStatus.equals(that.lbStatus()))
           && (this.timezone.equals(that.timezone()))
           && (this.operatingSystem.equals(that.operatingSystem()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.facility.hashCode();
    h *= 1000003;
    h ^= this.codename.hashCode();
    h *= 1000003;
    h ^= this.nodeId.hashCode();
    h *= 1000003;
    h ^= this.clusterId.hashCode();
    h *= 1000003;
    h ^= this.version.hashCode();
    h *= 1000003;
    h ^= this.startedAt.hashCode();
    h *= 1000003;
    h ^= this.isProcessing ? 1231 : 1237;
    h *= 1000003;
    h ^= this.hostname.hashCode();
    h *= 1000003;
    h ^= this.lifecycle.hashCode();
    h *= 1000003;
    h ^= this.lbStatus.hashCode();
    h *= 1000003;
    h ^= this.timezone.hashCode();
    h *= 1000003;
    h ^= this.operatingSystem.hashCode();
    return h;
  }

}
