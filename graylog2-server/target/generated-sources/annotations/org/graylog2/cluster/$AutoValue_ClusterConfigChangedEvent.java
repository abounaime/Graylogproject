
package org.graylog2.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ClusterConfigChangedEvent extends ClusterConfigChangedEvent {

  private final DateTime date;
  private final String nodeId;
  private final String type;

  $AutoValue_ClusterConfigChangedEvent(
      DateTime date,
      String nodeId,
      String type) {
    if (date == null) {
      throw new NullPointerException("Null date");
    }
    this.date = date;
    if (nodeId == null) {
      throw new NullPointerException("Null nodeId");
    }
    this.nodeId = nodeId;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
  }

  @JsonProperty
  @Override
  public DateTime date() {
    return date;
  }

  @JsonProperty
  @NotEmpty
  @Override
  public String nodeId() {
    return nodeId;
  }

  @JsonProperty
  @NotEmpty
  @Override
  public String type() {
    return type;
  }

  @Override
  public String toString() {
    return "ClusterConfigChangedEvent{"
        + "date=" + date + ", "
        + "nodeId=" + nodeId + ", "
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClusterConfigChangedEvent) {
      ClusterConfigChangedEvent that = (ClusterConfigChangedEvent) o;
      return (this.date.equals(that.date()))
           && (this.nodeId.equals(that.nodeId()))
           && (this.type.equals(that.type()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.date.hashCode();
    h *= 1000003;
    h ^= this.nodeId.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    return h;
  }

}
