
package org.graylog2.system.debug;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import org.joda.time.DateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DebugEvent extends DebugEvent {

  private final String nodeId;
  private final DateTime date;
  private final String text;

  $AutoValue_DebugEvent(
      String nodeId,
      DateTime date,
      String text) {
    if (nodeId == null) {
      throw new NullPointerException("Null nodeId");
    }
    this.nodeId = nodeId;
    if (date == null) {
      throw new NullPointerException("Null date");
    }
    this.date = date;
    if (text == null) {
      throw new NullPointerException("Null text");
    }
    this.text = text;
  }

  @JsonProperty
  @Override
  public String nodeId() {
    return nodeId;
  }

  @JsonProperty
  @Override
  public DateTime date() {
    return date;
  }

  @JsonProperty
  @Override
  public String text() {
    return text;
  }

  @Override
  public String toString() {
    return "DebugEvent{"
        + "nodeId=" + nodeId + ", "
        + "date=" + date + ", "
        + "text=" + text
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DebugEvent) {
      DebugEvent that = (DebugEvent) o;
      return (this.nodeId.equals(that.nodeId()))
           && (this.date.equals(that.date()))
           && (this.text.equals(that.text()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.nodeId.hashCode();
    h *= 1000003;
    h ^= this.date.hashCode();
    h *= 1000003;
    h ^= this.text.hashCode();
    return h;
  }

}
