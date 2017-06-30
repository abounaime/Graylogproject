package org.graylog2.rest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_HelloWorldResponse extends $AutoValue_HelloWorldResponse {
  AutoValue_HelloWorldResponse(String clusterId, String nodeId, String version, String tagline) {
    super(clusterId, nodeId, version, tagline);
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
  public final String getVersion() {
    return version();
  }

  @JsonIgnore
  public final String getTagline() {
    return tagline();
  }
}
