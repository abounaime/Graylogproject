package org.graylog2.cluster;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

final class AutoValue_ClusterConfigChangedEvent extends $AutoValue_ClusterConfigChangedEvent {
  AutoValue_ClusterConfigChangedEvent(DateTime date, String nodeId, String type) {
    super(date, nodeId, type);
  }

  @JsonIgnore
  public final DateTime getDate() {
    return date();
  }

  @JsonIgnore
  @NotEmpty
  public final String getNodeId() {
    return nodeId();
  }

  @JsonIgnore
  @NotEmpty
  public final String getType() {
    return type();
  }
}
