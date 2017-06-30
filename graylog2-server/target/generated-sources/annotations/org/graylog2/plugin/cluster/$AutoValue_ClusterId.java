
package org.graylog2.plugin.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterId extends ClusterId {

  private final String clusterId;

  $AutoValue_ClusterId(
      String clusterId) {
    if (clusterId == null) {
      throw new NullPointerException("Null clusterId");
    }
    this.clusterId = clusterId;
  }

  @JsonProperty
  @Override
  public String clusterId() {
    return clusterId;
  }

  @Override
  public String toString() {
    return "ClusterId{"
        + "clusterId=" + clusterId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterId) {
      ClusterId that = (ClusterId) o;
      return (this.clusterId.equals(that.clusterId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.clusterId.hashCode();
    return h;
  }

}
