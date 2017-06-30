package org.graylog2.rest.models.system.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_Throughput extends $AutoValue_Throughput {
  AutoValue_Throughput(long throughput) {
    super(throughput);
  }

  @JsonIgnore
  public final long getThroughput() {
    return throughput();
  }
}
