package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_SystemThreadDumpResponse extends $AutoValue_SystemThreadDumpResponse {
  AutoValue_SystemThreadDumpResponse(String threadDump) {
    super(threadDump);
  }

  @JsonIgnore
  public final String getThreadDump() {
    return threadDump();
  }
}
