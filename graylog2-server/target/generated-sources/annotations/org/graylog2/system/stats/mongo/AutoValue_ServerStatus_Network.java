package org.graylog2.system.stats.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;

final class AutoValue_ServerStatus_Network extends $AutoValue_ServerStatus_Network {
  AutoValue_ServerStatus_Network(int bytesIn, int bytesOut, int numRequests) {
    super(bytesIn, bytesOut, numRequests);
  }

  @JsonIgnore
  public final int getBytesIn() {
    return bytesIn();
  }

  @JsonIgnore
  public final int getBytesOut() {
    return bytesOut();
  }

  @JsonIgnore
  public final int getNumRequests() {
    return numRequests();
  }
}
