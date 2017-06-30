
package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_SystemThreadDumpResponse extends SystemThreadDumpResponse {

  private final String threadDump;

  $AutoValue_SystemThreadDumpResponse(
      String threadDump) {
    if (threadDump == null) {
      throw new NullPointerException("Null threadDump");
    }
    this.threadDump = threadDump;
  }

  @JsonProperty(value = "threaddump")
  @Override
  public String threadDump() {
    return threadDump;
  }

  @Override
  public String toString() {
    return "SystemThreadDumpResponse{"
        + "threadDump=" + threadDump
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SystemThreadDumpResponse) {
      SystemThreadDumpResponse that = (SystemThreadDumpResponse) o;
      return (this.threadDump.equals(that.threadDump()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.threadDump.hashCode();
    return h;
  }

}
