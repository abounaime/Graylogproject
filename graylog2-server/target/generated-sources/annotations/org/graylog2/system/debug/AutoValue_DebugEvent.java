package org.graylog2.system.debug;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import org.joda.time.DateTime;

final class AutoValue_DebugEvent extends $AutoValue_DebugEvent {
  AutoValue_DebugEvent(String nodeId, DateTime date, String text) {
    super(nodeId, date, text);
  }

  @JsonIgnore
  public final String getNodeId() {
    return nodeId();
  }

  @JsonIgnore
  public final DateTime getDate() {
    return date();
  }

  @JsonIgnore
  public final String getText() {
    return text();
  }
}
