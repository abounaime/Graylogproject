
package org.graylog2.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_HelloWorldResponse extends HelloWorldResponse {

  private final String clusterId;
  private final String nodeId;
  private final String version;
  private final String tagline;

  $AutoValue_HelloWorldResponse(
      String clusterId,
      String nodeId,
      String version,
      String tagline) {
    if (clusterId == null) {
      throw new NullPointerException("Null clusterId");
    }
    this.clusterId = clusterId;
    if (nodeId == null) {
      throw new NullPointerException("Null nodeId");
    }
    this.nodeId = nodeId;
    if (version == null) {
      throw new NullPointerException("Null version");
    }
    this.version = version;
    if (tagline == null) {
      throw new NullPointerException("Null tagline");
    }
    this.tagline = tagline;
  }

  @JsonProperty(value = "cluster_id")
  @Override
  public String clusterId() {
    return clusterId;
  }

  @JsonProperty(value = "node_id")
  @Override
  public String nodeId() {
    return nodeId;
  }

  @JsonProperty(value = "version")
  @Override
  public String version() {
    return version;
  }

  @JsonProperty(value = "tagline")
  @Override
  public String tagline() {
    return tagline;
  }

  @Override
  public String toString() {
    return "HelloWorldResponse{"
        + "clusterId=" + clusterId + ", "
        + "nodeId=" + nodeId + ", "
        + "version=" + version + ", "
        + "tagline=" + tagline
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HelloWorldResponse) {
      HelloWorldResponse that = (HelloWorldResponse) o;
      return (this.clusterId.equals(that.clusterId()))
           && (this.nodeId.equals(that.nodeId()))
           && (this.version.equals(that.version()))
           && (this.tagline.equals(that.tagline()));
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
    h ^= this.version.hashCode();
    h *= 1000003;
    h ^= this.tagline.hashCode();
    return h;
  }

}
